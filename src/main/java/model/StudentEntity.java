package model;

import jakarta.persistence.*;

@Entity
@Table(name= "student")
public class StudentEntity {
@Id
@GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "test")
@SequenceGenerator(name="test", sequenceName = "student_sequence")
@Column(name="id")
private int id;
@Column(name="name")
    private String name;
 @Column(name="address")
    private String address;

    public StudentEntity(String test, String us) {
    }

    public StudentEntity(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public StudentEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
