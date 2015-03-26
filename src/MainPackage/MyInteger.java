package MainPackage;

public class MyInteger {
	
		private int value;
		
		public static void main(String[] args) {
			
		}
		
		public MyInteger (int value){
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		
		public Boolean isEven() {
			if (value%2 == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public Boolean isOdd() {
			if (value%2 != 0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public Boolean isPrime() {
			if (value%2 == 2) {
				return false;
			}
			for (int i = 3; i * i <= value; i += 2) {
	            if (value % i == 0) {
	            	return false;
	            }
			}
	        return true;
		}
		
		public static boolean isEven(int value){
			if ((value % 2) == 0)
				return true;
			else
				return false;
		}
		
		public static boolean isOdd(int value) {
			if ((value % 2) == 1)
				return true;
			else
				return false;
		}
		
		public static boolean isPrime(int value) {
			for (int V = 2; V < value; V++) { 
				if (value % V == 0)           
					return false;         
			}
			return true;             
		}
		
		public static boolean isEven(MyInteger integer)
		{
			return integer.isEven();
		}
		
		public static boolean isOdd(MyInteger integer)
		{
			return integer.isOdd();
		}
		
		public static boolean isPrime(MyInteger integer)
		{
			return integer.isPrime();
		}
		
		
		public boolean equals(int newvalue){
			return this.value == newvalue;
		}
		
		public boolean equals(MyInteger newvalue){
			return equals(newvalue.getValue());
		}
		
		
		public static int parseInt(char[] ch){
			int number = Integer.parseInt(new String(ch));
					return number;
					}
		
		public static int parseInt(String string) {
			int number = Integer.parseInt(string);
					return number;
		}
		

}
