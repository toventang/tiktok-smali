package com.bytedance.xelement.experiment.richtext;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class ExperimentRichTextUI$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(28230);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        ExperimentRichTextUI experimentRichTextUI = (ExperimentRichTextUI) lynxBaseUI;
        str.hashCode();
        if (!str.equals("html")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            experimentRichTextUI.setSpan(vVar.c(str));
        }
    }
}
