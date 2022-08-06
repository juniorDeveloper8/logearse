
package prybanco;

public class cliente {
    private String identificacion ;
    private String apellidos ;
    private String nombres ;
    private String direccion ;
    private String telefono ;
    private String genero ;
    private String estadoCivil ;
    private fecha fechaNacimiento ;
    private cuentaBancaria cuenta ;
 
    public cliente() {
        fechaNacimiento = new fecha();
    }
    
    public cliente(String identificacion, String apellidos, String nombres, String direccion, String telefono, String genero, String estadoCivil, int year, int mes, int dia){
        this.identificacion = identificacion;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        fechaNacimiento.setYear(year);
        fechaNacimiento.setMes(mes);
        fechaNacimiento.setDia(dia);
    }
    
    public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public String getNombres(){
        return nombres;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    
    public fecha getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaNacimiento(int year, int mes, int dia){
        fechaNacimiento.setYear(year);
        fechaNacimiento.setMes(mes);
        fechaNacimiento.setDia(dia);
    }
    
    @Override
    public String toString(){
        return "CLIENTE" + "\n identificacion: " + identificacion + "\n apellidos: " + apellidos + "\n nombre: " + nombres + "\n direccion: " + direccion + "\n telefono: " + telefono + "\n genero: " + genero ; 
    }
        
}
