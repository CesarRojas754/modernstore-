package pe.edu.upc.moderstores.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Por favor completar el campo nombres")
	@Column(name = "nombres", length = 40, nullable = false)
	private String nombres;
	
	@NotBlank(message = "Por favor completar el campo apellidos")
	@Column(name = "apellidos", length = 40, nullable = false)
	private String apellidos;
	
	@Past(message = "La fecha de nacimiento debe ser una fecha pasada obligatoriamente")
	@Column(name = "fecha_nacimiento", nullable = false)
	@Temporal(value = TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimiento;
	
	@NotBlank(message = "Por favor completar el campo direccion")
	@Column(name = "direccion", length = 50, nullable = false)
	private String direccion;
	
	@NotBlank(message = "Por favor completar el campo correo")
	@Email(message = "No es una direccion de correo, por favor corregir sus datos")
	@Column(unique = true, name = "correo", length = 50, nullable = false)
	private String correo;
	
	@Size(min = 5, message = "El usuario debe tener como minimo 5 caracteres")
	@Column(unique = true, name = "usuario", length = 20, nullable = false)
	private String usuario;
	
	@Size(min = 5, message = "La contraseña debe tener como minimo 5 caracteres")
	@Column(name = "password", length = 20, nullable = false)
	private String password;
	
	//@NotEmpty(message = "La lista no puede estar vacia")
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<TarjetaCredito> listaTarjetas;
	
	//@NotEmpty(message = "La lista no puede estar vacia")
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Calificacion> listaCalificaciones;
	
	@OneToOne(mappedBy = "cliente")
	private Carrito carrito;
	
	public Cliente() {
		listaTarjetas = new ArrayList<TarjetaCredito>();
		listaCalificaciones = new ArrayList<Calificacion>();
	}
	
	public void addTarjeta(TarjetaCredito tarjeta) {
		listaTarjetas.add(tarjeta);
	}
	
	public void addCalificacion(Calificacion calificacion) {
		listaCalificaciones.add(calificacion);
	}
}
