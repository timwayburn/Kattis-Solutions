public class LicenseToLaunch {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.getInt();
        int firstmin = Integer.MAX_VALUE;
        int ans = 0;

        for(int i = 0; i < n; i++){
            int curr = io.getInt();

            if(curr < firstmin){
                firstmin = curr;
                ans = i;
            }
        }

        io.print(ans);
        io.close();
    }
}
