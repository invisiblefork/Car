package com.invisiblefork.base.car.engine.ecu;

import org.junit.Assert;
import org.junit.Test;

public class EcuDaoTest {

    @Test
    public void baseEcuDaoTest1() {

        EcuDao ecuDao = new EcuDao();

        Ecu ecu = new Ecu();
        ecu.setName( "baseEcuDaoTest1" );
        ecu.setAdditionalHorsePower( 3 );
        ecu.setAdditionalTorque( 3 );

        ecuDao.create( ecu );

        Ecu savedEcu = ecuDao.read( "baseEcuDaoTest1" );

        Assert.assertTrue( savedEcu.getName().equals( "baseEcuDaoTest1" ));

        ecuDao.delete( savedEcu );

        savedEcu = null;

        savedEcu = ecuDao.read( "baseEcuDaoTest1" );

        Assert.assertNull( savedEcu );

    }


}
