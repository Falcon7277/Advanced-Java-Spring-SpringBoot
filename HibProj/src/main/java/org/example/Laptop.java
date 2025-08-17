package org.example;

import jakarta.persistence.*;

import java.util.List;

//@Embeddable
//public class Laptop {
//    private String brand;
//    private String model;
//    private int ram;
//
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//
//    public void setRam(int ram) {
//        this.ram = ram;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public int getRam() {
//        return ram;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Laptop{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", ram=" + ram +
//                '}';
//    }
//}

//@Entity
//public class Laptop {
//
//    @Id
//    private int lid;
//    private String brand;
//    private String model;
//    private int ram;
//
//    public int getLid() {
//        return lid;
//    }
//
//    public void setLid(int lid) {
//        this.lid = lid;
//    }
//
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//
//    public void setRam(int ram) {
//        this.ram = ram;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public int getRam() {
//        return ram;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Laptop{" +
//                "lid=" + lid +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", ram=" + ram +
//                '}';
//    }
//}
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class Laptop {
//
//    @Id
//    private int lid;
//    private String brand;
//    private String model;
//    private int ram;
//    @ManyToOne
//    private Alien alien;
//
//    public Alien getAlien() {
//        return alien;
//    }
//
//    public void setAlien(Alien alien) {
//        this.alien = alien;
//    }
//
//    public int getLid() {
//        return lid;
//    }
//
//    public void setLid(int lid) {
//        this.lid = lid;
//    }
//
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//
//    public void setRam(int ram) {
//        this.ram = ram;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public int getRam() {
//        return ram;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    @Override
//    public String toString() {
//        return "Laptop{" +
//                "lid=" + lid +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", ram=" + ram +
//                '}';
//    }
//}

//@Entity
//public class Laptop {
//
//    @Id
//    private int lid;
//    private String brand;
//    private String model;
//    private int ram;
//
//    @ManyToMany(mappedBy = "laptops")
//    private List<Alien> aliens;
//    public List<Alien> getAliens() {
//        return aliens;
//    }
//
//    public void setAliens(List<Alien> aliens) {
//        this.aliens = aliens;
//    }
//
//
//    public int getLid() {
//        return lid;
//    }
//
//    public void setLid(int lid) {
//        this.lid = lid;
//    }
//
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//
//    public void setRam(int ram) {
//        this.ram = ram;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public int getRam() {
//        return ram;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    @Override
//    public String toString() {
//        return "Laptop{" +
//                "lid=" + lid +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", ram=" + ram +
//                '}';
//    }
//}

@Entity
@Cacheable
public class Laptop {

    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;


    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}