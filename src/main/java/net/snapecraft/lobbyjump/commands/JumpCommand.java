package net.snapecraft.lobbyjump.commands;

import net.snapecraft.lobbyjump.util.Game;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JumpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        Game g = new Game();
        if(!g.start(p)) {
            g = null;
            return true;
        }


        return true;
    }
}
