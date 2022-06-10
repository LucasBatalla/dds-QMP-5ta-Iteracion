public class AgregarPrenda extends PropuestaModificacion{
  private Prenda prenda;
  private Guardarropa guardarropa;

  public AgregarPrenda(Prenda prenda, Guardarropa guardarropa) {
    super(prenda, guardarropa);
  }

  @Override
  public void deshacerModificacion(Usuario usuario) {
    usuario.quitarPrendaDe(prenda, guardarropa);
  }

  @Override
  public void aceptarPropuesta(Usuario usuario, Guardarropa guardarropa) {
    usuario.agregarPrendaA(prenda, guardarropa);
  }
}
