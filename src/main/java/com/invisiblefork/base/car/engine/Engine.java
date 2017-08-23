package com.invisiblefork.base.car.engine;

import com.invisiblefork.base.BaseObject;
import com.invisiblefork.base.car.engine.airintake.AirIntake;
import com.invisiblefork.base.car.engine.ecu.Ecu;
import com.invisiblefork.base.car.engine.enginepullys.EnginePullys;
import com.invisiblefork.base.car.engine.forcedinduction.ForcedInduction;

import javax.persistence.*;

@Entity
@Table( name = "engine" )
public class Engine extends BaseObject {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;


    @Column( name = "name" )
    private String name;


    // Engine variables.
    @Column( name = "rpm_range" )
    private Integer rpmRange;


    @Column( name = "horsepower" )
    private Integer horsepower;


    @Column( name = "torque" )
    private Integer torque;


    // Engine components.
    @OneToOne( cascade = {CascadeType.PERSIST} )
    @JoinColumn( name = "engine_pullys_id" )
    private EnginePullys enginePullys;


    @OneToOne( cascade = {CascadeType.PERSIST} )
    @JoinColumn( name = "ecu_id" )
    private Ecu ecu;


    @OneToOne( cascade = {CascadeType.PERSIST} )
    @JoinColumn( name = "forced_induction_id" )
    private ForcedInduction forcedInduction;


    @OneToOne( cascade = {CascadeType.PERSIST} )
    @JoinColumn( name = "air_intake_id" )
    private AirIntake airIntake;


    public Engine() {}


    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }


    public EnginePullys getEnginePullys() {
        return enginePullys;
    }


    public void setEnginePullys( EnginePullys enginePullys ) {
        this.enginePullys = enginePullys;
    }


    public Ecu getEcu() {
        return ecu;
    }


    public void setEcu( Ecu ecu ) {
        this.ecu = ecu;
    }


    public ForcedInduction getForcedInduction() {
        return forcedInduction;
    }


    public void setForcedInduction( ForcedInduction forcedInduction ) {
        this.forcedInduction = forcedInduction;
    }


    public Integer getHorsepower() {
        return horsepower;
    }


    public void setHorsepower( Integer horsepower ) {
        this.horsepower = horsepower;
    }


    public Integer getTorque() {
        return torque;
    }


    public void setTorque( Integer torque ) {
        this.torque = torque;
    }


    public Integer getRpmRange() {
        return rpmRange;
    }


    public void setRpmRange( Integer rpmRange ) {
        this.rpmRange = rpmRange;
    }


    public AirIntake getAirIntake() {
        return airIntake;
    }


    public void setAirIntake( AirIntake airIntake ) {
        this.airIntake = airIntake;
    }



    @Override
    public Integer getId() {
        return id;
    }


    @Override
    public void setId( Integer id ) {
        this.id = id;
    }


}
