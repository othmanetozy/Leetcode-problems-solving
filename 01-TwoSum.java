class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (numIndices.containsKey(complement)) {
                return new int[] { numIndices.get(complement), i };
            }
            numIndices.put(num, i);
        }

        return new int[] {};
    }

    
    public static void main(String[] args){
        Solution solutions = new Solution();

        int[] results1 = solutions.twoSum(new int[]{2,7,11,15},9);
        System.out.println("Output : [" + results1[0] + "," + results1[1] + "]");  
        
        int[] results2 = solutions.twoSum(new int[]{3,2,4},6);
        System.out.println("Output : [" + results2[1] + "," + results2[2] + "]");  


        int[] results3 = solutions.twoSum(new int[]{3,3},6);
        System.out.println("Output : [" + results3[0] + "," + results3[1] + "]");
    }
}