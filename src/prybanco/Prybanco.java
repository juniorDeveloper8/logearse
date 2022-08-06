package prybanco;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import prybanco.Formulario.FmrLogin;
//import prybanco.Formulario.FrmLogin;

public class Prybanco {

    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<cliente> listaCliente1 = new ArrayList<cliente>();
    private static ArrayList<cuentaBancaria> listaCuenta = new ArrayList<cuentaBancaria>();

    public static void ingresarDatos() {

        String identificacion, apellidos, nombres, direccion, telefono, genero, estadoCivil;
        int year, mes, dia;

        System.out.println(" ingrese identificacion: ");
        identificacion = teclado.nextLine();

        System.out.println(" ingre apellidos: ");
        apellidos = teclado.nextLine();

        System.out.println(" ingrese nombres: ");
        nombres = teclado.nextLine();

        System.out.println(" ingrese la direccion: ");
        direccion = teclado.nextLine();

        System.out.println(" ingrese telefono: ");
        telefono = teclado.nextLine();

        System.out.println(" ingrese el genero: ");
        genero = teclado.nextLine();

        System.out.println(" ingrese su estado civil: ");
        estadoCivil = teclado.nextLine();

        System.out.println(" ingrese su año de nacimiento: ");
        year = teclado.nextInt();

        System.out.println(" ingrese el mes de nacimiento: ");
        mes = teclado.nextInt();

        System.out.println(" ingrese el dia de nacimiento: ");
        dia = teclado.nextInt();

        cliente cliente1 = new cliente();
        cliente1.setIdentificacion(identificacion);
        cliente1.setApellidos(apellidos);
        cliente1.setNombres(nombres);
        cliente1.setDireccion(direccion);
        cliente1.setTelefono(telefono);
        cliente1.setGenero(genero);
        cliente1.setEstadoCivil(estadoCivil);
        cliente1.setFechaNacimiento(year, mes, dia);

        listaCliente1.add(cliente1);

        System.out.println(" cliente registrado ");
        teclado.nextLine();
    }

    private static void crearCuenta() {
        String numero, identificacion;
        float saldo;
        double limiteRetiro;
        int year, mes, dia;

        System.out.println(" ingrese la identificacion ");
        identificacion = teclado.nextLine();

        cliente cliente1 = new cliente();
        cliente1 = buscarCliente(identificacion);

        if (!Objects.isNull(cliente1.getIdentificacion())) {

            System.out.println(" ingrese numero de cuenta ");
            numero = teclado.nextLine();

            System.out.println(" ingrese anio de apertura ");
            year = teclado.nextInt();

            System.out.println(" ingrese mes de apertura ");
            mes = teclado.nextInt();

            System.out.println(" ingrese el dia de apertura ");
            dia = teclado.nextInt();

            saldo = 0;

            System.out.println(" ingrese el limite de retiro ");
            limiteRetiro = teclado.nextDouble();

            cuentaBancaria cuenta = new cuentaBancaria();

            cuenta.setCliente1(cliente1);
            cuenta.setFachaApertura(year, mes, dia);
            cuenta.setLimiteRetiro(limiteRetiro);
            cuenta.setNumero(numero);
            cuenta.setSaldo(saldo);

            System.out.println(" CUENTA REGISTRADA CORRECTAMENTE ");
            listaCuenta.add(cuenta);
            teclado.nextLine();
        } else {
            System.out.println(" CLIENTE NO EXISTE ");
        }
    }

    private static void depositar() {
        double monto = 0;
        String cuenta;
        System.out.println(" ingrese numero de cuenta ");
        cuenta = teclado.nextLine();

        for (cuentaBancaria varCuenta : listaCuenta) {
            if (varCuenta.getNumero().equals(cuenta)) {
                try {
                    System.out.println(" ingrese el valor a depositar ");
                    monto = teclado.nextDouble();
                    varCuenta.depositar(monto);
                    System.out.println(" saldo: " + varCuenta.getSaldo());
                } catch (Exception e) {
                    System.out.println(" Error en el valor porfavor verifique denuevo y buelva a intetarlo. " + e.getMessage());
                }
                return;
            }
        }
    }

    private static void retirar() {
        double retiro = 0;
        String cuenta;
        System.out.println(" ingrese numero de cuenta ");
        cuenta = teclado.nextLine();
        for (cuentaBancaria varCuenta : listaCuenta) {
            if (varCuenta.getNumero().equals(cuenta)) {
                System.out.println(" ingrese el valor a retirar ");
                retiro = teclado.nextDouble();
                varCuenta.retirar(retiro);
                System.out.println(" saldo: " + varCuenta.getSaldo());
            }
        }
    }
    
    private static cliente buscarCliente(String identificacion){
        cliente clienteRetorno = new cliente();
        for (cliente varCliente : listaCliente1){
            if (varCliente.getIdentificacion().equals(identificacion)){
                clienteRetorno = varCliente;
            }
        }
        return clienteRetorno;
    }
    
    private static void consultarSaldo(){
        String cuenta, cliente;
        System.out.println(" ingrese el numero de cuenta ");
        cuenta = teclado.nextLine();
        for (cuentaBancaria varCuenta : listaCuenta){
            if (varCuenta.getNumero().equals(cuenta)){
                System.out.println(" Cuenta " + varCuenta.toString());
            }
        }
        for (cliente varCliente : listaCliente1){
            System.out.println(varCliente.toString());
        }
    }
    
    private static void mostrarClientes(){
        for (cliente varCliente : listaCliente1){
            System.out.println(varCliente.toString() + "\n");
        }
    }
    
    public static void main(String[] args) throws InterruptedException{
        /*throws InterruptedException 
        int op;
        do{
            System.out.println("1. crear cliente");
            System.out.println("2. crear ceunte");
            System.out.println("3. deposito");
            System.out.println("4. retirar");
            System.out.println("5. consultar saldo");
            System.out.println("6. mostrar Cliente");
            System.out.println("0. salir");
            op = teclado.nextInt();
            teclado.nextLine();
            switch (op){
                case 1:
                    ingresarDatos();
                    break;
            
                case 2:
                    crearCuenta();
                    break;
                    
                case 3:
                    depositar();
                    break;
                    
                case 4:
                    retirar();
                    break;
                    
                case 5:
                    consultarSaldo();
                    Thread.sleep(10000);
                    break;
                    
                case 6:
                    mostrarClientes();
                    Thread.sleep(10000);
                    break;
            };
        }while (op != 0 ); */
        FmrLogin frmLogin = new FmrLogin ();
        fmrLogin.setVisible(true);
    }
}
