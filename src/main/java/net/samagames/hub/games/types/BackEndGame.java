package net.samagames.hub.games.types;

import net.samagames.hub.Hub;
import net.samagames.hub.games.AbstractGame;
import net.samagames.hub.games.leaderboards.HubLeaderboard;
import net.samagames.hub.games.shops.ShopCategory;
import net.samagames.tools.RulesBook;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class BackEndGame extends AbstractGame
{
    private final String codeName;
    private final String publicName;
    private final Location spawn;

    public BackEndGame(Hub hub, String codeName, String publicName, Location spawn)
    {
        super(hub);

        this.codeName = codeName;
        this.publicName = publicName;
        this.spawn = spawn;
    }

    @Override
    public String getCodeName()
    {
        return this.codeName;
    }

    @Override
    public String getName()
    {
        return this.publicName;
    }

    @Override
    public String getCategory()
    {
        return null;
    }

    @Override
    public ItemStack getIcon()
    {
        return null;
    }

    @Override
    public String[] getDescription()
    {
        return null;
    }

    @Override
    public String[] getDevelopers()
    {
        return null;
    }

    @Override
    public RulesBook[] getRulesBooks()
    {
        return null;
    }

    @Override
    public int getSlotInMainMenu()
    {
        return -1;
    }

    @Override
    public ShopCategory getShopConfiguration()
    {
        return null;
    }

    @Override
    public Location getLobbySpawn()
    {
        return this.spawn;
    }

    @Override
    public boolean isGroup()
    {
        return false;
    }

    @Override
    public boolean isLocked()
    {
        return false;
    }

    @Override
    public boolean isNew()
    {
        return false;
    }

    @Override
    public List<HubLeaderboard> getLeaderBoards()
    {
        return new ArrayList<>();
    }
}
