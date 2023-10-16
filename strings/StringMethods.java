public class StringMethods {
    public static void main(String[] args) {
        String clientsName = "Eliezer";

        //toUpperCase()
        System.out.println("Your name is: " + clientsName.toUpperCase()); 
        //toLoweCase()
        System.out.println("\nYour name in lower case is: " + clientsName.toLowerCase());
        //equals()
        System.out.println("\nThe resoult of your name check is " + clientsName.equals("Eliezer"));
        //length()
        System.out.println("\nYour name has " +clientsName.length()+ " characters");
        //charAt()
        System.out.println("\nThe first letter of your name is " + clientsName.charAt(0));
        System.out.println("\nThe last letter of your name is " +  clientsName.charAt(clientsName.length()-1));
        //subString()
        System.out.println("\nThe first 3 letters of your name are: \"" + clientsName.substring(0, 3) + "\"");
        //replace()
        System.out.println("\nIf I replace the letter 'e' for a '.' in your name it'll be like: " + clientsName.replace('e', '.'));
        //indexOf()
        System.out.println("\nThe first letter 'i' in your name is in the position " + ((clientsName.indexOf("i"))+1));
        //contains()
        System.out.println("\nIt's " + clientsName.contains("zer") + " that your name contains 'zer'");
        //startsWith
        System.out.println("\n¿Your name starts with 'Mari'?: " + clientsName.startsWith("Mari"));
    }
}
