public class DeathKnightHero {

    static int ans = 0;

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int iter = io.getInt();

        for(int i = 0; i < iter; i++){
            isWin(io.getLine());
        }

        io.print(ans);
        io.flush();
    }

    private static void isWin(String seq){
        if(seq.contains("CD")){
            return;
        }
            ans++;
            return;
    }
}
