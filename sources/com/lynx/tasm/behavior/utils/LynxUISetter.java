package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.v;

public interface LynxUISetter<T extends LynxBaseUI> extends Settable {
    static {
        Covode.recordClassIndex(35215);
    }

    void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar);
}
