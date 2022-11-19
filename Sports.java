package com.te.hipernetuniversity.module;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "leage_match")
public class Sports {
	@Id
	private int jersyNo;
	private String games;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "sports1")
	private List<Student> students21;
	

}
