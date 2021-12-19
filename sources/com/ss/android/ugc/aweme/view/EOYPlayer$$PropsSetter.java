package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;
import com.lynx.tasm.behavior.v;

public class EOYPlayer$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(94235);
    }

    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
        EOYPlayer eOYPlayer = (EOYPlayer) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case 114148:
                if (str.equals("src")) {
                    eOYPlayer.setSrc(vVar.f(str));
                    return;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    eOYPlayer.switchPlay(vVar.a(str, false));
                    return;
                }
                break;
            case 104264043:
                if (str.equals("muted")) {
                    eOYPlayer.setMuted(vVar.a(str, false));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
