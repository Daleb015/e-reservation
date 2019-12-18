/**
 * 
 */
package com.daleb.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daleb.ereservation.model.Cliente;

/**
 * Interface para definir operaciones de bases de datos
 * @author daleb
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente,String> {
  
  /**
   * Definicion de metodo para buscar clientes por apellido
   * @param apellidoCli
   * @return
   */
  public List<Cliente> findByApellidoCli(String apellidoCli);
  
  public Cliente findByIdentificacion(String identificacionCli);
  

}
