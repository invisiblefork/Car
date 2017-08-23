package com.invisiblefork.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public interface HibernateUtil {


    static SessionFactory getSessionFactory() {

        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings( configuration.getProperties() );

        return configuration.buildSessionFactory( builder.build() );
    }


}
