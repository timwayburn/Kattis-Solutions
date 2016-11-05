/**
 * Created by Tim on 2016-11-05.
 * Solution to FizzBuzz.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int X = io.getInt();
        int Y = io.getInt();
        int iterations = io.getInt();

        for(int i = 1; i <= iterations; i++){
            if((i%X) == 0 && (i%Y) == 0){
                io.println("FizzBuzz");
            }
            else if((i%X) == 0){
                io.println("Fizz");
            }
            else if((i%Y) == 0){
                io.println("Buzz");
            }
            else{
                io.println(i);
            }
        }

        io.close();
    }
}
