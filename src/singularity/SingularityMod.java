package singularity;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import singularity.content.*; // import the Singularity content

public class SingularityMod extends Mod{
    public SingularityMod(){
        Log.info("Loaded SingulaityMod constructor.");
        
        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("hi");
                dialog.cont.add("Pray for the miracle..").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("singularity-mod-omega-singulaity")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }
    
    @Override
    public void loadContent(){
        SingularityBlocks.load();
        SingularityItems.load();
        Log.info("Loading some example content.");
    }
}
