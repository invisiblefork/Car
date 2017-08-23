package com.invisiblefork.base.car.engine.enginepullys;

import org.junit.Assert;
import org.junit.Test;

public class EnginePullysDaoTest {


    @Test
    public void baseEnginePullyDaoTest1() {

        EnginePullysDao enginePullysDao = new EnginePullysDao();

        EnginePullys enginePullys = new EnginePullys();
        enginePullys.setName( "baseEnginePullysDaoTest1" );

        enginePullys.setAdditionalHorsePower( 3 );
        enginePullys.setAdditionalTorque( 3 );

        enginePullysDao.create( enginePullys );

        EnginePullys savedEnginePullys = enginePullysDao.read( "baseEnginePullysDaoTest1" );

        Assert.assertTrue( savedEnginePullys.getName().equals( "baseEnginePullysDaoTest1" ));

        enginePullysDao.delete( savedEnginePullys );

        savedEnginePullys = null;

        savedEnginePullys = enginePullysDao.read( "baseEnginePullysDaoTest1" );

        Assert.assertNull( savedEnginePullys );

    }


}
