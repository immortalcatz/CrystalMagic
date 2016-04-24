package com.clausgames.crystalmagic.blocks.plants;

import com.clausgames.crystalmagic.lib.LibMisc;
import net.minecraft.block.material.Material;

public class EmeraldInfusedStone extends OreInfusedStone
{
    protected EmeraldInfusedStone(Material material)
    {
        super(Material.rock);
        this.setBlockName("EmeraldInfusedStone");
        this.setBlockTextureName(LibMisc.MODID + ":" + this.getUnlocalizedName().substring(5));
    }
}