public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.getInt();

        double ans = 0;

        for(int i = 0; i < n; i++){
            double q = io.getDouble();
            double y = io.getDouble();

            ans += q*y;
        }

        io.print(ans);
        io.close();
    }
}
