package com.invisiblefork.base;

import com.invisiblefork.base.car.Car;
import com.invisiblefork.base.car.CarDao;
import com.invisiblefork.base.car.engine.Engine;
import com.invisiblefork.base.car.engine.EngineDao;
import com.invisiblefork.base.car.engine.airintake.AirIntake;
import com.invisiblefork.base.car.engine.airintake.AirIntakeDao;
import com.invisiblefork.base.car.engine.ecu.Ecu;
import com.invisiblefork.base.car.engine.ecu.EcuDao;
import com.invisiblefork.base.car.engine.enginepullys.EnginePullys;
import com.invisiblefork.base.car.engine.enginepullys.EnginePullysDao;
import com.invisiblefork.base.car.engine.forcedinduction.ForcedInduction;
import com.invisiblefork.base.car.engine.forcedinduction.ForcedInductionDao;
import com.invisiblefork.base.car.suspension.Suspension;
import com.invisiblefork.base.car.suspension.SuspensionDao;
import com.invisiblefork.base.car.tires.Tires;
import com.invisiblefork.base.car.tires.TiresDao;
import com.invisiblefork.base.car.transmission.Transmission;
import com.invisiblefork.base.car.transmission.TransmissionDao;
import com.invisiblefork.base.car.wheels.Wheels;
import com.invisiblefork.base.car.wheels.WheelsDao;

import java.util.ArrayList;

public class BaseGarage {


    private CarDao carDao;
    private WheelsDao wheelsDao;
    private TransmissionDao transmissionDao;
    private TiresDao tiresDao;
    private SuspensionDao suspensionDao;
    private EngineDao engineDao;
    private ForcedInductionDao forcedInductionDao;
    private EnginePullysDao enginePullysDao;
    private EcuDao ecuDao;
    private AirIntakeDao airIntakeDao;



    public BaseGarage() {

        carDao = new CarDao();
        wheelsDao = new WheelsDao();
        transmissionDao = new TransmissionDao();
        tiresDao = new TiresDao();
        suspensionDao = new SuspensionDao();
        engineDao = new EngineDao();
        forcedInductionDao = new ForcedInductionDao();
        enginePullysDao = new EnginePullysDao();
        ecuDao = new EcuDao();
        airIntakeDao = new AirIntakeDao();

        runTest();

    }


    public void runTest() {

//        Car car = buildTestCar( "_2" );

//        CarDao.delete( car );

        Car car = carDao.read( 1 );
        Wheels wheels = wheelsDao.read( 1 );
        Transmission transmission = transmissionDao.read( 1 );
        Tires tires = tiresDao.read( 1 );
        Suspension suspension = suspensionDao.read( 1 );
        Engine engine = engineDao.read( 1 );
        ForcedInduction forcedInduction = forcedInductionDao.read( 1 );
        EnginePullys enginePullys = enginePullysDao.read( 1 );
        Ecu ecu = ecuDao.read( 1 );
        AirIntake airIntake = airIntakeDao.read( 1 );



        System.out.println( "car: " + car.getName() );
        System.out.println( "wheels: " + wheels.getName() );
        System.out.println( "transmission: " + transmission.getName() );
        System.out.println( "tires: " + tires.getName() );
        System.out.println( "suspension: " + suspension.getName() );
        System.out.println( "engine: " + engine.getName() );
        System.out.println( "forcedInduction: " + forcedInduction.getName() );
        System.out.println( "enginePullys: " + enginePullys.getName() );
        System.out.println( "ecu: " + ecu.getName() );
        System.out.println( "airIntake: " + airIntake.getName() );


//        System.out.println( "car: " + carDao.readAll() );
//        System.out.println( "wheels: " + wheelsDao.readAll() );
//        System.out.println( "transmission: " + transmissionDao.readAll() );
//        System.out.println( "tires: " + tiresDao.readAll() );
//        System.out.println( "suspension: " + suspensionDao.readAll() );
//        System.out.println( "engine: " + engineDao.readAll() );
//        System.out.println( "forcedInduction: " + forcedInductionDao.readAll() );
//        System.out.println( "enginePullys: " + enginePullysDao.readAll() );
//        System.out.println( "ecu: " + ecuDao.readAll() );
//        System.out.println( "airIntake: " + airIntake.getName() );

        carDao.delete( car );
        wheelsDao.delete( wheels );
        transmissionDao.delete( transmission );
        tiresDao.delete( tires );
        suspensionDao.delete( suspension );
        engineDao.delete( engine );
        forcedInductionDao.delete( forcedInduction );
        enginePullysDao.delete( enginePullys );
        ecuDao.delete( ecu );
        airIntakeDao.delete( airIntake );


        car = null;
        wheels = null;
        transmission = null;
        tires = null;
        suspension = null;
        engine = null;
        forcedInduction = null;
        enginePullys = null;
        ecu = null;
        airIntake = null;

//        car = carDao.read( 2 );
//        wheels = wheelsDao.read( 2 );
//        transmission = transmissionDao.read( 2 );
//        tires = tiresDao.read( 2 );
//        suspension = suspensionDao.read( 2 );
//        engine = engineDao.read( 2 );
//        forcedInduction = forcedInductionDao.read( 2 );
//        enginePullys = enginePullysDao.read( 2 );
//        ecu = ecuDao.read( 2 );
//        airIntake = airIntakeDao.read( 2 );



        System.out.println( "\n\ncar: " + car.getName() );
        System.out.println( "wheels: " + wheels.getName() );
        System.out.println( "transmission: " + transmission.getName() );
        System.out.println( "tires: " + tires.getName() );
        System.out.println( "suspension: " + suspension.getName() );
        System.out.println( "engine: " + engine.getName() );
        System.out.println( "forcedInduction: " + forcedInduction.getName() );
        System.out.println( "enginePullys: " + enginePullys.getName() );
        System.out.println( "ecu: " + ecu.getName() );
        System.out.println( "airIntake: " + airIntake.getName() );


        System.exit(0);

    }


