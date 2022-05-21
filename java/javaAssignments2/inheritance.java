package javaAssignments2;
class inheritance {
			public static void main(String[] args) {
				Manager manager = new Manager("Manager","Myna",1,20000,1000);
				manager.manager_data();
				Labour labour = new Labour("Labour","Happy",2,10000,1000);
				labour.Labour_data();
				labour.totalSalary();
				manager.totalSalary();
				
				}
			}
