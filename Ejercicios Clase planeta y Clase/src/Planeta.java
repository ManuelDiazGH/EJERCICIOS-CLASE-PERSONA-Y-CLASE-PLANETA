public class Planeta {

    private String nombre;
    private int cantidadSatélites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaSol;
    private TipoPlaneta tipoPlaneta;
    private boolean esObservable;
    private double periodoOrbital;
    private double periodoRotacion;

    public enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    public Planeta(String nombre, int cantidadSatélites, double masa, double volumen, int diametro, int distanciaSol, TipoPlaneta tipoPlaneta, boolean esObservable, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    public void imprimir() {
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatélites);
        System.out.println("Masa del planeta: " + masa + " kg");
        System.out.println("Volumen del planeta: " + volumen + " km³");
        System.out.println("Diámetro del planeta: " + diametro + " km");
        System.out.println("Distancia al Sol: " + distanciaSol + " millones de km");
        System.out.println("Tipo de planeta: " + tipoPlaneta);
        System.out.println("Es observable: " + esObservable);
        System.out.println("Periodo orbital: " + periodoOrbital + " años");
        System.out.println("Periodo de rotación: " + periodoRotacion + " días");
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.976e24, 1.08321e12, 12742, 150000000, TipoPlaneta.TERRESTRE, false, 1.0, 0.997);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898e27, 1.4313e15, 139820, 778500000, TipoPlaneta.GASEOSO, true, 11.86, 0.413);

        tierra.imprimir();
        System.out.println("Densidad de la Tierra: " + tierra.calcularDensidad() + " kg/km³");

        System.out.println();

        jupiter.imprimir();
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad() + " kg/km³");
    }
}
