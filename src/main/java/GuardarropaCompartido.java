import java.util.List;

public class GuardarropaCompartido extends Guardarropa{
  private List<Usuario> usuariosQueComparten;

  public GuardarropaCompartido(CriterioRopa criterioRopa, List<Usuario> usuarios){
    super(criterioRopa);
    this.usuariosQueComparten = usuarios;
  }



}
