import java.lang.String;

public class StringBuilderEx
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Djoyke Reijans");

        sb.append(" heeft honger");
        System.out.println(sb);

        sb.insert(7, "Abyah ");
        System.out.println(sb);

        sb.replace(26, 33, " dorst");
        System.out.println(sb);

        sb.delete(0, 7);
        System.out.println(sb);

        sb.replace(0, 6, "mv. ");
        System.out.println(sb);
    }
}
