package com.lynx.tasm.behavior.ui.view;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.v;

public class UIComponent$$PropsSetter extends UIView$$PropsSetter {
    static {
        Covode.recordClassIndex(35203);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        UIComponent uIComponent = (UIComponent) lynxBaseUI;
        str.hashCode();
        if (!str.equals("item-key")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            uIComponent.setItemKey(vVar.c(str));
        }
    }
}
