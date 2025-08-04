package com.gregtechceu.gtceu.gametest.util;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.TagTypes;
import net.minecraft.world.item.ItemStack;

public class TestUtils {

    // Compares two itemstacks' items and amounts
    // DOES NOT CHECK TAGS OR NBT ETC!
    public static boolean isItemStackEqual(ItemStack stack1, ItemStack stack2) {
        return ItemStack.isSameItem(stack1, stack2) && stack1.getCount() == stack2.getCount();
    }

    public static boolean nbtContainsAndEquals(CompoundTag tag, String key, boolean value) {
        return tag.contains(key, Tag.TAG_BYTE) && tag.getBoolean(key) == value;
    }

    public static boolean nbtContainsAndEquals(CompoundTag tag, String key, int value) {
        return tag.contains(key, Tag.TAG_INT) && tag.getInt(key) == value;
    }

    public static boolean nbtContainsAndEquals(CompoundTag tag, String key, long value) {
        return tag.contains(key, Tag.TAG_LONG) && tag.getLong(key) == value;
    }

    public static boolean nbtContainsAndEquals(CompoundTag tag, String key, byte value) {
        return tag.contains(key, Tag.TAG_BYTE) && tag.getByte(key) == value;
    }

    public static boolean nbtContainsAndEquals(CompoundTag tag, String key, float value) {
        return tag.contains(key, Tag.TAG_FLOAT) && tag.getFloat(key) == value;
    }

    public static boolean nbtContainsAndEquals(CompoundTag tag, String key, short value) {
        return tag.contains(key, Tag.TAG_SHORT) && tag.getShort(key) == value;
    }

    public static boolean nbtContainsAndEquals(CompoundTag tag, String key, String value) {
        return tag.contains(key, Tag.TAG_STRING) && tag.getString(key).equals(value);
    }
}
