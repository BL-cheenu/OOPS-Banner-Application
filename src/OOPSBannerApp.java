/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays the "OOPS"
 * banner using these mappings. This approach enhances code organization and modularity.
 *
 * @author Developer
 * @version 7.0
 */

// Extend the User Story 6 to implement a CharacterPatternMap class to encapsulate
// character-to-pattern mappings. The application retrieves and displays the "OOPS"
// banner using these mappings. Thereby addressing the drawback of not having a
// centralized character pattern management system.

// Key Requirements:
// 1. Create CharacterPatternMap class to hold character and its pattern
// 2. Implement methods to create and retrieve character patterns
// 3. Use CharacterPatternMap to display the "OOPS" banner
// 4. Implement modular and reusable character pattern management



// Drawback of this approach is that we are creating CharacterPatternMap objects ...

public class OOPSBannerApp {

    /**
     * CharacterPatternMap - Inner class for storing character-to-pattern mappings
     *
     * Encapsulates a single character and its corresponding ASCII art pattern.
     * Provides immutable access to character and pattern data through getters.
     */
    static class CharacterPatternMap {

        /** The character being represented */
        Character character;

        /** The ASCII art pattern lines for the character */
        String[] pattern;

        /**
         * Constructs a CharacterPatternMap with a character and its pattern
         *
         * @param character the character to be mapped
         * @param pattern   the ASCII art pattern representation as array of strings
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Retrieves the mapped character
         *
         * @return the character associated with this pattern map
         */
        public Character getCharacter() {
            return character;
        }

        /**
         * Retrieves the ASCII art pattern
         *
         * @return the pattern array representing the character
         */
        public String[] getPattern() {
            return pattern;
        }
    }
    /**
     * Static Method to Create and initializes CharacterPatternMap array for predefined characters
     *
     * Populates pattern maps for letters 'O', 'P', 'S' and space character.
     * Each character has a 7-line ASCII art representation.
     *
     * @return array of CharacterPatternMap objects containing character patterns
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        String[] oPattern = {
                "  ***  ",
                " **   **",
                " **   **",
                " **   **",
                " **   **",
                " **   **",
                "  ***  "
        };

        String[] pPattern = {
                "******",
                "**   **",
                "**   **",
                "******",
                "**     ",
                "**     ",
                "**     "
        };

        String[] sPattern = {
                " **** ",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "****  "
        };

        String[] spacePattern = {
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      "
        };

        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };
    }

    /**
     * Retrieves the ASCII pattern for a given character
     *
     * Searches through the character pattern maps to find a matching character.
     * If the character is not found, recursively returns the pattern for space character.
     *
     * @param ch       the character to look up
     * @param charMaps the array of CharacterPatternMap objects to search through
     * @return the pattern array for the given character, or space pattern if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as a banner using ASCII art patterns
     *
     * Renders the entire message horizontally by combining individual character
     * patterns line by line. Characters are separated by spacing for readability.
     *
     * @param message  the message string to be displayed as a banner
     * @param charMaps the array of CharacterPatternMap objects containing available patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int row = 0; row < 7; row++) {
            StringBuilder builder = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                builder.append(pattern[row]).append("  ");
            }
            System.out.println(builder);
        }
    }

    public static void main(String[] args) {
        /**
         * Main method
         */
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}
