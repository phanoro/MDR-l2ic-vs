package data;

public class HtmlSiteMapComponents extends SiteMapComponents {
	
    private String title;
    private String h1;

	public HtmlSiteMapComponents() {
		super();
	}
	
    public String getTitle() {
    	String lien = super.getUrl();
    	int debut = lien.indexOf("<title>");
    	int fin = lien.indexOf("</title>");
    	String texte = lien.substring(debut + 1, fin);
        return texte;
    }
	
	public String getH1(){
    	String lien = super.getUrl();
    	int debut = lien.indexOf("<h1>");
    	int fin = lien.indexOf("</h1>");
    	String texte = lien.substring(debut + 1, fin);
        return texte;
	}
	
	
	
}
