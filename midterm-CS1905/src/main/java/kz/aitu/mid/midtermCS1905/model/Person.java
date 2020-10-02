package kz.aitu.mid.midtermCS1905.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
public class Person {
    @Id
    private long id;
    private String firstname;
    private String lastname;
    private String city;
    private String phone;
    private String telegram;

}
