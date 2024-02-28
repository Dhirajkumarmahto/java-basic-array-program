public class calculateAveragearray {
    public static void main(String[] args){
        int[] array={10,20,30};
        int sum=0;
        int i;
        int average;
        for(i=0; i<array.length; i++){
            sum=sum+array[i];
        }
        average=sum/array.length;

        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);

    }
}
