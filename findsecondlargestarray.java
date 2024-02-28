public class findsecondlargestarray {
    public static void main(String[] args){
        int arr[]={20,30,20,4,92};
        int smallest=arr[0];
        int i;
        for(i=1; i<arr.length-1; i++){
            if(arr[i]>smallest){
                smallest=arr[i];
            }
        }
        System.out.println("The largest number in the array is: " + smallest);
    }
}

