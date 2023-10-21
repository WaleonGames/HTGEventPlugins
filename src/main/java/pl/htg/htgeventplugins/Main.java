package pl.htg.htgeventplugins;

import org.bukkit.plugin.java.JavaPlugin;
import pl.htg.htgeventplugins.commands.EventCommands;
import pl.htg.htgeventplugins.commands.EventLocalCommands;

public class Main extends JavaPlugin {

    public Adds adds;

    @Override
    public void onEnable() {
        super.onEnable();
        // Config
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        // Commands
        getCommand("event").setExecutor(new EventCommands(this));
        getCommand("event_local").setExecutor(new EventLocalCommands(this));

        // Console
        System.out.println("                                          ");
        System.out.println("  |    |   -------   |----    Authors WaleonGames");
        System.out.println("  |    |      |      |        Version " + getConfig().getString("version"));
        System.out.println("  |----|      |      |----|   IP Server 158.174.87.180");
        System.out.println("  |    |      |      |    |   Support: LuckPerms and");
        System.out.println("  |    |      |      |____|      PlaceholderAPI");
        System.out.println("                                          ");

        // Plugins
    }

    @Override
    public void onDisable() {
        // Console
        System.out.println("                                          ");
        System.out.println("  |    |   -------   |----    Authors WaleonGames");
        System.out.println("  |    |      |      |        Version " + getConfig().getString("version"));
        System.out.println("  |----|      |      |----|   IP Server 158.174.87.180");
        System.out.println("  |    |      |      |    |   Support: LuckPerms and");
        System.out.println("  |    |      |      |____|   Lang: EN, PL, and Cunfig.yml Edit Message");
        System.out.println(" ");
    }
}
