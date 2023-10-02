

public class BasicException {
    public static void main(String[] args) {
        
        try 
        {
        int arr[] = {10,20,30,40,50};
        System.out.println(arr[5]); 
    }
    catch(IndexOutOfBoundsException E){
        System.out.println(E);
    }
}
}
