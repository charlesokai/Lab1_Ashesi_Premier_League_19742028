import java.util.Scanner;
public class FootballPlayer {


        public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);

            String name;
            int age;
            double height;
            double weight;
            int jerseynumber;

            System.out.print("Enter the player name: ");
            name= scanner.nextLine();
            System.out.print("Enter the player age: ");
            age= scanner.nextInt();
            System.out.print("Enter the height of the player: ");
            height= scanner.nextDouble();
            System.out.print("Enter the player's weight: ");
            weight= scanner.nextDouble();
            System.out.print("Enter the player's jersey number: ");
            jerseynumber= scanner.nextInt();

            System.out.println("Player Details");
            System.out.println(name);
            System.out.println("age");
            System.out.println("height");
            System.out.println("weight");
            System.out.println("jerseynumber");

            scanner.close();

        }

}
