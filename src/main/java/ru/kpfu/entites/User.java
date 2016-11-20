package ru.kpfu.entites;

/**
 * Created by Admin on 28.09.2016.
 */
public class User {
    private String login;
    private String password;
    private String name;
    private String gender;
    private String country;
    private String aboutYourself;

    public User(String login, String password, String name, String gender, String country, String aboutYourself) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.country = country;
        this.aboutYourself = aboutYourself;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getAboutYourself() {
        return aboutYourself;
    }
}
