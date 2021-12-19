package com.lynx.tasm.behavior.ui.list;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.v;

public class UIList$$PropsSetter extends AbsLynxList$$PropsSetter {
    static {
        Covode.recordClassIndex(35109);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.list.AbsLynxList$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        UIList uIList = (UIList) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1035189822:
                if (str.equals("enable-new-exposure-strategy")) {
                    uIList.setNewAppear(vVar.a(str, false));
                    return;
                }
                break;
            case 1683042429:
                if (str.equals("android-diffable")) {
                    uIList.setDiffable(vVar.f(str));
                    return;
                }
                break;
            case 1816872768:
                if (str.equals("auto-measure")) {
                    uIList.setAutoMeasure(vVar.f(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
