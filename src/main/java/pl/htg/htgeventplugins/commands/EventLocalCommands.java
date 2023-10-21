package pl.htg.htgeventplugins.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import pl.htg.htgeventplugins.Adds;
import pl.htg.htgeventplugins.Main;

public class EventLocalCommands implements CommandExecutor {
    private final Main plugin;

    private final Adds adds;
    private final FileConfiguration messages;
    private final FileConfiguration config;

    public EventLocalCommands(Main plugin) {
        this.adds = plugin.adds;
        this.plugin = plugin;
        this.messages = plugin.getConfig();
        this.config = plugin.getConfig();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        {
            Player player = (Player) sender;
            if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
                // Obsługa komendy /event help
                sender.sendMessage(" ");
                sender.sendMessage("§5Event Help");
                sender.sendMessage("§7/event_local start - §fStarts an Event for something");
                sender.sendMessage("§7/event_local giveaway - §fGive items/keys/ranks to players");
                sender.sendMessage("§7/event_local stop - §fStops the Event, and you can return to the event later");
                sender.sendMessage(" ");
            } else if (args.length == 1 && args[0].equalsIgnoreCase("start")) {
                // Obsługa komendy /event start
                adds.start_message();
            } else if (args.length == 1 && args[0].equalsIgnoreCase("give")) {
                // Obsługa komendy /event rozdaj
                adds.give_message();
            } else if (args.length == 1 && args[0].equalsIgnoreCase("stop")) {
                // Obsługa komendy /event stop
                adds.stop_message();
            } else {
                sender.sendMessage("§cInvalid command. Use /event help for assistance.");
            }
        }
        return false;
    }
}
