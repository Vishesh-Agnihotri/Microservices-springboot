package com.api.model;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

public class Model {

	//private Name name;
	private List<String> tld;
	private String cca2;
	private String ccn3;
	private String cca3;
	private boolean independent;
	private String status;
	private boolean unMember;
//	private Currencies currencies;
//	private Idd idd;
	private List<String> capital;
	private List<String> altSpellings;
	private String region;
	private String subregion;
//	private Languages languages;
//	private Translations translations;
	private List<Double> latlng;
	private boolean landlocked;
	private double area;
//	private Demonyms demonyms;
	private String flag;
//	private Maps maps;
	private int population;
//	private Car car;
	private List<String> timezones;
	private List<String> continents;
//	private Flags flags;
//	private CoatOfArms coatOfArms;
	private String startOfWeek;
//	private CapitalInfo capitalInfo;
//	private PostalCode postalCode;

	// getters and setters
	
	/*
	 * public Name getName() { return name; }
	 * 
	 * public void setName(Name name) { this.name = name; }
	 */
	public List<String> getTld() {
		return tld;
	}

	public void setTld(List<String> tld) {
		this.tld = tld;
	}

	public String getCca2() {
		return cca2;
	}

	public void setCca2(String cca2) {
		this.cca2 = cca2;
	}

	public String getCcn3() {
		return ccn3;
	}

	public void setCcn3(String ccn3) {
		this.ccn3 = ccn3;
	}

	public String getCca3() {
		return cca3;
	}

	public void setCca3(String cca3) {
		this.cca3 = cca3;
	}

	public boolean isIndependent() {
		return independent;
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isUnMember() {
		return unMember;
	}

	public void setUnMember(boolean unMember) {
		this.unMember = unMember;
	}

	/*
	 * public Currencies getCurrencies() { return currencies; }
	 * 
	 * public void setCurrencies(Currencies currencies) { this.currencies =
	 * currencies; }
	 */

	/*
	 * public Idd getIdd() { return idd; }
	 * 
	 * public void setIdd(Idd idd) { this.idd = idd; }
	 */
	public List<String> getCapital() {
		return capital;
	}

	public void setCapital(List<String> capital) {
		this.capital = capital;
	}

	public List<String> getAltSpellings() {
		return altSpellings;
	}

	public void setAltSpellings(List<String> altSpellings) {
		this.altSpellings = altSpellings;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	/*
	 * public Languages getLanguages() { return languages; }
	 * 
	 * public void setLanguages(Languages languages) { this.languages = languages; }
	 * 
	 * public Translations getTranslations() { return translations; }
	 */

	/*
	 * public void setTranslations(Translations translations) { this.translations =
	 * translations; }
	 */
	public List<Double> getLatlng() {
		return latlng;
	}

	public void setLatlng(List<Double> latlng) {
		this.latlng = latlng;
	}

	public boolean isLandlocked() {
		return landlocked;
	}

	public void setLandlocked(boolean landlocked) {
		this.landlocked = landlocked;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	/*
	 * public Demonyms getDemonyms() { return demonyms; }
	 * 
	 * public void setDemonyms(Demonyms demonyms) { this.demonyms = demonyms; }
	 */
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	/*
	 * public Maps getMaps() { return maps; }
	 * 
	 * public void setMaps(Maps maps) { this.maps = maps; }
	 */
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	/*
	 * public Car getCar() { return car; }
	 * 
	 * public void setCar(Car car) { this.car = car; }
	 */

	public List<String> getTimezones() {
		return timezones;
	}

	public void setTimezones(List<String> timezones) {
		this.timezones = timezones;
	}

	public List<String> getContinents() {
		return continents;
	}

	public void setContinents(List<String> continents) {
		this.continents = continents;
	}

	/*
	 * public Flags getFlags() { return flags; }
	 * 
	 * public void setFlags(Flags flags) { this.flags = flags; }
	 * 
	 * public CoatOfArms getCoatOfArms() { return coatOfArms; }
	 * 
	 * public void setCoatOfArms(CoatOfArms coatOfArms) { this.coatOfArms =
	 * coatOfArms; }
	 */

	public String getStartOfWeek() {
		return startOfWeek;
	}

	public void setStartOfWeek(String startOfWeek) {
		this.startOfWeek = startOfWeek;
	}

	/*
	 * public CapitalInfo getCapitalInfo() { return capitalInfo; }
	 * 
	 * public void setCapitalInfo(CapitalInfo capitalInfo) { this.capitalInfo =
	 * capitalInfo; }
	 */

	/*
	 * public PostalCode getPostalCode() { return postalCode; }
	 * 
	 * public void setPostalCode(PostalCode postalCode) { this.postalCode =
	 * postalCode; }
	 */
	// Nested classes for the inner structures

	public static class Name {
		private String common;
		private String official;
		private NativeName nativeName;

		// getters and setters
	}

	public static class NativeName {
		private Map<String, CommonOfficial> eng;

		// getters and setters
	}

	public static class CommonOfficial {
		private String common;
		private String official;

		// getters and setters
	}

	public static class Currencies {
		private Map<String, CurrencyInfo> currencies;

		// getters and setters
	}

	public static class CurrencyInfo {
		private String name;
		private String symbol;

		// getters and setters
	}

	public static class Idd {
		private String root;
		private List<String> suffixes;

		// getters and setters
	}

	public static class Languages {
		private Map<String, String> eng;

		// getters and setters
	}

	public static class Translations {
		private Map<String, CommonOfficial> ara;
		private Map<String, CommonOfficial> bre;
		private Map<String, CommonOfficial> ces;
		private Map<String, CommonOfficial> cym;
		private Map<String, CommonOfficial> deu;
		private Map<String, CommonOfficial> est;
		private Map<String, CommonOfficial> fin;
		private Map<String, CommonOfficial> fra;
		private Map<String, CommonOfficial> hrv;
		private Map<String, CommonOfficial> hun;
		private Map<String, CommonOfficial> ita;
		private Map<String, CommonOfficial> jpn;
		private Map<String, CommonOfficial> kor;
		private Map<String, CommonOfficial> nld;
		private Map<String, CommonOfficial> per;
		private Map<String, CommonOfficial> pol;
		private Map<String, CommonOfficial> por;
		private Map<String, CommonOfficial> rus;
		private Map<String, CommonOfficial> slk;
		private Map<String, CommonOfficial> spa;
		private Map<String, CommonOfficial> srp;
		private Map<String, CommonOfficial> swe;
		private Map<String, CommonOfficial> tur;
		private Map<String, CommonOfficial> urd;
		private Map<String, CommonOfficial> zho;

		// getters and setters
	}

	public static class Demonyms {
		private Map<String, CommonOfficial> eng;
		private Map<String, CommonOfficial> fra;

		// getters and setters
	}

	public static class Maps {
		private String googleMaps;
		private String openStreetMaps;

		// getters and setters
	}

	public static class Car {
		private List<String> signs;
		private String side;

		// getters and setters
	}

	public static class Flags {
		private String png;
		private String svg;
		private String alt;

		// getters and setters
	}

	public static class CoatOfArms {
		private String png;
		private String svg;

		// getters and setters
	}

	public static class CapitalInfo {
		private List<Double> latlng;

		// getters and setters
	}

	public static class PostalCode {
		private String format;
		private String regex;

		// getters and setters
	}
}
