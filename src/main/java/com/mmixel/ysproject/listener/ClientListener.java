package com.mmixel.ysproject.listener;

import com.mmixel.ysproject.YSProject;
import com.mmixel.ysproject.block.YSBlockEntities;
import com.mmixel.ysproject.block.decoration.ClosetBlockRenderer;
import com.mmixel.ysproject.block.decoration.LockerBlockRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = YSProject.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
        event.registerBlockEntityRenderer(YSBlockEntities.LOCKER.get(), LockerBlockRenderer::new);
        event.registerBlockEntityRenderer(YSBlockEntities.CLOSET.get(), ClosetBlockRenderer::new);
    }

}
