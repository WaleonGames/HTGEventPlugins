package pl.htg.htgeventplugins.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import pl.htg.htgeventplugins.Adds;
import pl.htg.htgeventplugins.Main;

public class EventCommands implements CommandExecutor {

    private final Main plugin;

    private final Adds adds;
    private final FileConfiguration messages;
    private final FileConfiguration config;

    public EventCommands(Main plugin) {
        this.adds = plugin.adds;
        this.plugin = plugin;
        this.messages = plugin.getConfig();
        this.config = plugin.getConfig();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        {
            Player player = (Player) sender;
        }
        return false;
    }
}
