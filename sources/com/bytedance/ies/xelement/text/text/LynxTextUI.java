package com.bytedance.ies.xelement.text.text;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.text.AndroidText;
import com.lynx.tasm.behavior.ui.text.UIText;
import h.f.b.l;

public final class LynxTextUI extends UIText {
    static {
        Covode.recordClassIndex(22524);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxTextUI(j jVar) {
        super(jVar);
        l.c(jVar, "");
    }

    @Override // com.lynx.tasm.behavior.ui.text.UIText
    /* renamed from: a */
    public final AndroidText createView(Context context) {
        l.c(context, "");
        return new AndroidText(context);
    }
}
