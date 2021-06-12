public class leapYear {

    public static void main(String[] args) {
isLeapYear(1800);
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            System.out.println("Correct!");
               if (year%4 == 0 && year%400 ==0){
                System.out.println("It is a leap year!!!!");
                return true;
            }
               else if (year%4 == 0 && year%100 != 0){
                   System.out.println("itt is a leap year !!");
                   return true;
               }
               else if (year%400 == 0 ){
                   System.out.println("It iss a leap year!!!!");
                   return true;
               }
               else if (year%100 == 0){
                   System.out.println("It is not a leap year!!!!");
                   return false;
               }
               else if (year%100 == 0 && year%400 != 0){
                   System.out.println("it iss not a leap year!!");
                   return false;
               }
                else {
                System.out.println("Not a leap year!!!!");
                return false;
            }

        }
        else {
            System.out.println("Invalid Input!!!");
            return false;
        }
    }
}
