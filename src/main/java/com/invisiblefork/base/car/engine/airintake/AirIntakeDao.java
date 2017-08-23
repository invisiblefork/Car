package com.invisiblefork.base.car.engine.airintake;


import com.invisiblefork.base.BaseDao;
import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class AirIntakeDao extends BaseDao {


    @Override
    public AirIntake read( String name ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List results = session.createQuery("from AirIntake where name ='" + name + "'").list();

        session.close();

        if ( results.size() > 0 ) {
            return (AirIntake)results.get(0);
        } else {
            return null;
        }

    }


    @Override
    public List< AirIntake > readAll() {

        List<AirIntake> list = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        list = session.createQuery( "from AirIntake").list();

        session.getTransaction().commit();
        session.close();

        return list;

    }



    @Override
    public AirIntake read( Integer id ) {


        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        AirIntake airIntake = (AirIntake)session.get( AirIntake.class, id );

        session.flush();
        session.close();

        return airIntake;

    }
}
