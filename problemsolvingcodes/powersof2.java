public class powersof2 {
    public static void main(String[] args) {
        int base=2,result=1;
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                result=result*base;
            }
            System.out.println("2 power "+i+" " +result);
            result=1;
        }
    }
    
}
