package com.bytedance.ies.xelement.reveal;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxRevealView$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(22496);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxRevealView lynxRevealView = (LynxRevealView) lynxBaseUI;
        try {
            if (str.hashCode() == 3357091 && str.equals("mode")) {
                lynxRevealView.setRevealLayoutMode(vVar.c(str));
            } else {
                super.setProperty(lynxBaseUI, str, vVar);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new RuntimeException("setProperty error: " + str + "\n" + e2.toString());
        }
    }
}
