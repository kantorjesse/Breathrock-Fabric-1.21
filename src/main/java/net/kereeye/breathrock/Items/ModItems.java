package net.kereeye.breathrock.Items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kereeye.breathrock.Breathrock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BREATHROCK_CLEAR = registerItem("breathrock_clear", new Item(new Item.Settings()));
    public static final Item BREATHROCK_CUCUMBER = registerItem("breathrock_cucumber", new Item(new Item.Settings()));
    public static final Item BREATHROCK_GUAVA = registerItem("breathrock_guava", new Item(new Item.Settings()));
    public static final Item BREATHROCK_MANGO = registerItem("breathrock_mango", new Item(new Item.Settings()));
    public static final Item BREATHROCK_MINT = registerItem("breathrock_mint", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Breathrock.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Breathrock.LOGGER.info("Registering Mod Items for " + Breathrock.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BREATHROCK_CLEAR);
            entries.add(BREATHROCK_CUCUMBER);
            entries.add(BREATHROCK_GUAVA);
            entries.add(BREATHROCK_MANGO);
            entries.add(BREATHROCK_MINT);
        });
    }
}
