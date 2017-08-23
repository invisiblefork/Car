package com.invisiblefork.base.car.engine;


import com.invisiblefork.base.BaseDao;
import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class EngineDao extends BaseDao {


    @Override
    public Engine read( String name ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List results = session.createQuery("from Engine where name ='" + name + "'").list();

        session.close();

        if ( results.size() > 0 ) {
            return (Engine)results.get(0);
        } else {
            return null;
        }

    }


    @Override
    public Engine read( Integer id ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Engine engine = (Engine)session.get( Engine.class, id );

        session.getTransaction().commit();
        session.close();

        return engine;

    }


    @Override
    public List< Engine > readAll() {

        List<Engine> list = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        list = session.createQuery( "from Engine").list();

        session.getTransaction().commit();
        session.close();

        return list;

    }


}
