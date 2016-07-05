package UserDocuments;

import UserPackage.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Documents implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int DocumentId;
    @Column(nullable = false)
    private String reference;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;


    public Documents() {}

    public Documents(String reference, User user) {
        this.reference = reference;
        this.user = user;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDocumentId() {
        return DocumentId;
    }

    public void setDocumentId(int documentId) {
        DocumentId = documentId;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "DocumentId=" + DocumentId +
                ", reference='" + reference + '\'' +
                ", user=" + user +
                '}';
    }
}
