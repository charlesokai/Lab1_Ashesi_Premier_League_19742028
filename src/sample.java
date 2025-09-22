import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;


        final double POUND = 0.45359237;
        final int METER = 100;

        System.out.print("Enter the player name: ");
        name = scanner.nextLine();

        System.out.print("Enter the player age: ");
        age = scanner.nextInt();

        System.out.print("Enter the height of the player in meters: ");
        height = scanner.nextDouble();

        System.out.print("Enter the player's weight in pounds: ");
        weight = scanner.nextDouble();

        System.out.print("Enter the player's jersey number: ");
        jerseyNumber = scanner.nextInt();

        //conversions
        int heightInCm = (int) (height * METER); // converts from meters to centimeters
        double weightInKg = weight * POUND;      // converts from pounds to kg
        int roundedWeightKg = (int) weightInKg;  // casts to integer

        // Display converted details
        System.out.println("\n Player Details (Converted)");
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height in centimeters:" + heightInCm + "cm");
        System.out.println("Weight in kilograms:" + roundedWeightKg + "kg");
        System.out.println("Jersey Number:" + jerseyNumber);

        // Task 3: Increment and Decrement
        System.out.println("\n Updating Stats");
        System.out.println("Current Age: " + age);

        age++; // increase age by 1
        System.out.println("New Age after 1 season: " + age);

        jerseyNumber--; // penalty reduces jersey number by 1
        System.out.println("New Jersey Number after penalty fine: " + jerseyNumber);

        // Task 4: Checks Player Eligibility
        System.out.println("\n Eligibility Check");

        // Normal eligibility (AND condition)
        boolean TRUE = (age >= 18 && age <= 35 && roundedWeightKg < 90);
        if (TRUE) {
            System.out.println("TRUE");
        } else {
            System.out.println("Not TRUE");
        }

        // Problem with age or weight (OR Condition)
        boolean AgeOrWeight = (age < 18 || roundedWeightKg >= 90);
        if (AgeOrWeight) {
            System.out.println("Player has a problem:either too young or too heavy");
        } else {
            System.out.println("No major problems with age or weight");
        }

        // Flip eligibility result (NOT condition)
        if (!AgeOrWeight) {
            System.out.println("Not TRUE (using NOT)");
        } else {
            System.out.println("TRUE (using NOT)");
        }

        // Task 5: Categorize Player
        System.out.println("\n Player Category");
        String category;
        if (age < 20) {
            category = "Rising Star";
        } else if (age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }
        System.out.println("Category: " + category);

        // Task 6: Switch (Position)
        System.out.println("\n Player Position");
        String position;
        switch (jerseyNumber) {
            case 1: position = "Goalkeeper"; break;
            case 2: case 5: position = "Defender"; break;
            case 6: case 8: position = "Midfielder"; break;
            case 7: case 11: position = "Winger"; break;
            case 9: position = "Striker"; break;
            case 10: position = "Playmaker"; break;
            default: position = "Player position not known";
        }
        System.out.println("Position: " + position);

        // Task 7: Switch Fall-through
        System.out.println("\nSwitch Fall-through Demo");
        switch (jerseyNumber) {
            case 2:
                System.out.println("Case 2 triggered");
            case 6:
                System.out.println("Case 6 triggered");
            case 7:
                System.out.println("Case 7 triggered (fall-through example)");
            default:
                System.out.println("Default case triggered");
        }

        System.out.println("\nGrouped Switch Cases");
        switch (jerseyNumber) {
            case 2: case 5:
                System.out.println("Defender"); break;
            case 6: case 8:
                System.out.println("Midfielder"); break;
            case 7: case 11:
                System.out.println("Winger"); break;
            case 9:
                System.out.println("Striker"); break;
            case 10:
                System.out.println("Playmaker"); break;
            case 1:
                System.out.println("Goalkeeper"); break;
            default:
                System.out.println("Player position not known");
        }

        // Task 8: Nested Ifs
        System.out.println("\n Lineup Decision");
        String lineupDecision;
        if (category.equals("Prime Player")) {
            if (roundedWeightKg < 80) {
                lineupDecision = "Starting Lineup";
            } else {
                lineupDecision = "Bench";
            }
        } else {
            lineupDecision = "Bench";
        }
        System.out.println("Lineup Decision: " + lineupDecision);

        // Task 9: Ternary Operator
        String finalDecision = TRUE ? "Play" : "Rest";
        System.out.println("\n Final Status");
        System.out.println("Final Decision: " + finalDecision);

        // Task 10: Player Report
        System.out.println("\n PLAYER REPORT");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + heightInCm + " cm");
        System.out.println("Weight: " + roundedWeightKg + " kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + (jerseyNumber == 9 || jerseyNumber == 10 || jerseyNumber == 11 ? "Yes" : "No"));
        System.out.println("Eligibility: " + (TRUE ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + finalDecision);

        scanner.close();
    }
}

