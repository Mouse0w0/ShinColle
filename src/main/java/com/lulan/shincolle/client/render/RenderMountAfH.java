package com.lulan.shincolle.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.lulan.shincolle.reference.Reference;

public class RenderMountAfH extends RenderLiving {
	
	//�K���ɸ��|
	private static final ResourceLocation mobTextures = new ResourceLocation(Reference.TEXTURES_ENTITY+"EntityMountAfH.png");

	public RenderMountAfH(ModelBase par1, float par2) {
		super(par1, par2);	
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return mobTextures;
	}

}


