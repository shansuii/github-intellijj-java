public class max_element {
    static void main() {
        int[] arr={1,5,3,7,6};
        int mx=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) mx=arr[i];
        }
        System.out.println(mx);
    }
}
