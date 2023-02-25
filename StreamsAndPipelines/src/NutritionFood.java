import java.util.Objects;

public class NutritionFood {

	private String id;
	private String name;
	private String serving_size;
	private int calories;
	private String total_fat;
	private String saturated;
	private String cholestrol;
	private String sodium;
	private String choline;
	private String folate;
	private String folic_acid;
	private String niacin;
	private String pantother;
	private String riboflavin;
	private String thiamin;
	private String vitamin_a;
	private String vitamin_a_rae;
	private String carotene_alpha;
	private String carotene_beta;
	private String cryptoxanthin_beta;
	private String lutein_zeaxanthin;
	private String lucopene;
	private String vitamin_b12;
	private String vitamin_b6;
	private String vitamin_c;
	private String vitamin_d;
	private String vitamin_e;
	private String tocopherol_alpha;
	private String vitamin_k;
	private String calcium;
	private String copper;
	private String irom;
	private String magnesium;
	private String manganese;
	private String phosphorous;
	private String potassium;
	private String selenium;
	private String zink;
	private Double protein;
	private String alanine;
	private String arginine;
	private String aspartic_acid;
	private String cystine;
	private String glutamic_acid;
	private String glycine;
	private String histidine;
	private String hydroxyproline;
	private String isoleucine;
	private String leucine;
	private String lysine;
	private String methionine;
	private String phenylalanine;
	private String proline;
	private String serine;
	private String threonine;
	private String tryptophan;
	private String tyrosine;
	private String valine;
	private String carbohydrate;
	private String fiber;
	private String sugars;
	private String fructose;
	private String galactose;
	private String glucose;
	private Double lactose;
	private String maltose;
	private String sucrose;
	private Double fat;
	private String saturated_fatty_acids;
	private String monounsaturated_fatty_acids;
	private String polyunsaturated_fatty_acids;
	private String fatty_acids_total_trans;
	private String alcohol;
	private String ash;
	private String caffeine;
	private String theobromine;
	private String water;

