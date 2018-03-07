/*
 * Nicole Tao
 * MathClass.java
 * This program will explore math methods
 * March 7th, 2018
 */

package mathclass;

/**
 *
 * @author rkaune
 */
public class MathClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myNumberRounded;
        double myNumber=15.4;
        double pi = Math.PI;
        myNumberRounded = (int) Math.round(myNumber);
//        myNumber *=10; // this is the same as myNumber = myNumber *10;
//        myNumber +=5;
//        myNumber /=10;
//        myNumberRounded =(int)(myNumber);
        System.out.println(myNumberRounded);
        
        double absoluteNumber;
        double number = -4.8;
        //This will find the absolute value of a number and display the answer as an integer
        absoluteNumber = (int) Math.abs(number);
        System.out.println(absoluteNumber);
        
        double radians;
        double angle = 180;
        //This will convert 180 degrees into radians and display the answer as an interger
        radians = (int) Math.toRadians(angle);  
        System.out.println(radians);
        
        double powNumber;
        double first = 2;
        double second = 3;
        //This will calculate 2 to the power 3
        powNumber = Math.pow(first, second); 
        System.out.println(powNumber);
        
        
    }
    
}