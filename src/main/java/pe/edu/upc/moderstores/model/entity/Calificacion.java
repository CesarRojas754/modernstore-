package pe.edu.upc.moderstores.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="calificaciones")
public class Calificacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Min(value = 1,message = "puntaje minimo es 1")
	@Min(value = 10,message = "puntaje minimo es 10")
	@Column(name="puntaje")
	private int puntaje;
	
	@NotNull(message = "Por favor especifique el cliente")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	@NotNull(message = "Por favor especifique la ropa")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ropa_id")
	private Ropa ropa;
	
	
}
