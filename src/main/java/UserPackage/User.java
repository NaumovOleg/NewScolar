package UserPackage;

import UserDocuments.Documents;
import Usermassages.Massages;
import UsersCalendar.Calendar_For_Users;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int UserId;
    @Column
    private String name;
    @Column
    private String Surname;
    @Column
    private String password;
    @Column
    private String email;
    @Column(nullable = false)
    private Date dateOfRegistration;
    @Column
    private Date dateOfBirh;
    @Column
    private String nickname;
    @Column
    private String university;


    @OneToMany(mappedBy = "user")
    private List<Massages> listOfUsermassages;
    @OneToMany(mappedBy = "user")
    private List<Documents> listOfUserDocuments;
    @OneToMany(mappedBy = "user")
    private List<Calendar_For_Users> listOfCalendars;

    public User() {
    }

    public User(String name, String surname, String password, String email) {
        this.name = name;
        Surname = surname;
        this.password = password;
        this.email = email;
    }

    public User(String name, String surname,
                String password, String email, Date dateOfRegistration,
                Date dateOfBirh, String nickname, String university) {
        this.name = name;
        Surname = surname;
        this.password = password;
        this.email = email;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfBirh = dateOfBirh;
        this.nickname = nickname;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return UserId;
    }


    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Date getDateOfBirh() {
        return dateOfBirh;
    }

    public void setDateOfBirh(Date dateOfBirh) {
        this.dateOfBirh = dateOfBirh;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public List<Massages> getListOfUsermassages() {
        return listOfUsermassages;
    }

    public void setListOfUsermassages(List<Massages> listOfUsermassages) {
        this.listOfUsermassages = listOfUsermassages;
    }

    public List<Documents> getListOfUserDocuments() {
        return listOfUserDocuments;
    }

    public void setListOfUserDocuments(List<Documents> listOfUserDocuments) {
        this.listOfUserDocuments = listOfUserDocuments;
    }

    @Override
    public String toString() {
        return "UserPackage.User{" +
                "Id=" + UserId +
                ", name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", email='" + email + '\'' +
                ", dateOfRegistration=" + dateOfRegistration +
                ", dateOfBirh=" + dateOfBirh +
                ", nickname='" + nickname + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
