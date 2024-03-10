package github.CiLuQwQ.hidemodded.mixin;

import net.minecraft.util.ModStatus;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
@Mixin(ModStatus.class)
public class ModStatusMixin {
	/**
	 * @author CiLuQwQ
	 * @reason
     */
	@Overwrite
	public boolean isModded() {
		return false;
	}
}
