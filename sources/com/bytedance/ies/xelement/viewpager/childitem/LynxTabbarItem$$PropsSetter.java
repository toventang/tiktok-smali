package com.bytedance.ies.xelement.viewpager.childitem;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxTabbarItem$$PropsSetter extends UIGroup$$PropsSetter {
    static {
        Covode.recordClassIndex(22581);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) lynxBaseUI;
        str.hashCode();
        if (!str.equals("select")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxTabbarItem.setSelect(vVar.a(str, false));
        }
    }
}