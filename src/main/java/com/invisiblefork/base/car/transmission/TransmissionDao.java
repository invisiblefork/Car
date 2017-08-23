package com.invisiblefork.base.car.transmission;

import com.invisiblefork.base.BaseDao;
import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class TransmissionDao extends BaseDao {


    @Override
    public Transmission read( String name ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List results = session.createQuery("from Transmission where name ='" + name + "'").list();

        session.close();

        if ( results.size() > 0 ) {
            return (Transmission)results.get(0);
        } else {
            return null;
        }

    }


    @Override
    public Transmission read( Integer id ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Transmission transmission = (Transmission)session.get( Transmission.class, id );

        session.getTransaction().commit();
        session.close();

        return transmission;

    }


    @Override
    public List< Transmission > readAll() {

        List<Transmission> list = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        list = session.createQuery( "from Transmission").list();

        session.getTransaction().commit();
        session.close();

        return list;

    }


}
