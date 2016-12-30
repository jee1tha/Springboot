package employeeManager.models;

import org.springframework.context.annotation.Primary;

import javax.persistence.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by jee1tha on 12/30/16.
 */
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(name = "user_name", length = 40, columnDefinition = "VARCHAR(40)")
    private String user_name ;

    @Column(name = "user_email", length = 40, columnDefinition = "VARCHAR(40) ")
    private String user_email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
