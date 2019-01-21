public class LastFactorialDigit {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.getInt();

        for(int i = 0; i < n; i++){
            int curr = io.getInt();
            io.println(findLast(curr));
        }

        io.close();
    }

    static private int findLast(int fact){
        if(fact == 1){
            return 1;
        }
        else if(fact == 2){
            return 2;
        }
        else if(fact == 3){
            return 6;
        }
        else if(fact == 4){
            return 4;
        }
        else{
            return 0;
        }
    }
}
