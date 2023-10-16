public class Strings {
    public static void main(String[] args) {
        String course = "Java";
        String professor = "Andrés Guzmán";
        String classroomNumber = "17";
        int numberX = 1;
        int numberZ = 5;


        String description = course + " course with the professor " + professor; 

        System.out.println(description);//Concatening two strings

        System.out.println("Your grade in this subject is " + (numberX + numberZ));//Concatenating a String with a math operation

        System.out.println("This class is taught in the classroom ".concat(classroomNumber));//Using the concat method

    }
}
