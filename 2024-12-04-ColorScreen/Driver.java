public class Driver{
    public static final int BRIGHT = 1;
    public static final int DARK = 2;
    public static final int ITALICS = 3;

    public static final int BLACK = 30;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int YELLOW = 33;
    public static final int BLUE = 34;
    public static final int MAGENTA = 35;
    public static final int CYAN = 36;
    public static final int WHITE = 37;

    public static final String CLEAR_SCREEN =  "\u001b[2J";
    public static final String HIDE_CURSOR =  "\u001b[?25l";
    public static final String SHOW_CURSOR =  "\u001b[?25h";
    public static final String RESET = "\033[0m"+SHOW_CURSOR;

    public static void color(int foreground,int background){
        System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
    }
    public static void color(int m1, int m2, int m3){
        System.out.print ("\u001b["+ m1 + ";" + m2 + ";" + m3 + "m");
    }

    public static void go(int row,int col){
        System.out.print("\u001b[" + row + ";" + col + "H");
    }

    public static void erase(int r, int c, int size){
        go(r,c);
        System.out.print("\033[0m");
        for(int i = 0; i < size;i++){
            System.out.print(" ");
        }
    }

    public static void main(String[]args){
        System.out.print(CLEAR_SCREEN);
        System.out.print(HIDE_CURSOR);

        for(int i = 0; i < 80; i++){
            for(int j = 0; j < 31; j++){
                go(i+1,j+1);
                color(BLUE, GREEN);
                System.out.print(" ");
            }
        }

        System.out.println(RESET);
    }
}
