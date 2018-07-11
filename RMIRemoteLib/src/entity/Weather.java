
package entity;

import java.io.Serializable;

public class Weather implements Serializable {
    
    double degree;
    String description;

    public Weather() {
    }

    public Weather(double degree, String description) {
        this.degree = degree;
        this.description = description;
    }

    public double getDegree() {
        return degree;
    }

    public String getDescription() {
        return description;
    }
    
    
}
