package com.rupine.inst.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
//@Data
@Table(name="inst_profile")
public class Profile {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="active_template_id")
	private Long activeTemplateId;
	
	private Long themeId;
	private String institutionName;
	private String aboutUs;
	private Long noOfBed;
	private Long icuBed;
	private boolean pathLab;
	private boolean trumaFacility;
	private boolean infectiousDiseaseFacility;
	private boolean psychiatricFacility;
	private boolean ambulanceFacility;
	private String websiteAddress;
	private String status;
	private String bannerUrl;
	private Timestamp createdOn;
	private Timestamp updatedOn;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getActiveTemplateId() {
		return activeTemplateId;
	}
	public void setActiveTemplateId(Long activeTemplateId) {
		this.activeTemplateId = activeTemplateId;
	}
	public Long getThemeId() {
		return themeId;
	}
	public void setThemeId(Long themeId) {
		this.themeId = themeId;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getAboutUs() {
		return aboutUs;
	}
	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}
	public Long getNoOfBed() {
		return noOfBed;
	}
	public void setNoOfBed(Long noOfBed) {
		this.noOfBed = noOfBed;
	}
	public Long getIcuBed() {
		return icuBed;
	}
	public void setIcuBed(Long icuBed) {
		this.icuBed = icuBed;
	}
	public boolean isPathLab() {
		return pathLab;
	}
	public void setPathLab(boolean pathLab) {
		this.pathLab = pathLab;
	}
	public boolean isTrumaFacility() {
		return trumaFacility;
	}
	public void setTrumaFacility(boolean trumaFacility) {
		this.trumaFacility = trumaFacility;
	}
	public boolean isInfectiousDiseaseFacility() {
		return infectiousDiseaseFacility;
	}
	public void setInfectiousDiseaseFacility(boolean infectiousDiseaseFacility) {
		this.infectiousDiseaseFacility = infectiousDiseaseFacility;
	}
	public boolean isPsychiatricFacility() {
		return psychiatricFacility;
	}
	public void setPsychiatricFacility(boolean psychiatricFacility) {
		this.psychiatricFacility = psychiatricFacility;
	}
	public boolean isAmbulanceFacility() {
		return ambulanceFacility;
	}
	public void setAmbulanceFacility(boolean ambulanceFacility) {
		this.ambulanceFacility = ambulanceFacility;
	}
	public String getWebsiteAddress() {
		return websiteAddress;
	}
	public void setWebsiteAddress(String websiteAddress) {
		this.websiteAddress = websiteAddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBannerUrl() {
		return bannerUrl;
	}
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	public Timestamp getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
}
