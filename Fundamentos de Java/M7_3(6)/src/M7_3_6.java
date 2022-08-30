import java.util.Scanner;

public class M7_3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int i, even = 0, odd = 0;
		int size = nums.length;
		
		for (i = 0; i < size; i++) {
			if ((nums[i] % 2) == 0) {
				even += nums[i]; 
			} else 
				odd += nums[i];
		}
		System.out.println(even);
		System.out.println(odd);
	}
}

