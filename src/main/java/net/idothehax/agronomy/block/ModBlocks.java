package net.idothehax.agronomy.block;

import net.idothehax.agronomy.Agronomy;
import net.idothehax.agronomy.block.crop.PotatoCropBlock;
import net.idothehax.agronomy.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.shape.VoxelShape;

public class ModBlocks {
    public static final Block SWIFT_POTATOES;
    public static final Block PENTLAND_JAVELIN_POTATOES;
    public static final Block ROCKET_POTATOES;
    public static final Block CASABLANCA_POTATOES;
    public static final Block ARRAN_PILOT_POTATOES;
    public static final Block DUKE_OF_YORK_POTATOES;
    public static final Block RED_DUKE_OF_YORK_POTATOES;
    public static final Block EPICURE_POTATOES;
    public static final Block FOREMOST_POTATOES;
    public static final Block HOME_GUARD_POTATOES;
    public static final Block LADY_CHRISTL_POTATOES;
    public static final Block ORLA_POTATOES;
    public static final Block PREMIERE_POTATOES;
    public static final Block PURITAN_POTATOES;
    public static final Block ULSTER_PRINCE_POTATOES;
    public static final Block JERSEY_ROYAL_POTATOES;
    public static final Block MARFONA_POTATOES;
    public static final Block MARIS_PEER_POTATOES;
    public static final Block CHARLOTTE_POTATOES;
    public static final Block NICOLA_POTATOES;
    public static final Block ANYA_POTATOES;
    public static final Block BONNIE_POTATOES;
    public static final Block BRITISH_QUEEN_POTATOES;
    public static final Block CATRIONA_POTATOES;
    public static final Block DUNLUCE_POTATOES;
    public static final Block ESTIMA_POTATOES;
    public static final Block KESTREL_POTATOES;
    public static final Block NADINE_POTATOES;
    public static final Block RATTE_POTATOES;
    public static final Block WILJA_POTATOES;
    public static final Block KING_EDWARD_POTATOES;
    public static final Block MARIS_PIPER_POTATOES;
    public static final Block PICASSO_POTATOES;
    public static final Block DESIREE_POTATOES;
    public static final Block PINK_FIR_APPLE_POTATOES;
    public static final Block SARPO_MIRA_POTATOES;
    public static final Block CARA_POTATOES;
    public static final Block MAJESTIC_POTATOES;
    public static final Block RECORD_POTATOES;
    public static final Block ROMANO_POTATOES;
    public static final Block ROOSTER_POTATOES;
    public static final Block SANTE_POTATOES;
    public static final Block SAXON_POTATOES;
    public static final Block VALOR_POTATOES;
    public static final Block ELBA_POTATOES;
    public static final Block KENNEBEC_POTATOES;
    public static final Block RED_GOLD_POTATOES;
    public static final Block MASQUERADE_POTATOES;
    public static final Block PURPLE_MAJESTY_POTATOES;
    public static final Block RUSSIAN_BANANA_FINGERLING_POTATOES;
    public static final Block RED_NORLAND_POTATOES;
    public static final Block KIFLI_POTATOES;
    public static final Block LADY_BALFOUR_POTATOES;
    public static final Block VIVALDI_POTATOES;
    public static final Block ACCORD_POTATOES;
    public static final Block CONGO_POTATOES;
    public static final Block MAYAN_GOLD_POTATOES;

