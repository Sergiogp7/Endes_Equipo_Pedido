

/**
 * Class Cliente
 */
public class Cliente {

  //
  // Fields
  //

  private String nombre;
  private String correoElectronico;
  
  //
  // Constructors
  //
  public Cliente () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of correoElectronico
   * @param newVar the new value of correoElectronico
   */
  public void setCorreoElectronico (String newVar) {
    correoElectronico = newVar;
  }

  /**
   * Get the value of correoElectronico
   * @return the value of correoElectronico
   */
  public String getCorreoElectronico () {
    return correoElectronico;
  }

  //
  // Other methods
  //

  /**
   * @param        pedido
   */
  public void realizaPedido(Pedido pedido)
  {
  }


}
