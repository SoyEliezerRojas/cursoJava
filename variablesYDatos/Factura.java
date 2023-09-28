package variablesYDatos;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        String facturaString = "------- FACTURA -------\n";
        String nombreProducto; 
        double precioProducto, subtotal = 0;
        
        for (int i = 0; i < 2; i++) {
            limpiarConsola();
            try (Scanner sc = new Scanner(System.in)) {
                sc.nextLine();//Limpio la entrada
                System.out.println("Ingrese el nombre del producto: ");
                nombreProducto = sc.nextLine();
                facturaString = facturaString + "| " + nombreProducto;
                System.out.println("Ingrese el precio bruto del producto: ");
                precioProducto = sc.nextDouble();
                subtotal = subtotal + precioProducto ;
            }
            facturaString = facturaString + "    " + precioProducto + "\n";
        }
        facturaString = "| Subtotal    " + subtotal + "\n";
        facturaString = "| IVA(22%)    " + (subtotal*0.22) + "\n";
        facturaString = "| Total    " + (subtotal + (subtotal*0.22)) + "\n";
        limpiarConsola();
        System.out.println(facturaString);
    }

    public static void limpiarConsola(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
