package main;

import javax.persistence.*;
import java.util.Objects;

//Tells springs to pay attention to this
@Entity
public class Person {
    private int id;
    private String name;

    @Id//For primary key
    //Increment by itself
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 24)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //MYDB
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
