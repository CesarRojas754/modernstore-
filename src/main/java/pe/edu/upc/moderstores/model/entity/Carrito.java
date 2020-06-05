package pe.edu.upc.moderstores.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="carrito")
public class Carrito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="total")
	private double total;
	
	@OneToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	
	@OneToMany(mappedBy = "carrito",fetch = FetchType.LAZY)
	private List<Ropa> listaRopas;
	
	public Carrito() {
		listaRopas=new ArrayList<Ropa>();
	}
	public void addRopa(Ropa ropa) {
		listaRopas.add(ropa);
	}
}
