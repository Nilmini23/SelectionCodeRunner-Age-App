
public class Testing1 {

	public static void main(String[] args) {

		 int age = 42;
		 
		 if (age > 0 && age < 18)
		 {
			 System.out.println("You are under age.");
			 if (age >= 15)
			 {
				 System.out.println("You can drive a moped.");
			 }
		 }
		 else if (age >= 65)
		 {
			 System.out.println("You are retired.");
		 }
		 else
			 System.out.println("you are an adult.");
		 if (age == 18)
		 {
			 System.out.println("you can drive a car.");
		 }
		 if (age==10 || age==20 || age==30 || age==40 || age==50 || age==60 || age==70 || age==80 || age==90 || age==100 || age==110 || age==120 )
		 {
			 System.out.println("Anniversary Party!"); 
		 }
		 if (age == 100)
		 {
			 System.out.println("Congratulations!you are Hundred!!");
			 System.out.println("You are blessed!");
			// System.out.println("Congratulations!");

		 }
		 if (age < 50 && age > 40)
		 {
			 System.out.println("Hey! you are " + age + " now.");
			 System.out.println("Happy mid life!");

 
		 }
	}

}
