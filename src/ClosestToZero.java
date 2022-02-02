import java.util.Arrays;

public class ClosestToZero {

    public static int check(int[] ints) {

        int result =0;
        Arrays.sort(ints);

        for(int j=0;j<ints.length;j++){

            if(ints[j]>0){
                result=ints[j];
                break;
            }
        }


        return result;
    }
}




