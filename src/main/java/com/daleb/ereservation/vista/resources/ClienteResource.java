/**
 * 
 */
package com.daleb.ereservation.vista.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daleb.ereservation.model.Cliente;
import com.daleb.ereservation.negocio.services.ClienteService;
import com.daleb.ereservation.vista.resources.vo.ClienteVO;

/**
 * Controladores expuestos en el servicio web cliente
 * 
 * @author daleb
 *
 */
@RestController
@RequestMapping("/api/cliente")
public class ClienteResource {
  @Autowired
  ClienteService clienteService;

  /**
   * Método para crear un objeto cliente con un objeto de mapeo
   * 
   * @return
   */
  @PostMapping
  public ResponseEntity<Cliente> createCliente(@RequestBody ClienteVO clienteVO) {
    Cliente cliente = new Cliente();
    cliente.setNombreCli(clienteVO.getNombreCli());
    cliente.setApellidoCli(clienteVO.getApellidoCli());
    cliente.setDireccionCli(clienteVO.getDireccionCli());
    cliente.setTelefonoCli(clienteVO.getTelefonoCli());
    cliente.setEmailCli(clienteVO.getEmailCli());
    return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.CREATED);
  }

  /**
   * 
   * @param Parametro tipo string con el que se genera la consulta
   * @param clienteVO El objeto que contiene los valores con los que se
   *                  actualizará el registro
   * @return
   */
  @PutMapping("/{identification}")
  public ResponseEntity<Cliente> updateCliente(
      @PathVariable("identification") String identification, ClienteVO clienteVO) {
    Cliente cliente = clienteService.findByIdentification(identification);
    if (cliente == null) {
      return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
    } else {
      cliente.setNombreCli(clienteVO.getNombreCli());
      cliente.setApellidoCli(clienteVO.getApellidoCli());
      cliente.setDireccionCli(clienteVO.getDireccionCli());
      cliente.setTelefonoCli(clienteVO.getTelefonoCli());
      cliente.setEmailCli(clienteVO.getEmailCli());
    }

    return new ResponseEntity<>(clienteService.update(cliente), HttpStatus.OK);
  }

  /**
   * Método para eliminar una entidad cliente
   * 
   * @param indentification
   */
  @DeleteMapping("/{identification}")
  public void removeCliente(@PathVariable("identification") String indentification) {
    Cliente cliente = clienteService.findByIdentification(indentification);
    if (cliente != null) {
      clienteService.delete(cliente);
    }
  }

  /**
   * Método que devuelve todos los cliente
   * 
   * @return
   */
  @GetMapping
  public ResponseEntity<List<Cliente>> findAll() {
    return ResponseEntity.ok(clienteService.findAll());
  }

}
