package Usermassages;

import UserPackage.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by олег on 05.07.2016.
 */
@Entity
@Table
public class Massages implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int MassageId;
    @Column
    private String MassageText;
    @Column(nullable = false )
    private Date dateOfMassage;
    @Column(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Massages() {

    }

    public Massages(int massageId, String massageText, Date dateOfMassage) {
        MassageId = massageId;
        MassageText = massageText;
        this.dateOfMassage = dateOfMassage;
    }


    public Massages(int massageId, String massageText, Date dateOfMassage, User user) {
        MassageId = massageId;
        MassageText = massageText;
        this.dateOfMassage = dateOfMassage;
        this.user = user;
    }

    public Massages(Date dateOfMassage, User user, String massageText) {
        this.dateOfMassage = dateOfMassage;
        this.user = user;
        MassageText = massageText;
    }

    public int getUserId() {
        return this.user.getUserId();
    }



    public int getMassageId() {
        return MassageId;
    }

    public void setMassageId(int massageId) {
        MassageId = massageId;
    }

    public String getMassageText() {
        return MassageText;
    }

    public void setMassageText(String massageText) {
        MassageText = massageText;
    }

    public Date getDateOfMassage() {
        return dateOfMassage;
    }

    public void setDateOfMassage(Date dateOfMassage) {
        this.dateOfMassage = dateOfMassage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Usermassages.Massages{" +
                "UserId=" +this.user.getUserId() +
                ", MassageId=" + MassageId +
                ", MassageText='" + MassageText + '\'' +
                ", dateOfMassage=" + dateOfMassage +
                ", user=" + user +
                '}';
    }
}
