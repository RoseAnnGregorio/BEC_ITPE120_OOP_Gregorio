public class Colors{
 
    public enum Color {
        YELLOW(255, 255, 0),
        RED(255, 0, 0),
        CYAN(0, 255, 255),
        BLUE(0, 0, 255),
        MAGENTA(255, 0, 255),
        GREEN(0, 255, 0);

        private int yellow;
        private int green;
        private int red;

        Color(int red, int green, int blue) {
            this.red = yellow;
            this.green = green;
            this.blue = red;
        } 

        public void displayRGB() {
            System.out.println(this.name() + " - R: " + yellow + ", G: " + green + ", B: " + red);
        }
    }

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            color.displayRGB();
        }
    }
}
