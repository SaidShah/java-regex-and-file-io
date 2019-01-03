package regularExpressionPhoneValidation;

public class Demo {

	public static void main(String[] args) {
		 String s1 = "6311234567";
		 String s2 = "(631)123-4567";
		 String s3 = "(631)123.4567";
		 String s4 = "631.123.4567";
		 String s5 = "631.123-4567";
		 boolean isPhoneNumber = s5.matches("[(]?(\\d{3})[)]?[.-]?(\\d{3})[.-]?(\\d{4})");
		 System.out.println(isPhoneNumber);//you have to use double back slashes
		 String standardizePhoneNumber = s1.replaceAll("[(]?(\\d{3})[)]?[.-]?(\\d{3})[.-]?(\\d{4})","($1)$2-$3");
		 System.out.println(standardizePhoneNumber);
		 String standardizePhoneNumber2 = s5.replaceAll("[(]?(\\d{3})[)]?[.-]?(\\d{3})[.-]?(\\d{4})","($1)$2-$3");
		 System.out.println(standardizePhoneNumber2);
	}

}
