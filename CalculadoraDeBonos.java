package calculadoradebonos;

//Código ejecutado por YORNE SANTOS
//Del grupo SC
public class CalculadoraDeBonos {
    int salario;
    String mensajeBono;
    
    public void calcularBono() {
        salario = 50000;
        mensajeBono = "Bono = $ " + (0.02 * salario);
        System.out.println(mensajeBono);
    }

    public static void main(String[] args) {
        CalculadoraDeBonos calcular = new CalculadoraDeBonos();
        calcular.calcularBono();

    }

}
