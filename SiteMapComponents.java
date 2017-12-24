package data;

import java.net.URL;

public class SiteMapComponents {
    private String url;
    private String date;
    private String prio;
    private String freqChg;

    public SiteMapComponents() {
		// TODO Auto-generated constructor stub

        this.freqChg="monthly";
        this.prio="0.5";
    }

    public String getUrl() {
    	String lien = this.url;
    	int debut = lien.lastIndexOf("/");
    	String texte = lien.substring(debut + 1);
        return texte;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrio() {
        return prio;
    }

    public void setPrio(String prio) {
        this.prio = prio;
    }

    public String getFreqChg() {
        return freqChg;
    }

    public void setFreqChg(String freqChg) {
        this.freqChg = freqChg;
    }



}