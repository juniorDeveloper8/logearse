package prybanco;

public class cuentaBancaria {

    private String numero;
    private float saldo;
    private double limiteRetiro;
    private fecha fechaApertura;
    private cliente cliente1;

    public cuentaBancaria() {
        fechaApertura = new fecha();
        cliente1 = new cliente();
    }

    public cuentaBancaria(String numero, float saldo, double limiteRetiro, int year, int mes, int dia, cliente cliente1) {
        this.numero = numero;
        this.saldo = saldo;
        this.limiteRetiro = limiteRetiro;
        fechaApertura.setYear(year);
        fechaApertura.setMes(mes);
        fechaApertura.setDia(dia);
        this.cliente1 = cliente1;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getLimiteRetiro() {
        return limiteRetiro;
    }

    public void setLimiteRetiro(double limiteRetiro) {
        this.limiteRetiro = limiteRetiro;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public fecha getFechaApertura() {
        return fechaApertura;
    }

    public void setFachaApertura(int year, int mes, int dia) {
        fechaApertura.setYear(year);
        fechaApertura.setMes(mes);
        fechaApertura.setDia(dia);
    }

    public cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(cliente cliente1) {
        this.cliente1 = cliente1;
    }

    public void depositar(double valorADepositar) {
        if (valorADepositar <= 0) {
            System.out.println("valor incorrecto");
        } else {
            this.saldo += valorADepositar;
        }
    }

    public void consultarSaldo(double valorARetirar) {
        if (valorARetirar > this.saldo) {
            System.out.println("saldo insuficiente");
        } else {
            if (valorARetirar <= 0) {
                System.out.println("Valor incorrecto");
            } else {
                this.saldo -= valorARetirar;
            }
        }
    }

    @Override
    public String toString() {
        return "cuentaBancaria" + "\n numero de cuenta: " + numero + "\n saldo: " + saldo + "\n limiteRetiro: " + limiteRetiro + "\n fechaAperturna: " + fechaApertura;
    }

    void retirar(double retiro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
