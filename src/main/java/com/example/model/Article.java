package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Article {
	@Id
	private Integer id;
	private Integer account_id;
	private Boolean apply_margin;
	private Boolean bulky;
	private Date created_at;
	private Date updated_at;
	private Date deleted_at;
	private String description;
	private String depth_unit;
	private String diameter_unit;
	private String length_unit;
	private Boolean discontinued;
	private Integer expense_type_id;
	private String interval_ranges;
	private Float item_height;
	private Float item_length;
	private Float item_weight;
	private Float item_width;
	private String location_in_the_store;
	private Float price_cents;
	private Integer serial_number;
	private String serial_number_supplier;
	private Integer stock_amount;
	private Float supplier_price_cents;
	private String title;
	private Boolean track_stock_amount;
	private Integer unit_id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}
	public Boolean getApply_margin() {
		return apply_margin;
	}
	public void setApply_margin(Boolean apply_margin) {
		this.apply_margin = apply_margin;
	}
	public Boolean getBulky() {
		return bulky;
	}
	public void setBulky(Boolean bulky) {
		this.bulky = bulky;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Date getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDepth_unit() {
		return depth_unit;
	}
	public void setDepth_unit(String depth_unit) {
		this.depth_unit = depth_unit;
	}
	public String getDiameter_unit() {
		return diameter_unit;
	}
	public void setDiameter_unit(String diameter_unit) {
		this.diameter_unit = diameter_unit;
	}
	public String getLength_unit() {
		return length_unit;
	}
	public void setLength_unit(String length_unit) {
		this.length_unit = length_unit;
	}
	public Boolean getDiscontinued() {
		return discontinued;
	}
	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}
	public Integer getExpense_type_id() {
		return expense_type_id;
	}
	public void setExpense_type_id(Integer expense_type_id) {
		this.expense_type_id = expense_type_id;
	}
	public String getInterval_ranges() {
		return interval_ranges;
	}
	public void setInterval_ranges(String interval_ranges) {
		this.interval_ranges = interval_ranges;
	}
	public Float getItem_height() {
		return item_height;
	}
	public void setItem_height(Float item_height) {
		this.item_height = item_height;
	}
	public Float getItem_length() {
		return item_length;
	}
	public void setItem_length(Float item_length) {
		this.item_length = item_length;
	}
	public Float getItem_weight() {
		return item_weight;
	}
	public void setItem_weight(Float item_weight) {
		this.item_weight = item_weight;
	}
	public Float getItem_width() {
		return item_width;
	}
	public void setItem_width(Float item_width) {
		this.item_width = item_width;
	}
	public String getLocation_in_the_store() {
		return location_in_the_store;
	}
	public void setLocation_in_the_store(String location_in_the_store) {
		this.location_in_the_store = location_in_the_store;
	}
	public Float getPrice_cents() {
		return price_cents;
	}
	public void setPrice_cents(Float price_cents) {
		this.price_cents = price_cents;
	}
	public Integer getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(Integer serial_number) {
		this.serial_number = serial_number;
	}
	public String getSerial_number_supplier() {
		return serial_number_supplier;
	}
	public void setSerial_number_supplier(String serial_number_supplier) {
		this.serial_number_supplier = serial_number_supplier;
	}
	public Integer getStock_amount() {
		return stock_amount;
	}
	public void setStock_amount(Integer stock_amount) {
		this.stock_amount = stock_amount;
	}
	public Float getSupplier_price_cents() {
		return supplier_price_cents;
	}
	public void setSupplier_price_cents(Float supplier_price_cents) {
		this.supplier_price_cents = supplier_price_cents;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getTrack_stock_amount() {
		return track_stock_amount;
	}
	public void setTrack_stock_amount(Boolean track_stock_amount) {
		this.track_stock_amount = track_stock_amount;
	}
	public Integer getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(Integer unit_id) {
		this.unit_id = unit_id;
	}
}
