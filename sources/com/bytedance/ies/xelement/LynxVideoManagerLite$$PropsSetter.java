package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxVideoManagerLite$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(21959);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxVideoManagerLite lynxVideoManagerLite = (LynxVideoManagerLite) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1699818261:
                if (str.equals("enableplaylistener")) {
                    lynxVideoManagerLite.setEnablePlayListener(vVar.a(str, false));
                    return;
                }
                break;
            case -1664825047:
                if (str.equals("singleplayer")) {
                    lynxVideoManagerLite.setSinglePlayer(vVar.a(str, false));
                    return;
                }
                break;
            case -1531319052:
                if (str.equals("performanceLog")) {
                    lynxVideoManagerLite.setPerformanceLog(vVar.c(str));
                    return;
                }
                break;
            case -1489589134:
                if (str.equals("objectfit")) {
                    lynxVideoManagerLite.setObjectFit(vVar.c(str));
                    return;
                }
                break;
            case -982450867:
                if (str.equals("poster")) {
                    lynxVideoManagerLite.setPoster(vVar.f(str));
                    return;
                }
                break;
            case -894681731:
                if (str.equals("__control")) {
                    lynxVideoManagerLite.setControl(vVar.c(str));
                    return;
                }
                break;
            case -810883302:
                if (str.equals("volume")) {
                    lynxVideoManagerLite.setVolume(vVar.a(str, 0.0f));
                    return;
                }
                break;
            case -318476791:
                if (str.equals("preload")) {
                    lynxVideoManagerLite.setPreload(vVar.a(str, false));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxVideoManagerLite.setSrc(vVar.f(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxVideoManagerLite.setLoop(vVar.a(str, false));
                    return;
                }
                break;
            case 3493088:
                if (str.equals("rate")) {
                    lynxVideoManagerLite.setRate(vVar.a(str, 0));
                    return;
                }
                break;
            case 104264043:
                if (str.equals("muted")) {
                    lynxVideoManagerLite.setMuted(vVar.a(str, false));
                    return;
                }
                break;
            case 269397981:
                if (str.equals("inittime")) {
                    lynxVideoManagerLite.setInitTime(vVar.a(str, 0));
                    return;
                }
                break;
            case 850708551:
                if (str.equals("log-extra")) {
                    lynxVideoManagerLite.setLogExtra(vVar.e(str));
                    return;
                }
                break;
            case 894041755:
                if (str.equals("autolifecycle")) {
                    lynxVideoManagerLite.setAutoLifecycle(vVar.a(str, false));
                    return;
                }
                break;
            case 1331794760:
                if (str.equals("video-tag")) {
                    lynxVideoManagerLite.setVideoTag(vVar.c(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxVideoManagerLite.setAutoPlay(vVar.a(str, false));
                    return;
                }
                break;
            case 1933829272:
                if (str.equals("devicechangeaware")) {
                    lynxVideoManagerLite.setDeviceChangeAware(vVar.a(str, false));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
