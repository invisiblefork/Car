package com.invisiblefork.base.car.engine.forcedinduction;


import com.invisiblefork.base.BaseDao;
import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class ForcedInductionDao extends BaseDao {


    @Override
    public ForcedInduction read( String name ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List results = session.createQuery("from ForcedInduction where name ='" + name + "'").list();

        session.close();

        if ( results.size() > 0 ) {
            return (ForcedInduction)results.get(0);
        } else {
            return null;
        }

    }


    @Override
    public ForcedInduction read( Integer id ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        ForcedInduction forcedInduction = (ForcedInduction)session.get( ForcedInduction.class, id );

        session.getTransaction().commit();
        session.close();

        return forcedInduction;

    }


    @Override
    public List< ForcedInduction > readAll() {

        List<ForcedInduction> list = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        list = session.createQuery( "from ForcedInduction").list();

        session.getTransaction().commit();
        session.close();

        return list;

    }


}
