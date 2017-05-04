package models;

import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Acceso {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public int id;

    @Constraints.Required
    public double standar_time_ac=0;

    @Constraints.Required
    public int fallos_ac=0;

    @OneToMany
    public Item itemsAcceso;


}
