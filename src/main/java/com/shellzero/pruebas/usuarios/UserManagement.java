package com.shellzero.pruebas.usuarios;

import java.util.List;
import java.util.Objects;

public class UserManagement {
    /**
     * Function to filter users that can obtain a new credit card.
     * User above @param salary and with age greater than 18 can obtain a new credit card from bank
     * @param users list of user to be filter
     * @return list with user with salary above salary threshold
     */
    public static List<User> getPeopleAvailableForCreditCard(List<User> users, double salary) {
        return null;
    }

    /**
     * Function to filter users with unique State.
     * Filter users to obtain only one user per state, if a State has
     * more than one user please take user with the greatest name (Z it is
     * the greatest letter) and make uppercase to name
     * @param allUsers
     * @return
     */
    public static List<User> getPeopleFromUniqueState(List<User> allUsers) {
        return null;
    }
}


class User {
    private final String email;
    private final String name;
    private final Integer age;
    private final String state;
    private final Integer accountAmount;

    public User(String email, String name, Integer age, String state, Integer accountAmount) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.state = state;
        this.accountAmount = accountAmount;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getState() {
        return state;
    }

    public Integer getAccountAmount() {
        return accountAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getEmail().equals(user.getEmail()) && getName().equals(user.getName()) && getAge().equals(user.getAge()) && getState().equals(user.getState()) && getAccountAmount().equals(user.getAccountAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getName(), getAge(), getState(), getAccountAmount());
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", state='" + state + '\'' +
                ", accountAmount=" + accountAmount +
                '}';
    }
}
