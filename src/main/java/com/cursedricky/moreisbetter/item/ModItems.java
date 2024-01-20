package com.cursedricky.moreisbetter.item;

import com.cursedricky.moreisbetter.MoreIsBetter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_COBALT = registerItem("raw_cobalt", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()));
    public static final Item OSMIUM_INGOT = registerItem("osmium_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_OSMIUM = registerItem("raw_osmium", new Item(new FabricItemSettings()));
    public static final Item SULFUR = registerItem("sulfur", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientsTab(FabricItemGroupEntries entries) {
        entries.add(COBALT_INGOT);
        entries.add(RAW_COBALT);
        entries.add(SILVER_INGOT);
        entries.add(RAW_SILVER);
        entries.add(OSMIUM_INGOT);
        entries.add(RAW_OSMIUM);
        entries.add(SULFUR);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreIsBetter.MOD_ID, name), item);
    }

    public static void registerMoreItems() {
        MoreIsBetter.LOGGER.info("Registering more items for " + MoreIsBetter.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTab);
    }
}
