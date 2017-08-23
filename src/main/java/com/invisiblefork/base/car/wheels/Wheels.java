package com.invisiblefork.base.car.wheels;

import com.invisiblefork.base.BaseObject;

import javax.persistence.*;

@Entity
@Table( name = "wheels" )
public class Wheels extends BaseObject {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;


    @Column( name = "name" )
    private String name;


    @Column( name = "width" )
    private Integer width;


    @Column( name = "height" )
    private Integer height;


    public Wheels() {}


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


    public Integer getWidth() {
        return width;
    }


    public void setWidth( Integer width ) {
        this.width = width;
    }


    public Integer getHeight() {
        return height;
    }


    public void setHeight( Integer height ) {
        this.height = height;
    }


}
