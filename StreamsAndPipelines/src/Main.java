import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<NutritionFood> foodType = read(
				"C:/Users/Larry/Desktop/Spring 2022/Swer348 (Advanced object oriented programming)/Course work/Assignment 2/foods_nutrition.csv");

		// total calories
		long starttime = System.currentTimeMillis();
		int sum = foodType.stream().mapToInt(w -> w.getCalories()).sum();
		System.out.println("Total amount of calories in streams:" + sum);
		long endtime = System.currentTimeMillis();
		long elapsedtime = endtime - starttime;
		System.out.println("elapsed time for sum of calories using streams" + " " + elapsedtime + "\n");
		System.out.println();

		// fat < 0.5
		long starttime2 = System.currentTimeMillis();
		List<String> fat = foodType.stream().filter(p -> p.getFat() < 0.5).map(x -> x.getName())
				.collect(Collectors.toList());
		System.out.println(fat);
		long endtime2 = System.currentTimeMillis();
		long elapsedtime2 = endtime2 - starttime2;
		System.out.println("elapsed time for fats less than 0.5 using streams" + " " + elapsedtime2 + "\n");

		// highest amount of protein
		long starttime3 = System.currentTimeMillis();
		NutritionFood highestProtein = foodType.stream().max(Comparator.comparing(NutritionFood::getProtein))
				.orElseThrow(NoSuchElementException::new);

		System.out.println("Highest protein in streams = " + highestProtein + "\n");
		long endtime3 = System.currentTimeMillis();
		long elapsedtime3 = endtime3 - starttime3;
		System.out.println("elapsed time for highest protein using streams" + " " + elapsedtime3);

		// vegetarian foods
		long starttime4 = System.currentTimeMillis();
		List<String> vag = foodType.stream().filter(p -> p.getLactose().equals(0) || p.getLactose().equals(0.0))
				.map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(vag);
		long endtime4 = System.currentTimeMillis();
		long elapsedtime4 = endtime4 - starttime4;
		System.out.println("elapsed time for vegetarian food using streams is" + " " + elapsedtime4 + "\n");

		/////////////////// procedural programming//////////////////////////////
		System.out.println("\n\n\n\n\n\n\n\n\n");

		// total calories
		long starttime5 = System.currentTimeMillis();
		Double TCalories = calculatingTotalCalories(foodType);
		System.out.println("Total calories in procedural = " + TCalories);
		long endtime5 = System.currentTimeMillis();
		long elapsedtime5 = endtime5 - starttime5;
		System.out.println("elapsed time for total calories in procedural programming is " + elapsedtime5 + "\n");

		// fat < 0.5
		long starttime6 = System.currentTimeMillis();
		List<String> fatsN = CalculatingLowFat(foodType);
		System.out.println(fatsN);
		long endtime6 = System.currentTimeMillis();
		long elapsedtime6 = endtime6 - starttime6;
		System.out.println("elapsed time for fat less than 0.5 in procedural programming is " + elapsedtime6 + "\n");

		// highest amount of protein
		long starttime7 = System.currentTimeMillis();
		Double highestP = highestProtein(foodType);
		System.out.println("Highest protien in procedural =" + highestP + "\n");
		long endtime7 = System.currentTimeMillis();
		long elapsedtime7 = endtime7 - starttime7;
		System.out.println(
				"elapsed time for highest amount of protein in procedural programming is " + elapsedtime7 + "\n");

		// vegetarian foods
		long starttime8 = System.currentTimeMillis();
		Double vegValue = highestProtein(foodType);
		System.out.println("Vegetarian food types in procedural =" + vegValue);
		long endtime8 = System.currentTimeMillis();
		long elapsedtime8 = endtime8 - starttime8;
		System.out.println(
				"elapsed time for highest amount of protein in procedural programming is " + elapsedtime8 + "\n");
	}

	private static Double calculatingTotalCalories(List<NutritionFood> foods) {

		double sum = 0.0;

		for (int i = 0; i < foods.size(); i++) {
			sum += foods.get(i).getCalories();
		}

		return sum;
	}

	private static List<String> CalculatingLowFat(List<NutritionFood> foods) {

		List<String> fats = new ArrayList<String>();

		for (int i = 0; i < foods.size(); i++) {
			if (foods.get(i).getFat() < 0.5) {

				fats.add(foods.get(i).getName());
			}
		}

		return fats;
	}

	private static Double highestProtein(List<NutritionFood> foods) {
		double max = foods.get(0).getProtein();

		for (int i = 0; i < foods.size(); i++) {
			if (foods.get(i).getProtein() > max) {
				max = foods.get(i).getProtein();

			}
		}
		return max;
	}

	private static List<String> filterVegetarianFood(List<NutritionFood> foods) {

		List<String> fats = new ArrayList<String>();

		for (int i = 0; i < foods.size(); i++) {
			if (foods.get(i).getLactose() == 0 || foods.get(i).getLactose() == 0.0) {

				fats.add(foods.get(i).getName());
			}
		}

		return fats;
	}

	////////////////////////////////////////Methods/////////////////////////////
	private static List<NutritionFood> read(String p) {

		List<NutritionFood> foods = new ArrayList<>();
		Path path = Paths.get(p);

		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.US_ASCII)) {

			String line = br.readLine();

			while (line != null) {

				String[] attributes = line.split(",");
				NutritionFood food = createFood(attributes);

				foods.add(food);

				line = br.readLine();

			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return foods;
	}

	public static NutritionFood createFood(String[] metadata) {

		String id = metadata[0];
		String name = metadata[1];
		String serving_size = metadata[2];
		int calories = Integer.valueOf(metadata[3]);
		String total_fat = metadata[4];
		String saturated = metadata[5];
		String cholestrol = metadata[6];
		String sodium = metadata[7];
		String choline = metadata[8];
		String folate = metadata[9];
		String folic_acid = metadata[10];
		String niacin = metadata[11];
		String pantother = metadata[12];
		String riboflavin = metadata[13];
		String thiamin = metadata[14];
		String vitamin_a = metadata[15];
		String vitamin_a_rae = metadata[16];
		String carotene_alpha = metadata[17];
		String carotene_beta = metadata[18];
		String cryptoxanthin_beta = metadata[19];
		String lutein_zeaxanthin = metadata[20];
		String lucopene = metadata[21];
		String vitamin_b12 = metadata[22];
		String vitamin_b6 = metadata[23];
		String vitamin_c = metadata[24];
		String vitamin_d = metadata[25];
		String vitamin_e = metadata[26];
		String tocopherol_alpha = metadata[27];
		String vitamin_k = metadata[28];
		String calcium = metadata[29];
		String copper = metadata[30];
		String irom = metadata[31];
		String magnesium = metadata[32];
		String manganese = metadata[33];
		String phosphorous = metadata[34];
		String potassium = metadata[35];
		String selenium = metadata[36];
		String zink = metadata[37];
		String protein = metadata[38];
		protein = protein.replace("g", " ").trim();
		Double proteinParsed = Double.valueOf(protein);
		String alanine = metadata[39];
		String arginine = metadata[40];
		String aspartic_acid = metadata[41];
		String cystine = metadata[42];
		String glutamic_acid = metadata[43];
		String glycine = metadata[44];
		String histidine = metadata[45];
		String hydroxyproline = metadata[46];
		String isoleucine = metadata[47];
		String leucine = metadata[48];
		String lysine = metadata[49];
		String methionine = metadata[50];
		String phenylalanine = metadata[51];
		String proline = metadata[52];
		String serine = metadata[53];
		String threonine = metadata[54];
		String tryptophan = metadata[55];
		String tyrosine = metadata[56];
		String valine = metadata[57];
		String carbohydrate = metadata[58];
		String fiber = metadata[59];
		String sugars = metadata[60];
		String fructose = metadata[61];
		String galactose = metadata[62];
		String glucose = metadata[63];
		String lactose = metadata[64];
		lactose = lactose.replace("g", " ").trim();
		Double lactoseParsed = Double.valueOf(lactose);
		String maltose = metadata[65];
		String sucrose = metadata[66];
		String fat = metadata[67];
		fat = fat.replace("g", " ").trim();
		Double fatParsed = Double.valueOf(fat);
		String saturated_fatty_acids = metadata[68];
		String monounsaturated_fatty_acids = metadata[69];
		String polyunsaturated_fatty_acids = metadata[70];
		String fatty_acids_total_trans = metadata[71];
		String alcohol = metadata[72];
		String ash = metadata[73];
		String caffeine = metadata[74];
		String theobromine = metadata[75];
		String water = metadata[76];

		return new NutritionFood(id, name, serving_size, calories, total_fat, saturated, cholestrol, sodium, choline,
				folate, folic_acid, niacin, pantother, riboflavin, thiamin, vitamin_a, vitamin_a_rae, carotene_alpha,
				carotene_beta, cryptoxanthin_beta, lutein_zeaxanthin, lucopene, vitamin_b12, vitamin_b6, vitamin_c,
				vitamin_d, vitamin_e, tocopherol_alpha, vitamin_k, calcium, copper, irom, magnesium, manganese,
				phosphorous, potassium, selenium, zink, proteinParsed, alanine, arginine, aspartic_acid, cystine,
				glutamic_acid, glycine, histidine, hydroxyproline, isoleucine, leucine, lysine, methionine,
				phenylalanine, proline, serine, threonine, tryptophan, tyrosine, valine, carbohydrate, fiber, sugars,
				fructose, galactose, glucose, lactoseParsed, maltose, sucrose, fatParsed, saturated_fatty_acids,
				monounsaturated_fatty_acids, polyunsaturated_fatty_acids, fatty_acids_total_trans, alcohol, ash,
				caffeine, theobromine, water);
	}

}
