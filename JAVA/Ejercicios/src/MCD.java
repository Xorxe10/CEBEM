public class MCD{
    public static void main(String[] args){
        int a = 64, b = 120;
            while(a != b){
               if(a > b){
                  a = a - b; 
               }else{
                  b = b - a;
               }
            }
            System.out.println(a);
    }
}