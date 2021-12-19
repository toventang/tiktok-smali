package com.bytedance.ies.bullet.kit.lynx.model;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.utils.a;
import h.f.b.l;

public class LynxUIMethodInvokerProxy implements a<LynxUI<? extends View>> {
    static {
        Covode.recordClassIndex(19011);
    }

    public void a(String str, ReadableMap readableMap, Callback callback) {
        l.c(str, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.lynx.tasm.behavior.ui.LynxBaseUI, java.lang.String, com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback] */
    @Override // com.lynx.tasm.behavior.utils.a
    public /* synthetic */ void invoke(LynxUI<? extends View> lynxUI, String str, ReadableMap readableMap, Callback callback) {
        a(str, readableMap, callback);
    }
}
