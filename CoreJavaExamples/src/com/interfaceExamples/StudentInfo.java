package com.interfaceExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentInfo
{
		EnterInputFromSystem sym = new EnterInputFromSystem();
		
		//Enter number of students whose information has to be entered
		public int studentQty()
		{
			try
			{	
				System.out.println("Enter the number of students whose info to be inserted :");    
			}
			catch(Exception e)
			{
				System.out.println("Exception occured in studentQty() ");
			}
			return(sym.enterInt());
		}

		//Insert student details
		public  List<Student> insertElements(int noOfstud)
		{	
			List<Student> studList = new ArrayList<Student>();
			
			try
			{		
				for(int i=0;i<noOfstud;i++)
				{
					//Student student[] = new Student[noOfstud];
					
					System.out.println("Enter the details of student "+noOfstud+" :");
					
					//Enter student roll number
					System.out.println("Enter the student roll number : ");
					int rollNo = sym.enterInt();
					
					//Enter student name
					System.out.println("Enter the student name : ");
					String studName = sym.enterString();
					
					//Enter student address
					System.out.println("Enter the student address : ");
					String addr = sym.enterString();
					
					//Enter student marks
					System.out.println("Enter the student marks : ");
					double marks = sym.enterDecimal();
					
					studList.add(new Student(rollNo,studName,addr,marks));
				}
			}		
			catch(Exception e)
			{
				System.out.println("Exception occured in insertElements()");
			}
			return studList;
		}

		//Display object attribute
		public void display(List<Student> list) 
		{
			try
			{		
				for(Student list1 :list)
				{
					System.out.println("RollNumber:"+list1.getRollNo()+","+" Student Name:"+list1.getName()+","+" Address :"+list1.getAddress()+","+" Marks:"+list1.getMarks()+"\n");
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception occured in display() ");
			}
		}

		//Sort the elements based on object attributes 
		public void sortElements(List<Student> studentdList)
		{
			try
			{
				System.out.println("Enter the option on which attribute you want to sort the list :");
				
				//Options to sort list elements are
				System.out.println("1. By Student roll Number"+"\n"+"2. By Student Name"+"\n"+"3. By Student Marks"+"\n"+"4. Exit");
				int choiceAttri = sym.enterInt();
				
				System.out.println("List to be sorted in which manner? ");
				System.out.println("1. Ascending"+"\n"+"2. Descending");
				int typeAttri = sym.enterInt();
				
				switch(choiceAttri)
				{			
							//Sort by roll number
					case 1 : sortByRollNumber(studentdList,typeAttri);
							 System.out.println("After sorting the list is: "); 
							 display(studentdList);
							 break; 
							 
					
							//Sort by name
					case 2: sortByName(studentdList,typeAttri);
							System.out.println("After sorting the list is: "); 
							display(studentdList);
							break; 
				
							//Sort by marks
					case 3 : sortByMarks(studentdList,typeAttri);
							 System.out.println("After sorting the list is: "); 
							 display(studentdList);
							 break; 
												
					default : System.out.println("Attribute choice is invalid!!");	
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception occured in sortElements()");
			}
		}

		//Sort elements of array by marks
		private void sortByMarks(List<Student> studentList,int type) 
		{
			if(type==1)
			{
				// Sort in ascending
				Collections.sort(studentList,new StudentMarksCmpA()); 	
			}
			else if(type==2)
			{
				//Sort in descending
				Collections.sort(studentList, new StudentMarksCmpD());
			}else
			{
				//Exit from loop
				System.exit(0);
			}

			
		}

		//Sort elements of array by name 
		private void sortByName(List<Student> studentList,int type)
		{
			if(type==1)
			{
				// Sort in ascending
				Collections.sort(studentList,new StudentNameCmpA()); 	
			}
			else if(type==2)
			{
				//Sort in descending
				Collections.sort(studentList, new StudentNameCmpD());
			}else
			{
				//Exit from loop
				System.exit(0);
			}
		}

		//Sort elements of array by roll number
		private void sortByRollNumber(List<Student> studentList,int	 type)
		{			
			if(type==1)
			{
				// Sort in ascending
				Collections.sort(studentList,new StudentRollNumberCmp());  
			} 
			else if(type==2)
			{
				//Sort in descending
				Collections.sort(studentList, new StudentRollNumberCmpD());
			}else
			{
				//Exit from loop
				System.exit(0);
			}
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			//return "Roll Number :"+rollNo
			return super.toString();
		}
		
		
}
