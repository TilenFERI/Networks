package io.github.sefiraat.networks.slimefun;

import io.github.sefiraat.networks.Networks;
import io.github.sefiraat.networks.slimefun.groups.DummyItemGroup;
import io.github.sefiraat.networks.utils.Keys;
import io.github.sefiraat.networks.utils.Theme;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.core.guide.menus.AddonItemGroup;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import io.github.thebusybiscuit.slimefun5.libraries.keys.NamespacedKey;
import org.bukkit.inventory.ItemStack;


@UtilityClass
public final class NetworksItemGroups {

    public static final DummyItemGroup MATERIALS = new DummyItemGroup(
        Keys.newSlimefunKey("materials"),
        CustomItemStack.create(
            new ItemStack(Material.WHITE_STAINED_GLASS),
            Theme.MAIN.getColor() + "Crafting Materials"
        )
    );

    public static final DummyItemGroup TOOLS = new DummyItemGroup(
        Keys.newSlimefunKey("tools"),
        CustomItemStack.create(
            new ItemStack(Material.PAINTING),
            Theme.MAIN.getColor() + "Network Management Tools"
        )
    );

    public static final DummyItemGroup NETWORK_ITEMS = new DummyItemGroup(
        Keys.newSlimefunKey("network_items"),
        CustomItemStack.create(
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.MAIN.getColor() + "Network Items"
        )
    );

    public static final DummyItemGroup NETWORK_QUANTUMS = new DummyItemGroup(
        Keys.newSlimefunKey("network_quantums"),
        CustomItemStack.create(
            new ItemStack(Material.WHITE_TERRACOTTA),
            Theme.MAIN.getColor() + "Network Quantum Storage Devices"
        )
    );

    public static final ItemGroup DISABLED_ITEMS = new HiddenItemGroup(
        Keys.newSlimefunKey("disabled_items"),
        CustomItemStack.create(
            new ItemStack(Material.BARRIER),
            Theme.MAIN.getColor() + "Disabled/Removed Items"
        )
    );

    static {
        final Networks plugin = Networks.getInstance();

        // Slimefun Registry
        AddonItemGroup guideRoot = new AddonItemGroup(
            Keys.newSlimefunKey("guide_menu"),
            CustomItemStack.create(
                new ItemStack(Material.BLACK_STAINED_GLASS),
                Theme.MAIN.getColor() + "Networks"
            ),
            plugin.getName()
        );
        Slimefun.getAddonMenus().declareRoot(guideRoot);
        NetworksItemGroups.MATERIALS.register(plugin);
        NetworksItemGroups.TOOLS.register(plugin);
        NetworksItemGroups.NETWORK_ITEMS.register(plugin);
        NetworksItemGroups.NETWORK_QUANTUMS.register(plugin);
        NetworksItemGroups.DISABLED_ITEMS.register(plugin);
    }

}
