
package prybanco;

public class fecha {
    private int year;
    private int mes;
    private int dia; 
    
    public fecha(){
    }
    
    public fecha(int year, int mes, int dia){
        this.year = year;
        this.mes = mes;
        this.dia = dia;
    }
    
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    
    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    
    @Override
    public String toString(){
        return year+ "/" + mes + "/" + dia; 
    }
}
