package work;


	import java.util.Scanner;  //Sanner

	public class RomanToInteger {	

		public static void main(String[] args) {
			
			  try (Scanner scanner = new Scanner(System.in)) {   //輸入字串的寫法
				String s = scanner.next();   //輸入字串的寫法
				  
				int nums[]=new int[s.length()]; //字串長度
					    for(int i=0;i<s.length();i++){
					        switch (s.charAt(i)){  //字元
					            case 'M':
					                nums[i]=1000;
					                break; 
					            case 'D':
					                nums[i]=500;
					                break;
					            case 'C':
					                nums[i]=100;
					                break;
					            case 'L':
					                nums[i]=50;
					                break;
					            case 'X' :
					                nums[i]=10;
					                break;
					            case 'V':
					                nums[i]=5;
					                break;
					            case 'I':
					                nums[i]=1;
					                break;
					        }
					    }
					    int sum=0;
					    for(int i=0;i<nums.length-1;i++){
					        if(nums[i]<nums[i+1])
					            sum-=nums[i]; //sum=sum-nums[i]
					        else
					            sum+=nums[i]; //sum=sum+nums[i]
					    }
					    System.out.println(sum+nums[nums.length-1]);
			}
		  }
	}




