package com.logo.Repository;

import com.logo.Model.Customer;
import com.logo.Model.Order;
import com.logo.Model.User;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Data
public class UserRepository {
    private static List<User> userList = new ArrayList<>();

    public User save(User request) {
        request.getCustomerList().add(new Customer("Onur",23, new ArrayList<>()));
        request.getCustomerList().add(new Customer("Ufuk",23, new ArrayList<>()));
        request.getCustomerList().add(new Customer("Enes",23, new ArrayList<>()));
        userList.add(request);
        return request;
    }

    public List<User> findAll() {
        return userList;
    }

    public Optional<User> findByEmail(String email) {
        return userList.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }
}
