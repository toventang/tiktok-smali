package com.lynx.tasm.behavior.ui.canvas;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxHeliumCanvas$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(35084);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxHeliumCanvas lynxHeliumCanvas = (LynxHeliumCanvas) lynxBaseUI;
        str.hashCode();
        if (!str.equals("consume-android-events")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxHeliumCanvas.setConsumeAllEvents(vVar.a(str, false));
        }
    }
}
