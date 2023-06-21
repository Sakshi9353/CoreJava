public class MethodClass{
	public static void main(String[] args){
		multiply();
		count();
		declare();
		create();
		modify();
		
	}
	public static void multiply(){
		int[] studentMarks = {35, 45, 25,15,55};
		System.out.println("studentMarks");
		for(int i=0;i<studentMarks.length;i++)
		{
		System.out.println(studentMarks[i]);	
		}
	}
 
	public static void count(){
		float[] Heights = {5.2f , 3.7f , 4.2f , 4.8f , 5.3f};
		System.out.println("Heights");
		for(int i=0;i<Heights.length;i++)
		{
			System.out.println(Heights[i]);
		}
	}
	
	public static void declare(){
		char[] conconents = {'B' , 'C' , 'D' , 'F' , 'G' , 'H' , 'J' ,'K' , 'L' , 'M' , 'N' , 'P' , 'Q' , 'R' , 'T' , 'V' , 'W' , 'X' , 'Y' , 'Z'};
		System.out.println("conconents");
        for(int i=0;i<conconents.length;i++)
        {
	        System.out.println(conconents[i]);
        }
	}
	
	public static void create(){
		char[] attendenceOfStudents = {'P' , 'P' , 'P' , 'A' , 'A' , 'P' };
        System.out.println("attendenceOfStudents");
        for(int i=0;i<attendenceOfStudents.length;i++)
        {
	        System.out.println(attendenceOfStudents[i]);
        }
	}
	
	public static void modify(){
		byte[] numberOfStudentsPresent = {45 , 35, 0 , 10 , 45};
        System.out.println("numberOfStudentsPresent");
        for(int i=0;i<numberOfStudentsPresent.length;i++)
        {
	         System.out.println(numberOfStudentsPresent[i]);
        }
	}
	
	
}
	
	
	
