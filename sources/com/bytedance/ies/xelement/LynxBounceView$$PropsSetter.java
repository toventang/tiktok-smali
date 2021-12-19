package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxBounceView$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(21911);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxBounceView lynxBounceView = (LynxBounceView) lynxBaseUI;
        str.hashCode();
        if (!str.equals("direction")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxBounceView.setDirection(vVar.f(str));
        }
    }
}
