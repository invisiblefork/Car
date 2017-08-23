package com.invisiblefork.base;


import com.invisiblefork.util.HibernateUtil;
import org.hibernate.Session;


public abstract class BaseDao {


    public abstract Object read( Integer id );
    public abstract Object readAll();
    public abstract Object read( String name );


    public Integer create( Object o ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(o);

        session.getTransaction().commit();

        session.flush();
        session.close();

        return ((BaseObject)o).getId();
    }


    public void update( Object o ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.update(o);

        session.getTransaction().commit();

        session.flush();
        session.close();

    }


    public void delete( Object o ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.delete(o);

        session.getTransaction().commit();

        session.flush();
        session.close();

    }


}
