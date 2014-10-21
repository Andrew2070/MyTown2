package mytown.util;

import net.minecraft.block.Block;

/**
 * Created by AfterWind on 9/20/2014.
 * Helper class for storing position of a block
 */
public class BlockPos {
    public final int dim;
    public final int x;
    public final int y;
    public final int z;
    public BlockPos(int x, int y, int z, int dim) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dim = dim;
    }
}
