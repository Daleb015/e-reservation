/**
 * 
 */
package com.daleb.ereservation.negocio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daleb.ereservation.model.Cliente;
import com.daleb.ereservation.negocio.repository.ClienteRepository;

/**
 * define los servicios de cliente
 * 
 * @author daleb
 *
 */

@Service
public class ClienteService {

  @Autowired
  ClienteRepository clienteRepository;

  /**
   * Método para guardar un cliente
   * @param cliente
   * @return
   */
  public Cliente create(Cliente cliente) {
    return clienteRepository.save(cliente);
  }
  
  /**
   * Para actualizar un cliente, en este caso el cliente entrante tiene id
   * @param cliente
   * @return
   */
  public Cliente update(Cliente cliente) {
    return clienteRepository.save(cliente);
  }
  
  
  /**
   * Método para eliminar un cliente
   * @param cliente
   */
  public void delete(Cliente cliente) {
    clienteRepository.delete(cliente);
  }
  
  
  /**
   * Método para ubicar un cliente por identificacion
   * @param identificationCli
   * @return
   */
  public Cliente findByIdentification(String identificationCli) {
    return clienteRepository.findByIdentificacion(identificationCli);
  }
  
  

}
