package singularity.content;

import arc.graphics.*;
import mindustry.type.*;

public class Items {
     public static Item omega-singularity;

    public static void load(){
        omega-singularity = new Item("omegaSingularity", Color.valueOf("ffffff")){{
            flammability = 100.0f;
            radioactivity = 100.0f;
            explosiveness = 100.0;
            charge = 100.0f;
            cost = 100.0f;
            hardness = 100;
        }};
    }
}
