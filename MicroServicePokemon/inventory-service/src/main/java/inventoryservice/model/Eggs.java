package inventoryservice.model;

import jakarta.persistence.*;

@Entity
public class Eggs {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "egg_generator")
    @SequenceGenerator(name = "egg_generator", sequenceName = "egg_seq", allocationSize = 1)
    private Integer id;
    private int price;
    private String name;

    public Eggs(){
        this.id = 43;
        this.price = 10;
        this.name = "eggs Charminder";

    }
    public Eggs(int price, String name){
        //setId(id);
        setPrice(price);
        setName(name);
    }
    private void setPrice(int price){
        this.price = price;
    }
    private void  setName(String name){
        this.name = "egg "+name;
    }

    private void setId(int id) { this.id = id;
    }

    public int getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){ return this.id; }
    public String getNamePrice(){
        return getName() +" : "+getPrice();
    }
    public String stringify(){
        return "{\"id\":\""+getId()+"\",\"name\":\""+getName()+"\",\"price\":\""+getPrice()+"\"}";
    }

}
