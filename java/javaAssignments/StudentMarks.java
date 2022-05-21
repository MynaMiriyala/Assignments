package javaAssignments;

import java.util.Scanner;

public class StudentMarks {
		private Scanner sc;
		private Scanner sc2;
		private Scanner sc3;
		void student1() {
		int n1=3,avg1;
		int total1=0;
		int[] arr1=new int[n1];
	sc3 = new Scanner(System.in);
	System.out.println("Enter Marks of student1:");
	for (int i=0;i<n1; i++) {
		arr1[i]=sc3.nextInt();
	total1=total1+arr1[i];
	}
	System.out.println("total score=:" + total1);
	avg1=total1/n1;
	System.out.println("average of three subjects=:" + avg1);
	}
		 void student2() {
					int n2=3,avg2;
					int[] arr2=new int[n2];
					int total2=0;
				sc2 = new Scanner(System.in);
				System.out.println("Enter Marks of student2:");
				for (int i=0;i<n2; i++) {
					arr2[i]=sc2.nextInt();
				total2=total2+arr2[i];
				}
					System.out.println("total score=:" + total2);
					avg2=total2/n2;
					System.out.println("average of three subjects=:" + avg2);
				}
		 void student3() {
				int n3=3,avg3;
				int total3=0;
				int[] arr3 =new int[n3];
			sc = new Scanner(System.in);
			System.out.println("Enter Marks of student3:");
			for (int i=0;i<n3; i++) {
				arr3[i]=sc.nextInt();
			total3=total3+arr3[i];
			}
				System.out.println("total score=:" + total3);
				avg3=total3/n3;
				System.out.println("average of three subjects=:" + avg3);
			}
		 public static void main(String[] args) {
			 StudentMarks sm=new StudentMarks();
			 sm.student1();
			 sm.student2();
			 sm.student3();
		}
}
