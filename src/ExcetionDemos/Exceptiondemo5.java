package ExcetionDemos;

public class Exceptiondemo5 {

    // check whethere the number is in between 0 to 10
    // if not throw some exception


    void mymethod(int number) throws Exception {
        if(number>=0 && number<=10)
            System.out.println("Given Number is in safe zone");

        else
            throw new Exception("Number is in danger zone");

    }

    public static void main(String[] args) throws Exception {

        int i =6;


        Exceptiondemo5 ob = new Exceptiondemo5();

        ob.mymethod(i);

        System.out.println("last statement");

    }



}
