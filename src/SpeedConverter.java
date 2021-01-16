import java.util.Scanner;

public class SpeedConverter{
    public static void main(String[]args){
    toMilesPerHour();
        System.out.println(toMilesPerHour());
        System.out.println(System.out);

        String line;
        Scanner in = new Scanner(System.in);
        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);
        System.out.print("Type something else: ");
        line = in.nextLine();
        System.out.println("You said: " + line);
    }

    static double toMilesPerHour(){
        double kilometersPerHour = 98.0;
        //System.out.println(kilometersPerHour);
        return kilometersPerHour;
    }


}
