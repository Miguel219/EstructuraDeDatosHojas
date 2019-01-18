package application;
import java.util.*;

public class Radioimp implements Radio {
	
	 
	private boolean turnOn = false; // TODO turnOn encendido true apagado false
	private boolean frequency = true; // TODO frequency FM true frequency AM false
	private double station = 87.9;// TODO guarda la station de 87.9 a 107.9 en FM y de 530 a 1610 en AM
	private Double[] favoriteStations= new Double[12];// TODO guarda las estaciones de los botones (12 botones)
	
	@Override
	public void toggle() {
		// TODO cambia el estado
		turnOn=!turnOn;

	}

	@Override
	public boolean getState() {
		// TODO Regresa el estado del radio.
		return turnOn;
	}

	@Override
	public void changeFrequency() {
		// TODO cambia de frecuencia
		frequency=!frequency;
		if(frequency==true) {
			station=87.9;
		}else {
			station=530;
		}
	}

	@Override
	public void changeStation(boolean up) {
		// TODO cambia estacion dependiendo de la frecuencia y si desea subir (true)o bajar
        if(frequency==true) {
        	if(up==true) {
        		if(station>=107.9) {
        			station=87.9;
        		}else {
        			station= station+0.2;
        		}
        	}else {
        		if(station<=87.9) {
        			station=107.9;
        		}else {
        			station= station-0.2;
        		}
        	}
        }else if(frequency==false) {
        	if(up==true) {
        		if(station>=1610) {
        			station=530;
        		}else {
        			station= station+10;
        		}
        	}else {
        		if(station<=530) {
        			station=1610;
        		}else {
        			station= station-10;
        		}
        	}
        }
	}

	@Override
	public boolean getFrequency() {
		// TODO Regresa la frecuencia del radio
		return frequency;
	}

	@Override
	public void saveStation(int numButton) {
		// TODO guarda la estacion
		favoriteStations[numButton] = station;
	}

	@Override
	public void changeStationButton(int numButton) {
		// TODO cambia la estacion por la guardada en el boton
		if (favoriteStations[numButton]!=null) {
			if (favoriteStations[numButton]>87 && favoriteStations[numButton]<108) {
				frequency=true;
			}else {
				frequency=false;
			}
			station= favoriteStations[numButton];
		}
		
	}

	@Override
	public double getStation() {
		// TODO regresa la station del radio
		return station;
	}

}
