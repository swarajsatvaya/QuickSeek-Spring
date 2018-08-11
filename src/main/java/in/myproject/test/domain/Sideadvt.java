/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.myproject.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author pc2
 */
@Entity
@Table(name = "sideadvt")

public class Sideadvt extends BaseDomain{

    private static final long serialVersionUID = 1L;
    
    @Size(max = 255)
    @Column(name = "image")
    private String image;
    @Size(max = 255)
    @Column(name = "imageOne")
    private String imageOne;
    @Size(max = 255)
    @Column(name = "imageTwo")
    private String imageTwo;
    @Size(max = 255)
    @Column(name = "imageThree")
    private String imageThree;
    @Size(max = 255)
    @Column(name = "imageFour")
    private String imageFour;
    @Size(max = 255)
    @Column(name = "imageFive")
    private String imageFive;
    @Size(max = 255)
    @Column(name = "imageSix")
    private String imageSix;

    public Sideadvt() {
    }

    

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageOne() {
        return imageOne;
    }

    public void setImageOne(String imageOne) {
        this.imageOne = imageOne;
    }

    public String getImageTwo() {
        return imageTwo;
    }

    public void setImageTwo(String imageTwo) {
        this.imageTwo = imageTwo;
    }

    public String getImageThree() {
        return imageThree;
    }

    public void setImageThree(String imageThree) {
        this.imageThree = imageThree;
    }

    public String getImageFour() {
        return imageFour;
    }

    public void setImageFour(String imageFour) {
        this.imageFour = imageFour;
    }

    public String getImageFive() {
        return imageFive;
    }

    public void setImageFive(String imageFive) {
        this.imageFive = imageFive;
    }

    public String getImageSix() {
        return imageSix;
    }

    public void setImageSix(String imageSix) {
        this.imageSix = imageSix;
    }

    
    
}
