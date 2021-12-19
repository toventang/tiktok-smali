package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.v;

public class LynxInputView$$PropsSetter extends LynxBaseInputView$$PropsSetter {
    static {
        Covode.recordClassIndex(22320);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.bytedance.ies.xelement.input.LynxBaseInputView$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxInputView lynxInputView = (LynxInputView) lynxBaseUI;
        str.hashCode();
        if (!str.equals("password")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxInputView.setIsPassword(vVar.a(str, false));
        }
    }
}
