/**
 * 
 */
package com.daleb.ereservation.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daleb.ereservation.model.Reserva;

/**
 * Interface para definir los metodos de db de reservas
 * 
 * @author daleb
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, String> {

}
