import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now? :)");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		while( ! sc.hasNext()) {
            sc.next();
        }
		String nameInputed = sc.next();
		sc.close();
		HelloUser userName = new HelloUser(nameInputed);
		userName.greetUser();
	}

}
