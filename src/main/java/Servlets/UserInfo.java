package Servlets;

/**
 * Created by Violetta on 2017-08-28.
 */
public class UserInfo {

    private String name;
    private String country;
    private int post;

    public UserInfo(String name, String country, int post) {
        this.name = name;
        this.country = country;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getPost() {
        return post;
    }
}
