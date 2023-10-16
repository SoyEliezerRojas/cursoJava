public class fileExtentionName {
    public static void main(String[] args) {
        String fileName = "My file.git.js";

        String fileExtention = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println(fileExtention);
     }
}
