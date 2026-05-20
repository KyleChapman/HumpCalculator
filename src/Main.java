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
        final int TOO_MANY_HUMPS = 5;

        // Input.
        dromedaryCamels = input.nextInt();
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
}