    private Car buildTestCar( String appendToName ) {

        ArrayList<Float> gears = new ArrayList<>();
        gears.add( 3.1F );
        gears.add( 2.7F );

        Suspension sus = buildSuspension( "Test Suspension" + appendToName );
        Transmission trans = buildTransmission( "Test Transmission" + appendToName, gears, 3.78F );
        Tires tires = buildsTires( "Test tires" + appendToName, 0.5F );
        Wheels wheels = buildWheels( "Test wheels" + appendToName, 8, 18 );

        ForcedInduction fi = buildForcedInduction( "Test Turbo" + appendToName, 76, 82 );
        AirIntake ai = buildAirIntake( "Test Air Intake" + appendToName, 68.4f, 12, 8 );
        Ecu ecu = buildEcu( "Test Ecu" + appendToName , 22, 25 );
        EnginePullys ep = buildEnginePullys( "Test Pullys" + appendToName, 9, 8 );

        Engine engine = buildEngine( "Test engine" + appendToName, 288, 257, 6700, ep, ai, ecu, fi );

        Car car = buildCar( "Test Car" + appendToName, engine, trans, sus, wheels, tires );

        return car;

    }


    public Car buildCar( String name, Engine engine, Transmission transmission, Suspension suspension, Wheels wheels, Tires tires ) {

        Car car = new Car();

        car.setName( name );

        car.setEngine( engine );
        car.setTransmission( transmission );
        car.setSuspension( suspension );
        car.setWheels( wheels );
        car.setTires( tires );

        Integer x = carDao.create( car );

        return car;
    }


    public Engine buildEngine( String name, Integer horsepower, Integer torque, Integer rpmRange, EnginePullys ep, AirIntake ai, Ecu ecu, ForcedInduction fi ) {

        Engine engine = new Engine();
        engine.setName( name );
        engine.setForcedInduction( fi );
        engine.setAirIntake( ai );
        engine.setEcu( ecu );
        engine.setEnginePullys( ep );
        engine.setHorsepower( horsepower );
        engine.setRpmRange( rpmRange );
        engine.setTorque( torque );

        Integer x = engineDao.create( engine );

        return engine;
    }


    public Transmission buildTransmission( String name, ArrayList<Float> gears, Float reverse ) {

        Transmission transmission = new Transmission();
        transmission.setName( name );
        transmission.setGearRatios( gears );
        transmission.setReverse( reverse );

        Integer x = transmissionDao.create( transmission );

        return transmission;
    }


    public AirIntake buildAirIntake( String name, Float airFlow, Integer additionalHorsepower, Integer additionalTorque ) {

        AirIntake airIntake = new AirIntake();
        airIntake.setName( name );
        airIntake.setAdditionalHorsePower( additionalHorsepower );
        airIntake.setAdditionalTorque( additionalTorque );
        airIntake.setAirFlow( airFlow );
        Integer x = airIntakeDao.create( airIntake );

        return airIntake;
    }


    public Ecu buildEcu( String name, Integer additionalHorsepower, Integer additionalTorque ) {

        Ecu ecu = new Ecu();
        ecu.setName( name );
        ecu.setAdditionalHorsePower( additionalHorsepower );
        ecu.setAdditionalTorque( additionalTorque );

        Integer x = ecuDao.create( ecu );

        return ecu;
    }


    public EnginePullys buildEnginePullys( String name, Integer additionalHorsepower, Integer additionalTorque ) {

        EnginePullys enginePullys = new EnginePullys();
        enginePullys.setName( name );
        enginePullys.setAdditionalHorsePower( additionalHorsepower );
        enginePullys.setAdditionalTorque( additionalTorque );

        Integer x = enginePullysDao.create( enginePullys );

        return enginePullys;
    }

    public ForcedInduction buildForcedInduction( String name, Integer additionalHorsepower, Integer additionalTorque ) {

        ForcedInduction forcedInduction = new ForcedInduction();
        forcedInduction.setName( name );
        forcedInduction.setAdditionalHorsePower( additionalHorsepower );
        forcedInduction.setAdditionalTorque( additionalTorque );

        Integer x = forcedInductionDao.create( forcedInduction );

        return forcedInduction;
    }


    public Suspension buildSuspension( String name ) {

        Suspension suspension = new Suspension();
        suspension.setName( name );
        Integer x = suspensionDao.create( suspension );

        return suspension;
    }


    public Wheels buildWheels( String name, Integer width, Integer height ) {

        Wheels wheels = new Wheels();
        wheels.setName( name );
        wheels.setWidth( width );
        wheels.setHeight( height );

        Integer x = wheelsDao.create( wheels );

        return wheels;
    }

    public Tires buildsTires( String name, Float frictionCoefficient ) {

        Tires tires = new Tires();
        tires.setName( name );
        tires.setFrictionCoefficient( frictionCoefficient );

        Integer x = tiresDao.create( tires );

        return tires;

    }


    public static void main( String [] args ) {
        new BaseGarage();
    }


}
