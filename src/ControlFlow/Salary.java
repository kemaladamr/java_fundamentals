package ControlFlow;

public class Salary {

    public static void main(String[] args){

        int workHours = 10;
        double salary = 0;

        if (workHours <= 8 ){
            salary = workHours * 10;
        }
        else if ((workHours > 8) && workHours < 12){
            salary = 8 * 10 + (workHours - 8) * 12;
        }
        else{
            salary = 160;
        }
        System.out.println("The worker's salary is " + salary);
    }
}
