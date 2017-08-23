package com.invisiblefork.base.car.engine.enginepullys;

import com.invisiblefork.base.BaseObject;

import javax.persistence.*;

@Entity
@Table( name = "engine_pullys" )
public class EnginePullys extends BaseObject {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;


    @Column( name = "name" )
    private String name;


    @Column( name = "additional_horsepower" )
    private Integer additionalHorsePower;


    @Column( name = "additional_torque" )
    private Integer additionalTorque;


    public EnginePullys() {}


    public String getName() {
        return name;
    }


    public void setName( String name ) {
        this.name = name;
    }


    public Integer getAdditionalHorsePower() {
        return additionalHorsePower;
    }


    public void setAdditionalHorsePower( Integer additionalHorsePower ) {
        this.additionalHorsePower = additionalHorsePower;
    }


    public Integer getAdditionalTorque() {
        return additionalTorque;
    }


    public void setAdditionalTorque( Integer additionalTorque ) {
        this.additionalTorque = additionalTorque;
    }


}
