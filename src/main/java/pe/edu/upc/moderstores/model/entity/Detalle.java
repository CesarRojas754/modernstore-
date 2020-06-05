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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="detalles")
public class Detalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Positive(message = "La cantidad comprada debe ser mayor a cero")
	@NotBlank(message = "Por favor completar el campo cantidad")
	@Column(name = "cantidad_comprada", nullable = false)
	private int cantidadComprada;
	
	@Positive(message = "El monto debe ser mayor a cero")
	@NotBlank(message = "Por favor completar el campo monto a pagar")
	@Column(name = "monto_pagar", nullable = false)
	private double montoPagar;
	
	@NotNull(message = "Por favor especifique la factura")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "factura_id")
	private Factura factura;
	
	@NotNull(message = "Por favor especifique la ropa")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ropa_id")
	private Ropa ropa;
}
