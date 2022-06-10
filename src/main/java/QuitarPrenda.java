public class QuitarPrenda extends PropuestaModificacion{
  private Prenda prenda;
  private Guardarropa guardarropa;

  public QuitarPrenda(Prenda prenda, Guardarropa guardarropa) {
    super(prenda, guardarropa);
  }

  @Override
  public void deshacerModificacion(Usuario usuario) {
    usuario.agregarPrendaA(prenda, guardarropa);
  }

  @Override
  public void aceptarPropuesta(Usuario usuario, Guardarropa guardarropa) {
    usuario.quitarPrendaDe(prenda, guardarropa);
  }
}
