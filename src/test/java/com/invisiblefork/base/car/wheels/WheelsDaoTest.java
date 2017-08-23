package com.invisiblefork.base.car.wheels;

import org.junit.Assert;
import org.junit.Test;

public class WheelsDaoTest {


    @Test
    public void baseWheelsDaoTest1() {

        WheelsDao wheelsDao = new WheelsDao();

        Wheels wheels = new Wheels();
        wheels.setName( "baseWheelsDaoTest1" );
        wheels.setHeight( 20 );
        wheels.setWidth( 8 );

        wheelsDao.create( wheels );

        Wheels savedWheel = wheelsDao.read( "baseWheelsDaoTest1" );

        Assert.assertTrue( savedWheel.getName().equals( "baseWheelsDaoTest1" ));

        wheelsDao.delete( savedWheel );

        savedWheel = null;

        savedWheel = wheelsDao.read( "baseWheelsDaoTest1" );

        Assert.assertNull( savedWheel );

    }


}
