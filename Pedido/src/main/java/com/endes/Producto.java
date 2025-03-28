package com.endes;

import java.util.List;

/**
 * Class Producto
 */
public class Producto {

  //
  // Fields
  //

  private int id;
  /**
   * 					
   */
  private String nombre;
  private double precio;
  private Categoria categoria;
  
  //
  // Constructors
  //
  public Producto () { };
  
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
   * Set the value of nombre
   * 
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * 
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of precio
   * @param newVar the new value of precio
   */
  public void setPrecio (double newVar) {
    precio = newVar;
  }

  /**
   * Get the value of precio
   * @return the value of precio
   */
  public double getPrecio () {
    return precio;
  }

  /**
   * Set the value of categoria
   * @param newVar the new value of categoria
   */
  public void setCategoria (Categoria newVar) {
    categoria = newVar;
  }

  /**
   * Get the value of categoria
   * @return the value of categoria
   */
  public Categoria getCategoria () {
    return categoria;
  }

  //
  // Other methods
  //

  /**
   * @return       List<Producto>
   */
  public List<Producto> obtenerAccesorios()
  {
	return null;
  }


}
