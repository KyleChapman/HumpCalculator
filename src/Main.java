public class Main {
    /**
     * main method, really useful tool for counting humps.
     * @author Kyle Chapman
     * @param args Whatever command line arguments? Unused.
     */
    public static void main(String[] args) {
        int dromedaryCamels = 3;
        int bactrianCamels = 13;
        int humps;
        humps = dromedaryCamels + bactrianCamels * 2;

        /* This is a block comment.
        Something.
        Hey, look, it's some print statements.
         */
        System.out.print("Dromedary camels 🐪: ");
        System.out.println(dromedaryCamels);
        System.out.print("Bactrian camels 🐫: ");
        System.out.println(bactrianCamels);
        System.out.print("Total humps: ");
        System.out.println(humps);

        // Check if there's a lot of humps.
        if (humps < 6) {
            System.out.println("That's a lot of humps.");
        }
    }
}