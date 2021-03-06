package tropics.entities.renderer.passive;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import tropics.TestMod;
import tropics.entities.entity.passive.AnglerFishEntity;
import tropics.entities.model.passive.AnglerFishModel;

public class AnglerFishRenderer extends MobRenderer<AnglerFishEntity, AnglerFishModel> {
	private static final ResourceLocation TEXTURE = TestMod.location("textures/entity/angler_fish.png");

	public AnglerFishRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new AnglerFishModel(), 0.2F);
	}

	@Override
	public ResourceLocation getTextureLocation(AnglerFishEntity entity) {
		return TEXTURE;
	}
}
