import java.util.*;
class Student 
{
 String name;
 int rollno;
 Student(String name,int rollno)
 {
  this.name=name;
  this.rollno=rollno;
 }
 public String toString()
 {
  return(name+" "+rollno);
 }
public boolean equals(Object o)
{
 Student st =(Student)o;
 return(rollno==st.rollno && name.equals(st.name));
}
}
class Array_ListTest
{
public static void main(String arg[])
 {
  ArrayList al = new ArrayList();
  al.add(new Student("dimpal",101));
  al.add(new Student("Aman",102));
  al.add(new Student("pradeep",103));
  al.add(new Student("Rekha",104));
  System.out.println("Size of the collection is " + al.size());
  Iterator itr = al.iterator();
  while(itr.hasNext())
  {
  Student str = (Student)itr.next();
  System.out.println(str.name+" "+str.rollno);
  }
  System.out.println("Contains Aman "+al.contains(new Student("Aman",102)));
  System.out.println("Contains Aman "+al.remove(new Student("Aman",102)));
  System.out.println("List of element");
  System.out.println(al);
}
} 



