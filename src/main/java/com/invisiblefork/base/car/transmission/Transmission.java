package com.invisiblefork.base.car.transmission;

import com.invisiblefork.base.BaseObject;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table( name = "transmission" )
public class Transmission extends BaseObject {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;


    @Column( name = "name" )
    private String name;


    @Column( name = "gear_1" )
    private Float gear1;


    @Column( name = "gear_2" )
    private Float gear2;


    @Column( name = "gear_3" )
    private Float gear3;


    @Column( name = "gear_4" )
    private Float gear4;


    @Column( name = "gear_5" )
    private Float gear5;


    @Column( name = "gear_6" )
    private Float gear6;


    @Column( name = "gear_7" )
    private Float gear7;


    @Column( name = "gear_8" )
    private Float gear8;


    @Column( name = "gear_9" )
    private Float gear9;


    @Column( name = "gear_10" )
    private Float gear10;


    @Column( name = "reverse" )
    private Float reverse;


    public Transmission() {

    }


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


    public ArrayList<Float> getGearRatios() {

        ArrayList<Float> gearRatios = new ArrayList<>();

        if ( this.getGear1() != null ) {
            gearRatios.add( this.getGear1() );
        }

        if ( this.getGear2() != null ) {
            gearRatios.add( this.getGear2() );
        }

        if ( this.getGear3() != null ) {
            gearRatios.add( this.getGear3() );
        }

        if ( this.getGear4() != null ) {
            gearRatios.add( this.getGear4() );
        }

        if ( this.getGear5() != null ) {
            gearRatios.add( this.getGear5() );
        }

        if ( this.getGear6() != null ) {
            gearRatios.add( this.getGear6() );
        }

        if ( this.getGear7() != null ) {
            gearRatios.add( this.getGear7() );
        }

        if ( this.getGear8() != null ) {
            gearRatios.add( this.getGear8() );
        }

        if ( this.getGear9() != null ) {
            gearRatios.add( this.getGear9() );
        }

        if ( this.getGear10() != null ) {
            gearRatios.add( this.getGear10() );
        }

        return gearRatios;
    }


    public void setGearRatios( ArrayList<Float> gearRatios ) {


        for ( int i = 0; i < gearRatios.size(); i++ ) {

            if ( i == 0) {
                this.setGear1( gearRatios.get(i) );
            }

            if ( i == 1) {
                this.setGear2( gearRatios.get(i) );
            }

            if ( i == 2) {
                this.setGear3( gearRatios.get(i) );
            }

            if ( i == 3) {
                this.setGear4( gearRatios.get(i) );
            }

            if ( i == 4) {
                this.setGear5( gearRatios.get(i) );
            }

            if ( i == 5) {
                this.setGear6( gearRatios.get(i) );
            }

            if ( i == 6) {
                this.setGear7( gearRatios.get(i) );
            }

            if ( i == 7) {
                this.setGear8( gearRatios.get(i) );
            }

            if ( i == 8) {
                this.setGear9( gearRatios.get(i) );
            }

            if ( i == 9) {
                this.setGear10( gearRatios.get(i) );
            }
        }

    }


    public Float getGear1() {
        return gear1;
    }


    public void setGear1( Float gear1 ) {
        this.gear1 = gear1;
    }


    public Float getGear2() {
        return gear2;
    }


    public void setGear2( Float gear2 ) {
        this.gear2 = gear2;
    }


    public Float getGear3() {
        return gear3;
    }


    public void setGear3( Float gear3 ) {
        this.gear3 = gear3;
    }


    public Float getGear4() {
        return gear4;
    }


    public void setGear4( Float gear4 ) {
        this.gear4 = gear4;
    }


    public Float getGear5() {
        return gear5;
    }


    public void setGear5( Float gear5 ) {
        this.gear5 = gear5;
    }


    public Float getGear6() {
        return gear6;
    }


    public void setGear6( Float gear6 ) {
        this.gear6 = gear6;
    }


    public Float getGear7() {
        return gear7;
    }


    public void setGear7( Float gear7 ) {
        this.gear7 = gear7;
    }


    public Float getGear8() {
        return gear8;
    }


    public void setGear8( Float gear8 ) {
        this.gear8 = gear8;
    }


    public Float getGear9() {
        return gear9;
    }


    public void setGear9( Float gear9 ) {
        this.gear9 = gear9;
    }


    public Float getGear10() {
        return gear10;
    }


    public void setGear10( Float gear10 ) {
        this.gear10 = gear10;
    }


    public Float getReverse() {
        return reverse;
    }


    public void setReverse( Float reverse ) {
        this.reverse = reverse;
    }


}
