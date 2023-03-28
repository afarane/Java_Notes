package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode_349 {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		intersection(nums1,nums2);
		

	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> intersect = new HashSet<>();

		for (Integer i : nums1) {
			set1.add(i);
		}

		for (Integer i : nums2) {
			if (set1.contains(i)) {
				intersect.add(i);
			}
		}
		
		int size = intersect.size();
		int[] ans = new int[size];
		int index = 0;
		
		for (Integer i : intersect) {
			ans[index++] = i;
		}
		
		System.out.println(Arrays.toString(ans));
		return ans;

	}

}
