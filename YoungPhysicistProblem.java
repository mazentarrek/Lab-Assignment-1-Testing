import java.util.Scanner;

public class YoungPhysicistProblem {

    public static String Check_Equillibrium(int n, int x[], int y[], int z[])
    {
        if (n>100 || n <1)
            return "N is out of range";

        int sum_x =0;
        int sum_y =0;
        int sum_z =0;

        for (int i=n; i>0; i-- ) {

            sum_x += x[i-1];
            sum_y += y[i-1];
            sum_z += z[i-1];
        }

        if ((sum_x + sum_y + sum_z) == 0)
            return "YES";
        else
            return "NO";

    }
}
