import java.util.Objects;

public class Kata {
    public static void main(String[] args) {
        int rep = 4;
        String str = "a";
        System.out.println(Objects.equals(repeatStr(rep, str), "aaaa"));
    }

    public static String repeatStr(final int repeat, final String string) {
        return (repeat == 0) ? "" : String.valueOf(string).repeat(repeat);
    }
}
