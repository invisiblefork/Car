package com.invisiblefork.base.car.tires;


import com.invisiblefork.base.BaseObject;

import javax.persistence.*;

@Entity
@Table( name = "tires" )
public class Tires extends BaseObject {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;


    @Column( name = "name" )
    private String name;

    @Column( name = "friction_coefficient" )
    private Float frictionCoefficient;


    public Tires() {}


    public Integer getId() {
        return id;
    }


    public void setId( Integer id ) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName( String name ) {
        this.name = name;
    }


    public Float getFrictionCoefficient() {
        return frictionCoefficient;
    }


    public void setFrictionCoefficient( Float frictionCoefficient ) {
        this.frictionCoefficient = frictionCoefficient;
    }


}
