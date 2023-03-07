package project.esmp.dto;



/** @author Ale D*/
public class DtoUsers {


    private Integer userID;

    private String userName; 
    private String codeAccess; 
    private String firstName; 
    private String secondName; 
    private String lastName; 
    private String email; 
    

    public DtoUsers() {
    }

    public DtoUsers(Integer userID, String userName, String codeAccess, String firstName, String secondName, String lastName, String email) {
        this.userID = userID;
        this.userName = userName;
        this.codeAccess = codeAccess;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(String codeAccess) {
        this.codeAccess = codeAccess;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
