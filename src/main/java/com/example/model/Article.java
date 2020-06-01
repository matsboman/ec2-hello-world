package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer accountId;
	private Boolean applyMargin;
	private Boolean bulky;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private String description;
	private String depthUnit;
	private String diameterUnit;
	private String lengthUnit;
	private Boolean discontinued;
	private Integer expenseTypeId;
	private String intervalRanges;
	private Float itemHeight;
	private Float itemLength;
	private Float itemWeight;
	private Float itemWidth;
	private String locationInTheStore;
	private Float priceCents;
	private Integer serialNumber;
	private String serialNumberSupplier;
	private Integer stockAmount;
	private Float supplierPriceCents;
	private String title;
	private Boolean trackStockAmount;
	private Integer unitId;

	public void updateFrom(Article articleFrom) {
		if (articleFrom.accountId != null) {
			this.accountId = articleFrom.accountId;
		}
		if (articleFrom.applyMargin != null) {
			this.applyMargin = articleFrom.applyMargin;
		}
		if (articleFrom.bulky != null) {
			this.bulky = articleFrom.bulky;
		}
		if (articleFrom.description != null) {
			this.description = articleFrom.description;
		}
		if (articleFrom.discontinued != null) {
			this.discontinued = articleFrom.discontinued;
		}
		if (articleFrom.expenseTypeId != null) {
			this.expenseTypeId = articleFrom.expenseTypeId;
		}
		if (articleFrom.locationInTheStore != null) {
			this.locationInTheStore = articleFrom.locationInTheStore;
		}
		if (articleFrom.priceCents != null) {
			this.priceCents = articleFrom.priceCents;
		}
		if (articleFrom.serialNumber != null) {
			this.serialNumber = articleFrom.serialNumber;
		}
		if (articleFrom.serialNumberSupplier != null) {
			this.serialNumberSupplier = articleFrom.serialNumberSupplier;
		}
		if (articleFrom.stockAmount != null) {
			this.stockAmount = articleFrom.stockAmount;
		}
		if (articleFrom.supplierPriceCents != null) {
			this.supplierPriceCents = articleFrom.supplierPriceCents;
		}
		if (articleFrom.title != null) {
			this.title = articleFrom.title;
		}
		if (articleFrom.trackStockAmount != null) {
			this.trackStockAmount = articleFrom.trackStockAmount;
		}
		if (articleFrom.unitId != null) {
			this.unitId = articleFrom.unitId;
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Boolean getApplyMargin() {
		return applyMargin;
	}

	public void setApplyMargin(Boolean applyMargin) {
		this.applyMargin = applyMargin;
	}

	public Boolean getBulky() {
		return bulky;
	}

	public void setBulky(Boolean bulky) {
		this.bulky = bulky;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepthUnit() {
		return depthUnit;
	}

	public void setDepthUnit(String depthUnit) {
		this.depthUnit = depthUnit;
	}

	public String getDiameterUnit() {
		return diameterUnit;
	}

	public void setDiameterUnit(String diameterUnit) {
		this.diameterUnit = diameterUnit;
	}

	public String getLengthUnit() {
		return lengthUnit;
	}

	public void setLengthUnit(String lengthUnit) {
		this.lengthUnit = lengthUnit;
	}

	public Boolean getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}

	public Integer getExpenseTypeId() {
		return expenseTypeId;
	}

	public void setExpenseTypeId(Integer expenseTypeId) {
		this.expenseTypeId = expenseTypeId;
	}

	public String getIntervalRanges() {
		return intervalRanges;
	}

	public void setIntervalRanges(String intervalRanges) {
		this.intervalRanges = intervalRanges;
	}

	public Float getItemHeight() {
		return itemHeight;
	}

	public void setItemHeight(Float itemHeight) {
		this.itemHeight = itemHeight;
	}

	public Float getItemLength() {
		return itemLength;
	}

	public void setItemLength(Float itemLength) {
		this.itemLength = itemLength;
	}

	public Float getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(Float itemWeight) {
		this.itemWeight = itemWeight;
	}

	public Float getItemWidth() {
		return itemWidth;
	}

	public void setItemWidth(Float itemWidth) {
		this.itemWidth = itemWidth;
	}

	public String getLocationInTheStore() {
		return locationInTheStore;
	}

	public void setLocationInTheStore(String locationInTheStore) {
		this.locationInTheStore = locationInTheStore;
	}

	public Float getPriceCents() {
		return priceCents;
	}

	public void setPriceCents(Float priceCents) {
		this.priceCents = priceCents;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumberSupplier() {
		return serialNumberSupplier;
	}

	public void setSerialNumberSupplier(String serialNumberSupplier) {
		this.serialNumberSupplier = serialNumberSupplier;
	}

	public Integer getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(Integer stockAmount) {
		this.stockAmount = stockAmount;
	}

	public Float getSupplierPriceCents() {
		return supplierPriceCents;
	}

	public void setSupplierPriceCents(Float supplierPriceCents) {
		this.supplierPriceCents = supplierPriceCents;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getTrackStockAmount() {
		return trackStockAmount;
	}

	public void setTrackStockAmount(Boolean trackStockAmount) {
		this.trackStockAmount = trackStockAmount;
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}
}
