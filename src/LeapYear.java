import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        boolean leap = false;
        int year = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        year = scan.nextInt();


        if (year >= 1582){
            if (year % 400 == 0){
                leap = true;
            } else if (year % 100 == 0){
                leap = false;
            } else if (year % 4 == 0){
                leap = true;
            }
        }

        if (leap == true){
            System.out.println(year + " is a leap year");
        } else if (leap == false ){
            System.out.println(year + " is not a leap year.");
        } else {
            System.out.println(year + " is not a lear year.");
        }
    }
}