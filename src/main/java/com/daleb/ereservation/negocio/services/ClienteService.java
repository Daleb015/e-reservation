/**
 * 
 */
package com.daleb.ereservation.negocio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daleb.ereservation.model.Cliente;
import com.daleb.ereservation.negocio.repository.ClienteRepository;

/**
 * define los servicios de cliente
 * 
 * @author daleb
 *
 */

@Service
@Transactional(readOnly = true)
public class ClienteService {

  @Autowired
  ClienteRepository clienteRepository;

  /**
   * Método para guardar un cliente
   * 
   * @param cliente
   * @return
   */
  @Transactional
  public Cliente create(Cliente cliente) {
    return clienteRepository.save(cliente);
  }

  /**
   * Para actualizar un cliente, en este caso el cliente entrante tiene id
   * 
   * @param cliente
   * @return
   */
  @Transactional
  public Cliente update(Cliente cliente) {
    return clienteRepository.save(cliente);
  }

  /**
   * Método para eliminar un cliente
   * 
   * @param cliente
   */
  @Transactional
  public void delete(Cliente cliente) {
    clienteRepository.delete(cliente);
  }

  /**
   * Método para ubicar un cliente por identificacion
   * 
   * @param identificationCli
   * @return
   */
  public Cliente findByIdentification(String identificationCli) {
    return clienteRepository.findByIdentificacion(identificationCli);
  }
  
  
  /**
   * Método para devolver todos los cliente
   * @return
   */
  public List<Cliente> findAll(){
    return clienteRepository.findAll();
  }

}
