package am.hakobyan.hgh.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "password")
    private String userPassword;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="street", column = @Column(name = "home_street")),
            @AttributeOverride(name="zip", column = @Column(name = "home_zip_code")),
            @AttributeOverride(name="region", column = @Column(name = "home_region"))
    })
    private Address homeAddress;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="street", column = @Column(name = "office_street")),
            @AttributeOverride(name="zip", column = @Column(name = "office_zip_code")),
            @AttributeOverride(name="region", column = @Column(name = "office_region"))
    })
    private Address officeAddress;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", homeAddress=" + homeAddress +
                ", officeAddress=" + officeAddress +
                '}';
    }
}
