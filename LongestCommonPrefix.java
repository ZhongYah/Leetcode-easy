package work;


	import java.util.Scanner;

	public class LongestCommonPrefix {
		
		public static void main(String[] args) {
				
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Please texting your string arrays:");   // 輸入字串陣列
				String[] strs = new String[3] ;   // 陣列長度 = 3
				  
					int j=0;
					while(j<strs.length) {
						strs[j] = scan.next();
						System.out.println(strs[j]);  //  列出已輸入的字串
						j++;
			 }

			    String pre = strs[0];   
			    int i = 1;
			    while(i < strs.length){
			        while(strs[i].indexOf(pre) != 0)
			            pre = pre.substring(0, pre.length()-1);
			        i++;
			    }
			    
			    System.out.print("{ ");
			    
	            System.out.print(pre);
		
	             System.out.println(" }");
			 }
			
		}
	}


