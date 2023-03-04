package singularity.content;

import arc.graphics.Color;
import arc.math.Interp;
import arc.struct.EnumSet;
import arc.struct.Seq;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.pattern.ShootAlternate;
import mindustry.gen.Sounds;
import mindustry.graphics.CacheLayer;
import mindustry.graphics.Layer;
import mindustry.type.*;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.blocks.defense.MendProjector;
import mindustry.world.blocks.defense.OverdriveProjector;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.LogicBlock;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.content.Fx.none;
import static mindustry.type.ItemStack.with;




public class SingularityBlocks {

    public static Block miracle, omegaFuser;
    
    public static void load() {
        miracle = new ItemTurret("miracle"){{
            requirements(Category.turret, with(Items.copper, 100, Items.graphite, 80, Items.titanium, 50));
            ammo(
                Items.copper,  new BasicBulletType(2.5f, 11){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                    ammoMultiplier = 2;
                }},
                Items.graphite, new ArtilleryBulletType(3f, 20){{
                    knockback = 0.8f;
                    reloadMultiplier = 0.5f;
                    lifetime = 80f;
                    width = height = 11f;
                    collidesTiles = false;
                    splashDamageRadius = 25f * 0.75f;
                    splashDamage = 33f;
                }},
                Liquids.water,new LiquidBulletType(Liquids.water){{
                    knockback = 2f;
                    reloadMultiplier = 1.5f;
                    drag = 0.01f;
                    layer = Layer.bullet - 2f;
                }},
                }},
                Items.blastCompound, new MissileBulletType(3.7f, 10){{
                    reloadMultiplier = 0.3f;
                    width = 16f;
                    height = 16f;
                    shrinkY = 0f;
                    splashDamageRadius = 30f;
                    splashDamage = 30f * 1.5f;
                    ammoMultiplier = 5f;
                    hitEffect = Fx.blastExplosion;
                    despawnEffect = Fx.blastExplosion;

                    status = StatusEffects.blasted;
                    statusDuration = 60f;
                }},
                Items.silicon, new BasicBulletType(3f, 15, "bullet"){{
                    width = 7f;
                    height = 9f;
                    homingPower = 0.1f;
                    reloadMultiplier = 1.5f;
                    ammoMultiplier = 5;
                    lifetime = 60f;
                }},
                Items.thorium, new BasicBulletType(4f, 29, "bullet"){{
                    width = 10f;
                    height = 13f;
                    shootEffect = Fx.shootBig;
                    smokeEffect = Fx.shootBigSmoke;
                    ammoMultiplier = 4;
                    lifetime = 60f;
                }}
            );

            size = 2;
            range = 190f;
            reload = 31f;
            consumeAmmoOnce = false;
            ammoEjectBack = 3f;
            recoil = 3f;
            shake = 1f;
            shoot.shots = 4;
            shoot.shotDelay = 3f;

            ammoUseEffect = Fx.casing2;
            scaledHealth = 240;
            shootSound = Sounds.shootBig;

            limitRange();
        }};
        
    }
}
