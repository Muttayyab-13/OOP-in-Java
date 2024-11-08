/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testrectangle2;

/**
 *
 * @author My University
 */
public class rectangle {
    
    
    
    private double width;
    private double height;
    private double area;
    
    public rectangle()
    {
    this.width=1.0;
    this.height=1.0;
    }
    
    
    public rectangle(double h,double w)
    {
    this.height=h;
    this.width=w;
    }
    
   public rectangle(rectangle temp){
   
   this.height=temp.height;
   this.width=temp.width;
   
   } 

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void computearea()
    {
    double ar;
    
    ar=this.height*this.width;
     this.area=ar;
        System.out.printf("The area is %.2f \n",this.area);
    
   
    }
   
    
    public void computeperimeter()
    {
    double perimeter;
    perimeter=2*(this.height*this.width);
   
    System.out.printf("The perimeter is %f \n",perimeter);  
    }
    
    public void compareareas(rectangle rec)
    {
    if(this.area>rec.area)
    {
        double dif=this.area-rec.area;
        System.out.printf("Area 1 is %.2f more than area 2",dif);
    }
    
    else if(this.area==rec.area)
    {
        System.out.println("Both areas are equal");
    
    
    }
    
    else if (this.area<rec.area)
    {
        double dif=rec.area-this.area;
        System.out.printf("Area 2 is %.2f more than area 1",dif);
    }
    
    }
}

