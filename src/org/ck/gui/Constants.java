package org.ck.gui;

public interface Constants
{
//	public static final String TRAINING_SAMPLES_FILE_NAME = "Training Data/Horse/horse.train";
//	public static final String TESTING_SAMPLES_FILE_NAME = "Training Data/Horse/horse.test";
//	public static final String ATTRIBUTES_FILE_NAME = "Training Data/Horse/horse.attribute";
	
	enum Category
	{
		VERY_LOW,
		LOW,
		MEDIUM,
		HIGH,
		VERY_HIGH
	}
	
	enum DiscretizerAlgorithms
	{
		MEDIAN,
		EQUAL_BINNING
	}
	
	enum DatasetOptions
	{
		HORSE_DATASET,
		WATER_DATASET,
		WINE_DATASET
	}
	enum Filenames
	{
		TRAINING_SAMPLES_FILE,
		FEATURES_FILE
	}
	
	public static final int NUMBER_OF_BINS = 6;
	
	public static final int POPULATION_SIZE = 35;
	public static final int NUM_OF_GENERATIONS = 8;
	public static final double FITNESS_SCORE_THRESHOLD = 0.88;
	public static final double CROSSOVER_PROBABILITY_THRESHOLD = 0.850;
	public static final double MUTATION_PROBABILITY_THRESHOLD = 0.025;
	
	public static final double TRAINING_SET_WEIGHT = 0.750;
	public static final double TEST_SET_WEIGHT = 0.50;
	

}
