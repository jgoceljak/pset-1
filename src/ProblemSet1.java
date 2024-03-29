/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {

    public static void main(String[] args) {

        final double LENGTH = 11;
        final double WIDTH = 8.5;
        final double INCH_MM_CONV = 25.4;
        double lengthMm = LENGTH*INCH_MM_CONV;
        double widthMm = WIDTH*INCH_MM_CONV;
        double sheetArea = lengthMm*widthMm;
        System.out.printf("\n%,.2f square millimeters.\n", sheetArea );



        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
         final double INCH_CM_CONV = 2.54;
         double lengthCm = LENGTH*INCH_CM_CONV;
         double widthCm = WIDTH*INCH_CM_CONV;
         double perimeter = ((2*lengthCm)+(2*widthCm));
         System.out.printf("\n%.2f centimeters.\n", perimeter);



        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

        double HYPOTENUSE = Math.hypot(LENGTH, WIDTH);
        System.out.printf("\n%,.2f inches.\n", HYPOTENUSE);


        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        final double WEIGHT_Q = .35;
        final double WEIGHT_H = .15;
        final double WEIGHT_T = .50;

        double homework = (homework1 + homework2 + homework3)*WEIGHT_H/3;
        double quiz = (quiz1 + quiz2 + quiz3)*WEIGHT_Q/3;
        double test = (test1 + test2 + test3)*WEIGHT_T/3;
        double grade = homework + quiz + test;
        System.out.printf("\n%,.2f%%.\n", grade);



        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
        final double WAGE = 12.50;
        double pay = ((7.5*WAGE)+(8*WAGE)+(10.5*WAGE)+(9.5*WAGE)+(6*WAGE)+(11.5*WAGE));
        System.out.printf("\n$%,.2f.\n", pay);

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */
         final double SALARY = 117000;
         final double FED_TAX = 1 -.24;
         final double STATE = 1 - .0637;
         final double PRETAX_401K = 1 - .07;
         double perPeriod = SALARY/24;
         double annualAfter401k = perPeriod*PRETAX_401K;
         double biWeeklyTakeHome = annualAfter401k*(FED_TAX*STATE);
         System.out.printf("\n$%,.2f.\n", biWeeklyTakeHome);


        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
         final double STUDENTS = 273;
         final double TEACHERS = 28;
         final double CAPACITY = 54;
         double buses = Math.ceil((STUDENTS+TEACHERS)/CAPACITY);
         double remainder = (STUDENTS+TEACHERS)% 54;
         System.out.printf("\n%.0f buses are needed, with ", buses);
         System.out.printf("%.0f passengers on the last bus.\n", remainder);



        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */
         final double BOARD_LENGTH = 48;
         final double BOARD_WIDTH = 24;
         final double HOLE_DIAMETER = 6;
         double radius = HOLE_DIAMETER/2;
         double circleArea = Math.PI*Math.pow(radius,2);
         double rectangleArea = BOARD_WIDTH*BOARD_LENGTH;
         double boardArea = rectangleArea - circleArea;
         System.out.printf("\n%,.2f square inches.\n", boardArea);



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */
        int year1 = 2020;
        int year2 = 2100;
        int year3 = 2400;
        boolean isLeapYear1 = (year1 % 4 == 0)&&((year1 % 100 != 0)||(year1 % 400 == 0));
        boolean isLeapYear2 = (year2 % 4 == 0)&&((year2 % 100 != 0)||(year2 % 400 == 0));
        boolean isLeapYear3 = (year3 % 4 == 0)&&((year3 % 100 != 0)||(year3 % 400 == 0));
        System.out.println("\n" + year1 + " is a leap year..."+isLeapYear1 +".");
        System.out.println(year2 + " is a leap year..."+isLeapYear2 +".");
        System.out.println(year3 + " is a leap year..."+isLeapYear3 +".");


        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */
         double temperature = 38;
         double windSpeed = 14;
         double windChill = 35.74 + (.621*temperature) + (((0.427*temperature)-35.75)*Math.pow(windSpeed, .16));
         System.out.printf("\n%,.1f degrees.\n", windChill);



    }
}
