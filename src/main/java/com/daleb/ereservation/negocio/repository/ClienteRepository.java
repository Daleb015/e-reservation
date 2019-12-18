/**
 * 
 */
package com.daleb.ereservation.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daleb.ereservation.model.Cliente;

/**
 * Interface para definir operaciones de bases de datos
 * @author daleb
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente,String> {

}
