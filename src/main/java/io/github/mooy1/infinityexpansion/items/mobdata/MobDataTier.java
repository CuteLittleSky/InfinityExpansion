package io.github.mooy1.infinityexpansion.items.mobdata;

import org.bukkit.Material;

public enum MobDataTier {

    ZISHUIJING(1, 50, Material.AMETHYST_SHARD),
    // ex: chicken
    PASSIVE(2, 150, Material.IRON_CHESTPLATE),

    // ex: slime
    NEUTRAL(2, 300, Material.IRON_CHESTPLATE),

    // ex: zombie
    HOSTILE(4, 600, Material.DIAMOND_CHESTPLATE),

    // ex: endermen
    ADVANCED(8, 1500, Material.DIAMOND_CHESTPLATE),

    // ex: wither
    MINI_BOSS(64, 9000, Material.NETHERITE_CHESTPLATE),

    // ex: ender dragon
    BOSS(192, 18000, Material.NETHERITE_CHESTPLATE);

    final int xp;
    final int energy;
    final Material material;

    MobDataTier(int xp, int energy, Material material) {
        this.xp = (int) (xp * MobSimulationChamber.XP_MULTIPLIER);
        this.energy = energy;
        this.material = material;
    }

}
