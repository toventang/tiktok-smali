package com.lynx.tasm.behavior.c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;

public final class g extends l {
    static {
        Covode.recordClassIndex(34913);
    }

    public g(int i2) {
        super(i2, 13);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.k
    public final void a(q qVar) {
        LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(this.f55846b.f55847a));
        if (lynxBaseUI instanceof UIShadowProxy) {
            lynxBaseUI = ((UIShadowProxy) lynxBaseUI).f56071a;
        }
        lynxBaseUI.onAnimatedNodeReady();
    }
}
