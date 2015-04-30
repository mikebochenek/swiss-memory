package ch.bochenek.memory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library {
	private String id;
	private String name;
	private boolean shared;
	private boolean deleted;
	private Date lastUpdate;
	private List<Image> images = new ArrayList<Image>();
	
	public Library(String i, String n) {
		this.id = i;
		this.name = n;
		this.lastUpdate = new Date();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isShared() {
		return shared;
	}
	public void setShared(boolean shared) {
		this.shared = shared;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public List<Image> getImages() {
		return images;
	}
	public void addImage(Image image) {
		this.images.add(image);
	}
}
