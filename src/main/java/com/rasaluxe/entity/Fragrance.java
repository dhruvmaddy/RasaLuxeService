package com.rasaluxe.entity;

import com.rasaluxe.enums.FragranceIntensityEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fragrance")
public class Fragrance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fragrance_id")
    private Integer fragranceId;

    @Column(name = "fragrance_name")
    private String fragranceName;

    @Column(name = "fragrance_family")
    private String fragranceFamily;

    @Column(name = "fragrance_description")
    private String fragranceDescription;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "fragrance_intensity", nullable = false)
    private FragranceIntensityEnum fragranceIntensity;


    @Column(name = "main_fragrance")
    private String mainFragrance;

    @Column(name = "blend_composition")
    private String blendComposition;

    @Column(name = "is_active")
    private Boolean isActive;

	public Integer getFragranceId() {
		return fragranceId;
	}

	public void setFragranceId(Integer fragranceId) {
		this.fragranceId = fragranceId;
	}

	public String getFragranceName() {
		return fragranceName;
	}

	public void setFragranceName(String fragranceName) {
		this.fragranceName = fragranceName;
	}

	public String getFragranceFamily() {
		return fragranceFamily;
	}

	public void setFragranceFamily(String fragranceFamily) {
		this.fragranceFamily = fragranceFamily;
	}

	public String getFragranceDescription() {
		return fragranceDescription;
	}

	public void setFragranceDescription(String fragranceDescription) {
		this.fragranceDescription = fragranceDescription;
	}

	public FragranceIntensityEnum getFragranceIntensity() {
		return fragranceIntensity;
	}

	public void setFragranceIntensity(FragranceIntensityEnum fragranceIntensity) {
		this.fragranceIntensity = fragranceIntensity;
	}

	public String getMainFragrance() {
		return mainFragrance;
	}

	public void setMainFragrance(String mainFragrance) {
		this.mainFragrance = mainFragrance;
	}

	public String getBlendComposition() {
		return blendComposition;
	}

	public void setBlendComposition(String blendComposition) {
		this.blendComposition = blendComposition;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
    
    

}
