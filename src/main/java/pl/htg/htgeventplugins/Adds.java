package pl.htg.htgeventplugins;

import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Adds extends JavaPlugin {

    private final Main plugin;
    private final Adds adds;
    private FileConfiguration config; // Przechowuje plik konfiguracyjny

    // Konstruktor
    public Adds(Main plugin) {
        this.plugin = plugin;
        this.adds = plugin.adds;
        this.config = config;
    }

    public void start_message() {
        // Odczytaj sekcję "customMessages" z konfiguracji
        ConfigurationSection customMessagesSection = config.getConfigurationSection("message.start");

        if (customMessagesSection != null) {
            StringBuilder message = new StringBuilder();

            // Przejdź przez każdą linię w sekcji "customMessages" i dodaj do wiadomości
            for (String key : customMessagesSection.getKeys(false)) {
                String line = customMessagesSection.getString(key);
                message.append(line).append(" ");
            }

            // Wyślij dostosowaną wiadomość do gracza
            Bukkit.broadcastMessage(message.toString().trim());
        }
    }

    public void give_message() {
        // Odczytaj sekcję "customMessages" z konfiguracji
        ConfigurationSection customMessagesSection = config.getConfigurationSection("message.give");

        if (customMessagesSection != null) {
            StringBuilder message = new StringBuilder();

            // Przejdź przez każdą linię w sekcji "customMessages" i dodaj do wiadomości
            for (String key : customMessagesSection.getKeys(false)) {
                String line = customMessagesSection.getString(key);
                message.append(line).append(" ");
            }

            // Wyślij dostosowaną wiadomość do gracza
            Bukkit.broadcastMessage(message.toString().trim());
        }
    }

    public void stop_message() {
        // Odczytaj sekcję "customMessages" z konfiguracji
        ConfigurationSection customMessagesSection = config.getConfigurationSection("message.stop");

        if (customMessagesSection != null) {
            StringBuilder message = new StringBuilder();

            // Przejdź przez każdą linię w sekcji "customMessages" i dodaj do wiadomości
            for (String key : customMessagesSection.getKeys(false)) {
                String line = customMessagesSection.getString(key);
                message.append(line).append(" ");
            }

            // Wyślij dostosowaną wiadomość do gracza
            Bukkit.broadcastMessage(message.toString().trim());
        }
    }
}
