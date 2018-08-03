package io.ubona.udial.chat.model;

public class LogOutNotification {

    private String user;

    public LogOutNotification(String user) {
        this.user = user;
    }
    
    public String getLogoutMsg(){
        return "User "+this.user+ " has logged out";
    }
   
}
