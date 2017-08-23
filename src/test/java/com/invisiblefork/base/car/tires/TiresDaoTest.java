package com.invisiblefork.base.car.tires;

import org.junit.Assert;
import org.junit.Test;

public class TiresDaoTest {


    @Test
    public void baseTiresDaoTest1() {

        TiresDao tiresDao = new TiresDao();

        Tires tires = new Tires();
        tires.setName( "baseTiresDaoTest1" );
        tires.setFrictionCoefficient( 0.7f );

        tiresDao.create( tires );

        Tires savedTires = tiresDao.read( "baseTiresDaoTest1" );

        Assert.assertTrue( savedTires.getName().equals( "baseTiresDaoTest1" ));

        tiresDao.delete( savedTires );

        savedTires = null;

        savedTires = tiresDao.read( "baseTiresDaoTest1" );

        Assert.assertNull( savedTires );

    }

}
