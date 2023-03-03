package singularity;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import singularity.content.SingularityItems; // import the SingularityItems class

public class SingularityMod extends Mod{

    public SingularityMod(){
        Log.info("Loaded SingulaityMod constructor.");
    }

    @Override
    public void loadContent(){
        SingularityItems.load();
        Log.info("Loading some example content.");
    }
}
