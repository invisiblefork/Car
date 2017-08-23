package com.invisiblefork.base.car.engine;


import org.junit.Assert;
import org.junit.Test;

public class EngineDaoTest {


    @Test
    public void baseEngineDaoTest1() {

        EngineDao engineDao = new EngineDao();

        Engine engine = new Engine();
        engine.setName( "baseEngineDaoTest1" );

        engine.setTorque( 300 );
        engine.setRpmRange( 7000 );
        engine.setHorsepower( 415 );


        engineDao.create( engine );

        Engine savedEngine = engineDao.read( "baseEngineDaoTest1" );

        Assert.assertTrue( savedEngine.getName().equals( "baseEngineDaoTest1" ));

        engineDao.delete( savedEngine );

        savedEngine = null;

        savedEngine = engineDao.read( "baseEngineDaoTest1" );

        Assert.assertNull( savedEngine );

    }

}
