package com.lynx.tasm.behavior.ui;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.v;

public class LynxFlattenUI$$PropsSetter extends LynxBaseUI$$PropsSetter {
    static {
        Covode.recordClassIndex(35028);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxFlattenUI lynxFlattenUI = (LynxFlattenUI) lynxBaseUI;
        str.hashCode();
        if (str.equals("opacity")) {
            lynxFlattenUI.setAlpha(vVar.a(str, 1.0f));
        } else if (!str.equals("transform")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxFlattenUI.setTransform(vVar.d(str));
        }
    }
}
