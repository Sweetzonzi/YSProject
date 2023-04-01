package com.mmixel.ysproject.block.decoration;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class ClosetBlockRenderer extends GeoBlockRenderer<ClosetBlockEntity> {
    public ClosetBlockRenderer(BlockEntityRendererProvider.Context rendererProvider) {
        super(rendererProvider, new ClosetBlockModel());
    }

    @Override
    public RenderType getRenderType(ClosetBlockEntity animatable,
                                    float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer,
                                    int packedLight,
                                    ResourceLocation texture) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
