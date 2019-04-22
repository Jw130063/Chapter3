import java.util.Scanner;

public class MethodsThatUseAnEmployee {

    public static void main(String[] args){
        Employee myEmployee;
        myEmployee = getEmployeeData();
        displayEployee(myEmployee);


    }
    public static Employee getEmployeeData(){
       employee tempEmp + new employee();
       int id;
       double sal;
        Scanner input = new Scanner(System.in);
        System.out.print("enter employee ID>>>>");
        id = input.nextInt();
        tempEmp.setEmpNum(id);
        System.out.print("Enter employee salary>>>");
        sal = input.nextDouble();
        tempEmp.setSalry(sal);
        return tempEmp;






    }
    public static void displayEmployee(Employee anEmp){


    }



}
