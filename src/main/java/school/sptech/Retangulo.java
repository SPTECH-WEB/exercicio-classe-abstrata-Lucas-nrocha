package school.sptech;

public class Retangulo extends Figura{
    private Double base;
    private Double altura;

    public Retangulo() {
        super();
    }

    @Override public Double calcularArea(){
        if (this.base == null || this.altura == null) {
            return null;
        }
        return this.base * this.altura;
    }

    @Override public String toString(){
            String baseInfo = (this.base != null) ? this.base.toString() : "não definida";
            String alturaInfo = (this.altura != null) ? this.altura.toString() : "não definida";
            return "Retangulo [base=" + baseInfo + ", altura=" + alturaInfo + "]" + super.toString();
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
