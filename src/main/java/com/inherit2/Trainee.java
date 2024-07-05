package com.inherit2;
import jakarta.persistence.*;
@Entity
@Table(name="EMP2")
@AttributeOverrides({
	@AttributeOverride(name="payperhour",column=@Column(name="payperhour")),
    @AttributeOverride(name="contractperiod",column=@Column(name="contractperiod"))
})
public class Trainee extends Employee {
	private float payperhour;
	private String contractperiod;
	
	public Trainee(String contractperiod,float payperhour,String name) {
		super(name); 
			this.payperhour=payperhour;
			this.contractperiod=contractperiod;
	}
	public float getPaperhour() {
		return payperhour;
	}
	public void setPaperhour(float paperhour) {
		this.payperhour = paperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
		}
}
