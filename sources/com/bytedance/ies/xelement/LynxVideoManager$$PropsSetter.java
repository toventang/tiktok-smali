package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxVideoManager$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(21954);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxVideoManager lynxVideoManager = (LynxVideoManager) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1664825047:
                if (str.equals("singleplayer")) {
                    lynxVideoManager.setSinglePlayer(vVar.a(str, false));
                    return;
                }
                break;
            case -1596019157:
                if (str.equals("videowidth")) {
                    lynxVideoManager.setVideoWidth(vVar.a(str, 0));
                    return;
                }
                break;
            case -1531319052:
                if (str.equals("performanceLog")) {
                    lynxVideoManager.setPerformanceLog(vVar.c(str));
                    return;
                }
                break;
            case -1489589134:
                if (str.equals("objectfit")) {
                    lynxVideoManager.setObjectFit(vVar.c(str));
                    return;
                }
                break;
            case -982450867:
                if (str.equals("poster")) {
                    lynxVideoManager.setPoster(vVar.f(str));
                    return;
                }
                break;
            case -894681731:
                if (str.equals("__control")) {
                    lynxVideoManager.setControl(vVar.c(str));
                    return;
                }
                break;
            case -810883302:
                if (str.equals("volume")) {
                    lynxVideoManager.setVolume(vVar.a(str, 0.0f));
                    return;
                }
                break;
            case -318476791:
                if (str.equals("preload")) {
                    lynxVideoManager.setPreload(vVar.a(str, false));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxVideoManager.setSrc(vVar.f(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxVideoManager.setLoop(vVar.a(str, false));
                    return;
                }
                break;
            case 3493088:
                if (str.equals("rate")) {
                    lynxVideoManager.setRate(vVar.a(str, 0));
                    return;
                }
                break;
            case 104264043:
                if (str.equals("muted")) {
                    lynxVideoManager.setMuted(vVar.a(str, false));
                    return;
                }
                break;
            case 269397981:
                if (str.equals("inittime")) {
                    lynxVideoManager.setInitTime(vVar.a(str, 0));
                    return;
                }
                break;
            case 850708551:
                if (str.equals("log-extra")) {
                    lynxVideoManager.setLogExtra(vVar.e(str));
                    return;
                }
                break;
            case 894041755:
                if (str.equals("autolifecycle")) {
                    lynxVideoManager.setAutoLifecycle(vVar.a(str, false));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxVideoManager.setAutoPlay(vVar.a(str, false));
                    return;
                }
                break;
            case 1630018914:
                if (str.equals("videoheight")) {
                    lynxVideoManager.setVideoHeight(vVar.a(str, 0));
                    return;
                }
                break;
            case 1933829272:
                if (str.equals("devicechangeaware")) {
                    lynxVideoManager.setDeviceChangeAware(vVar.a(str, false));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
