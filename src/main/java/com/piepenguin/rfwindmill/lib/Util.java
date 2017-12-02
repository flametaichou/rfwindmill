package com.piepenguin.rfwindmill.lib;

import cpw.mods.fml.common.Loader;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Various useful functions that are used throughout the codebase.
 */
public class Util {

    /**
     * Convert an integer 0-3 into a Forge direction in the xz plane according to
     * <ul>
     *     <li>0 -> North</li>
     *     <li>1 -> East</li>
     *     <li>2 -> South</li>
     *     <li>3 -> West</li>
     * </ul>
     * @param pDir Integer representing a direction in the xz plane
     * @return Forge direction corresponding to that direction
     */
    public static ForgeDirection intToDirection(int pDir) {
        switch(pDir) {
            case 0:
                return ForgeDirection.NORTH;
            case 1:
                return ForgeDirection.EAST;
            case 2:
                return ForgeDirection.SOUTH;
            case 3:
                return ForgeDirection.WEST;
            default:
                return ForgeDirection.NORTH;
        }
    }

    /**
     * Convert a Forge direction in the xz plane into an integer 0-3 according to
     * <ul>
     *     <li>North -> 0</li>
     *     <li>East -> 1</li>
     *     <li>South -> 2</li>
     *     <li>West -> 3</li>
     * </ul>
     * @param pDir Forge direction in the xz plane
     * @return Integer representing that direction
     */
    public static int directionToInt(ForgeDirection pDir) {
        if(pDir == ForgeDirection.NORTH)
            return 0;
        else if(pDir == ForgeDirection.EAST)
            return 1;
        else if(pDir == ForgeDirection.SOUTH)
            return 2;
        else if(pDir == ForgeDirection.WEST)
            return 3;
        else
            return 0;
    }

    /**
     * Checks if Thermal Expansion features should be used
     * @return {@code true} if Thermal Expansion is loaded and the recipes
     * aren't disabled and {@code false} otherwise
     */
    public static boolean useThermalExpansion() {
        return Loader.isModLoaded(Constants.THERMAL_EXPANSION_MOD_ID) && !ModConfiguration.useVanillaRecipes();
    }

    /**
     * Checks if Thermal Foundation features should be used
     * @return {@code true} if Thermal Foundation is loaded and the recipes
     * aren't disabled, and {@code false} otherwise
     */
    public static boolean useThermalFoundation() {
        return Loader.isModLoaded(Constants.THERMAL_FOUNDATION_MOD_ID) && !ModConfiguration.useVanillaRecipes();
    }

    /**
     * Returns the number of ticks one right click cycle takes.
     * @return Ticks in a player click cycle
     */
    public static int ticksPerClick() {
        return 4;
    }
}
