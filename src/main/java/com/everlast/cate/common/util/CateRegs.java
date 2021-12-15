package com.everlast.cate.common.util;

import com.everlast.cate.common.Cate;
import com.everlast.cate.common.block.BlockInit;
import com.everlast.cate.common.item.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CateRegs {

    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, Cate.MODID);
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, Cate.MODID);

    public static void register(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.register();
        ItemInit.register();

        Blocks.register(eventBus);
        Items.register(eventBus);
    }
}
