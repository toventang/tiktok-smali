package com.lynx.tasm.behavior.ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class AbsUIImage$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(35098);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        AbsUIImage absUIImage = (AbsUIImage) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    absUIImage.setCapInsetsScale(vVar.c(str));
                    return;
                }
                break;
            case -1249491252:
                if (str.equals("cover-start")) {
                    absUIImage.setCoverStart(vVar.a(str, false));
                    return;
                }
                break;
            case -934531685:
                if (str.equals("repeat")) {
                    absUIImage.setRepeat(vVar.a(str, false));
                    return;
                }
                break;
            case -629825370:
                if (str.equals("loop-count")) {
                    absUIImage.setLoopCount(vVar.a(str, 0));
                    return;
                }
                break;
            case -256430480:
                if (str.equals("prefetch-width")) {
                    absUIImage.setPreFetchWidth(vVar.c(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    absUIImage.setSource(vVar.c(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    absUIImage.setObjectFit(vVar.c(str));
                    return;
                }
                break;
            case 207594941:
                if (str.equals("prefetch-height")) {
                    absUIImage.setPreFetchHeight(vVar.c(str));
                    return;
                }
                break;
            case 516005201:
                if (str.equals("cap-insets")) {
                    absUIImage.setCapInsetsBackUp(vVar.c(str));
                    return;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    absUIImage.setPlaceholder(vVar.c(str));
                    return;
                }
                break;
            case 681292984:
                if (str.equals("blur-radius")) {
                    absUIImage.setBlurRadius(vVar.c(str));
                    return;
                }
                break;
            case 1198809474:
                if (str.equals("disable-default-placeholder")) {
                    absUIImage.setDisableDefaultPlaceholder(vVar.a(str, false));
                    return;
                }
                break;
            case 1515751784:
                if (str.equals("capInsets")) {
                    absUIImage.setCapInsets(vVar.c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
