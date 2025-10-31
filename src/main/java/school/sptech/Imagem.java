package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem(){
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura) {
        if (figura != null) {
            this.figuras.add(figura);
        }
    }

    public Double calcularSomaDasAreas() {
        Double somaTotal = 0.0;
        for (Figura f : this.figuras) {
            Double area = f.calcularArea();
            if (area != null) {
                somaTotal += area;
            }
        }
        return somaTotal;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasMaiores = new ArrayList<>();
        for (Figura f : this.figuras) {
            Double area = f.calcularArea();
            if (area != null && area > 20.0) {
                figurasMaiores.add(f);
            }
        }
        return figurasMaiores;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> listaDeQuadrados = new ArrayList<>();
        for (Figura f : this.figuras) {
            if (f instanceof Quadrado) {
                listaDeQuadrados.add(f);
            }
        }
        return listaDeQuadrados;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }
}
