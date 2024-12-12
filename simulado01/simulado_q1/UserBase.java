package simulado_q1;

import java.util.Date;

public class UserBase {

    private java.util.LinkedList<User> users;
    private int usersQuantity;

    public UserBase() {
        this.users = new java.util.LinkedList<User>();
    }

    public java.util.LinkedList<User> getUsers() {
        java.util.LinkedList<User> copy = new java.util.LinkedList<User>(users);
        return copy;
    }

    public void setUsers(java.util.LinkedList<User> users) {
        this.users = users;
    }

    public User createUser(String name) {
        User u = new User(name);
        users.add(u);
        usersQuantity++;
        return u;
    }

    public VerifiedUser createVerifiedUser(String name, Date verificationDate) {
        VerifiedUser u = new VerifiedUser(name, verificationDate);
        users.add(u);
        usersQuantity++;
        return u;

    }

    public double porcentagemVerificados() {
        int verified = 0;
        for(User user: users) {
            if(user instanceof VerifiedUser) verified++;
        }
        return (double)verified/(double)usersQuantity;
    }

    public double tamanhoMedioTweets() {
        int lenghtSum = 0;
        for(User u: users) {
            lenghtSum += u.getTweetsLenght();
        }
        return (double)lenghtSum/(double)usersQuantity;
    }

}