package com.lynx.tasm.behavior.ui.text;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class UIText$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(35178);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        UIText uIText = (UIText) lynxBaseUI;
        str.hashCode();
        if (str.equals(b.f37372a)) {
            uIText.setColor(vVar.f(str));
        } else if (!str.equals("accessibility-label")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            uIText.setAccessibilityLabel(vVar.f(str));
        }
    }
}
