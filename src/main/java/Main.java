import taejun.controller.ManagerController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       ManagerController managerController = new ManagerController();

        Scanner scanner = new Scanner(System.in);

        System.out.println("============= 로그인 ==============");

        System.out.println("사용자의 이메일을 입력하세요. ");

        String email = scanner.next();


        System.out.println("사용자의 비밀번호를 입력하세요. ");
        String password = scanner.next();

        managerController.login(email, password);



        System.out.println(" 새로운 비밀번호를 입력하십시오 ");
        String newPassword = scanner.next();

         managerController.changePassword(email, password, newPassword);


        System.out.println("관리자 등록을 하겠습니다.");

        System.out.println(" 이메일을 입력해주세요. ");
       email = scanner.next();

        System.out.println(" 이름을 입력해주세요. ");
       String name = scanner.next();

        System.out.println(" 비밀번호를 입력해주세요. ");
         password = scanner.next();

       managerController.resisterManger(email, name, password);

        System.out.println(" 로그아웃 하시겠습니까? " + "\n 1. 예 " + "\n 2. 아니요 ");
        int choice = scanner.nextInt();

        managerController.logout(choice);
    }
}
