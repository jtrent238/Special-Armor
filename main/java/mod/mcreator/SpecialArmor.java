package mod.mcreator;import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;

import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.common.network.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import io.netty.buffer.ByteBuf;

import net.minecraftforge.fml.common.network.FMLIndexedMessageToMessageCodec;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraftforge.fml.relauncher.*;

@Mod(modid = TestEnvironmentMod.MODID, version = TestEnvironmentMod.VERSION)
public class TestEnvironmentMod implements IFuelHandler, IWorldGenerator{

	public static final String MODID = "TestEnvironmentMod";
    public static final String VERSION = "1.0.1a";

	@SidedProxy(clientSide="mod.mcreator.ClientProxyTestEnvironmentMod", serverSide="mod.mcreator.CommonProxyTestEnvironmentMod")
    //@SidedProxy(clientSide="mod.mcreator.ClientProxyTestEnvironmentMod", serverSide="mod.mcreator.CommonProxyTestEnvironmentMod")
    public static CommonProxyTestEnvironmentMod proxy;
    //public static EnumMap<Side, FMLEmbeddedChannel> channels = NetworkRegistry.INSTANCE.newChannel("MCRBUS", new ChannelHandlerTestEnvironmentMod());

	@Instance(MODID)
    public static TestEnvironmentMod instance;

	mcreator_redLeather mcreator_0 = new mcreator_redLeather();
mcreator_redleatheritem mcreator_1 = new mcreator_redleatheritem();
mcreator_blueLeather mcreator_2 = new mcreator_blueLeather();
mcreator_blueArmor mcreator_3 = new mcreator_blueArmor();
mcreator_redLeatherDye mcreator_4 = new mcreator_redLeatherDye();
mcreator_blueLeatherDye mcreator_5 = new mcreator_blueLeatherDye();
mcreator_glowingArmor mcreator_6 = new mcreator_glowingArmor();
mcreator_purpleLeather mcreator_7 = new mcreator_purpleLeather();
mcreator_purpleLeatherArmor mcreator_8 = new mcreator_purpleLeatherArmor();


@Override
public int getBurnTime(ItemStack fuel) {
if(mcreator_0.addFuel(fuel)!=0) return mcreator_0.addFuel(fuel);
if(mcreator_1.addFuel(fuel)!=0) return mcreator_1.addFuel(fuel);
if(mcreator_2.addFuel(fuel)!=0) return mcreator_2.addFuel(fuel);
if(mcreator_3.addFuel(fuel)!=0) return mcreator_3.addFuel(fuel);
if(mcreator_4.addFuel(fuel)!=0) return mcreator_4.addFuel(fuel);
if(mcreator_5.addFuel(fuel)!=0) return mcreator_5.addFuel(fuel);
if(mcreator_6.addFuel(fuel)!=0) return mcreator_6.addFuel(fuel);
if(mcreator_7.addFuel(fuel)!=0) return mcreator_7.addFuel(fuel);
if(mcreator_8.addFuel(fuel)!=0) return mcreator_8.addFuel(fuel);
return 0;
}

@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

chunkX = chunkX * 16;
chunkZ = chunkZ * 16;
if(world.provider.getDimensionId()==-1)mcreator_0.generateNether(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==0)mcreator_0.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==-1)mcreator_1.generateNether(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==0)mcreator_1.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==-1)mcreator_2.generateNether(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==0)mcreator_2.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==-1)mcreator_3.generateNether(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==0)mcreator_3.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==-1)mcreator_4.generateNether(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==0)mcreator_4.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==-1)mcreator_5.generateNether(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==0)mcreator_5.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==-1)mcreator_6.generateNether(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==0)mcreator_6.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==-1)mcreator_7.generateNether(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==0)mcreator_7.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==-1)mcreator_8.generateNether(world, random, chunkX, chunkZ);
if(world.provider.getDimensionId()==0)mcreator_8.generateSurface(world, random, chunkX, chunkZ);


}
@EventHandler
public void load(FMLInitializationEvent event) {

GameRegistry.registerFuelHandler(this);
GameRegistry.registerWorldGenerator(this, 1);
MinecraftForge.EVENT_BUS.register(new mcreator_GlobalEventsTestEnvironmentMod());
NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
mcreator_0.load(event);
mcreator_1.load(event);
mcreator_2.load(event);
mcreator_3.load(event);
mcreator_4.load(event);
mcreator_5.load(event);
mcreator_6.load(event);
mcreator_7.load(event);
mcreator_8.load(event);


}
@EventHandler
public void serverLoad(FMLServerStartingEvent event){
mcreator_0.serverLoad(event);
mcreator_1.serverLoad(event);
mcreator_2.serverLoad(event);
mcreator_3.serverLoad(event);
mcreator_4.serverLoad(event);
mcreator_5.serverLoad(event);
mcreator_6.serverLoad(event);
mcreator_7.serverLoad(event);
mcreator_8.serverLoad(event);
}
@EventHandler
public void preInit(FMLPreInitializationEvent event){
mcreator_0.instance = this.instance;
mcreator_1.instance = this.instance;
mcreator_2.instance = this.instance;
mcreator_3.instance = this.instance;
mcreator_4.instance = this.instance;
mcreator_5.instance = this.instance;
mcreator_6.instance = this.instance;
mcreator_7.instance = this.instance;
mcreator_8.instance = this.instance;
mcreator_0.preInit(event);
mcreator_1.preInit(event);
mcreator_2.preInit(event);
mcreator_3.preInit(event);
mcreator_4.preInit(event);
mcreator_5.preInit(event);
mcreator_6.preInit(event);
mcreator_7.preInit(event);
mcreator_8.preInit(event);
proxy.registerRenderers(this);
}
public static class GuiHandler implements IGuiHandler {
@Override public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
return null;}
@Override public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
return null;}
}


}
