package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ch_001 {

	public static void main(String[] args) {

		int[] nums = {3,2,4};
		 twoSum(nums, 6);
		
		int[] result = twoSumHashMap(nums, 6);
		
		System.out.println(result[0] + " " +  result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				int first = target - nums[i];
				if (nums[j] == first) {
					System.out.println("i : " + i + " j : " + j);
					return new int[] { i, j };
				}

			}

		}
		throw new IllegalArgumentException("No Match");

	}

	public static int[] twoSumHashMap(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length ; i++) {

			int first = target - nums[i];
			if (map.containsKey(first)) {
				return new int[] { map.get(first) ,i };
			}
			map.put(nums[i], i);
		}
		return new int[] { -1, -1 };

	}
}
