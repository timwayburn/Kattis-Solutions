/**
 * Created by Tim on 2016-11-11.
 * Solution to I Repeat Myself I Repeat Myself I Repeat
 */
public class IRepeatMyself {
    public static int finalrep;

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.getInt();

        for(int i = 0; i < n; i++){
            String currentline = io.getLine();

            for(int p = 0; p < (currentline.length()); p++){
                String repitition = currentline.substring(0, p+1);
                if(isDivisable(repitition, currentline.toCharArray())){
                    io.println(finalrep);
                    finalrep = 0;
                    break;
                }
                else if(repitition.length() == currentline.length()){
                    io.println(currentline.length());
                    finalrep = 0;
                    break;
                }
            }
        }
        io.close();
    }

    static public boolean isDivisable(String rep, char[] currentline){
        for(int i = 0; i < currentline.length; i++){
            finalrep = rep.length();
            if(rep.charAt(i%finalrep) != currentline[i]){
                return false;
            }
        }
        return true;
    }
}
