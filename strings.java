public class strings
{
public static void main(String args[])
{
String text="object oriented programming";
System.out.println("orginal text:"+text);
System.out.println("\n the  given text is empty->"+text.isEmpty());
System.out.println("\n length of given text ->"+text.length());
System.out.println("\n upper case :"+text.toUpperCase());
System.out.println("\n lower case :"+text.toLowerCase());
System.out.println("\n substring:" +text.substring(7));
System.out.println("\n subsequence:" +text.subSequence(7,15));
System.out.println("\n replace o with $: "+text.replace('o','$'));
}}

output

  orginal text:object oriented programming

 the  given text is empty->false

 length of given text ->27

 upper case :OBJECT ORIENTED PROGRAMMING

 lower case :object oriented programming

 substring:oriented programming

 subsequence:oriented

 replace o with $: $bject $riented pr$gramming



