package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setRollNo(66);
//        s1.setsName("Vaishvik Jaiswal");
//        s1.setAge(21);

//        Student s1 = new Student();
//        s1.setRollNo(66);
//        s1.setsName("Vaishvik Singh");
//        s1.setAge(21);

//        Student s2 = null;
//        Student s2 = null;

//        Configuration cf = new Configuration();
//        cf.addAnnotatedClass(org.example.Student.class);
//        cf.configure();

//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(org.example.Student.class)
//                .configure()
//                .buildSessionFactory();//cf.buildSessionFactory();
//        Session ss = sf.openSession();

//        Transaction ts = ss.beginTransaction();
//        ss.persist(s1);
//        ts.commit();

//        s2 = ss.get(Student.class, 64);

//        Transaction ts = ss.beginTransaction();
//        ss.merge(s1);
//        ts.commit();

//        s2 = ss.get(Student.class, 66);
//        Transaction ts = ss.beginTransaction();
//        ss.remove(s2);
//        ts.commit();

//        ss.close();
//        sf.close();

//        System.out.println(s2);

//        Alien a1 = new Alien();
//        a1.setAid(101);
//        a1.setAname("Navin");
//        a1.setTech("Java");
//
//        SessionFactory sf = new Configuration()
//                .configure()
//                .addAnnotatedClass(org.example.Alien.class)
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.persist(a1);
//        transaction.commit();
//        session.close();
//        sf.close();

//        Laptop l1 = new Laptop();
//        l1.setBrand("Asus");
//        l1.setModel("Rog");
//        l1.setRam(16);
//
//
//        Alien a1 = new Alien();
//        a1.setAid(101);
//        a1.setAname("Navin");
//        a1.setTech("Java");
//        a1.setLaptop(l1);
//
//        SessionFactory sf = new Configuration()
//                .configure()
//                .addAnnotatedClass(org.example.Alien.class)
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.persist(a1);
//        transaction.commit();
//
//        Alien a2 = session.get(Alien.class, 101);
//        System.out.println(a2);
//        session.close();
//        sf.close();

//        Laptop l1 = new Laptop();
//        l1.setLid(1);
//        l1.setBrand("Asus");
//        l1.setModel("Rog");
//        l1.setRam(16);
//
//
//        Alien a1 = new Alien();
//        a1.setAid(101);
//        a1.setAname("Navin");
//        a1.setTech("Java");
//        a1.setLaptop(l1);
//
//        SessionFactory sf = new Configuration()
//                .configure()
//                .addAnnotatedClass(org.example.Alien.class)
//                .addAnnotatedClass(org.example.Laptop.class)
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.persist(l1);
//        session.persist(a1);
//        transaction.commit();
//
//        Alien a2 = session.get(Alien.class, 101);
//        System.out.println(a2);
//        session.close();
//        sf.close();

//        Laptop l1 = new Laptop();
//        l1.setLid(1);
//        l1.setBrand("Asus");
//        l1.setModel("Rog");
//        l1.setRam(16);
//
//
//        Laptop l2 = new Laptop();
//        l2.setLid(2);
//        l2.setBrand("Dell");
//        l2.setModel("XPS");
//        l2.setRam(32);
//
//        Alien a1 = new Alien();
//        a1.setAid(101);
//        a1.setAname("Navin");
//        a1.setTech("Java");
//        a1.setLaptops(Arrays.asList(l1, l2));
//
//        l1.setAlien(a1);
//        l2.setAlien(a1);
//
//        SessionFactory sf = new Configuration()
//                .configure()
//                .addAnnotatedClass(org.example.Alien.class)
//                .addAnnotatedClass(org.example.Laptop.class)
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(a1);
//        transaction.commit();
//
//        Alien a2 = session.get(Alien.class, 101);
//        System.out.println(a2);
//        session.close();
//        sf.close();

//        Laptop l1 = new Laptop();
//        l1.setLid(1);
//        l1.setBrand("Asus");
//        l1.setModel("Rog");
//        l1.setRam(16);
//
//
//        Laptop l2 = new Laptop();
//        l2.setLid(2);
//        l2.setBrand("Dell");
//        l2.setModel("XPS");
//        l2.setRam(32);
//
//        Laptop l3 = new Laptop();
//        l3.setLid(3);
//        l3.setBrand("Apple");
//        l3.setModel("Macbook air");
//        l3.setRam(8);
//
//        Alien a1 = new Alien();
//        a1.setAid(101);
//        a1.setAname("Navin");
//        a1.setTech("Java");
//
//
//        Alien a2 = new Alien();
//        a2.setAid(102);
//        a2.setAname("Harsh");
//        a2.setTech("Python");
//
//
//        Alien a3 = new Alien();
//        a3.setAid(103);
//        a3.setAname("Kiran");
//        a3.setTech("AI");
//
//
//        a1.setLaptops(Arrays.asList(l1, l2));
//        a2.setLaptops(Arrays.asList(l2, l3));
//        a3.setLaptops(Arrays.asList(l1));
//
//
//        l1.setAliens(Arrays.asList(a1, a3));
//        l2.setAliens(Arrays.asList(a1, a2));
//        l3.setAliens(Arrays.asList(a2));
//
//
//        SessionFactory sf = new Configuration()
//                .configure()
//                .addAnnotatedClass(org.example.Alien.class)
//                .addAnnotatedClass(org.example.Laptop.class)
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);
//
//        session.persist(a1);
//        session.persist(a2);
//        session.persist(a3);
//
//        transaction.commit();
//
//        Alien a5 = session.get(Alien.class, 102);
//        System.out.println(a5);
//        session.close();
//        sf.close();

