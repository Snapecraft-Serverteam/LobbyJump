package net.snapecraft.lobbyjump;

import net.snapecraft.lobbyjump.commands.JumpCommand;
import net.snapecraft.lobbyjump.util.Game;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public final class Lobbyjump extends JavaPlugin {

    public Map<Player, Game> runningGames = new HashMap<>();

    @Override
    public void onEnable() {
        getCommand("jump").setExecutor(new JumpCommand());
        initConfig();
    }

    private void initConfig() {
        getConfig().addDefault("height", 8);

        getConfig().options().copyDefaults(true);
        saveConfig();
        reloadConfig();
    }

    public void relConf() {
        saveConfig();
        reloadConfig();
    }

    @Override
    public void onDisable() {
        // TODO: STOP ALL GAMES
    }

    public static Lobbyjump getInstance() {
        return getInstance();
    }
    public Map<Player, Game> getRunningGames() {
        return runningGames;
    }
}
