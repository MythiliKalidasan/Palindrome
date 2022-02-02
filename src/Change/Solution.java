package Change;

public class Solution {


    int age;
    public static void main(String[] args){


        Change chg;
        chg=  TestChange.testChange(66L);
        System.out.println("COIN 2--->"+chg.coin2);
        System.out.println("BILL 5--->"+chg.bill5);
        System.out.println("BILL 10--->"+chg.bill10);
    }
}
