package com.lynx.component.svg;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class UISvg$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(34626);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        UISvg uISvg = (UISvg) lynxBaseUI;
        try {
            int hashCode = str.hashCode();
            if (hashCode != 114148) {
                if (hashCode == 951530617) {
                    if (str.equals("content")) {
                        uISvg.setContent(vVar.c(str));
                        return;
                    }
                }
            } else if (str.equals("src")) {
                uISvg.setSource(vVar.c(str));
                return;
            }
            super.setProperty(lynxBaseUI, str, vVar);
        } catch (Exception e2) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e2.toString());
        }
    }
}
