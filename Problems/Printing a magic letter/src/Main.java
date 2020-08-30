import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "      **";
        String s2 = "**    **";
        for (String s : Arrays.asList("********", s1,
                s1, s1, s2, s2,
                " *******")) {
            System.out.println(s);
        }
    }
}