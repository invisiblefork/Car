package com.invisiblefork.base.car.suspension;

import com.invisiblefork.base.BaseObject;

import javax.persistence.*;

@Entity
@Table( name = "suspension" )
public class Suspension extends BaseObject {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;


    @Column( name = "name" )
    private String name;


    public Suspension() {}


    public String getName() {
        return name;
    }


    public void setName( String name ) {
        this.name = name;
    }


}
