package com.firstproject.app.modules;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Invoice {	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date invoiceDate;
	
	@ManyToOne
	@JoinColumn(name="invoicestatusid", insertable=false, updatable=false)	
	private InvoiceStatus invoiceStatus;
	private Integer invoicestatusid;
	
	@ManyToOne
	@JoinColumn(name="clientid", insertable=false, updatable=false)	
	public Client client;
	private Integer clientid;
	
	private String remarks;

	public Integer getInvoicestatusid() {
		return invoicestatusid;
	}

	public void setInvoicestatusid(Integer invoicestatusid) {
		this.invoicestatusid = invoicestatusid;
	}

	public Integer getClientid() {
		return clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}	
}
