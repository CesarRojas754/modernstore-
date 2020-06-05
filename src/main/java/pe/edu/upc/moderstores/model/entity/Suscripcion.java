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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="suscripciones")
public class Suscripcion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@PastOrPresent(message = "La fecha de suscripcion debe ser pasado o presente obligatoriamente")
	@Temporal(value = TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Column(name = "fecha_suscripcion", nullable = false)
	private Date fechaSuscripcion;
	
	@Positive(message = "El monto debe ser mayor a cero")
	@Column(name = "monto", nullable = false)
	private double monto;
	
	//@Size(min = 7, max = 7)
	@NotBlank(message = "Por favor completar el campo nombre")
	@Column(name = "nombre", length = 20, nullable = false)
	private String nombre;
	
	//@NotEmpty(message = "La lista no puede estar vacia")
	@OneToMany(mappedBy = "suscripcion", fetch = FetchType.LAZY)
	private List<Comerciante> listaComerciantes;
	
	public Suscripcion() {
		listaComerciantes = new ArrayList<Comerciante>();
	}
	
	public void addComerciante(Comerciante comerciante) {
		listaComerciantes.add(comerciante);
	}
}
