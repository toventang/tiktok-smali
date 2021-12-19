package com.bytedance.ies.xelement.alphavideo;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxAlphaVideo$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(21977);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -2133601602:
                if (str.equals("keep-last-frame")) {
                    lynxAlphaVideo.setKeepLastFrame(vVar.a(str, false));
                    return;
                }
                break;
            case -982450867:
                if (str.equals("poster")) {
                    lynxAlphaVideo.setPoster(vVar.c(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxAlphaVideo.setSrc(vVar.c(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxAlphaVideo.setLoop(vVar.a(str, false));
                    return;
                }
                break;
            case 838895478:
                if (str.equals("last-frame")) {
                    lynxAlphaVideo.setLastFrame(vVar.c(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxAlphaVideo.setAutoPlay(vVar.a(str, true));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
