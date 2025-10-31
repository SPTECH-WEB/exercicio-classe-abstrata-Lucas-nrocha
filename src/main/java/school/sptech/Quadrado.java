package school.sptech;

public class Quadrado extends Figura {
    private Double lado;

    public Quadrado() {
        super();
    }

    @Override public Double calcularArea(){
        if(this.lado == null){
            return null;
        }
        return this.lado * this.lado;
    }

    @Override public String toString(){
        String ladoInfo = (this.lado != null) ? this.lado.toString() : "não definido";
        return "Quadrado [lado=" + ladoInfo + "]" + super.toString();
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}

