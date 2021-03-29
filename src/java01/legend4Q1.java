package java01;

public class legend4Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
	      int num2 = 2;
	      
	      char operator = '+';
	      
	      if (num1 > 10) {
	         System.out.println(num1 + 5);
	      }
	      else {
	         System.out.println(num2 + 10);
	      }
	      
	      if (num2 >= 4) {
	         System.out.println(num1 - 6);
	      }
	      else {
	         System.out.println(num2 + 8);
	      }
	      
	      String number = "-";
	      
	      switch(number) {
	      case "+" : 
	         System.out.println(num1 + 50);
	         break;
	      case "-" : 
	         System.out.println(num2 + 45);
	         break;
	      case "*" : 
	         System.out.println(num2 + 20);
	         break;
	      case "/" : 
	         System.out.println(num1 + 30);
	         break;
	      
	      }
	}

}
