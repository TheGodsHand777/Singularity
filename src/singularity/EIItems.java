package ExpandedIndustries.content;

import arc.graphics.*;
import mindustry.type.*;

public class EIItems {
     public static Item starium, peridotium, lumium, stariumAlloy, enhancedPeridotium, ice, solidFuel, neorium, teranite;

    public static void load(){
        starium = new Item("starium", Color.valueOf("4c4379")){{
            hardness = 4;
        }};

        peridotium = new Item("peridotium", Color.valueOf("45bb49")){{
            explosiveness = 2.2f;
            radioactivity = 1.1f;
            flammability = 1.3f;
            hardness = 3;
        }};

        lumium = new Item("lumium", Color.valueOf("AAFF00")){{
            charge = 2.8f;
            explosiveness = 1.2f;
        }};

        stariumAlloy = new Item("starium-alloy", Color.valueOf("4c4590")){{
            charge = 2.35f;
            cost = 1.3f;
        }};

        enhancedPeridotium = new Item("enhanced-peridotium", Color.valueOf("3E920B")){{
            flammability = 0.5f;
            radioactivity = 1.7f;
            explosiveness = 0.4f;
        }};

        omegaSingularity = new Item("omega-singularity", Color.valueOf("ffffff")){{
            flammability = 100.0f;
            radioactivity = 100.0f;
            explosiveness = 100.0;
            charge = 100.0f;
            cost = 100.0f;
            hardness = 100;
        }};

        ice = new Item("ice", Color.valueOf("C2BFFBFF"));

        solidFuel = new Item("solid-fuel", Color.valueOf("9E9E9E")){{
            flammability = 3.5f;
            explosiveness = 1.3f;
        }};
    }
}
