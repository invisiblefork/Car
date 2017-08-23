package com.invisiblefork.base.car.engine.forcedinduction;

import org.junit.Assert;
import org.junit.Test;

public class ForcedInductionDaoTest {


    @Test
    public void baseForcedInductionTest1() {

        ForcedInductionDao forcedInductionDao = new ForcedInductionDao();

        ForcedInduction forcedInduction = new ForcedInduction();
        forcedInduction.setName( "baseForcedInductionDaoTest1" );
        forcedInduction.setAdditionalTorque( 50 );
        forcedInduction.setAdditionalHorsePower( 50 );

        forcedInductionDao.create( forcedInduction );

        ForcedInduction savedForcedInduction = forcedInductionDao.read( "baseForcedInductionDaoTest1" );

        Assert.assertTrue( savedForcedInduction.getName().equals( "baseForcedInductionDaoTest1" ));

        forcedInductionDao.delete( savedForcedInduction );

        savedForcedInduction = null;

        savedForcedInduction = forcedInductionDao.read( "baseForcedInductionDaoTest1" );

        Assert.assertNull( savedForcedInduction );

    }


}
