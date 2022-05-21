package javaAssignments2;

abstract class Persistence {
	abstract void Presist();

}
abstract class filePersistence extends Persistence {
	abstract void Persist();
	
}
abstract class DataBasePersistence extends Persistence {
	abstract void Persist();
	
}