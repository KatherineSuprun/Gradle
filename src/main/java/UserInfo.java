public class UserInfo {
    public static void main(String[] args) {

        User user = new User();

        user.name = "John";
        user.height = 185.30;
        user.age = 32;

        System.out.println("Name: " + user.name);
        System.out.println("Height: " + user.height);
        System.out.println("Age:" + user.age);
    }
}
