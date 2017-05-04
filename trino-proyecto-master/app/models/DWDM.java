package models;

import play.data.validation.Constraints;

import javax.persistence.OneToMany;
import java.util.ArrayList;

public class DWDM{

    @Constraints.Required
    public double standar_time_dwdm;

    @Constraints.Required
    public int fallos_dwdm;

    @OneToMany
    public Item itemsDwdm;

    public DWDM(){
        standar_time_dwdm = 0;
        fallos_dwdm = 0;
    }

}