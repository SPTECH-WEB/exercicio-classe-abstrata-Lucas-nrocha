package school.sptech;

public abstract class Figura {
    private String cor;
    private Integer espessura;


    public Figura(){
        super();
    }

    public abstract Double calcularArea();


    @Override
    public String toString(){
        String corInfo = (cor != null) ? cor : "não definida";
        String espessuraInfo = (espessura != null) ? espessura.toString() : "não definida";
        return "Figura [cor=" + corInfo + ", espessura=" + espessuraInfo + "]";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }
}
