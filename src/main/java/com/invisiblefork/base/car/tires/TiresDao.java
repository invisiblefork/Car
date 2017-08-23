package com.invisiblefork.base.car.tires;


import com.invisiblefork.base.BaseDao;
import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class TiresDao extends BaseDao {


    @Override
    public Tires read( String name ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List results = session.createQuery("from Tires where name ='" + name + "'").list();

        session.close();

        if ( results.size() > 0 ) {
            return (Tires)results.get(0);
        } else {
            return null;
        }

    }


    @Override
    public Tires read( Integer id ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Tires tires = (Tires)session.get( Tires.class, id );

        session.getTransaction().commit();
        session.close();

        return tires;

    }


    @Override
    public List< Tires > readAll() {

        List<Tires> list = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        list = session.createQuery( "from Tires").list();

        session.getTransaction().commit();
        session.close();

        return list;

    }


}
