package com.lynx.tasm.ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class FlattenUIImage$$PropsSetter extends LynxFlattenUI$$PropsSetter {
    static {
        Covode.recordClassIndex(35396);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        Boolean valueOf;
        FlattenUIImage flattenUIImage = (FlattenUIImage) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    flattenUIImage.setCapInsetsScale(vVar.c(str));
                    return;
                }
                break;
            case -1338903714:
                if (str.equals("skip-redirection")) {
                    flattenUIImage.setSkipRedirection(vVar.a(str, false));
                    return;
                }
                break;
            case -1138223116:
                if (str.equals("image-config")) {
                    flattenUIImage.setImageConfig(vVar.c(str));
                    return;
                }
                break;
            case -934531685:
                if (str.equals("repeat")) {
                    flattenUIImage.setRepeat(vVar.a(str, false));
                    return;
                }
                break;
            case -629825370:
                if (str.equals("loop-count")) {
                    flattenUIImage.setLoopCount(vVar.a(str, 0));
                    return;
                }
                break;
            case -602643660:
                if (str.equals("fresco-nine-patch")) {
                    flattenUIImage.setFrescoNinePatch(vVar.a(str, false));
                    return;
                }
                break;
            case -256430480:
                if (str.equals("prefetch-width")) {
                    flattenUIImage.setPreFetchWidth(vVar.c(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    flattenUIImage.setSource(vVar.c(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    flattenUIImage.setObjectFit(vVar.c(str));
                    return;
                }
                break;
            case 207594941:
                if (str.equals("prefetch-height")) {
                    flattenUIImage.setPreFetchHeight(vVar.c(str));
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
                    flattenUIImage.setLocalCache(valueOf);
                    return;
                }
                break;
            case 516005201:
                if (str.equals("cap-insets")) {
                    flattenUIImage.setCapInsetsBackUp(vVar.c(str));
                    return;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    flattenUIImage.setPlaceholder(vVar.c(str));
                    return;
                }
                break;
            case 681292984:
                if (str.equals("blur-radius")) {
                    flattenUIImage.setBlurRadius(vVar.c(str));
                    return;
                }
                break;
            case 1515751784:
                if (str.equals("capInsets")) {
                    flattenUIImage.setCapInsets(vVar.c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
