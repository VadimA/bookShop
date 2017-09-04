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
}
