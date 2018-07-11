/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Picture;

/**
 *
 * @author Nguyen Thai Bao
 */
public class MyPicture {
    
    private String name, path;

    public MyPicture() {
    }

    public MyPicture(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
