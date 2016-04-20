package hackerrank;

import java.util.*;

/**
 * Created by sredreddy on 4/20/2016.
 */

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


public class Java_Sort {

    public static void main(String[] args) {
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

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int result = Double.valueOf(s2.getCgpa()).compareTo(s1.getCgpa());
                if(result == 0)
                    result = s1.getFname().compareTo(s2.getFname());
                    if(result == 0)
                        result = Integer.valueOf(s1.getId()).compareTo(s2.getId());
                return result;
            }
        });
        for(Student st: studentList){
            System.out.println(st.getFname()+":"+st.getId()+":"+st.getCgpa());
        }
    }
}
