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

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("singularity");
                dialog.cont.add("Pray for the miracles...").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("singularity-mod-omega-singularity")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        SingularityItems.load();
        Log.info("Loading some example content.");
    }
}
