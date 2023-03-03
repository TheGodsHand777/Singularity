package singularity.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class Items {
    public static Item omegaSingularity;

    public static void load() {
        omegaSingularity = new Item("omegaSingularity", Color.valueOf("ffffff")) {{
            flammability = 100.0f;
            radioactivity = 100.0f;
            explosiveness = 100.0f;
            charge = 100.0f;
            cost = 100.0f;
            hardness = 100;
        }};
    }
}
