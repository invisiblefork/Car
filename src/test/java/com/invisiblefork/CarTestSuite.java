package com.invisiblefork;

import com.invisiblefork.base.car.CarDaoTest;
import com.invisiblefork.base.car.CarTest;
import com.invisiblefork.base.car.engine.EngineDaoTest;
import com.invisiblefork.base.car.engine.EngineTest;
import com.invisiblefork.base.car.engine.airintake.AirIntakeDaoTest;
import com.invisiblefork.base.car.engine.airintake.AirIntakeTest;
import com.invisiblefork.base.car.engine.ecu.EcuDaoTest;
import com.invisiblefork.base.car.engine.ecu.EcuTest;
import com.invisiblefork.base.car.engine.enginepullys.EnginePullysDaoTest;
import com.invisiblefork.base.car.engine.enginepullys.EnginePullysTest;
import com.invisiblefork.base.car.engine.forcedinduction.ForcedInductionDaoTest;
import com.invisiblefork.base.car.engine.forcedinduction.ForcedInductionTest;
import com.invisiblefork.base.car.suspension.SuspensionDaoTest;
import com.invisiblefork.base.car.suspension.SuspensionTest;
import com.invisiblefork.base.car.tires.TiresDaoTest;
import com.invisiblefork.base.car.tires.TiresTest;
import com.invisiblefork.base.car.transmission.TransmissionDaoTest;
import com.invisiblefork.base.car.transmission.TransmissionTest;
import com.invisiblefork.base.car.wheels.WheelsDaoTest;
import com.invisiblefork.base.car.wheels.WheelsTest;
import com.invisiblefork.util.HibernateUtilTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith( Suite.class )
@Suite.SuiteClasses( {

        HibernateUtilTest.class,
        CarTest.class,
        CarDaoTest.class,
        WheelsTest.class,
        WheelsDaoTest.class,
        TransmissionTest.class,
        TransmissionDaoTest.class,
        TiresTest.class,
        TiresDaoTest.class,
        SuspensionTest.class,
        SuspensionDaoTest.class,
        EngineTest.class,
        EngineDaoTest.class,
        ForcedInductionTest.class,
        ForcedInductionDaoTest.class,
        EnginePullysTest.class,
        EnginePullysDaoTest.class,
        EcuTest.class,
        EcuDaoTest.class,
        AirIntakeTest.class,
        AirIntakeDaoTest.class,

} )

public class CarTestSuite {}