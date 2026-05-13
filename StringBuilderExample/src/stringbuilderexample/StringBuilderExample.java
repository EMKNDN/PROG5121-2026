
package stringbuilderexample;


public class StringBuilderExample {

   
    public static void main(String[] args) {
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("Hello"); 
stringBuilder.append(" World"); 
String FirstResult = stringBuilder.toString(); // Convert StringBuilder to String
System.out.println("First result: " + FirstResult);
System.out.println();

stringBuilder.insert(5, ","); // Insert a character at index 5
String SecondResult = stringBuilder.toString(); // Convert StringBuilder to String
System.out.println("Second result: " + SecondResult);
System.out.println();

stringBuilder.replace(6, 11, "Universe"); // Replace characters from index 6 to 11
stringBuilder.delete(5, 6); // Delete character at index 5

String ThirdResult = stringBuilder.toString(); // Convert StringBuilder to String
System.out.println("Third result: " + ThirdResult);
System.out.println();

stringBuilder.reverse(); // Reverse the string

System.out.println("Lastresult: " + stringBuilder.toString()); // Output: "esrevinU olleH"

      
    }
    
}
