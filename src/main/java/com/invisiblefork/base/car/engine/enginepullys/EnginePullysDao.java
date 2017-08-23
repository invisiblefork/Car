package com.invisiblefork.base.car.engine.enginepullys;


import com.invisiblefork.base.BaseDao;
import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class EnginePullysDao extends BaseDao {


    @Override
    public EnginePullys read( String name ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List results = session.createQuery("from EnginePullys where name ='" + name + "'").list();

        session.close();

        if ( results.size() > 0 ) {
            return (EnginePullys)results.get(0);
        } else {
            return null;
        }

    }


    @Override
    public List< EnginePullys > readAll() {

        List<EnginePullys> list = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        list = session.createQuery( "from EnginePullys").list();

        session.getTransaction().commit();
        session.close();

        return list;

    }


    @Override
    public EnginePullys read( Integer id ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        EnginePullys enginePullys = (EnginePullys)session.get( EnginePullys.class, id );

        session.getTransaction().commit();
        session.close();

        return enginePullys;

    }


}
