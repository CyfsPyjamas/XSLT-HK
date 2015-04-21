package edu.neu.cs5200.XLST.orm.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.*;

@Entity
public class Site {
	@Id
	private int id;
	private String name;
	private double latitude;
	private double longitude;
	private int siteId;
	@OneToMany(mappedBy="site")
	private List<Tower> towers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public List<Tower> getTowers() {
		return towers;
	}
	public void setTowers(List<Tower> towers) {
		this.towers = towers;
	}
	public Site(int id, String name, double latitude, double longitude,
			int siteId) {
		super();
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.siteId = siteId;
	}
	public Site() {
		super();
	}
}