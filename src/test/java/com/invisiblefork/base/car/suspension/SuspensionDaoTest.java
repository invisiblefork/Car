package com.invisiblefork.base.car.suspension;

import org.junit.Assert;
import org.junit.Test;

public class SuspensionDaoTest {


    @Test
    public void baseWheelsDaoTest1() {

        SuspensionDao suspensionDao = new SuspensionDao();

        Suspension suspension = new Suspension();
        suspension.setName( "baseSuspensionDaoTest1" );

        suspensionDao.create( suspension );

        Suspension savedSuspension = suspensionDao.read( "baseSuspensionDaoTest1" );

        Assert.assertTrue( savedSuspension.getName().equals( "baseSuspensionDaoTest1" ));

        suspensionDao.delete( savedSuspension );

        savedSuspension = null;

        savedSuspension = suspensionDao.read( "baseSuspensionDaoTest1" );

        Assert.assertNull( savedSuspension );

    }

}
