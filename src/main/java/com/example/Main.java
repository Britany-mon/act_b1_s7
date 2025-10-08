package com.example;

public class Main {
    public static void main(String[] args) {
    ProductoElectronico laptop = new ProductoElectronico(
            "Laptop", 2_500_000, "PROD-0001", 5, "Electrónica",
            24, "Dell", 110, true
        );

        ProductoElectronico celular = new ProductoElectronico(
            "Celular", 1_200_000, "PROD-0002", 10, "Electrónica",
            12, "Samsung", 120, false
        );

        ProductoAlimenticio leche = new ProductoAlimenticio(
            "Leche", 4_500, "PROD-0003", 20, "Alimentos",
            true, "L123", 5
        );

        ProductoAlimenticio pan = new ProductoAlimenticio(
            "Pan", 2_000, "PROD-0004", 15, "Alimentos",
            false, "P456", 2
        );

        laptop.vender(2);
        laptop.vender(10);

        System.out.println(laptop.getPrecioBase());
        System.out.println(laptop.calcularPrecioFinal());
        System.out.println(laptop.calcularPrecioElectronico());
        System.out.println(laptop.esGarantiaExtendida());
        System.out.println(laptop.calcularCostoGarantia());
        System.out.println(laptop.esCompatibleVoltaje(120));
        System.out.println(celular.calcularPrecioElectronico());

        System.out.println(leche.getPrecioBase());
        System.out.println(leche.calcularPrecioFinal());
        System.out.println(leche.calcularPrecioAlimenticio());
        System.out.println(leche.obtenerEstadoFrescura());
        System.out.println(leche.estaProximoAVencer());

        laptop.reabastecer(3);

        System.out.println(pan.obtenerEstadoFrescura());
        System.out.println(pan.estaProximoAVencer());

        leche.setDiasParaVencer(0);
        System.out.println(leche.estaVencido());
        System.out.println(leche.calcularPerdidaPorVencimiento());
    }
}
    