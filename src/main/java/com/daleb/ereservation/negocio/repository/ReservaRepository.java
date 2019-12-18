/**
 * 
 */
package com.daleb.ereservation.negocio.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.daleb.ereservation.model.Reserva;

/**
 * Interface para definir los metodos de db de reservas
 * 
 * @author daleb
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, String> {

  /**
   * 
   * @param fechaInicio
   * @param fechaSalida
   * @return Listado de reservas que coinciden con los parametros de fechas
   */
  @Query("Select r from Reserva r where r.fechaIngresoRes =:fechaInicio and r.fechaSalidaRes =: fechaSalida")
  public List<Reserva> find(@Param("fechaInicio") Date fechaInicio,@Param("fechaSalida") Date fechaSalida);

}
