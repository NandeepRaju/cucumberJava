package practice;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int to String
		int num=10;
		String s= Integer.toString(num);
		System.out.println(s);
		
		//String to int
		String s1 ="100";
		int num1 = Integer.valueOf(s1);
		System.out.println(num1);
		
		int A[]={-1,-5,-3};
		System.out.println(solution.smallInt(A));

		int B[]={1,-5,-3};
		int sortedB [] = solution.bubbleSort(B);
		System.out.println(Arrays.toString(sortedB));
		
		System.out.println(solution.findDay(1988, 06, 27));
		
		System.out.println(solution.currencyFormatter("INDIA", 100));
		
	}

	public static int [] bubbleSort(int[]A) {

		for (int i = 0; i < A.length-1; i++) {
			for (int j = 0; j < A.length-i-1; j++) {
				if (A[j+1]<A[j]) {
					int swap=A[j];
					A[j]=A[j+1];
					A[j+1]=swap;
				}
			}
		}
		return A;	
	}

	public static int smallInt(int[] A) {
		// write your code in Java SE 8
		int smallInt = 1;
		Arrays.sort(A);						
		for(int i=0; i<A.length; i++){		
			if(A[i]== smallInt){						
				smallInt++;							
			}

		}return smallInt;
	}

	public static String findDay(int year, int month, int day) {
		LocalDate date= LocalDate.of(year, month, month);
		return date.getDayOfWeek().toString();
	}
	
	enum Currency{US, INDIA, CHINA, FRANCE}
	
	public static String currencyFormatter(String Currency, int num) {
		String amount = null;
		switch (Currency) {
		case "US":
			amount=NumberFormat.getCurrencyInstance(Locale.US).format(num);
			break;
		case "INDIA":
			amount=NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(num);
			break;
		case "CHINA":
			amount=NumberFormat.getCurrencyInstance(Locale.CHINA).format(num);
			break;
		case "FRANCE":
			amount=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(num);
			break;
		default:
			amount="Unknown currency";
			break;
		}
		return amount;
	}
	
}
