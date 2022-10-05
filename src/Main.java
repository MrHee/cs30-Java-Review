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




    }
}