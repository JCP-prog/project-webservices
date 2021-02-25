/**
 * 
 */
package com.jimmyc.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.jimmyc.projectwebservices.entity.Empleado;

/**
 * @author JimmyC
 *
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar un Empleado por su Id
	 * @param numeroEmpleado {@link String} numero del empleado
	 * @return {@link Empleado} empleado consultado
	 */
	public Empleado consultarEmpleadoPorNumeroEmpleado(String numeroEmpleado) {
		List<Empleado> empleadosConsultados = this.consultarEmpleados();
		
		for (Empleado empleadoConsultado : empleadosConsultados) {
			if(empleadoConsultado.getNumeroEmpleado().equals(numeroEmpleado)) {
				return empleadoConsultado;
			}
		}
		return null;
	}
	
	/**
	 * Metodo que simula la consulta de un empleado
	 * @return {@link Empleado} empleado consultado
	 */
	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Diego");
		empleado.setPrimerApellido("Paniagua");
		empleado.setSegundoApellido("Lopez");
		empleado.setEdad(31);
		empleado.setFechaCreacion(LocalDateTime.now());
		
		return empleado;
	}
	
	/**
	 * Metodo que permite consultar la lista de empleados
	 * @return {@link List} lista consultada
	 */
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList();
		
		Empleado empleado = new Empleado();
		
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Diego");
		empleado.setPrimerApellido("Paniagua");
		empleado.setSegundoApellido("Lopez");
		empleado.setEdad(31);
		empleado.setFechaCreacion(LocalDateTime.now());
		
		Empleado empleadoNuevo = new Empleado();
		
		empleadoNuevo.setNumeroEmpleado("895656");
		empleadoNuevo.setNombre("Erick");
		empleadoNuevo.setPrimerApellido("Guerrero");
		empleadoNuevo.setSegundoApellido("Gomez");
		empleadoNuevo.setEdad(31);
		empleadoNuevo.setFechaCreacion(LocalDateTime.now());
		
		empleados.add(empleado);
		empleados.add(empleadoNuevo);
		
		return empleados;
	}
}
