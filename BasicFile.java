package data;

public class BasicFile {
	private String name;
	private String url;
	private String lastModif;
	private String place;
	private String title;
	private String h1;
	private double priority;
	private String freq;
	
	public BasicFile(String name){
		this.name = name;
	}
	
	public BasicFile(String name, String url, String lastModif, String place, String title, String h1, String freq) {
		this.name = name;
		this.url = url;
		this.lastModif = lastModif;
		this.place = place;
		this.title = title;
		this.h1 = h1;
		this.priority = 0.5;
		this.freq = freq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLastModif() {
		return lastModif;
	}

	public void setLastModif(String lastModif) {
		this.lastModif = lastModif;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getH1() {
		return h1;
	}

	public void setH1(String h1) {
		this.h1 = h1;
	}

	public double getPriority() {
		return priority;
	}

	public void setPriority(double priority) {
		this.priority = priority;
	}

	public String getFreq() {
		return freq;
	}

	public void setFreq(String freq) {
		this.freq = freq;
	}

	@Override
	public String toString() {
		return "Fic [name=" + name + ", url=" + url + ", lastModif=" + lastModif + ", place=" + place + ", title=" + title + ", h1=" + h1 + ", priority=" + priority + ", freq=" + freq + "]";
	}
	
}