	public NutritionFood() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NutritionFood(String id, String name, String serving_size, int calories, String total_fat, String saturated,
			String cholestrol, String sodium, String choline, String folate, String folic_acid, String niacin,
			String pantother, String riboflavin, String thiamin, String vitamin_a, String vitamin_a_rae,
			String carotene_alpha, String carotene_beta, String cryptoxanthin_beta, String lutein_zeaxanthin,
			String lucopene, String vitamin_b12, String vitamin_b6, String vitamin_c, String vitamin_d,
			String vitamin_e, String tocopherol_alpha, String vitamin_k, String calcium, String copper, String irom,
			String magnesium, String manganese, String phosphorous, String potassium, String selenium, String zink,
			Double protein, String alanine, String arginine, String aspartic_acid, String cystine, String glutamic_acid,
			String glycine, String histidine, String hydroxyproline, String isoleucine, String leucine, String lysine,
			String methionine, String phenylalanine, String proline, String serine, String threonine, String tryptophan,
			String tyrosine, String valine, String carbohydrate, String fiber, String sugars, String fructose,
			String galactose, String glucose, Double lactose, String maltose, String sucrose, Double fat,
			String saturated_fatty_acids, String monounsaturated_fatty_acids, String polyunsaturated_fatty_acids,
			String fatty_acids_total_trans, String alcohol, String ash, String caffeine, String theobromine,
			String water) {
		super();
		this.id = id;
		this.name = name;
		this.serving_size = serving_size;
		this.calories = calories;
		this.total_fat = total_fat;
		this.saturated = saturated;
		this.cholestrol = cholestrol;
		this.sodium = sodium;
		this.choline = choline;
		this.folate = folate;
		this.folic_acid = folic_acid;
		this.niacin = niacin;
		this.pantother = pantother;
		this.riboflavin = riboflavin;
		this.thiamin = thiamin;
		this.vitamin_a = vitamin_a;
		this.vitamin_a_rae = vitamin_a_rae;
		this.carotene_alpha = carotene_alpha;
		this.carotene_beta = carotene_beta;
		this.cryptoxanthin_beta = cryptoxanthin_beta;
		this.lutein_zeaxanthin = lutein_zeaxanthin;
		this.lucopene = lucopene;
		this.vitamin_b12 = vitamin_b12;
		this.vitamin_b6 = vitamin_b6;
		this.vitamin_c = vitamin_c;
		this.vitamin_d = vitamin_d;
		this.vitamin_e = vitamin_e;
		this.tocopherol_alpha = tocopherol_alpha;
		this.vitamin_k = vitamin_k;
		this.calcium = calcium;
		this.copper = copper;
		this.irom = irom;
		this.magnesium = magnesium;
		this.manganese = manganese;
		this.phosphorous = phosphorous;
		this.potassium = potassium;
		this.selenium = selenium;
		this.zink = zink;
		this.protein = protein;
		this.alanine = alanine;
		this.arginine = arginine;
		this.aspartic_acid = aspartic_acid;
		this.cystine = cystine;
		this.glutamic_acid = glutamic_acid;
		this.glycine = glycine;
		this.histidine = histidine;
		this.hydroxyproline = hydroxyproline;
		this.isoleucine = isoleucine;
		this.leucine = leucine;
		this.lysine = lysine;
		this.methionine = methionine;
		this.phenylalanine = phenylalanine;
		this.proline = proline;
		this.serine = serine;
		this.threonine = threonine;
		this.tryptophan = tryptophan;
		this.tyrosine = tyrosine;
		this.valine = valine;
		this.carbohydrate = carbohydrate;
		this.fiber = fiber;
		this.sugars = sugars;
		this.fructose = fructose;
		this.galactose = galactose;
		this.glucose = glucose;
		this.lactose = lactose;
		this.maltose = maltose;
		this.sucrose = sucrose;
		this.fat = fat;
		this.saturated_fatty_acids = saturated_fatty_acids;
		this.monounsaturated_fatty_acids = monounsaturated_fatty_acids;
		this.polyunsaturated_fatty_acids = polyunsaturated_fatty_acids;
		this.fatty_acids_total_trans = fatty_acids_total_trans;
		this.alcohol = alcohol;
		this.ash = ash;
		this.caffeine = caffeine;
		this.theobromine = theobromine;
		this.water = water;
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

	public String getServing_size() {
		return serving_size;
	}

	public void setServing_size(String serving_size) {
		this.serving_size = serving_size;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getTotal_fat() {
		return total_fat;
	}

	public void setTotal_fat(String total_fat) {
		this.total_fat = total_fat;
	}

	public String getSaturated() {
		return saturated;
	}

	public void setSaturated(String saturated) {
		this.saturated = saturated;
	}

	public String getCholestrol() {
		return cholestrol;
	}

	public void setCholestrol(String cholestrol) {
		this.cholestrol = cholestrol;
	}

	public String getSodium() {
		return sodium;
	}

	public void setSodium(String sodium) {
		this.sodium = sodium;
	}

	public String getCholine() {
		return choline;
	}

	public void setCholine(String choline) {
		this.choline = choline;
	}

	public String getFolate() {
		return folate;
	}

	public void setFolate(String folate) {
		this.folate = folate;
	}

	public String getFolic_acid() {
		return folic_acid;
	}

	public void setFolic_acid(String folic_acid) {
		this.folic_acid = folic_acid;
	}

	public String getNiacin() {
		return niacin;
	}

	public void setNiacin(String niacin) {
		this.niacin = niacin;
	}

	public String getPantother() {
		return pantother;
	}

	public void setPantother(String pantother) {
		this.pantother = pantother;
	}

	public String getRiboflavin() {
		return riboflavin;
	}

	public void setRiboflavin(String riboflavin) {
		this.riboflavin = riboflavin;
	}

	public String getThiamin() {
		return thiamin;
	}

	public void setThiamin(String thiamin) {
		this.thiamin = thiamin;
	}

	public String getVitamin_a() {
		return vitamin_a;
	}

	public void setVitamin_a(String vitamin_a) {
		this.vitamin_a = vitamin_a;
	}

	public String getVitamin_a_rae() {
		return vitamin_a_rae;
	}

	public void setVitamin_a_rae(String vitamin_a_rae) {
		this.vitamin_a_rae = vitamin_a_rae;
	}

	public String getCarotene_alpha() {
		return carotene_alpha;
	}

	public void setCarotene_alpha(String carotene_alpha) {
		this.carotene_alpha = carotene_alpha;
	}

	public String getCarotene_beta() {
		return carotene_beta;
	}

	public void setCarotene_beta(String carotene_beta) {
		this.carotene_beta = carotene_beta;
	}

	public String getCryptoxanthin_beta() {
		return cryptoxanthin_beta;
	}

	public void setCryptoxanthin_beta(String cryptoxanthin_beta) {
		this.cryptoxanthin_beta = cryptoxanthin_beta;
	}

	public String getLutein_zeaxanthin() {
		return lutein_zeaxanthin;
	}

	public void setLutein_zeaxanthin(String lutein_zeaxanthin) {
		this.lutein_zeaxanthin = lutein_zeaxanthin;
	}

	public String getLucopene() {
		return lucopene;
	}

	public void setLucopene(String lucopene) {
		this.lucopene = lucopene;
	}

	public String getVitamin_b12() {
		return vitamin_b12;
	}

	public void setVitamin_b12(String vitamin_b12) {
		this.vitamin_b12 = vitamin_b12;
	}

	public String getVitamin_b6() {
		return vitamin_b6;
	}

	public void setVitamin_b6(String vitamin_b6) {
		this.vitamin_b6 = vitamin_b6;
	}

	public String getVitamin_c() {
		return vitamin_c;
	}

	public void setVitamin_c(String vitamin_c) {
		this.vitamin_c = vitamin_c;
	}

	public String getVitamin_d() {
		return vitamin_d;
	}

	public void setVitamin_d(String vitamin_d) {
		this.vitamin_d = vitamin_d;
	}

	public String getVitamin_e() {
		return vitamin_e;
	}

	public void setVitamin_e(String vitamin_e) {
		this.vitamin_e = vitamin_e;
	}

	public String getTocopherol_alpha() {
		return tocopherol_alpha;
	}

	public void setTocopherol_alpha(String tocopherol_alpha) {
		this.tocopherol_alpha = tocopherol_alpha;
	}

	public String getVitamin_k() {
		return vitamin_k;
	}

	public void setVitamin_k(String vitamin_k) {
		this.vitamin_k = vitamin_k;
	}

	public String getCalcium() {
		return calcium;
	}

	public void setCalcium(String calcium) {
		this.calcium = calcium;
	}

	public String getCopper() {
		return copper;
	}

	public void setCopper(String copper) {
		this.copper = copper;
	}

	public String getIrom() {
		return irom;
	}

	public void setIrom(String irom) {
		this.irom = irom;
	}

	public String getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(String magnesium) {
		this.magnesium = magnesium;
	}

	public String getManganese() {
		return manganese;
	}

	public void setManganese(String manganese) {
		this.manganese = manganese;
	}

	public String getPhosphorous() {
		return phosphorous;
	}

	public void setPhosphorous(String phosphorous) {
		this.phosphorous = phosphorous;
	}

	public String getPotassium() {
		return potassium;
	}

	public void setPotassium(String potassium) {
		this.potassium = potassium;
	}

	public String getSelenium() {
		return selenium;
	}

	public void setSelenium(String selenium) {
		this.selenium = selenium;
	}

	public String getZink() {
		return zink;
	}

	public void setZink(String zink) {
		this.zink = zink;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public String getAlanine() {
		return alanine;
	}

	public void setAlanine(String alanine) {
		this.alanine = alanine;
	}

	public String getArginine() {
		return arginine;
	}

	public void setArginine(String arginine) {
		this.arginine = arginine;
	}

	public String getAspartic_acid() {
		return aspartic_acid;
	}

	public void setAspartic_acid(String aspartic_acid) {
		this.aspartic_acid = aspartic_acid;
	}

	public String getCystine() {
		return cystine;
	}

	public void setCystine(String cystine) {
		this.cystine = cystine;
	}

	public String getGlutamic_acid() {
		return glutamic_acid;
	}

	public void setGlutamic_acid(String glutamic_acid) {
		this.glutamic_acid = glutamic_acid;
	}

	public String getGlycine() {
		return glycine;
	}

	public void setGlycine(String glycine) {
		this.glycine = glycine;
	}

	public String getHistidine() {
		return histidine;
	}

	public void setHistidine(String histidine) {
		this.histidine = histidine;
	}

	public String getHydroxyproline() {
		return hydroxyproline;
	}

	public void setHydroxyproline(String hydroxyproline) {
		this.hydroxyproline = hydroxyproline;
	}

	public String getIsoleucine() {
		return isoleucine;
	}

	public void setIsoleucine(String isoleucine) {
		this.isoleucine = isoleucine;
	}

	public String getLeucine() {
		return leucine;
	}

	public void setLeucine(String leucine) {
		this.leucine = leucine;
	}

	public String getLysine() {
		return lysine;
	}

	public void setLysine(String lysine) {
		this.lysine = lysine;
	}

	public String getMethionine() {
		return methionine;
	}

	public void setMethionine(String methionine) {
		this.methionine = methionine;
	}

	public String getPhenylalanine() {
		return phenylalanine;
	}

	public void setPhenylalanine(String phenylalanine) {
		this.phenylalanine = phenylalanine;
	}

	public String getProline() {
		return proline;
	}

	public void setProline(String proline) {
		this.proline = proline;
	}

	public String getSerine() {
		return serine;
	}

	public void setSerine(String serine) {
		this.serine = serine;
	}

	public String getThreonine() {
		return threonine;
	}

	public void setThreonine(String threonine) {
		this.threonine = threonine;
	}

	public String getTryptophan() {
		return tryptophan;
	}

	public void setTryptophan(String tryptophan) {
		this.tryptophan = tryptophan;
	}

	public String getTyrosine() {
		return tyrosine;
	}

	public void setTyrosine(String tyrosine) {
		this.tyrosine = tyrosine;
	}

	public String getValine() {
		return valine;
	}

	public void setValine(String valine) {
		this.valine = valine;
	}

	public String getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(String carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public String getFiber() {
		return fiber;
	}

	public void setFiber(String fiber) {
		this.fiber = fiber;
	}

	public String getSugars() {
		return sugars;
	}

	public void setSugars(String sugars) {
		this.sugars = sugars;
	}

	public String getFructose() {
		return fructose;
	}

	public void setFructose(String fructose) {
		this.fructose = fructose;
	}

	public String getGalactose() {
		return galactose;
	}

	public void setGalactose(String galactose) {
		this.galactose = galactose;
	}

	public String getGlucose() {
		return glucose;
	}

	public void setGlucose(String glucose) {
		this.glucose = glucose;
	}

	public Double getLactose() {
		return lactose;
	}

	public void setLactose(Double lactose) {
		this.lactose = lactose;
	}

	public String getMaltose() {
		return maltose;
	}

	public void setMaltose(String maltose) {
		this.maltose = maltose;
	}

	public String getSucrose() {
		return sucrose;
	}

	public void setSucrose(String sucrose) {
		this.sucrose = sucrose;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public String getSaturated_fatty_acids() {
		return saturated_fatty_acids;
	}

	public void setSaturated_fatty_acids(String saturated_fatty_acids) {
		this.saturated_fatty_acids = saturated_fatty_acids;
	}

	public String getMonounsaturated_fatty_acids() {
		return monounsaturated_fatty_acids;
	}

	public void setMonounsaturated_fatty_acids(String monounsaturated_fatty_acids) {
		this.monounsaturated_fatty_acids = monounsaturated_fatty_acids;
	}

	public String getPolyunsaturated_fatty_acids() {
		return polyunsaturated_fatty_acids;
	}

	public void setPolyunsaturated_fatty_acids(String polyunsaturated_fatty_acids) {
		this.polyunsaturated_fatty_acids = polyunsaturated_fatty_acids;
	}

	public String getFatty_acids_total_trans() {
		return fatty_acids_total_trans;
	}

	public void setFatty_acids_total_trans(String fatty_acids_total_trans) {
		this.fatty_acids_total_trans = fatty_acids_total_trans;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public String getAsh() {
		return ash;
	}

	public void setAsh(String ash) {
		this.ash = ash;
	}

	public String getCaffeine() {
		return caffeine;
	}

	public void setCaffeine(String caffeine) {
		this.caffeine = caffeine;
	}

	public String getTheobromine() {
		return theobromine;
	}

	public void setTheobromine(String theobromine) {
		this.theobromine = theobromine;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alanine, alcohol, arginine, ash, aspartic_acid, caffeine, calcium, calories, carbohydrate,
				carotene_alpha, carotene_beta, cholestrol, choline, copper, cryptoxanthin_beta, cystine, fat,
				fatty_acids_total_trans, fiber, folate, folic_acid, fructose, galactose, glucose, glutamic_acid,
				glycine, histidine, hydroxyproline, id, irom, isoleucine, lactose, leucine, lucopene, lutein_zeaxanthin,
				lysine, magnesium, maltose, manganese, methionine, monounsaturated_fatty_acids, name, niacin, pantother,
				phenylalanine, phosphorous, polyunsaturated_fatty_acids, potassium, proline, protein, riboflavin,
				saturated, saturated_fatty_acids, selenium, serine, serving_size, sodium, sucrose, sugars, theobromine,
				thiamin, threonine, tocopherol_alpha, total_fat, tryptophan, tyrosine, valine, vitamin_a, vitamin_a_rae,
				vitamin_b12, vitamin_b6, vitamin_c, vitamin_d, vitamin_e, vitamin_k, water, zink);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NutritionFood other = (NutritionFood) obj;
		return Objects.equals(alanine, other.alanine) && Objects.equals(alcohol, other.alcohol)
				&& Objects.equals(arginine, other.arginine) && Objects.equals(ash, other.ash)
				&& Objects.equals(aspartic_acid, other.aspartic_acid) && Objects.equals(caffeine, other.caffeine)
				&& Objects.equals(calcium, other.calcium) && Objects.equals(calories, other.calories)
				&& Objects.equals(carbohydrate, other.carbohydrate)
				&& Objects.equals(carotene_alpha, other.carotene_alpha)
				&& Objects.equals(carotene_beta, other.carotene_beta) && Objects.equals(cholestrol, other.cholestrol)
				&& Objects.equals(choline, other.choline) && Objects.equals(copper, other.copper)
				&& Objects.equals(cryptoxanthin_beta, other.cryptoxanthin_beta)
				&& Objects.equals(cystine, other.cystine) && Objects.equals(fat, other.fat)
				&& Objects.equals(fatty_acids_total_trans, other.fatty_acids_total_trans)
				&& Objects.equals(fiber, other.fiber) && Objects.equals(folate, other.folate)
				&& Objects.equals(folic_acid, other.folic_acid) && Objects.equals(fructose, other.fructose)
				&& Objects.equals(galactose, other.galactose) && Objects.equals(glucose, other.glucose)
				&& Objects.equals(glutamic_acid, other.glutamic_acid) && Objects.equals(glycine, other.glycine)
				&& Objects.equals(histidine, other.histidine) && Objects.equals(hydroxyproline, other.hydroxyproline)
				&& Objects.equals(id, other.id) && Objects.equals(irom, other.irom)
				&& Objects.equals(isoleucine, other.isoleucine) && Objects.equals(lactose, other.lactose)
				&& Objects.equals(leucine, other.leucine) && Objects.equals(lucopene, other.lucopene)
				&& Objects.equals(lutein_zeaxanthin, other.lutein_zeaxanthin) && Objects.equals(lysine, other.lysine)
				&& Objects.equals(magnesium, other.magnesium) && Objects.equals(maltose, other.maltose)
				&& Objects.equals(manganese, other.manganese) && Objects.equals(methionine, other.methionine)
				&& Objects.equals(monounsaturated_fatty_acids, other.monounsaturated_fatty_acids)
				&& Objects.equals(name, other.name) && Objects.equals(niacin, other.niacin)
				&& Objects.equals(pantother, other.pantother) && Objects.equals(phenylalanine, other.phenylalanine)
				&& Objects.equals(phosphorous, other.phosphorous)
				&& Objects.equals(polyunsaturated_fatty_acids, other.polyunsaturated_fatty_acids)
				&& Objects.equals(potassium, other.potassium) && Objects.equals(proline, other.proline)
				&& Objects.equals(protein, other.protein) && Objects.equals(riboflavin, other.riboflavin)
				&& Objects.equals(saturated, other.saturated)
				&& Objects.equals(saturated_fatty_acids, other.saturated_fatty_acids)
				&& Objects.equals(selenium, other.selenium) && Objects.equals(serine, other.serine)
				&& Objects.equals(serving_size, other.serving_size) && Objects.equals(sodium, other.sodium)
				&& Objects.equals(sucrose, other.sucrose) && Objects.equals(sugars, other.sugars)
				&& Objects.equals(theobromine, other.theobromine) && Objects.equals(thiamin, other.thiamin)
				&& Objects.equals(threonine, other.threonine)
				&& Objects.equals(tocopherol_alpha, other.tocopherol_alpha)
				&& Objects.equals(total_fat, other.total_fat) && Objects.equals(tryptophan, other.tryptophan)
				&& Objects.equals(tyrosine, other.tyrosine) && Objects.equals(valine, other.valine)
				&& Objects.equals(vitamin_a, other.vitamin_a) && Objects.equals(vitamin_a_rae, other.vitamin_a_rae)
				&& Objects.equals(vitamin_b12, other.vitamin_b12) && Objects.equals(vitamin_b6, other.vitamin_b6)
				&& Objects.equals(vitamin_c, other.vitamin_c) && Objects.equals(vitamin_d, other.vitamin_d)
				&& Objects.equals(vitamin_e, other.vitamin_e) && Objects.equals(vitamin_k, other.vitamin_k)
				&& Objects.equals(water, other.water) && Objects.equals(zink, other.zink);
	}

	@Override
	public String toString() {
		return "Foods [id=" + id + ", name=" + name + ", serving_size=" + serving_size + ", calories=" + calories
				+ ", total_fat=" + total_fat + ", saturated=" + saturated + ", cholestrol=" + cholestrol + ", sodium="
				+ sodium + ", choline=" + choline + ", folate=" + folate + ", folic_acid=" + folic_acid + ", niacin="
				+ niacin + ", pantother=" + pantother + ", riboflavin=" + riboflavin + ", thiamin=" + thiamin
				+ ", vitamin_a=" + vitamin_a + ", vitamin_a_rae=" + vitamin_a_rae + ", carotene_alpha=" + carotene_alpha
				+ ", carotene_beta=" + carotene_beta + ", cryptoxanthin_beta=" + cryptoxanthin_beta
				+ ", lutein_zeaxanthin=" + lutein_zeaxanthin + ", lucopene=" + lucopene + ", vitamin_b12=" + vitamin_b12
				+ ", vitamin_b6=" + vitamin_b6 + ", vitamin_c=" + vitamin_c + ", vitamin_d=" + vitamin_d
				+ ", vitamin_e=" + vitamin_e + ", tocopherol_alpha=" + tocopherol_alpha + ", vitamin_k=" + vitamin_k
				+ ", calcium=" + calcium + ", copper=" + copper + ", irom=" + irom + ", magnesium=" + magnesium
				+ ", manganese=" + manganese + ", phosphorous=" + phosphorous + ", potassium=" + potassium
				+ ", selenium=" + selenium + ", zink=" + zink + ", protein=" + protein + ", alanine=" + alanine
				+ ", arginine=" + arginine + ", aspartic_acid=" + aspartic_acid + ", cystine=" + cystine
				+ ", glutamic_acid=" + glutamic_acid + ", glycine=" + glycine + ", histidine=" + histidine
				+ ", hydroxyproline=" + hydroxyproline + ", isoleucine=" + isoleucine + ", leucine=" + leucine
				+ ", lysine=" + lysine + ", methionine=" + methionine + ", phenylalanine=" + phenylalanine
				+ ", proline=" + proline + ", serine=" + serine + ", threonine=" + threonine + ", tryptophan="
				+ tryptophan + ", tyrosine=" + tyrosine + ", valine=" + valine + ", carbohydrate=" + carbohydrate
				+ ", fiber=" + fiber + ", sugars=" + sugars + ", fructose=" + fructose + ", galactose=" + galactose
				+ ", glucose=" + glucose + ", lactose=" + lactose + ", maltose=" + maltose + ", sucrose=" + sucrose
				+ ", fat=" + fat + ", saturated_fatty_acids=" + saturated_fatty_acids + ", monounsaturated_fatty_acids="
				+ monounsaturated_fatty_acids + ", polyunsaturated_fatty_acids=" + polyunsaturated_fatty_acids
				+ ", fatty_acids_total_trans=" + fatty_acids_total_trans + ", alcohol=" + alcohol + ", ash=" + ash
				+ ", caffeine=" + caffeine + ", theobromine=" + theobromine + ", water=" + water + "]";
	}

}
