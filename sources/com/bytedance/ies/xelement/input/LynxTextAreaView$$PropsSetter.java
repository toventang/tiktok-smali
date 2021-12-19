package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.v;

public class LynxTextAreaView$$PropsSetter extends LynxBaseInputView$$PropsSetter {
    static {
        Covode.recordClassIndex(22325);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.bytedance.ies.xelement.input.LynxBaseInputView$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1550570986:
                if (str.equals("richtype")) {
                    lynxTextAreaView.setRichType(vVar.c(str));
                    return;
                }
                break;
            case -428786256:
                if (str.equals("max-height")) {
                    lynxTextAreaView.setMaxHeight(vVar.c(str));
                    return;
                }
                break;
            case 419784731:
                if (str.equals("maxlines")) {
                    lynxTextAreaView.setMaxLines(vVar.a(str, Integer.MAX_VALUE));
                    return;
                }
                break;
            case 2043213058:
                if (str.equals("min-height")) {
                    lynxTextAreaView.setMinHeight(vVar.c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
