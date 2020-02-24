package Week2Test;
import java.lang.annotation.*;
import java.io.*;
import java.lang.reflect.*;
public class Week2Exam {
	public static void serialize(Employee e) throws IOException
	{
		File f=new File("D:\\IBM training\\JAVATest\\SecondWeekTest\\src\\Week2Test\\serialize.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.flush();
		oos.close();
	}
	public static Employee deserialize() throws IOException, ClassNotFoundException
	{
		File f=new File("D:\\IBM training\\JAVATest\\SecondWeekTest\\src\\Week2Test\\serialize.txt");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		return (Employee)ois.readObject();
	}
 public static void main(String args[]) throws IOException, ClassNotFoundException
 {
	 Employee e=new Employee("Priyamvad",101,10000);
	 //getting the methods having CustomAnnotaion before serialization
	 
	 Class c=e.getClass();
	 int k=0;
	 Method method[]=c.getDeclaredMethods();
	 Method methodsHavingCustomAnnotation[]=new Method[method.length];
	 for(Method m:method)
	 {
		 if(m.isAnnotationPresent(CustomAnnotation.class))
		 {
			 methodsHavingCustomAnnotation[k++]=m;
		 }
		 
	 }
	 
	 
	 //Serializing the object Employee
	 
	 serialize(e);
	 Employee e1=(Employee)deserialize();
	 System.out.println("After deserialization object is :");
	 System.out.println(e1);
	 System.out.println("");
	 //checking whether my CustomAnnotations are present in methods in which it was present before serialization
	 Class c1=e1.getClass();
	
	 for(int i=0;i<k;i++)
	 {  Method m=methodsHavingCustomAnnotation[i];
		 try
		 {
			 if(!m.isAnnotationPresent(CustomAnnotation.class))
			 {
				 throw new AnnotationNotPersistedException();
			 }
		 }
		 catch (AnnotationNotPersistedException ex) {
			// TODO: handle exception
			 ex.printStackTrace();
		}
		 
	 }
	 
	 
	 
	 
 }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation
{
	
}

class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	private  String name;
	private int id,slary;
	public Employee(String name, int id, int slary) {
		super();
		this.name = name;
		this.id = id;
		this.slary = slary;
	}
	@CustomAnnotation
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@CustomAnnotation
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@CustomAnnotation
	public int getSlary() {
		return slary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", slary=" + slary + "]";
	}
	
	
}
class AnnotationNotPersistedException extends Exception
{
	private String message;
	
	public AnnotationNotPersistedException() {
		message="";
	}
	public AnnotationNotPersistedException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String toString() {
		return "Annotaion not present in as object before serialization[message=" + message + "]";
	}
	
}


/*
 Answer of Question 7.
 On retention policy "RetentionPolicy.RUNTIME" my object is serialized]
  On retention policy "RetentionPolicy.CLASS" my CustomAnnotations are not retained]
*/
