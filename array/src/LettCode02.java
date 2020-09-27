/**
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
 */
public class LettCode02 {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            result[i] = nums[i]+result[i-1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] ints = runningSum(nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
