package com.lynx.tasm.ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.image.AbsUIImage$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class UIImage$$PropsSetter extends AbsUIImage$$PropsSetter {
    static {
        Covode.recordClassIndex(35419);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.ui.image.AbsUIImage$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        Boolean valueOf;
        UIImage uIImage = (UIImage) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    uIImage.setCapInsetsScale(vVar.c(str));
                    return;
                }
                break;
            case -1338903714:
                if (str.equals("skip-redirection")) {
                    uIImage.setSkipRedirection(vVar.a(str, false));
                    return;
                }
                break;
            case -1138223116:
                if (str.equals("image-config")) {
                    uIImage.setImageConfig(vVar.c(str));
                    return;
                }
                break;
            case -602643660:
                if (str.equals("fresco-nine-patch")) {
                    uIImage.setFrescoNinePatch(vVar.a(str, false));
                    return;
                }
                break;
            case 313009824:
                if (str.equals("local-cache")) {
                    if (vVar.b(str)) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(vVar.a(str, false));
                    }
                    uIImage.setLocalCache(valueOf);
                    return;
                }
                break;
            case 512852970:
                if (str.equals("subsample")) {
                    uIImage.setSubSample(vVar.c(str));
                    return;
                }
                break;
            case 516005201:
                if (str.equals("cap-insets")) {
                    uIImage.setCapInsetsBackUp(vVar.c(str));
                    return;
                }
                break;
            case 1090746891:
                if (str.equals("fresco-visible")) {
                    uIImage.setFrescoVisible(vVar.c(str));
                    return;
                }
                break;
            case 1245269388:
                if (str.equals("fresco-attach")) {
                    uIImage.setFrescoAttach(vVar.c(str));
                    return;
                }
                break;
            case 1672916293:
                if (str.equals("fix-fresco-bug")) {
                    uIImage.fixFrescoWebPBug(vVar.a(str, false));
                    return;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    uIImage.setVisibility(vVar.a(str, 0));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
