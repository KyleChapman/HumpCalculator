// Author: Kyle Chapman
// Date:    May early something, 2026
// Description: TODO write something good here

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    /**
     * main method, really useful tool for counting humps.
     * @author Kyle Chapman
     * @param args Whatever command line arguments? Unused.
     */
    public static void main(String[] args) {

        // Declarations.
        int dromedaryCamels;
        int bactrianCamels;
        int humps;
        final int TOO_MANY_HUMPS = 10;

        // Input.
        System.out.print("Enter the number of dromedary camels: ");
        if (input.hasNextInt()) {
            dromedaryCamels = input.nextInt();

            System.out.print("Enter the number of bactrian camels: ");
            if (input.hasNextInt()) {
                bactrianCamels = input.nextInt();

                // Processing.
                humps = dromedaryCamels + bactrianCamels * 2;

                /* This is a block comment.
                Something.
                Hey, look, it's some print statements.
                 */
                System.out.println("Dromedary camels 🐪: " + dromedaryCamels);
                System.out.print("Bactrian camels 🐫: " + bactrianCamels);
                System.out.print("Total humps: " + humps);

                // Check if there's a lot of humps.
                if (humps >= TOO_MANY_HUMPS) {
                    System.out.println("That's a lot of humps.");
                }
            }
            else {
                System.out.println("Bactrian camels must be entered as an integer.");
            }
        }
        else {
            System.out.println("Dromedary camels must be entered as an integer.");
        }
    }
}