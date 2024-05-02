package taejun.controller;

import taejun.repository.managerRepo.ManagerRepository;

import java.util.Scanner;

public class ManagerController {


    // 여기서 ManagerRepository를 선언해주어야 전체적으로 이 레파지토리에 대한 값을 사용가능함
    private ManagerRepository managerRepository = new ManagerRepository();



    // 관리자 로그인
    public boolean login(String email, String password) {


        boolean success = managerRepository.login(email, password); // managerRepository의 login 메소드의 매개변수 안에 scanner로 받은 email과 password 넣어준다

        return success;
    }

    // 관리자 비밀번호 변경
    public void changePassword(String email, String password, String newPassword) {


        if (login(email, password)) {


            managerRepository.changePassword(newPassword);
        }
    }


    // 관리자 등록
    public void resisterManger(String email, String name, String password) {


        managerRepository.save(email, name, password);

    }

    public boolean logout(int choice) {


        if(choice == 1 ){
            System.out.println("로그아웃 하셨습니다 ");
            return false;

        }else
            System.out.println("로그아웃을 취소");
            return  true;


    }
}



