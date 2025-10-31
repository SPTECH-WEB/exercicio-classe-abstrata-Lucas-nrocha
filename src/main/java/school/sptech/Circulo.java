package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Circulo(){
        super();
    }

    @Override public Double calcularArea(){
            if (this.raio == null) {
                return null;
            }
            return Math.PI * this.raio * this.raio;
    }

    @Override public String toString(){
        String raioInfo = (this.raio != null) ? this.raio.toString() : "não definido";
        return "Circulo [raio=" + raioInfo + "]" + super.toString();
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

}
