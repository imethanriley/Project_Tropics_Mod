package tropics.entities.renderer.boss;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tropics.TestMod;
import tropics.entities.entity.boss.VulcanEntity;
import tropics.entities.model.boss.VulcanModel;

@OnlyIn(Dist.CLIENT)
public class VulcanRenderer extends MobRenderer<VulcanEntity, VulcanModel<VulcanEntity>> {
   private static final ResourceLocation TEXTURE = new ResourceLocation(TestMod.MOD_ID, "textures/entity/vulcan.png");

   public VulcanRenderer(EntityRendererManager renderManagerIn) {
      super(renderManagerIn, new VulcanModel<>(), 1.4F);
      //this.addLayer(new IronGolemCracksLayer(this));
      //this.addLayer(new IronGolenFlowerLayer(this));
   }

   @Override
   protected void scale(VulcanEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
      float scaleFactor = 1.00F;
      matrixStackIn.scale(scaleFactor, scaleFactor, scaleFactor);
      super.scale(entitylivingbaseIn, matrixStackIn, partialTickTime);
   }

   public ResourceLocation getTextureLocation(VulcanEntity entity) {
      return TEXTURE;
   }

   protected void setupRotations(VulcanEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
      super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
      /*
      if (!((double)entityLiving.limbSwingAmount < 0.01D)) {
         float f = 13.0F;
         float f1 = entityLiving.limbSwing - entityLiving.limbSwingAmount * (1.0F - partialTicks) + 6.0F;
         float f2 = (Math.abs(f1 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(6.5F * f2));
      }
       */
   }
}