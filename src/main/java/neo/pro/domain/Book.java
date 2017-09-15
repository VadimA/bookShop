package neo.pro.domain;

import java.io.Serializable;
import java.util.Date;


public class Book implements Serializable{

    private long id;

    private String name;

    private String ibsn;

    private Date year;

    private String description;

    private float price;

    public Book() {
    }

    public Book(String name, Date year, String description, float price) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
