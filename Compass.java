/*
  Written by: Tim Wayburn, Joel Vikström and Jacob Adlers.

  Jumbled Compass
 */

import java.lang.Math;

public class Compass {

  public static void main(String[] arg) {
    Kattio io = new Kattio(System.in, System.out);

    int current = io.getInt();
    int wanted = io.getInt();

    int result1 = ((wanted-current+720)%360);
    int result2 = -1*((current-wanted+720)%360);


    if (Math.abs(result1) == 180) {
      io.println(180);
    }
    else if (Math.abs(result1)<Math.abs(result2)) {
      io.println(result1);
    }
    else {
      io.println(result2);
    }


    io.flush();
  }

}
