// https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package basic;


import java.util.*;

class Student2{
	private int id;
	private String fname;
	private double cgpa;
	public Student2(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() { return id;	}
	public String getFname() { return fname; }
	public double getCgpa() { return cgpa; }
	
}

class ComparatorStudent2 implements Comparator<Student2>{
    @Override
    public int compare(Student2 o1, Student2 o2) {
        if(o2.getCgpa() > o1.getCgpa()) return  1; 
        if(o2.getCgpa() < o1.getCgpa()) return -1; 
        
        if(o1.getFname().equals(o2.getFname())) return o1.getId() - o2.getId();
        
        return o1.getFname().compareTo(o2.getFname());
    }
}

//Complete the code
public class P036DataStructuresJavaSort {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.ENGLISH);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student2> studentList = new ArrayList<Student2>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student2 st = new Student2(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
		studentList.sort(new ComparatorStudent2());
      	for(Student2 st: studentList){
			System.out.println(st.getFname());
		}
	}
}
