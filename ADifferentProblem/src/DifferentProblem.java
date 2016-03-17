import java.util.LinkedList;

/**
 * Created by Tim on 17/03/16.
 */
public class DifferentProblem {
    public static void main(String[] args) {
        Kattiodip io = new Kattiodip(System.in);

        while(io.hasMoreTokens()) {
            LinkedList<Integer> number1 = new LinkedList<>();
            LinkedList<Integer> number2 = new LinkedList<>();
            LinkedList<Integer> answer = new LinkedList<>();
            LinkedList<Integer> temp = new LinkedList<>();

            String num1 = io.getWord();
            String num2 = io.getWord();

            int l1 = num1.length(), l2 = num2.length();
            String s1 = num1, s2 = num2;
            if (l1 < l2 || (l1 == l2 && num1.compareTo(num2) < 0)) {
                s1 = num2;
                s2 = num1;
            }
            l1 = s1.length();
            while (s2.length() != l1)
                s2 = "0" + s2;

            for (int i = l1 - 1; i >= 0; i--) {
                number1.add(s1.charAt(i) - '0');

                number2.add('9' - s2.charAt(i));
            }

            int carry = 0;
            for (int i = 0; i < l1; i++) {
                int d1;
                int d2;

                    d1 = number1.get(i);
                    d2 = number2.get(i);

                int x = d1 + d2 + carry;
                temp.add(x % 10);
                carry = x / 10;
            }

            for (int i = 0; i < l1; i++) {
                int x = temp.get(i) + carry;
                answer.add(x % 10);
                carry = x / 10;
            }
            if (s1.equals(s2))
                System.out.println(0);
            else {
                int i;
                for (i = answer.size() - 1; i >= 0; i--)
                    if (answer.get(i) != 0)
                        break;
                for (; i >= 0; i--)
                    System.out.print(answer.get(i));
                System.out.println("");
            }
        }
        io.close();
    }
}
