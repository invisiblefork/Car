package com.invisiblefork.base.car;


import com.invisiblefork.base.BaseDao;
import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class CarDao extends BaseDao {


    @Override
    public Car read( String name ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List results = session.createQuery("from Car where name ='" + name + "'").list();

        session.close();

        if ( results.size() > 0 ) {

            return (Car)results.get(0);

        } else {

            return null;

        }

    }


    @Override
    public Car read( Integer id ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Car car = (Car)session.get( Car.class, id );

        session.getTransaction().commit();
        session.close();

        return car;

    }


    @Override
    public List< Car > readAll() {

        List<Car> list = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        list = session.createQuery( "from Car").list();

        session.getTransaction().commit();
        session.close();

        return list;

    }


}
