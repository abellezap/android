package com.servidor.rest.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_docente")
public class Docente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_doc")
	private Integer codigo;
	@Column(name = "nom_doc")
	private String nombre;
	@Column(name = "pat_doc")
	private String paterno;
	@Column(name = "mat_doc")
	private String materno;
	@Column(name = "sexo_doc")
	private String sexo;
	@Column(name = "num_hijo")
	private int hijos;
	@Column(name = "sue_doc")
	private double sueldo;
	@Column(name = "dir_doc")
	private String direccion;
	private String foto;
	
	@ManyToOne
	@JoinColumn(name="cod_dis")
	private Distrito distrito; ///ASOC

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	
	
}



