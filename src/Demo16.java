void main(){
    int[] nums = {10, 20, 30, 40};
    System.out.println(nums.hashCode());
    System.out.println(nums.toString());

    String str = nums + "";
    System.out.println(str);
}