package models;

import java.awt.Color;

public class Constants {
    // Arena Settings
    public static final int ARENA_WIDTH = 15;
    public static final int ARENA_HEIGHT = 20;
    public static final int ZONE_SIZE = 3;
    public static final int ARENA_DIVIDER_LINE_THICKNESS = 4;
    public static final int GRID_SIZE = 25;
    public static final int GOAL_ZONE_ROW = 1;
    public static final int GOAL_ZONE_COL = 13;
    public static final int START_ZONE_ROW = 18;
    public static final int START_ZONE_COL = 1;

    public static final int DEFAULT_START_ROW = 18;
    public static final int DEFAULT_START_COL = 1;
    public static final int DEFAULT_WAY_POINT_ROW = 1;
    public static final int DEFAULT_WAY_POINT_COL = 13;

    public static final Orientation DEFAULT_START_ORIENTATION = Orientation.E;

    public static final int MOVE_COST = 1;
    public static final int TURN_COST = 1;
    public static final int INFINITY = 999;

    public static final int DEFAULT_COVERAGE_LIMIT = 100;
    public static final int DEFAULT_TIME_LIMIT = 120;

    // Color
    public static final Color ARENA_LABEL_COLOR = Color.darkGray;
    public static final Color EXPLORED_COLOR = Color.white;
    public static final Color UNEXPLORED_COLOR = Color.black;
    public static final Color OBSTACLE_COLOR = Color.RED;
    public static final Color ROBOT_COLOR = Color.black;
    public static final Color ARENA_DIVIDER_LINE_COLOR = Color.BLUE;
    public static final Color ARENA_GRID_LINE_COLOR = Color.darkGray;
    public static final Color GOAL_ZONE_COLOR = Color.MAGENTA;
    public static final Color START_ZONE_COLOR = new Color (50, 226, 36);
    public static final Color ORIENTATION_MARKER_COLOR = Color.WHITE;
    public static final Color SENSOR_RANGE_COLOR = new Color(212, 255, 46, 100);
    public static final Color PATH_TAKEN_COLOR = new Color(80, 65, 255, 132);
    public static final Color OBSTACLE_FACE_CAPTURED_COLOR = Color.GREEN;

    public static final String ARENA_DESCRIPTOR_PATH = System.getProperty("user.dir") + "/local_storage/mock_arena.txt";
    public static final String LOG_PATH = System.getProperty("user.dir") + "/local_storage/log.txt";
    public static final String LOG_FOR_CALIBRATION_PATH = System.getProperty("user.dir") + "/local_storage/log.txt";

    public static final String[] orientationList = new String[]{"North", "East", "South", "West"};

    public static final String CALIBRATE_RIGHT_INSTRUCTION_TO_ARDUINO = "arC";
    public static final String CALIBRATE_FRONT_INSTRUCTION_TO_ARDUINO = "arc";
    public static final String ULTRA_INSTINCT_INSTRUCTION_TO_ARDUINO = "ar2";
    public static final String FORWARD_INSTRUCTION_TO_ARDUINO = "arW";
    public static final String REVERSE_INSTRUCTION_TO_ARDUINO = "arr";
    public static final String TURN_LEFT_INSTRUCTION_TO_ARDUINO = "arA";
    public static final String TURN_RIGHT_INSTRUCTION_TO_ARDUINO = "arD";
    public static final String EXPLORATION_DONE_TO_ARDUINO = "arf";

	public static final String EXPLORE_DONE = "F";
	public static final String SEPARATOR = "|";
	public static final String READ_SENSOR_VALUES = "E";
	public static final String DONE = "Y";
	public static final String START_EXPLORATION = "explore";
	public static final String START_FASTEST = "fastest";
	public static final String CALIBRATE = "C";
	public static final String SENSOR_READING_PATTERN = "\\d{6}";
	public static final String CALIBRATE_PATTERN = ":1:[0-9]:1:[0-9]:[0-9][|]";

	public static final String RPI_IDENTIFIER = "rpi";
    public static final String ARD_IDENTIFIER = "ar";
    public static final String ANDROID_IDENTIFIER = "ar";
    public static final String END_DELIMITER = ";";


    public static final double[] FRONT_L_SENSOR_THRESHOLD = {15.5, 23.4};
    public static final double[] FRONT_M_SENSOR_THRESHOLD = {15.5, 23.4};
    public static final double[] FRONT_R_SENSOR_THRESHOLD = {15.5, 23.4};
    public static final double[] RIGHT_F_SENSOR_THRESHOLD = {14.0, 23.5};
    public static final double[] RIGHT_B_SENSOR_THRESHOLD = {14.0, 22.0};
    public static final double[] LEFT_SENSOR_THRESHOLD = {20.5, 26.9, 38, 48, 58};

	public static final int TIMES_NOT_CALIBRATED_R_THRESHOLD = 7;
    public static final int TIMES_NOT_CALIBRATED_F_THRESHOLD = 7;

    public static final int NUMBER_OF_IMAGE_NEEDED = 5;

    public enum Orientation {
        N,
        E,
        S,
        W,
    }

    public enum ExplorationType {
        NORMAL,
        NEW,
        TIME_LIMITED,
        COVERAGE_LIMITED,
    }

    // this position is relative to the orientation of the robot
    public enum Sensor_Position {
        FRONT,
        RIGHT,
        LEFT,
    }
}