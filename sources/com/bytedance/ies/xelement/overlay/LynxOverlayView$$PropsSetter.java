package com.bytedance.ies.xelement.overlay;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class LynxOverlayView$$PropsSetter extends UIGroup$$PropsSetter {
    static {
        Covode.recordClassIndex(22361);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        LynxOverlayView lynxOverlayView = (LynxOverlayView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1952821320:
                if (str.equals("overlay-id")) {
                    lynxOverlayView.setOverlayId(vVar.c(str));
                    return;
                }
                break;
            case -1389050563:
                if (str.equals("events-pass-through")) {
                    lynxOverlayView.setEventsPassThrough(vVar.f(str));
                    return;
                }
                break;
            case -939362323:
                if (str.equals("cut-out-mode")) {
                    lynxOverlayView.setCutOutMode(vVar.a(str, false));
                    return;
                }
                break;
            case -243354428:
                if (str.equals("status-bar-translucent")) {
                    lynxOverlayView.setStatusBarTranslucent(vVar.f(str));
                    return;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    lynxOverlayView.setVisible(vVar.f(str));
                    return;
                }
                break;
            case 1860950378:
                if (str.equals("full-screen")) {
                    lynxOverlayView.setFullScreen(vVar.a(str, false));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
