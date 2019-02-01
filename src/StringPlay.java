// This program creates and prints out a string of 100,000 "x" characters.
// An illustration of the usefulness of the StringBuilder class.

public class StringPlay {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        useStringBuilder();
        long end = System.currentTimeMillis();
        System.out.println("took " + (end - start) + " ms");
    }

    private static void useStringBuilder(){
        StringBuilder sb = new StringBuilder(1000000);
        for (int i = 0; i < 800000; i++)
            sb.append("x");
        String s = sb.toString();
        System.out.println(s);
    }

    private static void useString(){
        String s = "";
        for (int i = 0; i < 800000; i++)
            s += "x";
        System.out.println(s);
    }
}