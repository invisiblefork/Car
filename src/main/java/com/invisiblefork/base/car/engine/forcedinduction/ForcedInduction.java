package com.invisiblefork.base.car.engine.forcedinduction;

import com.invisiblefork.base.BaseObject;

import javax.persistence.*;

@Entity
@Table( name = "forced_induction" )
public class ForcedInduction extends BaseObject {


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


    public ForcedInduction() {}


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
