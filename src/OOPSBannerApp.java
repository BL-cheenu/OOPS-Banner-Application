/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join() method to create each
 * line of the banner. This further enhances code readability and maintainability.
 *
 * @author Developer
 * @version 5.0
 */

// Extend the user story 4 to further develop the OOPS Banner Application by
// not only using String arrays to hold banner lines and printing them in a
// loop, but also by defining and populating the array in a more concise way
// at the time of declaration using String.join() method to create each line
// of the banner.

public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define String Array variable to hold the OOPS banner lines
        // Each line represents a row in the banner for the letters O, O, P, S
        String[] lines = {
                String.join(" ","  ***  ", "    ***  ", "******", " **** "),
                String.join(" ", " **   **", " **   **", "**   **", "**    "),
                String.join(" ", " **   **", " **   **", "**   **", "**    "),
                String.join(" ", " **   **", " **   **", "******", " **** "),
                String.join(" ", " **   **", " **   **", "**     ", "    **"),
                String.join(" ", " **   **", " **   **", "**     ", "    **"),
                String.join(" ", "  ***  ", "  ***  ", "**     ", "**** ")
        };

        // Use a loop to print each line of the banner to create the
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
