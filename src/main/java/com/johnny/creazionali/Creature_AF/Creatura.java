package com.johnny.creazionali.Creature_AF;

import java.io.InputStream;

public abstract class Creatura {
	
	protected double altezza;
	protected double larghezza;
	protected double forza;
	protected double probabAttaccoCritico;
	protected double protezioneDanni;
	protected double protezioneDanniEnergetici;
	protected double protezioneDanniRadioattivi;
	protected InputStream pathImg;
	
	public Creatura() {}

	public Creatura(double altezza, double larghezza, double forza, double probabAttaccoCritico, double protezioneDanni,
			double protezioneDanniEnergetici, double protezioneDanniRadioattivi) {
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.forza = forza;
		this.probabAttaccoCritico = probabAttaccoCritico;
		this.protezioneDanni = protezioneDanni;
		this.protezioneDanniEnergetici = protezioneDanniEnergetici;
		this.protezioneDanniRadioattivi = protezioneDanniRadioattivi;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}

	public double getForza() {
		return forza;
	}

	public void setForza(double forza) {
		this.forza = forza;
	}

	public double getProbabAttaccoCritico() {
		return probabAttaccoCritico;
	}

	public void setProbabAttaccoCritico(double probabAttaccoCritico) {
		this.probabAttaccoCritico = probabAttaccoCritico;
	}

	public double getProtezioneDanni() {
		return protezioneDanni;
	}

	public void setProtezioneDanni(double protezioneDanni) {
		this.protezioneDanni = protezioneDanni;
	}

	public double getProtezioneDanniEnergetici() {
		return protezioneDanniEnergetici;
	}

	public void setProtezioneDanniEnergetici(double protezioneDanniEnergetici) {
		this.protezioneDanniEnergetici = protezioneDanniEnergetici;
	}

	public double getProtezioneDanniRadioattivi() {
		return protezioneDanniRadioattivi;
	}

	public void setProtezioneDanniRadioattivi(double protezioneDanniRadioattivi) {
		this.protezioneDanniRadioattivi = protezioneDanniRadioattivi;
	}

	public InputStream getPathImg() {
		return pathImg;
	}

	public void setPathImg(InputStream pathImg) {
		this.pathImg = pathImg;
	}
	
}
