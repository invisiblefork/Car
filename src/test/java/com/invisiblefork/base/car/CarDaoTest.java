package com.invisiblefork.base.car;

import com.invisiblefork.base.car.wheels.Wheels;
import com.invisiblefork.base.car.wheels.WheelsDao;
import org.junit.Assert;
import org.junit.Test;


public class CarDaoTest {


    /**
     * Create a car.  Save.  Update.
     */
    @Test
    public void baseCarDaoUpdateTest1() {

        CarDao carDao = new CarDao();
        WheelsDao wheelsDao = new WheelsDao();

        Car car = new Car();
        car.setName( "baseCarDaoUpdateTest1" );

        Wheels wheels = new Wheels();
        wheels.setName( "baseCarDaoUpdateTest1" );
        wheels.setHeight( 20 );
        wheels.setWidth( 8 );

        int x = carDao.create( car );

        Car savedCar = carDao.read( "baseCarDaoUpdateTest1" );

        Wheels newWheels = new Wheels();
        newWheels.setName( "new wheels" );
        newWheels.setHeight( 22 );
        newWheels.setWidth( 6 );

        int i = wheelsDao.create( newWheels );

        savedCar.setWheels( newWheels );

        carDao.update( savedCar );

        savedCar = null;

        savedCar = carDao.read( "baseCarDaoUpdateTest1" );

        Assert.assertTrue( savedCar.getWheels().getName().equals( "new wheels" ) );

        carDao.delete( savedCar );
        wheelsDao.delete( wheelsDao.read( "new wheels" ));
    }


    /**
     * Create a car.  Save.  Delete.
     */
    @Test
    public void baseCarDaoTest1() {

        CarDao carDao = new CarDao();

        Car car = new Car();
        car.setName( "baseCarDaoTest1" );

        carDao.create( car );

        Car savedCar = carDao.read( "baseCarDaoTest1" );
        carDao.delete( savedCar );

        savedCar = null;

        savedCar = carDao.read( "baseCarDaoTest1" );

        Assert.assertNull( savedCar );

    }


}