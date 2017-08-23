package com.invisiblefork.base.car.engine.airintake;

import org.junit.Assert;
import org.junit.Test;

public class AirIntakeDaoTest {


    @Test
    public void baseAirIntakeDaoTest1() {

        AirIntakeDao airIntakeDao = new AirIntakeDao();

        AirIntake airIntake = new AirIntake();
        airIntake.setName( "baseAirIntakeDaoTest1" );
        airIntake.setAirFlow( 0.5f );
        airIntake.setAdditionalHorsePower( 3 );
        airIntake.setAdditionalTorque( 3 );

        airIntakeDao.create( airIntake );

        AirIntake savedAirIntake = airIntakeDao.read( "baseAirIntakeDaoTest1" );

        Assert.assertTrue( savedAirIntake.getName().equals( "baseAirIntakeDaoTest1" ));

        airIntakeDao.delete( savedAirIntake );

        savedAirIntake = null;

        savedAirIntake = airIntakeDao.read( "baseAirIntakeDaoTest1" );

        Assert.assertNull( savedAirIntake );

    }


}
