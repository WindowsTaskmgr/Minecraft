
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mo.sword.init;

import net.mo.sword.item.HolyshitItem;
import net.mo.sword.SwordMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class SwordModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SwordMod.MODID);
	public static final RegistryObject<Item> HOLYSHIT = REGISTRY.register("holyshit", () -> new HolyshitItem());
}
