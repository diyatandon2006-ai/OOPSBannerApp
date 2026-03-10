public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = printO();
        String[] p = printP();
        String[] s = printS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + p[i] + "  " + p[i] + "  " + s[i]);
        }
    }

    // Pattern for O
    public static String[] printO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Pattern for P
    public static String[] printP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Pattern for S
    public static String[] printS() {
        return new String[]{
                " ***** ",
                "*     ",
                "*     ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}