package HW3;

import java.util.Scanner;

public class mainCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int place = 0;
		Scanner scann = new Scanner(System.in);

		System.out.println("Enter the name of the college");
		String nameOfTheCollege = scann.next();
		System.out.println("Enter the maximum number of lecturers in the college");
		int maxOfLecturers = scann.nextInt();

		College college = new College(nameOfTheCollege, maxOfLecturers);

		System.out.println("Enter the name of the first lecturer that we add");
		String name = scann.next();
		System.out.println("Enter num of pens falls");
		int numOfPenFalls = scann.nextInt();
		System.out.println("Enter him favorite ice cream");
		String favoriteIceCream = scann.next();

		Lecturer lecturer = new Lecturer(name, numOfPenFalls, favoriteIceCream);

		college.addLecturer(lecturer);
		
		
		if (college.addLecturer(lecturer) == true) {
			System.out.println("The lecturer successfully added");
		} else {
			System.out.println("Eror! Full quota of lecturers");
		}

		System.out.println("Enter the name of the second lecturer that we add");
		name = scann.next();
		System.out.println("Enter num of pens falls");
		numOfPenFalls = scann.nextInt();
		System.out.println("Enter him favorite ice cream");
		favoriteIceCream = scann.next();

		Lecturer lecturer2 = new Lecturer(name, numOfPenFalls, favoriteIceCream);

		college.addLecturer(lecturer2);
		
		if (college.addLecturer(lecturer) == true) {
			System.out.println("The lecturer successfully added");
		} else {
			System.out.println("Eror! Full quota of lecturers");
		}
		college.toString();
		System.out.println(college.toString());
		for (int i = 0; i < college.allLecturers.length; i++) {
			System.out.println(college.allLecturers[i]);
		}
		
		
		college.sortLecturers();
		
		college.toString();
		System.out.println(college.toString());
		for (int i = 0; i < college.allLecturers.length; i++) {
			System.out.println(college.allLecturers[i]);
		}
	}

}
