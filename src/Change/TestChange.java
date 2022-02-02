package Change;

public class TestChange {

     static Change testChange(long k){

         Change chg= new Change();

         if(k%2==1){
             return null;
         }
         else{
             if(k%10==0){
                 chg.bill10=k/10;
             }
             else if(k%5==0){
                 chg.bill5 = k/5;
             }
             else{
                 chg.coin2=k/2;
                 if( chg.coin2>10){
                     chg.bill10=k/10;
                     long remd=k%10;
                     chg.coin2=remd/2;
                 }
             }

         }

         return chg;
     }
}
