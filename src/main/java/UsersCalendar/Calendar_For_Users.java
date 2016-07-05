package UsersCalendar;

import UserPackage.User;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Calendar_For_Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int CalendarId;
    @Column
    private Date date;
    @Column
    private String note;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;




}
