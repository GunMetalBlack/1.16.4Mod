package firstmod.common.item;

import firstmod.common.MagicManager;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCherry extends BlockItem{

	public ItemCherry(Block blockIn, Properties builder) {
		super(blockIn, builder);
		
	}
	
	
	@Override
		public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
			MagicManager.MagicController();
			MagicManager.RegenMana = true;
			return super.onItemUseFinish(stack, worldIn, entityLiving);
		}

}
