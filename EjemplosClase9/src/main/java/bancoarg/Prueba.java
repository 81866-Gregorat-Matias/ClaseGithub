/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoarg;

/**
 *
 * @author philip
 */
public class Prueba
{
    public static void main(String args[]) {
//        ListaCliente lis = new ListaCliente();
//
//        System.out.println("Listado filtrado por: inversion");
//        Cliente[] res = lis.Filtrar("inversion");
//        int i = 0;
//        while(i < res.length && res[i] != null)
//        {
//                res[i].getCuenta().retirar(8000);
//                System.out.println(res[i]);
//
//                i++;
//            }
//
//    }

   // Ejemplo de retiro sin Plata
        Cuenta aux1 = new CuentaInversion(100, 1000);
        Cliente cli1 = new Cliente(100, "Martin", aux1);
        double monto = 8000;
        try {
            cli1.getCuenta().retirar(monto);
        }
        catch (FondosInsuficientesExcept e){
            System.out.println("No tiene: " + monto);
        }

        //cli1.getCuenta().retirar(8000);

        System.out.println("Hasta luego");

}}
