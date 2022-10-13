import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CS30 Java Review

        //Java main method

        //Arrays

        //An array can hold more than one piece of data.

        String[] roster = new String[5];
        //Don't forget - arrays are numbered starting from index 0

        roster[0] = "Superman";
        roster[1] = "Batman";
        roster[2] = "Wonder Woman";
        roster[3] = "The Flash";
        roster[4] = "Martian Manhunter";

        //You can save time by bulk assigning an array
        String[] betterRoster = {"Iron Man", "Thor", "The Hulk", "Captain America"};

        //You can't print an array.
        System.out.println(roster); //prints a useless pointer

        //FOR loop (iteration loop)

        //Iterating over arrays
        for (int i = 0; i < roster.length; i++) {
            System.out.println(roster[i]);
        }


        //SImple selection:

        boolean condition = false;
        boolean secondCondition = true;

        if (condition) {
            System.out.println("This prints if the condition is true.");
        }
        else if (secondCondition) {
            System.out.println("This prints if the second condition is true.");
        }
        else {
            System.out.println("Neither of the conditions above are true.");
        }

        //More advanced selection

        char classDay = 'A';
        String studentName = "Majd";

        ArrayList<String> cs20List = new ArrayList<String>();
        cs20List.add("Nathan");
        cs20List.add("Owen");
        ArrayList<String> cs30List = new ArrayList<String>();
        cs30List.add("Owen");
        cs30List.add("Majd");

        //Does this student show up today?

        if( classDay == 'A' && cs20List.contains(studentName)){
            System.out.println(studentName + " should attend CS20 today.");
        } else if(classDay == 'B' && cs30List.contains(studentName) ){
            System.out.println(studentName + " should attend CS30 today.");
        } else {

            //Nested if
            if( !cs20List.contains(studentName) && !cs30List.contains(studentName) ){
                System.out.println("You are not registered in CS20 or CS30. This program isn't for you.");
            }
            else {
            System.out.println("You do not have computer science today.");
        }}


        //Switch statements for menus.

        String[] menuOptions = {"1. Ride the roller-coaster", "2. Visit the midway", "3. Get a snack", "4. Surrender to clowns"};

        System.out.println("\n\nPlease choose one of the following menu options:");
        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println("    "+ menuOptions[i]);
        }

        Scanner INPUT = new Scanner(System.in);

        String menuChoice = INPUT.nextLine();

        switch (menuChoice){
            case "1":
                System.out.println("Roller-coasters are fun.");
                break;
            case "2":
                System.out.println("The midway is a scam, but a fun scam.");
                break;
            case "3":
                System.out.println("Yum");
                break;
            case "4":
                System.out.println("It was inevitable.");
                break;
            default:
                System.out.println("You entered an invalid option.");
                break;
        }

        System.out.println("Is it the weekend?");

        System.out.println(betterWeekendQuery());



    }


    //User defined method
    public static boolean checkWeekend(String dayOfTheWeek){

        if( dayOfTheWeek.equalsIgnoreCase("saturday") || dayOfTheWeek.equalsIgnoreCase("sunday")){

            return true;
    }
        else{
        return false;
        }
    }

    public static boolean betterWeekendQuery(){
        //Lets find an external library for day of the week.
Calendar myCalendar = Calendar.getInstance();


        int dayNumber = myCalendar.get(Calendar.DAY_OF_WEEK);
if( dayNumber == 1 ||  dayNumber == 7){
    return true;
}
return false;

    }


}