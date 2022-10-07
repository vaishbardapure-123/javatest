class Student{
String name;
String rollno;
String branch;
String collegename;
void study(){
System.out.println(name+ " " + " " +  rollno + " " + branch + " " + "is studying in" + " " + collegename + " ");
 }
 public static void main(String[] agrs){
 Student XyZ = new Student();
   XyZ.name = "vaishnavi";
   XyZ.rollno = "3rb18cs116";
   XyZ.branch = "cse";
   XyZ.collegename = "BKIT";
   XyZ.study();
}}