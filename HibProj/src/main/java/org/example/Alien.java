//package org.example;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "alien_table")
//public class Alien {
//
//    @Id
//    private int aid;
//
//    @Column(name = "alien_name")
//    private String aname;
//
//    @Transient
//    private String tech;
//
//    public int getAid() {
//        return aid;
//    }
//
//    public void setAid(int aid) {
//        this.aid = aid;
//    }
//
//    public String getTech() {
//        return tech;
//    }
//
//    public void setTech(String tech) {
//        this.tech = tech;
//    }
//
//    public String getAname() {
//        return aname;
//    }
//
//    public void setAname(String aname) {
//        this.aname = aname;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "aid=" + aid +
//                ", aname='" + aname + '\'' +
//                ", tech='" + tech + '\'' +
//                '}';
//    }
//}

//package org.example;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//@Entity
//public class Alien {
//
//    @Id
//    private int aid;
//    private String aname;
//    private String tech;
//
//
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//    private Laptop laptop;
//
//    public int getAid() {
//        return aid;
//    }
//
//    public void setAid(int aid) {
//        this.aid = aid;
//    }
//
//    public String getTech() {
//        return tech;
//    }
//
//    public void setTech(String tech) {
//        this.tech = tech;
//    }
//
//    public String getAname() {
//        return aname;
//    }
//
//    public void setAname(String aname) {
//        this.aname = aname;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "aid=" + aid +
//                ", aname='" + aname + '\'' +
//                ", tech='" + tech + '\'' +
//                ", laptop=" + laptop +
//                '}';
//    }
//}
//package org.example;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//
//@Entity
//public class Alien {
//
//    @Id
//    private int aid;
//    private String aname;
//    private String tech;
//    @OneToOne
//    private Laptop laptop;
//
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//
//    public int getAid() {
//        return aid;
//    }
//
//    public void setAid(int aid) {
//        this.aid = aid;
//    }
//
//    public String getTech() {
//        return tech;
//    }
//
//    public void setTech(String tech) {
//        this.tech = tech;
//    }
//
//    public String getAname() {
//        return aname;
//    }
//
//    public void setAname(String aname) {
//        this.aname = aname;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "aid=" + aid +
//                ", aname='" + aname + '\'' +
//                ", tech='" + tech + '\'' +
//                ", laptop=" + laptop +
//                '}';
//    }
//
//
//}
package org.example;
import jakarta.persistence.*;

import java.util.List;

//@Entity
//public class Alien {
//
//    @Id
//    private int aid;
//    private String aname;
//    private String tech;
//    @OneToMany(mappedBy = "alien")
//    private List<Laptop> laptops;
//
//    public List<Laptop> getLaptops() {
//        return laptops;
//    }
//
//    public void setLaptops(List<Laptop> laptops) {
//        this.laptops = laptops;
//    }
//
//    public int getAid() {
//        return aid;
//    }
//
//    public void setAid(int aid) {
//        this.aid = aid;
//    }
//
//    public String getTech() {
//        return tech;
//    }
//
//    public void setTech(String tech) {
//        this.tech = tech;
//    }
//
//    public String getAname() {
//        return aname;
//    }
//
//    public void setAname(String aname) {
//        this.aname = aname;
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "aid=" + aid +
//                ", aname='" + aname + '\'' +
//                ", tech='" + tech + '\'' +
//                ", laptops=" + laptops +
//                '}';
//    }
//}

//@Entity
//public class Alien {
//
//    @Id
//    private int aid;
//    private String aname;
//    private String tech;
//    @ManyToMany
//    private List<Laptop> laptops;
//
//    public List<Laptop> getLaptops() {
//        return laptops;
//    }
//
//    public void setLaptops(List<Laptop> laptops) {
//        this.laptops = laptops;
//    }
//
//    public int getAid() {
//        return aid;
//    }
//
//    public void setAid(int aid) {
//        this.aid = aid;
//    }
//
//    public String getTech() {
//        return tech;
//    }
//
//    public void setTech(String tech) {
//        this.tech = tech;
//    }
//
//    public String getAname() {
//        return aname;
//    }
//
//    public void setAname(String aname) {
//        this.aname = aname;
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "aid=" + aid +
//                ", aname='" + aname + '\'' +
//                ", tech='" + tech + '\'' +
//                ", laptops=" + laptops +
//                '}';
//    }
//}

@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;
    private String tech;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Laptop> laptops;

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}