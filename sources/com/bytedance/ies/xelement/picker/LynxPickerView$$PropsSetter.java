package com.bytedance.ies.xelement.picker;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxPickerView$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(22378);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxPickerView lynxPickerView = (LynxPickerView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1274708295:
                if (str.equals("fields")) {
                    lynxPickerView.setFields(vVar.c(str));
                    return;
                }
                break;
            case -854975978:
                if (str.equals("confirm-color")) {
                    lynxPickerView.setConfirmColor(vVar.c(str));
                    return;
                }
                break;
            case -752785969:
                if (str.equals("range-key")) {
                    lynxPickerView.setRangeKey(vVar.f(str));
                    return;
                }
                break;
            case -586660946:
                if (str.equals("title-color")) {
                    lynxPickerView.setTitleColor(vVar.c(str));
                    return;
                }
                break;
            case -271594562:
                if (str.equals("confirm-string")) {
                    lynxPickerView.setConfirmString(vVar.c(str));
                    return;
                }
                break;
            case -28424822:
                if (str.equals("title-font-size")) {
                    lynxPickerView.setTitleFontSize(vVar.c(str));
                    return;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    lynxPickerView.setEnd(vVar.c(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    lynxPickerView.setMode(vVar.c(str));
                    return;
                }
                break;
            case 49495748:
                if (str.equals("cancel-string")) {
                    lynxPickerView.setCancelString(vVar.c(str));
                    return;
                }
                break;
            case 108280125:
                if (str.equals("range")) {
                    lynxPickerView.setRange(vVar.f(str));
                    return;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    lynxPickerView.setStart(vVar.c(str));
                    return;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    lynxPickerView.setTitle(vVar.c(str));
                    return;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    lynxPickerView.setValue(vVar.f(str));
                    return;
                }
                break;
            case 1372139088:
                if (str.equals("cancel-color")) {
                    lynxPickerView.setCancelColor(vVar.c(str));
                    return;
                }
                break;
            case 1732829925:
                if (str.equals("separator")) {
                    lynxPickerView.setSeparator(vVar.c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
