package com.bytedance.ies.xelement.pickview;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxPickerViewColumn$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(22451);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxPickerViewColumn lynxPickerViewColumn = (LynxPickerViewColumn) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -752785969:
                if (str.equals("range-key")) {
                    lynxPickerViewColumn.setRangeKey(vVar.f(str));
                    return;
                }
                break;
            case -208291852:
                if (str.equals("visible-count")) {
                    lynxPickerViewColumn.setVisibleCount(vVar.c(str));
                    return;
                }
                break;
            case 108280125:
                if (str.equals("range")) {
                    lynxPickerViewColumn.setRange(vVar.f(str));
                    return;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    lynxPickerViewColumn.setValue(vVar.f(str));
                    return;
                }
                break;
            case 1256871824:
                if (str.equals("mask-style")) {
                    lynxPickerViewColumn.setMaskStyle(vVar.c(str));
                    return;
                }
                break;
            case 2065426547:
                if (str.equals("indicator-style")) {
                    lynxPickerViewColumn.setIndicatorStyle(vVar.c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
