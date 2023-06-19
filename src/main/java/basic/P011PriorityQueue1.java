package basic;
/**
 * ENTRADA DE TESTE
 * 
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

SAIDA ESPERADA
Dan
Ashley
Shafaet
Maria

Explanation
Explanation 0

In this case, the number of events is 12. Let the name of the queue be Q.

    John is added to Q. So, it contains (John, 3.75, 50).
    Mark is added to Q. So, it contains (John, 3.75, 50) and (Mark, 3.8, 24).
    Shafaet is added to Q. So, it contains (John, 3.75, 50), (Mark, 3.8, 24), and (Shafaet, 3.7, 35).
    Mark is served as he has the highest CGPA. So, Q contains (John, 3.75, 50) and (Shafaet, 3.7, 35).
    John is served next as he has the highest CGPA. So, Q contains (Shafaet, 3.7, 35).
    Samiha is added to Q. So, it contains (Shafaet, 3.7, 35) and (Samiha, 3.85, 36).
    Samiha is served as she has the highest CGPA. So, Q contains (Shafaet, 3.7, 35).
    Now, four more students are added to Q. So, it contains (Shafaet, 3.7, 35), (Ashley, 3.9, 42), (Maria, 3.6, 46), (Anik, 3.95, 49), and (Dan, 3.95, 50).
    Anik is served because though both Anil and Dan have the highest CGPA but Anik comes first when sorted in alphabetic order. So, Q contains (Dan, 3.95, 50), (Ashley, 3.9, 42), (Shafaet, 3.7, 35), and (Maria, 3.6, 46).

As all events are completed, the name of each of the remaining students is printed on a new line.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
class Student implements Comparable<Student>{
	private int    id;
	private String name;
	private double cgpa;
	
	Student(int id, String name, double cgpa){
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	int    getID()   {return this.id;  }
	String getName() {return this.name;}
	double getCGPA() {return this.cgpa;}

	@Override
	public int compareTo(Student st) {
//		System.out.println(this + " " + st) ;
		int ret = 0;
		if( this.cgpa > st.getCGPA() ) ret = -1;
		if( this.cgpa < st.getCGPA() ) ret =  1;
//		System.out.println(ret);
		if( ret != 0) return ret;
		
		ret = this.name.compareTo(st.getName());
//		System.out.println(ret);
		if( ret != 0) return ret;

		ret = this.id - st.getID();
//		System.out.println(ret);
		return ret;
	}
	
	public String toString() {
		return this.name + " " + this.cgpa + " " + this.id;
	}
	
}

class Priorities{
	/* Process all the given events and return all the students 
	 * yet to be served in the priority order.*/
	List<Student> getStudents(List<String> events){
		
		PriorityQueue<Student> queue = new PriorityQueue<>();
		String vet[];
		for(String evt : events) {
			vet = evt.split(" ");
			if(vet[0].equalsIgnoreCase("ENTER")) {
				queue.add( new Student(Integer.parseInt(  vet[3]),
														  vet[1] , 
									   Double.parseDouble(vet[2]) ) );
			}else if( vet[0].equalsIgnoreCase("SERVED") ){
				queue.poll();
			}
		}
		
		ArrayList<Student> students = new ArrayList<Student>();
		while( !queue.isEmpty() ) { students.add( queue.poll() ); }
		return students;
		
	}
}


public class P011PriorityQueue1{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
