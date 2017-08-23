package com.invisiblefork.base.car.engine.ecu;


import com.invisiblefork.base.BaseDao;
import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class EcuDao extends BaseDao {


    @Override
    public Ecu read( String name ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List results = session.createQuery("from Ecu where name ='" + name + "'").list();

        session.close();

        if ( results.size() > 0 ) {
            return (Ecu)results.get(0);
        } else {
            return null;
        }

    }


    @Override
    public List< Ecu > readAll() {

        List<Ecu> list = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        list = session.createQuery( "from Ecu").list();

        session.getTransaction().commit();
        session.close();

        return list;

    }


    @Override
    public Ecu read( Integer id ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Ecu ecu = (Ecu)session.get( Ecu.class, id );

        session.getTransaction().commit();
        session.close();

        return ecu;

    }


}
