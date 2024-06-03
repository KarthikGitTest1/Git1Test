
public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("Testing");
		
        double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");

        System.out.println("2n changes post commit");
		 System.out.println("Changes done from GitHub");
		
	}

}
