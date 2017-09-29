/**
 * Created by Tim on 2017-09-29.
 */
public class anewAlphabet {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        String line = io.getLine();

        for(int i = 0; i < line.length(); i++){
            String stringtoPrint = "";
            switch(Character.toLowerCase(line.charAt(i))){
                case 'a': stringtoPrint = "@"; break;
                case 'b': stringtoPrint = "8"; break;
                case 'c': stringtoPrint = "("; break;
                case 'd': stringtoPrint = "|)"; break;
                case 'e': stringtoPrint = "3"; break;
                case 'f': stringtoPrint = "#"; break;
                case 'g': stringtoPrint = "6"; break;
                case 'h': stringtoPrint = "[-]"; break;
                case 'i': stringtoPrint = "|"; break;
                case 'j': stringtoPrint = "_|"; break;
                case 'k': stringtoPrint = "|<"; break;
                case 'l': stringtoPrint = "1"; break;
                case 'm': stringtoPrint = "[]\\/[]"; break;
                case 'n': stringtoPrint = "[]\\[]"; break;
                case 'o': stringtoPrint = "0"; break;
                case 'p': stringtoPrint = "|D"; break;
                case 'q': stringtoPrint = "(,)"; break;
                case 'r': stringtoPrint = "|Z"; break;
                case 's': stringtoPrint = "$"; break;
                case 't': stringtoPrint = "']['"; break;
                case 'u': stringtoPrint = "|_|"; break;
                case 'v': stringtoPrint = "\\/"; break;
                case 'w': stringtoPrint = "\\/\\/"; break;
                case 'x': stringtoPrint = "}{"; break;
                case 'y': stringtoPrint = "`/"; break;
                case 'z': stringtoPrint = "2"; break;
                default: stringtoPrint = Character.toString(line.charAt(i)); break;
            }
            io.print(stringtoPrint);
        }
        io.close();
    }
}
