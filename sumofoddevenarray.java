public class sumofoddevenarray {
    public static void main(String[] args){
        int[] a={10,20,30,};
        int[] a1=new int[a.length];
        int i;
        int sum=0;
        for(i=0; i<a.length; i++){
            sum=sum+a[i];
        }
        System.out.print(sum);

        if(sum%2==0){
            sum=a[i]/a.length;
            System.out.print("even number");
        }
        else{
            System.out.print("odd numbers");
        }
    }

}
