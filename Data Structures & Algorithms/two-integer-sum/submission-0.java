class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int currentElement = nums[i];

            int temp = target - currentElement;

            if(map.containsKey(temp)) {

                return new int[] {map.get(temp), i};
            }

            else {

                map.put(currentElement, i);
            }
        }

        return new int[] {};
    }
}