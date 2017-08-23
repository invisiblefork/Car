package com.invisiblefork.base.car.wheels;


import com.invisiblefork.base.BaseDao;
import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;


public class WheelsDao extends BaseDao {


    @Override
    public Wheels read( String name ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List results = session.createQuery("from Wheels where name ='" + name + "'").list();

        session.close();

        if ( results.size() > 0 ) {
            return (Wheels)results.get(0);
        } else {
            return null;
        }

    }


    @Override
    public Wheels read( Integer id ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Wheels wheels = (Wheels)session.get( Wheels.class, id );

        session.getTransaction().commit();
        session.close();

        return wheels;

    }

    @Override
    public List< Wheels > readAll() {

        List<Wheels> list = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        list = session.createQuery( "from Wheels").list();

        session.getTransaction().commit();
        session.close();

        return list;

    }


}
