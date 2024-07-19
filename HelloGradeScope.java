public class HelloGradeScope{
	
	public HelloGradeScope(){
	}
	
	public String sayHello(){
		return "Hello GradeScope";
	}
	// Function
	public static void main(String[] args) {
	       HelloGradeScope hello = new HelloGradeScope();
	       System.out.println(hello.sayHello());
   }
}
