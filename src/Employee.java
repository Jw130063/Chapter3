public class Employee {
     private int empNum;
     private String emplastName;
     private static String empfirstName;
     private double empSalary;

     public int getEmpNum(){
         return empNum;
         }

    public void setEmpNum(int emp){
         empNum = emp;
         }
         public String getEmpLastName(){
         return emplastName;
         }
         public void setEmpLastname(String name){
         emplastName = name;

         }
         public void setEmpfirstName(String name){
         empfirstName = name;

         }
         public void getSalary(double sal) {

         empSalary = sal;
         }



}
