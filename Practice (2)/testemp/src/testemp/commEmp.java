/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemp;

/**
 *
 * @author My University
 */
public class commEmp extends employee {
    
    private double earning ;
    
    public commEmp(String n, String id, double cr, double gs) {
        super(n, id, cr, gs);
        this.earning();
    }
    
    private double earning()
    {
    this.earning=this.commissiomRate*this.grossSale;
        return earning;
    }
    
    @Override
    public String toString()
    {
        return  String.format("%s \n Earning : %.2f \n\n",super.toString(),earning);
    }
}
