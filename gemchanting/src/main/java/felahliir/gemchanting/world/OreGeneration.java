package felahliir.gemchanting.world;

import felahliir.gemchanting.ObjectHolders;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;


public class OreGeneration
{
public static void setupOreGeneration()
{
	for(Biome biome : ForgeRegistries.BIOMES)
	{
	
		biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature( Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ObjectHolders.winestone_ore.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(15, 1, 0, 140)
		        )
		    );

		biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature( Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ObjectHolders.gold_netherrack.getDefaultState(), 10), Placement.COUNT_RANGE, new CountRangeConfig(20, 10, 20, 1280)
		        )
		    );
		biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature( Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ObjectHolders.onyx_netherrack.getDefaultState(), 14), Placement.COUNT_RANGE, new CountRangeConfig(8, 10, 20, 128)
		        )
		    );
		biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature( Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ObjectHolders.gallenite_ore.getDefaultState(), 5), Placement.COUNT_RANGE, new CountRangeConfig(8, 1, 0, 40)
		        )
		    );
		biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature( Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ObjectHolders.malachite_ore.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(8,30,0,140)
		        )
		    );

		biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature( Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ObjectHolders.ifranite_ore.getDefaultState(), 3), Placement.COUNT_RANGE, new CountRangeConfig(1,80,0,140)
		        )
		    );

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

 
}
}
