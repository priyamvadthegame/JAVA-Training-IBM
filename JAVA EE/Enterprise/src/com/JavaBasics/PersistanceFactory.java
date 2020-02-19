package com.JavaBasics;
abstract class Persistence
{
	abstract void persist();
}

class FilePersistence extends Persistence
{
	void persist()
	{
		System.out.print("FilePersistence");
	}
}
class DatabasePersistance extends Persistence
{
	void persist()
	{
		System.out.print("DatabasePersistance");
	}
}
class PersistanceFactory
{
 public static Persistence getPersistance()
 {
	return new DatabasePersistance();
 }
 public static void main(String args[])
 {
	Persistence p=PersistanceFactory.getPersistance();
	p.persist();
 }

}