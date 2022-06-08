public class AgregarPrenda implements PropuestaModificacion{
  private Prenda prenda;
  private Guardarropa guardarropa;

  @Override
  public void aceptarPropuesta(Usuario usuario, Guardarropa guardarropa) {
    usuario.agregarPrendaA(prenda, guardarropa);
  }
}
