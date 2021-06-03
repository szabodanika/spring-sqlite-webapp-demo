package danielszabo.springsqlitewebappdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Camera {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String manufacturer, model;
	private Integer year;

	public Camera() {
	}

	public Camera(String manufacturer, String model, int year) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
}
