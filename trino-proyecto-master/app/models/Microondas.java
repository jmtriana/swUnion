package models;

import play.data.validation.Constraints;

import javax.persistence.*;

@Entity
@Table(name = "microondas")
public class Microondas{

    public final static String TAG = "Microondas";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int id;

    @Constraints.Required
    public double standar_time_mw;

    @Constraints.Required
    public int fallos_mw;

    @OneToMany
    public Item itemsMw;

    public Microondas(){
        standar_time_mw = 0;
        fallos_mw = 0;
    }
}