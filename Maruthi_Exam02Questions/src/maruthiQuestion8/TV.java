//TV.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maruthiQuestion8;

/**
 *
 * @author Priyanka Maruthi
 */
public class TV extends Electronics{
  private int id;
    private String Color;

    public TV(int id, String Color) {
        this.id = id;
        this.Color = Color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "TV{" + "id=" + id + ", Color=" + Color + '}';
    }
    @Override
    public String typeOfElectronicGoods() {
        return "The type of Electronic Good is : Samsung TV";
    }
    
}
