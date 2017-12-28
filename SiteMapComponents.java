package data;

import java.net.URL;

public class SiteMapComponents {
    private String url;
    private String date;
    private String prio;
    private String freqChg;

    public SiteMapComponents() {
		// TODO Auto-generated constructor stub
/**
 * @author Virginie/Stéphane
 * @version 1.0
 */
        this.freqChg="monthly";
        this.prio="0.5";
    }
/**
 * 
 * @return L'url de la page
 */
    public String getUrl() {
    	String lien = this.url;
    	int debut = lien.lastIndexOf("/");
    	String texte = lien.substring(debut + 1);
        return texte;
    }
    /**
     * 
     * @param url
     */

    public void setUrl(String url) {
        this.url = url;
    }
/**
 * 
 * @return La date de la page.
 */
    public String getDate() {
        return date;
    }
/**
 * 
 * @param date
 */
    public void setDate(String date) {
        this.date = date;
    }
/**
 * 
 * @return La priorité de la page.
 */
    public String getPrio() {
        return prio;
    }
/**
 * 
 * @param prio
 */
    public void setPrio(String prio) {
        this.prio = prio;
    }
/**
 * 
 * @return La fréquence des mises à jour de la page
 */
    public String getFreqChg() {
        return freqChg;
    }
/**
 * 
 * @param freqChg
 */
    public void setFreqChg(String freqChg) {
        this.freqChg = freqChg;
    }



}
