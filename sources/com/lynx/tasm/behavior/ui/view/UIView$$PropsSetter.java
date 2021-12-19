package com.lynx.tasm.behavior.ui.view;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.v;

public class UIView$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(35209);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        UIView uIView = (UIView) lynxBaseUI;
        str.hashCode();
        if (!str.equals("impression_id")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            uIView.setImpressionId(vVar.c(str));
        }
    }
}
