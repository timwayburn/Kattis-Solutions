public class IsItHalloween {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        String date = io.getLine();

        if(date.equals("OCT 31") || date.equals("DEC 25")){
            io.print("yup");
        }
        else{
            io.print("nope");
        }

        io.close();
    }
}
