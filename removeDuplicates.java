public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        removeDuplicates r = new removeDuplicates();
        System.out.println(r.removeDuplicates(new int[]{1,1,1,2,2,3,3,4}));
        System.out.println(r.removeDuplicates(new int[]{1,1,1,2,2,3,3,4}));
    }
}






