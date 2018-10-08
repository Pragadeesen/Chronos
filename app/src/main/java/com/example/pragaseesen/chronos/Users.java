package com.example.pragaseesen.chronos;

public class Users {
    private String email;
    private  String username;
    private String password;
    private String nic;
    private String phone;

    public Users(String email, String username, String password, String nic, String phone) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.nic = nic;
        this.phone = phone;
    }

    public Users() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
