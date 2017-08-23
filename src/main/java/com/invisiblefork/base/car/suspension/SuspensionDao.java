package com.invisiblefork.base.car.suspension;


import com.invisiblefork.base.BaseDao;
import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class SuspensionDao extends BaseDao {


    @Override
    public Suspension read( String name ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List results = session.createQuery("from Suspension where name ='" + name + "'").list();

        session.close();

        if ( results.size() > 0 ) {
            return (Suspension)results.get(0);
        } else {
            return null;
        }

    }


    @Override
    public List< Suspension > readAll() {

        List<Suspension> list = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        list = session.createQuery( "from Suspension").list();

        session.getTransaction().commit();
        session.close();

        return list;

    }


    @Override
    public Suspension read( Integer id ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Suspension suspension = (Suspension)session.get( Suspension.class, id );

        session.getTransaction().commit();
        session.close();

        return suspension;

    }


}
