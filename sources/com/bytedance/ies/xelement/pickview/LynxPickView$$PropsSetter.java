package com.bytedance.ies.xelement.pickview;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxPickView$$PropsSetter extends UIView$$PropsSetter {
    static {
        Covode.recordClassIndex(22448);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxPickView lynxPickView = (LynxPickView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -208291852:
                if (str.equals("visible-count")) {
                    lynxPickView.setVisibleCount(vVar.c(str));
                    return;
                }
                break;
            case 1256871824:
                if (str.equals("mask-style")) {
                    lynxPickView.setMaskStyle(vVar.c(str));
                    return;
                }
                break;
            case 2065426547:
                if (str.equals("indicator-style")) {
                    lynxPickView.setIndicatorStyle(vVar.c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
