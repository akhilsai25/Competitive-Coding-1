class GfG {

    static int missingNumber(int[] arr) {
      int i = 0, j = arr.length-1;
      while(i<=j) {
        int mid = i+(j-i)/2;
        if(arr[mid]==mid+1) {
          i=mid+1;
        } else {
          j=mid-1;
        }
      }
      return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(missingNumber(arr));
    }
}
