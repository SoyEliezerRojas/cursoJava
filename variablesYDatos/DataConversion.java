package variablesYDatos;

public class DataConversion {
    public static void main(String[] args) {

        String numberStr = "50";
        System.out.println("String number: " + numberStr + "\n");

        //Convierto el string a integer
        //I'll convert the string to an integer
        int numberInt = Integer.parseInt(numberStr);
        System.out.println("String Integer: " + numberInt + "\n");

        String doubleStr = "37435.69";
        System.out.println("Double String: " + doubleStr + "\n");

        //Convierto el string a double
        //I'll convert the string to a double
        double realDouble = Double.parseDouble(doubleStr);
        System.out.println("Real Double: " + realDouble + "\n");

        String booleanStr = "True";
        System.out.println("String Boolean: " + booleanStr + "\n");

        //Convierto el string a booleano
        //I'll convert the string to boolean
        boolean logicBoolean = Boolean.parseBoolean(booleanStr);
        System.out.println("Logic Boolean: " + logicBoolean + "\n");
    }
}
