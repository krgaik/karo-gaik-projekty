import java.lang.*;

class Application {
    public static void main(String[] args) throws java.lang.Exception {


        User user = new User("Adam", 35, 178);

        if (user.Name(user.getName()) == true) {
            if (user.Height(user.getHeight()) && user.Age(user.getAge1()))
            {
                System.out.println("User is older than 30 and higher than 160cm");
            }

            else System.out.println("User is younger than 30 or lower than 160cm");
        }
    }

}