    static {
        // First Earlies
        SWIFT_POTATOES = registerCropBlocks("swift_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        PENTLAND_JAVELIN_POTATOES = registerCropBlocks("pentland_javelin_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        ROCKET_POTATOES = registerCropBlocks("rocket_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        CASABLANCA_POTATOES = registerCropBlocks("casablanca_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        ARRAN_PILOT_POTATOES = registerCropBlocks("arran_pilot_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        DUKE_OF_YORK_POTATOES = registerCropBlocks("duke_of_york_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        RED_DUKE_OF_YORK_POTATOES = registerCropBlocks("red_duke_of_york_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        EPICURE_POTATOES = registerCropBlocks("epicure_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        FOREMOST_POTATOES = registerCropBlocks("foremost_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        HOME_GUARD_POTATOES = registerCropBlocks("home_guard_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        LADY_CHRISTL_POTATOES = registerCropBlocks("lady_christl_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        ORLA_POTATOES = registerCropBlocks("orla_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        PREMIERE_POTATOES = registerCropBlocks("premiere_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        PURITAN_POTATOES = registerCropBlocks("puritan_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        ULSTER_PRINCE_POTATOES = registerCropBlocks("ulster_prince_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        JERSEY_ROYAL_POTATOES = registerCropBlocks("jersey_royal_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        MARFONA_POTATOES = registerCropBlocks("marfona_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        MARIS_PEER_POTATOES = registerCropBlocks("maris_peer_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        CHARLOTTE_POTATOES = registerCropBlocks("charlotte_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        NICOLA_POTATOES = registerCropBlocks("nicola_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        ANYA_POTATOES = registerCropBlocks("anya_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        BONNIE_POTATOES = registerCropBlocks("bonnie_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        BRITISH_QUEEN_POTATOES = registerCropBlocks("british_queen_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        CATRIONA_POTATOES = registerCropBlocks("catriona_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        DUNLUCE_POTATOES = registerCropBlocks("dunluce_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        ESTIMA_POTATOES = registerCropBlocks("estima_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        KESTREL_POTATOES = registerCropBlocks("kestrel_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        NADINE_POTATOES = registerCropBlocks("nadine_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        RATTE_POTATOES = registerCropBlocks("ratte_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        WILJA_POTATOES = registerCropBlocks("wilja_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        KING_EDWARD_POTATOES = registerCropBlocks("king_edward_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        MARIS_PIPER_POTATOES = registerCropBlocks("maris_piper_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        PICASSO_POTATOES = registerCropBlocks("picasso_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        DESIREE_POTATOES = registerCropBlocks("desiree_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        PINK_FIR_APPLE_POTATOES = registerCropBlocks("pink_fir_apple_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        SARPO_MIRA_POTATOES = registerCropBlocks("sarpo_mira_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        CARA_POTATOES = registerCropBlocks("cara_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        MAJESTIC_POTATOES = registerCropBlocks("majestic_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        RECORD_POTATOES = registerCropBlocks("record_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        ROMANO_POTATOES = registerCropBlocks("romano_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        ROOSTER_POTATOES = registerCropBlocks("rooster_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        SANTE_POTATOES = registerCropBlocks("sante_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        SAXON_POTATOES = registerCropBlocks("saxon_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        VALOR_POTATOES = registerCropBlocks("valor_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        ELBA_POTATOES = registerCropBlocks("elba_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        KENNEBEC_POTATOES = registerCropBlocks("kennebec_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        RED_GOLD_POTATOES = registerCropBlocks("red_gold_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        MASQUERADE_POTATOES = registerCropBlocks("masquerade_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        PURPLE_MAJESTY_POTATOES = registerCropBlocks("purple_majesty_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        RUSSIAN_BANANA_FINGERLING_POTATOES = registerCropBlocks("russian_banana_fingerling_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        RED_NORLAND_POTATOES = registerCropBlocks("red_norland_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        KIFLI_POTATOES = registerCropBlocks("kifli_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        LADY_BALFOUR_POTATOES = registerCropBlocks("lady_balfour_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        VIVALDI_POTATOES = registerCropBlocks("vivaldi_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        ACCORD_POTATOES = registerCropBlocks("accord_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        CONGO_POTATOES = registerCropBlocks("congo_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
        MAYAN_GOLD_POTATOES = registerCropBlocks("mayan_gold_potatoes", new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));





    }

    public static Block registerCropBlocks(String id, Block block) {
        return (Block)Registry.register(Registries.BLOCK, id, block);
    }

    public static void registerBlocks() {

    }
}
