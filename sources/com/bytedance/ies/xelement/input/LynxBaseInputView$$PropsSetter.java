package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxBaseInputView$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(22309);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxBaseInputView lynxBaseInputView = (LynxBaseInputView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1988401764:
                if (str.equals("letter-spacing")) {
                    lynxBaseInputView.setLetterSpacing(vVar.a(str, 0.0f));
                    return;
                }
                break;
            case -1730062511:
                if (str.equals("smart-scroll")) {
                    lynxBaseInputView.setSmartScroll(vVar.a(str, true));
                    return;
                }
                break;
            case -1586082113:
                if (str.equals(b.f37373b)) {
                    lynxBaseInputView.setFontTextSize(vVar.f(str));
                    return;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    lynxBaseInputView.setLynxDirection(vVar.a(str, 3));
                    return;
                }
                break;
            case -866730430:
                if (str.equals("readonly")) {
                    lynxBaseInputView.setIsReadOnly(vVar.a(str, false));
                    return;
                }
                break;
            case -525534091:
                if (str.equals("fullscreen-mode")) {
                    lynxBaseInputView.setKeyBoardFullscreenMode(vVar.a(str, true));
                    return;
                }
                break;
            case -445272125:
                if (str.equals("show-soft-input-onfocus")) {
                    lynxBaseInputView.setShowSoftInputOnFocus(vVar.a(str, true));
                    return;
                }
                break;
            case -140393755:
                if (str.equals("placeholder-font-size")) {
                    lynxBaseInputView.setPlaceholderTextSize(vVar.f(str));
                    return;
                }
                break;
            case 3575610:
                if (str.equals(StringSet.type)) {
                    lynxBaseInputView.setInputType(vVar.c(str));
                    return;
                }
                break;
            case 94842723:
                if (str.equals(b.f37372a)) {
                    lynxBaseInputView.setFontColor(vVar.f(str));
                    return;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    lynxBaseInputView.setFocus(vVar.a(str, false));
                    return;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    lynxBaseInputView.setInputValue(vVar.c(str));
                    return;
                }
                break;
            case 124732746:
                if (str.equals("maxlength")) {
                    lynxBaseInputView.setMaxLength(vVar.f(str));
                    return;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    lynxBaseInputView.setDisable(vVar.a(str, false));
                    return;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    lynxBaseInputView.setPlaceholder(vVar.c(str));
                    return;
                }
                break;
            case 746232421:
                if (str.equals("text-align")) {
                    lynxBaseInputView.setTextAlign(vVar.a(str, 0));
                    return;
                }
                break;
            case 1101235489:
                if (str.equals("adjust-mode")) {
                    lynxBaseInputView.setAdjustMode(vVar.c(str));
                    return;
                }
                break;
            case 1155760891:
                if (str.equals("bottom-inset")) {
                    lynxBaseInputView.setBottomInset(vVar.c(str));
                    return;
                }
                break;
            case 1437560563:
                if (str.equals("auto-fit")) {
                    lynxBaseInputView.setAutoFit(vVar.a(str, true));
                    return;
                }
                break;
            case 1782197877:
                if (str.equals("enableAutoFill")) {
                    lynxBaseInputView.setIsAutoFillEnabled(vVar.a(str, false));
                    return;
                }
                break;
            case 1901673625:
                if (str.equals("caret-color")) {
                    lynxBaseInputView.setCursorColor(vVar.c(str));
                    return;
                }
                break;
            case 2018420361:
                if (str.equals("placeholder-color")) {
                    lynxBaseInputView.setPlaceholderColor(vVar.f(str));
                    return;
                }
                break;
            case 2033358039:
                if (str.equals("placeholder-style")) {
                    lynxBaseInputView.setPlaceHolderStyle(vVar.e(str));
                    return;
                }
                break;
            case 2051146279:
                if (str.equals("confirm-type")) {
                    lynxBaseInputView.setConfirmType(vVar.c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
