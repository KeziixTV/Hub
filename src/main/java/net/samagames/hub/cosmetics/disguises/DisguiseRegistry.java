package net.samagames.hub.cosmetics.disguises;

import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import net.samagames.hub.cosmetics.common.AbstractCosmeticRegistry;
import net.samagames.tools.GlowEffect;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class DisguiseRegistry extends AbstractCosmeticRegistry<DisguiseCosmetic>
{
    @Override
    public void register()
    {
        DisguiseCosmetic creeperDisguise = new DisguiseCosmetic("creeper", "Creeper", new ItemStack(Material.MONSTER_EGG, 1, EntityType.CREEPER.getTypeId()), new String[] {
                "Réveillez la peur ancestrale des joueurs !"
        }, DisguiseType.CREEPER);
        creeperDisguise.permissionNeeded("disguise.creeper");

        DisguiseCosmetic zombieDisguise = new DisguiseCosmetic("zombie", "Zombie", new ItemStack(Material.MONSTER_EGG, 1, EntityType.ZOMBIE.getTypeId()), new String[] {
                "Nourissez vous de chair fraîche !"
        }, DisguiseType.ZOMBIE);
        zombieDisguise.permissionNeeded("disguise.zombie");

        DisguiseCosmetic pigmanDisguise = new DisguiseCosmetic("pigman", "Pigman", new ItemStack(Material.MONSTER_EGG, 1, EntityType.PIG_ZOMBIE.getTypeId()), new String[] {
                "Cochon ? Zombie ? Impossible de savoir..."
        }, DisguiseType.PIG_ZOMBIE);
        pigmanDisguise.permissionNeeded("disguise.pigman");

        DisguiseCosmetic ironGolemDisguise = new DisguiseCosmetic("golem", "Golem de Fer" , new ItemStack(Material.MONSTER_EGG, 1, EntityType.GHAST.getTypeId()), new String[] {
                "Montrez à tous votre force et",
                "votre puissance !"
        }, DisguiseType.IRON_GOLEM);
        ironGolemDisguise.buyableWithStars(5000);

        DisguiseCosmetic giantDisguise = new DisguiseCosmetic("giant", "Géant", GlowEffect.addGlow(new ItemStack(Material.MONSTER_EGG, 1, EntityType.ZOMBIE.getTypeId())), new String[] {
                "Imposez vous par votre hauteur !"
        }, DisguiseType.GIANT);
        giantDisguise.buyableWithStars(8000);

        DisguiseCosmetic villagerDisguise = new DisguiseCosmetic("villager", "Villageois", new ItemStack(Material.MONSTER_EGG, 1, EntityType.VILLAGER.getTypeId()), new String[] {
                "Arnaquez les joueurs avec vos",
                "échanges hors de prix !"
        }, DisguiseType.VILLAGER);
        villagerDisguise.buyableWithStars(2500);

        DisguiseCosmetic witchDisguise = new DisguiseCosmetic("witch", "Sorcière", new ItemStack(Material.MONSTER_EGG, 1, EntityType.WITCH.getTypeId()), new String[] {
                "Abracadabra !"
        }, DisguiseType.WITCH);
        witchDisguise.buyableWithStars(1000);

        DisguiseCosmetic caveSpiderDisguise = new DisguiseCosmetic("cavespider", "Araignée bleue", new ItemStack(Material.MONSTER_EGG, 1, EntityType.SPIDER.getTypeId()), new String[] {
                "Terrée dans les mineshafts, vous terrorisez les ",
                "joueurs par la menace de votre morsure..."
        }, DisguiseType.CAVE_SPIDER);
        caveSpiderDisguise.buyableWithStars(350);

        DisguiseCosmetic rabbitDisguise = new DisguiseCosmetic("rabbit", "Lapin", new ItemStack(Material.MONSTER_EGG, 1, EntityType.RABBIT.getTypeId()), new String[] {
                "Devenez un petit lapin trop mignon !"
        }, DisguiseType.RABBIT);
        rabbitDisguise.buyableWithStars(1500);

        DisguiseCosmetic endermanDisguise = new DisguiseCosmetic("enderman", "Enderman", new ItemStack(Material.MONSTER_EGG, 1, EntityType.ENDERMAN.getTypeId()), new String[] {
                "Effrayez les autres joueurs avec",
                "votre taille sur-humaine !"
        }, DisguiseType.ENDERMAN);
        endermanDisguise.buyableWithStars(2000);

        DisguiseCosmetic squidDisguise = new DisguiseCosmetic("squid", "Poulpe", new ItemStack(Material.MONSTER_EGG, 1, EntityType.SQUID.getTypeId()), new String[] {
                "`Bloups` `Bloups` `Bloups`"
        }, DisguiseType.SQUID);
        squidDisguise.buyableWithStars(2500);

        DisguiseCosmetic chickenDisguise = new DisguiseCosmetic("chicken", "Poulet", new ItemStack(Material.MONSTER_EGG, 1, EntityType.CHICKEN.getTypeId()), new String[] {
                "Essayez de vous infiltrer dans",
                "la ferme pour voir Mr ou Mme Poulet !"
        }, DisguiseType.CHICKEN);
        chickenDisguise.buyableWithStars(1500);

        DisguiseCosmetic pigDisguise = new DisguiseCosmetic("pig", "Cochon", new ItemStack(Material.MONSTER_EGG, 1, EntityType.PIG.getTypeId()), new String[] {
                "Vous connaissez le dicton :",
                "\"Tout est bon dans le cochon !\""
        }, DisguiseType.PIG);
        pigDisguise.buyableWithStars(1500);

        DisguiseCosmetic sheepDisguise = new DisguiseCosmetic("sheep", "Mouton", new ItemStack(Material.MONSTER_EGG, 1, EntityType.SHEEP.getTypeId()), new String[] {
                "Faites attention à ceux qui",
                "voudraient vous voler votre",
                "somptueuse laine !"
        }, DisguiseType.SHEEP);
        sheepDisguise.buyableWithStars(1500);

        this.registerElement(creeperDisguise);
        this.registerElement(zombieDisguise);
        this.registerElement(pigmanDisguise);
        this.registerElement(ironGolemDisguise);
        this.registerElement(giantDisguise);
        this.registerElement(villagerDisguise);
        this.registerElement(witchDisguise);
        this.registerElement(caveSpiderDisguise);
        this.registerElement(rabbitDisguise);
        this.registerElement(endermanDisguise);
        this.registerElement(squidDisguise);
        this.registerElement(chickenDisguise);
        this.registerElement(pigDisguise);
        this.registerElement(sheepDisguise);
    }
}
