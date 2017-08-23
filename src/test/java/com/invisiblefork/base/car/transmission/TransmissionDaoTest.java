package com.invisiblefork.base.car.transmission;


import org.junit.Assert;
import org.junit.Test;

public class TransmissionDaoTest {


    @Test
    public void baseWheelsDaoTest1() {

        TransmissionDao transmissionDao = new TransmissionDao();

        Transmission transmission = new Transmission();
        transmission.setName( "baseTransmissionDaoTest1" );

        transmissionDao.create( transmission );

        Transmission savedTransmission = transmissionDao.read( "baseTransmissionDaoTest1" );

        Assert.assertTrue( savedTransmission.getName().equals( "baseTransmissionDaoTest1" ));

        transmissionDao.delete( savedTransmission );

        savedTransmission = null;

        savedTransmission = transmissionDao.read( "baseTransmissionDaoTest1" );

        Assert.assertNull( savedTransmission );

    }


}
