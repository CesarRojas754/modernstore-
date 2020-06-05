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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="tarjeta_credito")
public class TarjetaCredito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min = 16, max = 16, message = "El tamaño debe ser de 16 caracteres")
	@Column(name = "numero_tarjeta", nullable = false)
	private String numeroTarjeta;
	
	@Size(min = 3, max = 3, message = "El mensaje debe ser de 3 caracteres")
	@Column(name = "codigo_control", nullable = false)
	private String codigoControl;
	
	@FutureOrPresent(message = "La fecha debe caducar obligatoriamente en una fecha futura o presente")
	@Column(name = "expira", nullable = false)
	@Temporal(value = TemporalType.DATE)
	private Date expira;
	
	@NotBlank(message = "Por favor completar el campo tipo")
	@Column(name = "tipo", length = 40, nullable = false)
	private String tipo;
	
	@NotNull(message = "Por favor especifique el cliente")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@NotNull(message = "Por favor especifique el comerciante")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "comerciante_id")
	private Comerciante comerciante;
	
	@NotEmpty(message = "La lista no puede estar vacia")
	@OneToMany(mappedBy = "tarjeta", fetch = FetchType.LAZY)
	private List<Factura> listaFacturas;
	
	public TarjetaCredito() {
		listaFacturas = new ArrayList<Factura>();
	}
	
	public void addFactura(Factura factura) {
		listaFacturas.add(factura);
	}
}
