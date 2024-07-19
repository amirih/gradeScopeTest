public class HelloGradeScope{
	
	public HelloGradeScope(){
	}
	public String sayHello(){
		return "Hello World!";
	}
	// Main Method
	public static void main(String[] args) {
	       HelloGradeScope hello = new HelloGradeScope();
	       System.out.println(hello.sayHello());
   }
}
