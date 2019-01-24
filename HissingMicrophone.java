public class HissingMicrophone {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        String str = io.getLine();

        if(!(str.indexOf("ss")<0)){
            io.print("hiss");
        }
        else{
            io.print("no hiss");
        }

        io.close();
    }
}
