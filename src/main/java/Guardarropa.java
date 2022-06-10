import java.util.List;

public class Guardarropa {
  private CriterioRopa criterio;
  private List<Prenda> prendas;

  public Guardarropa(CriterioRopa criterio){
    this.criterio = criterio;
  }



  public CriterioRopa getCriterio() {
    return criterio;
  }

  public boolean contienePrenda(Prenda prenda){
    return prendas.contains(prenda);
  }
  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void agregarPrenda(Prenda prenda){
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda){
    prendas.remove(prenda);
  }

}
