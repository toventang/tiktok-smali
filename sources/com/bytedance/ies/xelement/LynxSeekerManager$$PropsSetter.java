package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxSeekerManager$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(21949);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxSeekerManager lynxSeekerManager = (LynxSeekerManager) lynxBaseUI;
        str.hashCode();
        if (str.equals("duration")) {
            lynxSeekerManager.setDuration(vVar.a(str, 0));
        } else if (!str.equals("currentDuration")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxSeekerManager.setProgress(vVar.a(str, 0));
        }
    }
}
