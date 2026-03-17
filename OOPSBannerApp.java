import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize patterns
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

    public static void main(String[] args) {

        String bannerWord = "OOPS";

        renderBanner(bannerWord);
    }

    // Function to render banner
    public static void renderBanner(String word) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}