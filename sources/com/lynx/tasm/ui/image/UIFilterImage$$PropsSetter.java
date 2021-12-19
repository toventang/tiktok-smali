package com.lynx.tasm.ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.v;

public class UIFilterImage$$PropsSetter extends UIImage$$PropsSetter {
    static {
        Covode.recordClassIndex(35415);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.ui.image.AbsUIImage$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.ui.image.UIImage$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        UIFilterImage uIFilterImage = (UIFilterImage) lynxBaseUI;
        str.hashCode();
        if (!str.equals("drop-shadow")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            uIFilterImage.setDropShadow(vVar.c(str));
        }
    }
}
