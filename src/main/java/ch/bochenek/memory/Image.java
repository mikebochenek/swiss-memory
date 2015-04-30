package ch.bochenek.memory;

public class Image {
	private String id;
	private String url;
	private byte[] data;
	
	public Image(String i, String u, byte[] b) {
		this.id = i;
		this.url = u;
		this.data = b;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
}
