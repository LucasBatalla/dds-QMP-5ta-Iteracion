public class QuitarPrenda implements PropuestaModificacion{
  private Prenda prenda;
  private Guardarropa guardarropa;
  @Override
  public void aceptarPropuesta(Usuario usuario, Guardarropa guardarropa) {
    usuario.quitarPrendaDe(prenda, guardarropa);
  }
}
