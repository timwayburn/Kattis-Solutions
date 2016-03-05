/**
 * Created by Tim on 03/03/16.
 */
public class Pet {
    static Kattio io;
    static int largestsum;
    static int currentsum;
    static int student;
    public static void main(String[] args) {
        io = new Kattio(System.in);
        for(int i = 0; i < 5; i++){
            currentsum = 0;
            for(int x = 0; x < 4; x++){
                currentsum = currentsum + io.getInt();
            }
            if(currentsum > largestsum){
                largestsum = currentsum;
                student = i;
            }
        }
        io.print(student + " " + largestsum);
        io.close();
    }
}
