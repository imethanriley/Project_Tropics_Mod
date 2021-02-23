package tropics.renderer;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import tropics.Tropics;
import tropics.entity.AnglerFishEntity;

public class AnglerFishRenderer extends MobRenderer<AnglerFishEntity, AnglerFishModel> {
	private static final ResourceLocation TEXTURE = Tropics.location("textures/entity/angler_fish.png");

	public AnglerFishRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new AnglerFishModel(), 0.2F);
	}

	@Override
	public ResourceLocation getEntityTexture(AnglerFishEntity entity) {
		return TEXTURE;
	}
}