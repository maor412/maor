package HW3;

import java.util.Arrays;

import matala3.lecturer;

public class College {

	private String name;
	private int numOfLecturers;
	Lecturer[] allLecturers;
	
	College(String name, int maxOfLecturers){
		this.name = name;
		this.numOfLecturers = 0;
		this.allLecturers = new Lecturer[maxOfLecturers];
		
		for (int i = 0; i < allLecturers.length; i++) {
			allLecturers[i] = new Lecturer();
		}
	}

	public String getName() {
		return name;
	}

	public int getNumOfLecturers() {
		return numOfLecturers;
	}

	public Lecturer[] getAllLecturers() {
		return allLecturers;
	}
	
	public boolean addLecturer(Lecturer lecturer) {
		
		if (allLecturers.length==numOfLecturers) {
			return false;
		}
		
		allLecturers[numOfLecturers] = lecturer;
		numOfLecturers++;
		return true;
	}

	
 	public void sortLecturers () {

			
			for (int i = 0; i < allLecturers.length-1; i++) {
				for(int j = 0; j < allLecturers.length - i - 1; j++) {
				if (allLecturers[i].getNumOfPenFalls()>allLecturers[i+1].getNumOfPenFalls()) {
					Lecturer temp = allLecturers[i];
					allLecturers[i]=allLecturers[i+1];
					allLecturers[i+1]=temp;
					
				}
				
			}
		
			
		}
	}



	public String toString() {
		return "College -> name = " + name + " \n\tnumOfLecturers = " + numOfLecturers;
	}
	public int addLecturerArray(Lecturer lecturer, int place) {
		
		allLecturers[place] = lecturer;
		
		place++;
		return place;
	}

}
	
	

