package repository;

import entity.Manager;

public class ManagerRepository {

    private Manager manager = new Manager("abcd@abcd.com", "1234", "김개똥");

    public void logIn(String email, String password) {
        // 만약 관리자가 입력한 비밀번호가 등록된 비밀번호와 같다면
        if(manager.getEmail().equals(email) && manager.getPassword().equals(password)) {
            // 관리자 인증 성공
        }
        else { // 비밀번호가 다르면
            // 관리자 인증 실패로 비밀번호 입력으로 다시 돌아감(순서도 참고)
            return;
        }
    }

}
