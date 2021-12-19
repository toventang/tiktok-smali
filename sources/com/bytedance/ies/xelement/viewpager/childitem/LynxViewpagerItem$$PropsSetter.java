package com.bytedance.ies.xelement.viewpager.childitem;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxViewpagerItem$$PropsSetter extends UIGroup$$PropsSetter {
    static {
        Covode.recordClassIndex(22586);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
        str.hashCode();
        if (!str.equals("tag")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxViewpagerItem.setTag(vVar.c(str));
        }
    }
}
