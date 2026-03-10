import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static inner class to store character patterns
    static class CharacterPatternMap {

        private static final Map<Character, String[]> patternMap = new HashMap<>();

        static {
            patternMap.put('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            });

            patternMap.put('P', new String[]{
                    "****** ",
                    "*     *",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      ",
                    "*      "
            });

            patternMap.put('S', new String[]{
                    " ***** ",
                    "*     ",
                    "*     ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            });
        }

        public static String[] getPattern(char ch) {
            return patternMap.get(ch);
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = CharacterPatternMap.getPattern(c);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}