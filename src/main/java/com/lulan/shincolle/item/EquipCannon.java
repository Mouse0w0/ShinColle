package com.lulan.shincolle.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;

public class EquipCannon extends BasicEquip {
	
	IIcon[] icons = new IIcon[3];
	
	public EquipCannon() {
		super();
		this.setUnlocalizedName("EquipCannon");
		this.types = 11;	//single = 2, twin = 7, triple = 2
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegister) {	
		icons[0] = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1)+"0");
		icons[1] = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1)+"1");
		icons[2] = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1)+"2");
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
	    if(meta < 2) {				//0,1 = single cannon
	    	return this.icons[0];
	    }
	    else if(meta < 9) {			//2~6 = twin cannon
	    	return this.icons[1];
	    }
	    else if(meta < 11) {			//7,8 = triple cannon
	    	return this.icons[2];
	    }
	   
	    return icons[0];
	}

}
