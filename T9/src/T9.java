import java.util.ArrayList;


/**
 * Created by Tim on 04/03/16.
 */
public class T9 {
    static Kattio io = new Kattio(System.in);
    static ArrayList<Character> characters = new ArrayList<>();
    static ArrayList<Integer> t9 = new ArrayList<>();
    static char lb = 'B';
    static String s;

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        int n = io.getInt();
        for(int i = 0; i<n; i++){
            s = io.getLine();
            for(int x = 0; x < s.length(); x++){
                characters.add(s.charAt(x));
                if(x == s.length() -1){
                    characters.add(lb);
                }
            }
        }
        for(int m = 0; m <characters.size(); m++){
            t9.add(tnine(characters.get(m)));
        }
        int o = 0;
        int lastnumber = 123;
        for(int number: t9){
            if(o == 0){
                sb.append("Case #1: ");
                o++;
            }
            if(number == 1001){
                o++;
                io.println(sb.toString());
                sb = new StringBuilder();
                sb.append("Case #");
                sb.append(o);
                sb.append(": ");
            }
            if(lastnumber == number%10){
                sb.append(" ");
            }
            if(number != 1001) {
                sb.append(number);
            }
            lastnumber = number%10;
        }
        io.close();
    }
    static private int tnine(int charindex) throws IllegalArgumentException{
            switch(charindex){
                case 'a':
                    return 2;
                case 'b':
                    return 22;
                case 'c':
                    return 222;
                case 'd':
                    return 3;
                case 'e':
                    return 33;
                case 'f':
                    return 333;
                case 'g':
                    return 4;
                case 'h':
                    return 44;
                case 'i':
                    return 444;
                case 'j':
                    return 5;
                case 'k':
                    return 55;
                case 'l':
                    return 555;
                case 'm':
                    return 6;
                case 'n':
                    return 66;
                case 'o':
                    return 666;
                case 'p':
                    return 7;
                case 'q':
                    return 77;
                case 'r':
                    return 777;
                case 's':
                    return 7777;
                case 't':
                    return 8;
                case 'u':
                    return 88;
                case 'v':
                    return 888;
                case 'w':
                    return 9;
                case 'x':
                    return 99;
                case 'y':
                    return 999;
                case 'z':
                    return 9999;
                case ' ':
                    return 0;
                case 'B':
                    return 1001;
            }
        return 000000000;
    }
}
