package com.ber.blackcat.capabilities.mana;

import com.ber.blackcat.util.MathUtil;
import net.minecraft.nbt.CompoundTag;

public class PlayerMana {
    private final int minMana = 0;
    private int mana;
    private int maxMana = 100;

    public int getMana(){return mana;}

    public void setMana(int mana) {this.mana = mana;}

    public void addMana(int dMana){mana = MathUtil.Clamp(mana + dMana, minMana, maxMana);}

    public void deductMana(int dMana){mana = MathUtil.Clamp(mana - dMana, minMana, maxMana);}

    public int getMaxMana() {return maxMana;}

    public void setMaxMana(int maxMana) {this.maxMana = maxMana;}

    public void addMaxMana(int dMana){maxMana+=dMana;}

    public void deductMaxMana(int dMana){maxMana-=dMana;}

    public boolean canCast(int cost) {return cost <= mana;}

    public void copyFrom(PlayerMana source){this.mana = source.mana;}

    public void serializeNBTData(CompoundTag nbt){
        nbt.putInt("mana", mana);
        nbt.putInt("maxMana", maxMana);
    }

    public void deserializeNBTData(CompoundTag nbt){
        mana = nbt.getInt("mana");
        maxMana = nbt.getInt("maxMana");
    }
}
