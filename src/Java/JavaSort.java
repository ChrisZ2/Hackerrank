package Java;

import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
class Checker implements Comparator<Student>{
    @Override
	public int compare(Student tv1, Student tv2) {
	
 
		if (tv1.getCgpa() > tv2.getCgpa()) {
			return -1;
		} else if (tv1.getCgpa() < tv2.getCgpa()) {
			return 1;
		} else {
			if(tv1.getFname().compareTo(tv2.getFname())>0){
                return 1;
            }else if(tv1.getFname().compareTo(tv2.getFname())<0){
                return -1;
            }else{
                if(tv1.getId()>tv2.getId()){
                    return -1;
                }else if(tv1.getId()<tv2.getId()){
                    return 1;
                }
            }
		}
		return 0;
	}
}
public class JavaSort
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
     Collections.sort(studentList,new Checker());
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}

