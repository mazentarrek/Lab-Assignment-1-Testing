import java.util.Scanner;

public class WatermelonProblem {

    public String Check_Divisibility (int w) {

        if (w<1 || w>100)
            return "Weight is out of range";

        else if ( w % 2 == 0 )
            return "YES";

        else
            return "NO";
    }

}



