package taejun.repository.managerRepo;

import taejun.data.Manager;

import java.util.ArrayList;
import java.util.List;


public class ManagerRepository {
    private Manager manager = new Manager("1","박태준", "1234" );




    public void save(String email, String name, String password) {
         manager = new Manager(email, name, password);

    }

    public boolean login(String email, String password) {
        if (manager.getEmail().equals(email) && manager.getPassword().equals(password)) {
            return true;
        }
        return false;


    }

    public boolean changePassword(String newPassword) {
        manager.setPassword(newPassword);


        return true;
    }




}


