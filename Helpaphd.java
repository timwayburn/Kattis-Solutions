/**
 * Created by Tim on 2018-01-05.
 * Solution to Help a PHD candidate out!
 */
public class Helpaphd {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int lines = io.getInt();

        for(int i = 0; i < lines; i++){
            String[] nums = io.getLine().split("\\+");
            if(nums.length == 1){
                io.println("skipped");
            }
            else {
                int sum = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
                io.println(sum);
            }
        }

        io.close();
    }
}
