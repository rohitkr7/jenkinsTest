public class JenkinsDemo {

	public static void main(String[] args) {
		System.out.println("hi this is my first jenkin experiment!");
		String nonSense = myFunnyMethod("bom diggy diggy bom bom");
		System.out.println(nonSense);
	}

	public static String myFunnyMethod(String passSomethingSilly) {
		return "Whatever u just passed is nonsense!";
	}
}
