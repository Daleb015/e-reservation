/**
 * 
 */
package com.daleb.ereservation.vista.resources.vo;

import lombok.Data;

/**
 * Clase que representa un objeto virtual para crear un objeto
 * 
 * @author daleb
 *
 */
@Data
public class ClienteVO {

  private String idCli;
  private String nombreCli;
  private String apellidoCli;
  private String identificacionCli;
  private String direccionCli;
  private String telefonoCli;
  private String emailCli;

}
