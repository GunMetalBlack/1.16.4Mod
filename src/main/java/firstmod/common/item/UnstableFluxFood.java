package firstmod.common.item;

import firstmod.common.MagicManager;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UnstableFluxFood extends Item{

	public UnstableFluxFood(Properties properties) {
		super(properties);
		
	}

	@Override
		public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		MagicManager.CanUseUnstable = true;		
		MagicManager.MagicController();
		MagicManager.Mana += 5;
		return super.onItemUseFinish(stack, worldIn, entityLiving);
			}
	

}
