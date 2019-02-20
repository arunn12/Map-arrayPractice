package jarraylist;

import java.util.ArrayList;
import java.util.*;

public class Jarraylist {

    int no;
    String name;
    int age;

    Jarraylist(int rollno, String name, int age) {
        this.no = rollno;
        this.name = name;
        this.age = age;
    }

 public static void main(String args[]) 
 {
        Jarraylist s1 = new Jarraylist(10, "Sachin", 23);
        Jarraylist s2 = new Jarraylist(12, "Yuvi", 21);
        Jarraylist s3 = new Jarraylist(18, "Virat", 25);

        ArrayList<Jarraylist> al = new ArrayList<Jarraylist>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        
     
      

for (Jarraylist a : al) {
           System.out.println( "Number :"+a.no+"Name is :" +a.name+ " Age is :"  +a.age);
      
}
    }
}


