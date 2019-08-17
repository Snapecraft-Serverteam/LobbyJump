package net.snapecraft.lobbyjump.util;

import net.snapecraft.lobbyjump.Lobbyjump;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GameUtil {

    public static void hasEnoughSpace(Player p) {
        Location loc = p.getLocation();

        Lobbyjump.getInstance().relConf();
        int height = Lobbyjump.getInstance().getConfig().getInt("height");

        Location newloc = loc;
        newloc.setY(newloc.getBlockY() + height);




    }


    public static boolean hasEnoughSpaceAround(Location location) {
        Block loc = location.getBlock();

        Block   l1 = loc, l2 = loc.getRelative(BlockFace.NORTH), l3 = loc,
                l4 = loc.getRelative(BlockFace.WEST), l5 = loc, l6 = loc.getRelative(BlockFace.EAST),
                l7 = loc, l8 = loc.getRelative(BlockFace.SOUTH), l9 = loc;

        l1 = l2.getRelative(BlockFace.WEST);
        l3 = l2.getRelative(BlockFace.EAST);
        l7 = l8.getRelative(BlockFace.WEST);
        l9 = l8.getRelative(BlockFace.EAST);


        List<Block> blocks = new ArrayList<>();
        blocks.add(l1);
        blocks.add(l2);
        blocks.add(l3);
        blocks.add(l4);
        blocks.add(l5);
        blocks.add(l6);
        blocks.add(l7);
        blocks.add(l8);
        blocks.add(l9);


        for(Block b : blocks) {
            if(!b.getType().equals(Material.AIR)) {
                return false;
            }
        }
        return true;
    }

}
