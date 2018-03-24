package net.blay09.mods.prettybeaches;

import net.minecraft.block.Block;
import net.minecraftforge.common.config.Config;

import java.util.ArrayList;
import java.util.List;

@Config(modid = PrettyBeaches.MOD_ID)
public class PrettyBeachesConfig {

    @Config.Name("Affected Blocks")
    @Config.Comment("List of blocks that should be affected by the adjusted water physics.")
    public static String[] affectedBlocks = {"minecraft:sand"};

    private static List<Block> affectedBlocksList;

    public static void onConfigReload() {
        affectedBlocksList = new ArrayList<>();
        for (String block : affectedBlocks) {
            affectedBlocksList.add(Block.getBlockFromName(block));
        }
    }

    public static boolean isBlockAffected(Block block) {
        return affectedBlocksList.contains(block);
    }

}