package com.invisiblefork.base.car;

import com.invisiblefork.base.BaseObject;
import com.invisiblefork.base.car.engine.Engine;
import com.invisiblefork.base.car.suspension.Suspension;
import com.invisiblefork.base.car.tires.Tires;
import com.invisiblefork.base.car.transmission.Transmission;
import com.invisiblefork.base.car.wheels.Wheels;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table( name = "car" )
public class Car extends BaseObject {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;


    @Column( name = "name" )
    private String name;


    @OneToOne( cascade = {CascadeType.PERSIST} )
    @JoinColumn( name = "engine_id" )
    private Engine engine;


    @OneToOne( cascade = {CascadeType.PERSIST} )
    @JoinColumn( name = "suspension_id" )
    private Suspension suspension;


    @OneToOne( cascade = {CascadeType.PERSIST} )
    @JoinColumn( name = "tires_id" )
    private Tires tires;


    @OneToOne( cascade = {CascadeType.PERSIST} )
    @JoinColumn( name = "transmission_id" )
    private Transmission transmission;


    @OneToOne( cascade = {CascadeType.PERSIST} )
    @JoinColumn( name = "wheels_id" )
    private Wheels wheels;


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


    public void setEngine( Engine engine ) {
        this.engine = engine;
    }


    public Engine getEngine() {
        return engine;
    }


    public void setSuspension( Suspension suspension ) {
        this.suspension = suspension;
    }


    public Suspension getSuspension() {
        return suspension;
    }


    public void setTires( Tires tires ) {
        this.tires = tires;
    }


    public Tires getTires() {
        return tires;
    }


    public void setWheels( Wheels wheels ) {
        this.wheels = wheels;
    }


    public Wheels getWheels() {
        return wheels;
    }


    public void setTransmission( Transmission transmission ) {
        this.transmission = transmission;
    }


    public Transmission getTransmission() {
        return transmission;
    }


}
