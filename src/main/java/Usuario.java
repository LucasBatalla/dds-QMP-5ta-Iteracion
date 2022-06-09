import com.sun.jndi.toolkit.url.GenericURLContext;

import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
  private List<Guardarropa> guardarropas;
  private List<GuardarropaCompartido> guardarropasCompartidos;
  private List<PropuestaModificacion> propuestasModificacion;
  private List<PropuestaModificacion> historialPropuestasAceptadas;


  public void deshacerPropuestaAceptada(PropuestaModificacion propuestaModificacion){
    if(historialPropuestasAceptadas.contains(propuestaModificacion)){
      propuestaModificacion.deshacerModificacion(this);
    }
  }

  public void recibirPropuestaDeModificacion(PropuestaModificacion propuesta){
    propuestasModificacion.add(propuesta);
  }

  public void enviarPropuestaDeModificacion(Usuario usuario, PropuestaModificacion propuestaModificacion){
    usuario.recibirPropuestaDeModificacion(propuestaModificacion);
  }

  public List<PropuestaModificacion> getPropuestasModificacion(){
    return propuestasModificacion;
  }

  public void aceptarPropuesta(PropuestaModificacion propuestaModificacion){
    propuestaModificacion.aceptarPropuesta(this, propuestaModificacion.getGuardarropa());
    historialPropuestasAceptadas.add(propuestaModificacion);
  }
  public void rechazarrPropuesta(PropuestaModificacion propuestaModificacion){
    propuestasModificacion.remove(propuestaModificacion);
  }

  public void agregarGuardarropa(Guardarropa guardarropa){
    guardarropas.add(guardarropa);
  }

  public void agregarGuardarropaCompartidoConUsuario(GuardarropaCompartido guardarropaCompartido){
        guardarropasCompartidos.add(guardarropaCompartido);
  }

  public void agregarPrendaA(Prenda prenda, Guardarropa guardarropa){
    if(!guardarropa.getPrendas().contains(prenda)){
      guardarropa.agregarPrenda(prenda);
    }
  }

  public void quitarPrendaDe(Prenda prenda, Guardarropa guardarropa){
    if(guardarropa.getPrendas().contains(prenda)){
      guardarropa.quitarPrenda(prenda);
    }
  }

  public void agregarPrendaAGuardarropaSegun(Prenda prenda, CriterioRopa criterio){
    if(guardarropas.stream().anyMatch(guardarropa -> guardarropa.getCriterio() == criterio)){
      getGuardarropaSegun(criterio).agregarPrenda(prenda);
    }
    Guardarropa nuevoGuardarropa = new Guardarropa(criterio;
    nuevoGuardarropa.agregarPrenda(prenda);
    agregarGuardarropa(nuevoGuardarropa);
  }

  public Guardarropa getGuardarropaSegun(CriterioRopa criterio){
    return guardarropas.stream().filter(guardarropa -> guardarropa.getCriterio() == criterio).collect(Collectors.toList()).get(0);
  }
}
