package customerservice.Models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long ID;

    //Backquotes required so that Hibertnate maLongains casing
    @Column(name = "`firstName`")
    String firstName;

    @Column(name = "surname")
    String surname;

    @Column(name = "`dateOfBirth`")
    @JsonFormat(pattern = "dd-MM-yyyy")
    Date dateOfBirth;

    @Column(name = "`emailAddress`")
    String emailAddress;

    public Customer() {
    }

    public Customer(Long ID, String firstName, String surname, Date dateOfBirth, String emailAddress) {
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
    }

    public Customer(String firstName, String surname, Date dateOfBirth, String emailAddress) {
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