//        Laptop l1 = new Laptop();
//        l1.setLid(1);
//        l1.setBrand("Asus");
//        l1.setModel("Rog");
//        l1.setRam(16);
//
//
//        Laptop l2 = new Laptop();
//        l2.setLid(2);
//        l2.setBrand("Dell");
//        l2.setModel("XPS");
//        l2.setRam(32);
//
//        Laptop l3 = new Laptop();
//        l3.setLid(3);
//        l3.setBrand("Apple");
//        l3.setModel("Macbook air");
//        l3.setRam(8);
//
//        Alien a1 = new Alien();
//        a1.setAid(101);
//        a1.setAname("Navin");
//        a1.setTech("Java");
//
//
//        Alien a2 = new Alien();
//        a2.setAid(102);
//        a2.setAname("Harsh");
//        a2.setTech("Python");
//
//
//        a1.setLaptops(Arrays.asList(l1, l2));
//        a2.setLaptops(Arrays.asList(l3));
//
//
//        SessionFactory sf = new Configuration()
//                .configure()
//                .addAnnotatedClass(org.example.Alien.class)
//                .addAnnotatedClass(org.example.Laptop.class)
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);
//
//        session.persist(a1);
//        session.persist(a2);
//
//        transaction.commit();
//
//
//        session.close();
//
//        Session session1 = sf.openSession();
//
//        Alien a5 = session1.get(Alien.class, 101);
////        System.out.println(a5);
//        session1.close();
//        sf.close();

//        SessionFactory sf = new Configuration()
//                .configure()
//                .addAnnotatedClass(org.example.Laptop.class)
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
////   Select * from laptop where ram=32 ->SQL
////        from Laptop where ram=32 -> HQL
//
//
//        Query query = session.createQuery("from Laptop where ram=32");
//        List<Laptop> laptops = query.getResultList();
//
//
////        Laptop l1=session.get(Laptop.class, 3);
//        System.out.println(laptops);
//        session.close();
//
//        sf.close();

//        SessionFactory sf = new Configuration()
//                .configure()
//                .addAnnotatedClass(org.example.Laptop.class)
//                .buildSessionFactory();
//
//        Session session = sf.openSession();

//   Select * from laptop where ram=32 ->SQL
//        from Laptop where ram=32 -> HQL

//        Query query = session.createQuery("from Laptop");
//        List<Laptop> laptops = query.getResultList();

//        Query query = session.createQuery("select model from Laptop where brand like 'Asus'");
//        List<String> brands = query.getResultList();

//        String brand = "Asus";
//
////        Query query = session.createQuery("from Laptop where brand like 'Asus' ");
//
//        Query query = session.createQuery("select brand, model from Laptop where brand like ?1");
//        query.setParameter(1, brand);
//
////        List<Laptop> laptops = query.getResultList();
//        List<Object[]> laptops = query.getResultList();
//
//        for (Object[] data : laptops) {
//            System.out.println((String) data[0] + " : " + (String) data[1]);
//        }
////        Laptop l1=session.get(Laptop.class, 3);
//
//
//        System.out.println(laptops);
//        session.close();
//
//        sf.close();

//        SessionFactory sf = new Configuration()
//                .configure()
//                .addAnnotatedClass(org.example.Laptop.class)
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
////        Laptop laptop = session.get(Laptop.class, 2);
////        Laptop laptop = session.load(Laptop.class, 2);
//        Laptop laptop = session.byId(Laptop.class).getReference(2);
//        System.out.println(laptop);
//        session.close();
//
//        sf.close();

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Laptop.class)
                .buildSessionFactory();

        Session session = sf.openSession();

        Laptop l1 = session.get(Laptop.class, 2);
        System.out.println(l1);
        session.close();

        Session session1 = sf.openSession();
        Laptop l2 = session1.get(Laptop.class, 2);
        System.out.println(l2);

        session1.close();

        sf.close();
    }
}