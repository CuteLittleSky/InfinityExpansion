package io.github.mooy1.infinityexpansion.items.mobdata;

import org.bukkit.Material;

public enum MobDataTier {

    ZISHUIJING(1, 50, Material.AMETHYST_SHARD),
    // ex: chicken
    PASSIVE(1, 125, Material.IRON_CHESTPLATE),

    // ex: slime
    NEUTRAL(1, 300, Material.IRON_CHESTPLATE),

    // ex: zombie
    HOSTILE(2, 600, Material.DIAMOND_CHESTPLATE),

    // ex: endermen
    ADVANCED(4, 1200, Material.DIAMOND_CHESTPLATE),

    // ex: wither
    MINI_BOSS(32, 9000, Material.NETHERITE_CHESTPLATE),

    // ex: ender dragon
    BOSS(96, 18000, Material.NETHERITE_CHESTPLATE);

    final int xp;
    final int energy;
    final Material material;

    MobDataTier(int xp, int energy, Material material) {
        this.xp = (int) (xp * MobSimulationChamber.XP_MULTIPLIER);
        this.energy = energy;
        this.material = material;
    }

}
