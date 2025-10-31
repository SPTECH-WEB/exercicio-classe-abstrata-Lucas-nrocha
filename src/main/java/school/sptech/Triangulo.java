package school.sptech;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;

    public Triangulo(){
        super();
    }

    @Override
    public Double calcularArea(){
            if (this.base == null || this.altura == null) {
                return null;
            }
            return (this.base * this.altura) / 2.0;
    }

    @Override
    public String toString(){
        String baseInfo = (this.base != null) ? this.base.toString() : "não definida";
        String alturaInfo = (this.altura != null) ? this.altura.toString() : "não definida";
        return "Triangulo [base=" + baseInfo + ", altura=" + alturaInfo + "]" + super.toString();
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

}
