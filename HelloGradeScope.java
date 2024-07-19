
public class HelloGradeScope{
	
	public HelloGradeScope(){
	}
	
	public String sayHi(){
		return "Hello GradeScope";
	}
	public static void main(String[] args) {
	       HelloGradeScope hello = new HelloGradeScope();
	       System.out.println(hello.sayHi());
   }
}
