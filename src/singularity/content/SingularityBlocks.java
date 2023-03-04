package ExpandedIndustries.content;

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




public class EIBlocks {

    public static Block miracle;
    
    public static void load() {
        miracle = new ItemTurret("miracle") {{
            requirements(Category.turret, with(Items.copper, 45, Items.lead, 20));
            ammo(
                    Items.scrap, new BasicBulletType(2f, 8) {{
                        width = 6f;
                        height = 8f;
                        lifetime = 60f;
                        fragBullets = 4;
                        reloadMultiplier = 0.66f;
                        fragBullet = new BasicBulletType(1f, 5) {{
                            splashDamage = 3f;
                            splashDamageRadius = 40f;
                            height = 5f;
                            width = 3f;
                            lifetime = 20f;
                        }};
                    }},
                    Items.lead, new BasicBulletType(2f, 7) {{
                        width = 6f;
                        height = 8f;
                        lifetime = 60f;
                        ammoMultiplier = 2;
                        fragBullets = 3;
                        fragBullet = new BasicBulletType(1f, 4) {{
                            splashDamage = 2f;
                            splashDamageRadius = 40f;
                            height = 5f;
                            width = 3f;
                            lifetime = 20f;
                        }};
                    }},
                    Items.metaglass, new BasicBulletType(3f, 14) {{
                        width = 6f;
                        height = 8f;
                        lifetime = 75f;
                        ammoMultiplier = 4;
                        fragBullets = 6;
                        fragBullet = new BasicBulletType(1f, 7) {{
                            splashDamage = 6f;
                            splashDamageRadius = 40f;
                            height = 5f;
                            width = 3f;
                            lifetime = 30f;
                        }};
                    }}
            );

            reload = 20f;
            range = 120;
            shootCone = 15f;
            ammoUseEffect = Fx.casing1;
            health = 320;
            inaccuracy = 1f;
            rotateSpeed = 7.2f;
            coolant = consumeCoolant(0.1f);

            limitRange();
        }};
        
    }
}
