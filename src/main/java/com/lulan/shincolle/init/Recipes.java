package com.lulan.shincolle.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
	//�t��d��
	//GameRegistry.addSmelting(���o��, ����, 0.1f�g��);
	//GameRegistry.addRecipe(new ShapedOreRecipe(���o��, " s ", "sss", " s ", 's', "stickWood" ���ư}�C));
    //GameRegistry.addRecipe(new ShapelessOreRecipe(���o��, ����A, ����B, ...));		
	public static void init() {
		//�t�����or���~
		ItemStack abyssiumStack = new ItemStack(ModItems.Abyssium);
		ItemStack ammo8 = new ItemStack(ModItems.Ammo,8); 
		ItemStack ammo16 = new ItemStack(ModItems.Ammo,16);
		ItemStack ammo32 = new ItemStack(ModItems.Ammo,32);
		ItemStack ammo64 = new ItemStack(ModItems.Ammo,64);
		ItemStack ammoHeavy8 = new ItemStack(ModItems.HeavyAmmo,1); 
		ItemStack ammoHeavy16 = new ItemStack(ModItems.HeavyAmmo,2);
		ItemStack ammoHeavy32 = new ItemStack(ModItems.HeavyAmmo,4);
		ItemStack ammoHeavy64 = new ItemStack(ModItems.HeavyAmmo,8);
		ItemStack blazepowderStack = new ItemStack(Items.blaze_powder);
		ItemStack bucketRepairStack = new ItemStack(ModItems.BucketRepair);	
		ItemStack grudeStack = new ItemStack(ModItems.Grudge);
		ItemStack gunpowderStack = new ItemStack(Items.gunpowder);	
		ItemStack smallshipyardStack = new ItemStack(ModBlocks.BlockSmallShipyard);
		
		//SHAPELESS RECIPE
		//abyssium material:
		GameRegistry.addRecipe(new ShapelessOreRecipe(abyssiumStack, "ingotIron", grudeStack));
		GameRegistry.addRecipe(new ShapelessOreRecipe(bucketRepairStack, Items.lava_bucket, grudeStack));

		//SHAPED RECIPE
		//ammo material: copper/tin=8 iron/bronze=16 abyssium/gold/silver=32 diamond=64
		GameRegistry.addRecipe(new ShapedOreRecipe(ammo8,"iii","igi","ipi",'i',"ingotCopper",'g',grudeStack,'p',gunpowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammo8,"iii","igi","ipi",'i',"ingotTin",'g',grudeStack,'p',gunpowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammo16,"iii","igi","ipi",'i',"ingotIron",'g',grudeStack,'p',gunpowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammo16,"iii","igi","ipi",'i',"ingotBronze",'g',grudeStack,'p',gunpowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammo32,"iii","igi","ipi",'i',abyssiumStack,'g',grudeStack,'p',gunpowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammo32,"iii","igi","ipi",'i',"ingotGold",'g',grudeStack,'p',gunpowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammo32,"iii","igi","ipi",'i',"ingotSilver",'g',grudeStack,'p',gunpowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammo64,"iii","igi","ipi",'i',"gemDiamond",'g',grudeStack,'p',gunpowderStack));
		
		//heavy ammo material: copper/tin=1 iron/bronze=2 gold/silver=4 diamond=8
		GameRegistry.addRecipe(new ShapedOreRecipe(ammoHeavy8,"iii","igi","ipi",'i',"ingotCopper",'g',grudeStack,'p',blazepowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammoHeavy8,"iii","igi","ipi",'i',"ingotTin",'g',grudeStack,'p',blazepowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammoHeavy16,"iii","igi","ipi",'i',"ingotIron",'g',grudeStack,'p',blazepowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammoHeavy16,"iii","igi","ipi",'i',"ingotBronze",'g',grudeStack,'p',blazepowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammoHeavy32,"iii","igi","ipi",'i',abyssiumStack,'g',grudeStack,'p',blazepowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammoHeavy32,"iii","igi","ipi",'i',"ingotGold",'g',grudeStack,'p',blazepowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammoHeavy32,"iii","igi","ipi",'i',"ingotSilver",'g',grudeStack,'p',blazepowderStack));
		GameRegistry.addRecipe(new ShapedOreRecipe(ammoHeavy64,"iii","igi","ipi",'i',"gemDiamond",'g',grudeStack,'p',blazepowderStack));
		
		//small shipyard
		GameRegistry.addRecipe(new ShapedOreRecipe(smallshipyardStack,"glg","lol","ooo",'g',grudeStack,'l',Items.lava_bucket,'o',Blocks.obsidian));
		
	}

}