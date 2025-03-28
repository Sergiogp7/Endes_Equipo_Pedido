package com.endes;



/**
 * Class Reseña
 */
public class Reseña {

  //
  // Fields
  //

  private int id;
  private String comentario;
  private int puntaje;
  
  //
  // Constructors
  //
  public Reseña () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of comentario
   * @param newVar the new value of comentario
   */
  public void setComentario (String newVar) {
    comentario = newVar;
  }

  /**
   * Get the value of comentario
   * @return the value of comentario
   */
  public String getComentario () {
    return comentario;
  }

  /**
   * Set the value of puntaje
   * @param newVar the new value of puntaje
   */
  public void setPuntaje (int newVar) {
    puntaje = newVar;
  }

  /**
   * Get the value of puntaje
   * @return the value of puntaje
   */
  public int getPuntaje () {
    return puntaje;
  }

  //
  // Other methods
  //

}
