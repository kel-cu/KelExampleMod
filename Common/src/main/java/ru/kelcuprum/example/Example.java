package ru.kelcuprum.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.kelcuprum.alinlib.config.Config;

public class Example {
    public static final Logger LOG = LogManager.getLogger("Ruthenium");
    public static Config config = new Config("config/example.json");
    public static void onInitializeClient() {
        log("I'm started work UwU");
    }
    public static void log(String message){ log(message, Level.INFO); }
    public static void log(String message, Level level){
        LOG.log(level, "[Ruthenium] "+message);
    }
}