package com.invisiblefork.base.car.engine.airintake;

import com.invisiblefork.base.BaseObject;

import javax.persistence.*;

@Entity
@Table( name = "air_intake" )
public class AirIntake extends BaseObject {

    /**
     * Example Calculations:
     * Minimum Intake Width: 3'' X 3'' (9 Sq. Inches)
     * Displacement: 2.4 liters (~1.2 liter volume intake per revolution assuming counterbalanced pistons)
     * RPM: 6000 Volume / Min: (1.2 X 6000) 7200 liters / min
     * Cubic Feet / Min: (0.0353147 cubic feet / liter) 0.0353147 X 7200 = 254 cubic feet / min
     * Cubic Feet / Sec: 4.24
     * Feet / Sec Through Intake: 4.24 / (0.25' * 0.25') = 67.8 ft / sec
     *
     * Reference https://www.physicsforums.com/threads/air-intake-design-turbulent-flow-modifications.761014/
     */

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;


    @Column( name = "name" )
    private String name;


    @Column( name = "air_flow" )
    private Float airFlow;


    @Column( name = "additional_torque" )
    private Integer additionalTorque;


    @Column( name = "additional_horsepower" )
    private Integer additionalHorsePower;


    public AirIntake() {}


    public String getName() {
        return name;
    }


    public void setName( String name ) {
        this.name = name;
    }


    /**
     * Air flow in feet/sec
     * @return feet/sec for particular implementation.
     */
    public Float getAirFlow() {
        return airFlow;
    }


    public void setAirFlow( Float airFlow ) {
        this.airFlow = airFlow;
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
