package com.example.demo;

public class DemoTest {

	public static void main(String[] args) {
		System.out.println("hi");
	}
}


//package com.example.demo;
//
//public class DemoTestTwo {
//
//	public static void main(String[] args) {
//		int n = 9;
//		System.out.println(fibo(n));
//	}
//
//	public static int fibo(int n ){
//		int a = 0, b = 1, c=0;
//		if (n == 0){
//			return a;
//		}
//		if (n == 1){
//			return b;
//		}
//
//		for (int i = 2; i <= n; i++) {
//			c = a + b;
//			a = b;
//			b = c;
//		}
//		return b;
//	}
//}
//
//package com.example.demo;
//
//public class DemoTestOne {
//
//	public static void main(String[] args) {
////		"701,408,733"
////		String num1 = "701,408,733" ; //"222232244629420445529739893461909967206666939096499764990979600";// "8944394323791464" ;//  "99934";
////		String num2 = "433,494,437" ; //"1"; //"14472334024676221" ;// ""44412337";
////		String num1 = "317,811";
////		String num2 = "514,229";
//		String num1 = "8,944,394,323,791,464";
//		String num2 = "14,472,334,024,676,221";
//
//		num1 = preProcessing(num1);
//		num2 = preProcessing(num2);
//
//		String result  = "";
//
//		int num1Len = num1.length();
//		int num2Len = num2.length();
//		int lengthDiff = Math.abs(num1Len-num2Len);
//
//		if (num1Len < num2Len) {
//			num1 = prependZeros(num1, lengthDiff);
//		}
//		else {
//			num2 =  prependZeros(num2, lengthDiff);
//		}
//
//		result = sumOfTwoLargeNumbers(num1 , num2);
//		result = postProcessResult(result);
//		System.out.println("result  : " + result);
//
//	}
//
//	static String postProcessResult(String result){
//		String curatedResult = "";
//		int cnt = 0;
//		for (int i = result.length() - 1 ; i >= 0 ; i--){
//			curatedResult = result.charAt(i) + curatedResult;
//			cnt++;
//			if ( cnt % 3 == 0 && i != 0){
//				curatedResult = "," + curatedResult;
//				cnt = 0;
//			}
//		}
//		return curatedResult;
//	}
//
//
//
//	static String preProcessing(String num){
//		return  num.replaceAll(",","");
//	}
//
//	static String prependZeros(String num , Integer lengthDiff){
//		for(int i = 0 ; i < lengthDiff ; i++){
//			num = 0+num;
//		}
//		return num;
//	}
//
//
//	static String sumOfTwoLargeNumbers(String num1 , String num2){
//		int newLength = num1.length();
//		int intNum1 = 0;
//		int intNum2 = 0 ;
//		int tempSum = 0;
//		int parity = 0;
//		int digit = 0;
//		String result  = "";
//
//		for (int i = newLength-1 ; i >= 0  ; i-- ){
//			intNum1 = Integer.parseInt(String.valueOf(num1.charAt(i)));
//			intNum2 = Integer.parseInt(String.valueOf(num2.charAt(i)));
//			tempSum = intNum1 + intNum2 + parity;
//			parity = tempSum / 10;
//			digit = tempSum % 10;
//			result = digit+result;
//		}
//		if (parity > 0){
//			result = parity+result;
//		}
//		return result;
//	}
//
//}


//package com.example.demo;
//
//import java.util.*;
//
//public class DemoTest {
//
//	public static void main(String[] args) {
//		System.out.println("hi");
//
//		String str = "forgeeksskeegfor";
//		// handle empty string
////		String str1 = null;
//
//		if (Objects.isNull(str)){
//			System.out.println("str1 is null");
//		}
//		str = filterStr(str);
//		int strLen = 0 ;
//		Map<Integer,List<String>> strMap = new HashMap<>();
//
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i; j < str.length(); j++) {
//				String subStr = str.substring(i,j);
//				if (isPalindrome(subStr)){
//					strLen = subStr.length();
//					List<String> strList = strMap.get(strLen);
//					if ( strList == null){
//						strList = new ArrayList<>();
//					}
//					strList.add(subStr);
//					strMap.put(strLen,strList);
//				}
//			}
//		}
//
//
//		int maxValue = 0 ;
//		List<String> strList = null;
//		for(Map.Entry<Integer,List<String>> it: strMap.entrySet()){
//			if ( it.getKey() >= maxValue){
//				maxValue = it.getKey();
//				strList = it.getValue();
//			}
//		}
//		System.out.println(strList);
//	}
//
//	public static String filterStr(String str){
//		String filteredStr = "";
//		for(int i = 0 ; i < str.length();i++){
//			char ch = str.charAt(i) ;
//			if( (  ch >= 'a' && ch <= 'z')   || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
//				filteredStr = filteredStr + ch;
//			}
//		}
//		return filteredStr;
//	}
//
//	public static boolean isPalindrome(String str){
//		int i=0, j = str.length()-1;
//		boolean flag = true;
//
//		while(i<j){
//			if(str.charAt(i) != str.charAt(j) ){
//				flag = false;
//				break;
//			}
//			i++;
//			j--;
//		}
//		return flag;
//	}
//
//
//}
//
