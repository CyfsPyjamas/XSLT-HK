package edu.neu.cs5200.XLST.orm.models;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Tower {
	@Id
	private int id;
	private String name;
	private double height;
	private int sides;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="siteId")
	private Site site;
	private int towerId;
	@OneToMany(mappedBy="tower")
	private List<Equipment> equipments;
	
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int sides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public int getTowerId(){
		return towerId;
	}
	public void setTowerId(int towerId) {
		this.towerId = towerId;
	}
	public List<Equipment> getEquipments() {
		return equipments;
	}
	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}
	public Tower(int id, String name, double height, int sides, Site site) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.sides = sides;
		this.site = site;
		this.towerId = towerId;
	}
	public Tower() {
		super();
	}
}