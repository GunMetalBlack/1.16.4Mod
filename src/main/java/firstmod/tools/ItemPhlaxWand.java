package firstmod.tools;

import firstmod.common.MagicManager;
import firstmod.common.entities.spells.PhlaxWandEntitie;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.fml.ModLoader;

public class ItemPhlaxWand extends Item {

	public ItemPhlaxWand(Properties properties) {

		super(properties);

	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		
		MagicManager.MagicController();
		if (!worldIn.isRemote && MagicManager.Mana > 10 &&  MagicManager.CanUseUnstable == true) {
			PhlaxWandEntitie phlaxen = new PhlaxWandEntitie(worldIn);
			phlaxen.setLocationAndAngles(playerIn.getPosX(), playerIn.getPosY() + playerIn.getEyeHeight() * 0.8,
					playerIn.getPosZ(), playerIn.rotationYaw, playerIn.rotationPitch);
			phlaxen.func_234612_a_(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0, 1, 1);
			worldIn.addEntity(phlaxen);
			phlaxen.player = playerIn;
			MagicManager.Mana -= 10f;
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);

	}

}
