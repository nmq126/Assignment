package lab3.ex5;

import java.io.Console;

public class LoginController {
    public static void main(String[] args) {
        Console console = System.console();
        String username = console.readLine("username:");
        char[] password = console.readPassword("password:");
        if (username.equals("fpt") && password.length == 6){
            console.printf("ok");
        }else {
            console.printf("not ok");
        }
    }
}
