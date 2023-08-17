import java.util.*;
class student
{
    public int roll_no;
    public String name;
    student(int roll_no,String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class Main{
	public static void main(String[] args) {
	    student a[];
	    a = new student[4];
	    a[0] = new student(1,"arun");
	    a[1] = new student(2,"buji");
	    a[2] = new student(3,"chikku");
	    a[3] = new student(4,"doops");
	    for(int i=0;i<a.length;i++){
	        System.out.println(a[i].roll_no +" "+a[i].name);
	    }
	}
}
