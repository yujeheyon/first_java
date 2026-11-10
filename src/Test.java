public class Test {
    public static void main(String[] args) 
    {
        int arr1[] = {10, 20, 30};
        int arr2[] = new int[arr1.length];
        
        for(int i = 0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }

        arr2[0] = 100;

        System.out.print("arr1: ");
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        System.out.print("arr2: ");
        for(int k = 0; k < arr2.length; k++)
        {
            System.out.print(arr2[k] + " ");
        }

    }
}