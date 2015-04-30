package ch.bochenek.memory;

import java.util.Date;
import java.util.List;

public class Library {
	private String id;
	private String name;
	private boolean shared;
	private boolean deleted;
	private Date lastUpdate;
	private List<Image> images;
}
