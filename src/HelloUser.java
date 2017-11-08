public class HelloUser {
	private String userName;
	
	public HelloUser(String userName) {
		this.userName = userName;
	}

	public void greetUser(){
		System.out.print("Hello " + userName + "!");
	}
	
}
