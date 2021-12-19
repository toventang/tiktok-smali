package com.lynx.tasm.behavior.ui.text;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class FlattenUIText$$PropsSetter extends LynxFlattenUI$$PropsSetter {
    static {
        Covode.recordClassIndex(35174);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        FlattenUIText flattenUIText = (FlattenUIText) lynxBaseUI;
        str.hashCode();
        if (!str.equals(b.f37372a)) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            flattenUIText.setColor(vVar.f(str));
        }
    }
}
