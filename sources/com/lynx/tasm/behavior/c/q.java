package com.lynx.tasm.behavior.c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public final class q extends f {
    static {
        Covode.recordClassIndex(34924);
    }

    public q(int i2) {
        super(i2, 8);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.k
    public final void a(com.lynx.tasm.behavior.q qVar) {
        LynxBaseUI a2 = qVar.a(this.f55846b.f55847a);
        if (a2 == null) {
            LLog.a(6, "LynxUIOwner", "try to validate a not-existing node");
        } else {
            a2.renderIfNeeded();
        }
    }
}
