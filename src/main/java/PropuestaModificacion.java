public abstract class PropuestaModificacion {
  private Prenda prenda;
  private Guardarropa guardarropa;

  public PropuestaModificacion(Prenda prenda, Guardarropa guardarropa){
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  

  public Guardarropa getGuardarropa(){
    return guardarropa;
  }

  public Prenda getPrenda() {
    return prenda;
  }

  public abstract void aceptarPropuesta(Usuario usuario, Guardarropa guardarropa);

  public abstract void deshacerModificacion(Usuario usuario);
}
