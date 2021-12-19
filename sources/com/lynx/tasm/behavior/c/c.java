package com.lynx.tasm.behavior.c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final long f55840a;

    static {
        Covode.recordClassIndex(34909);
    }

    public c(long j2) {
        super(10);
        this.f55840a = j2;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.k
    public final void a(q qVar) {
        LynxBaseUI lynxBaseUI;
        long j2 = this.f55840a;
        if (j2 != 0 && (lynxBaseUI = qVar.f55935e.get(Integer.valueOf((int) (j2 >>> 32)))) != null) {
            String str = "UIOwner.layoutFinish." + lynxBaseUI.mTagName;
            TraceEvent.a(0, str);
            lynxBaseUI.onLayoutFinish(j2);
            TraceEvent.b(0, str);
        }
    }
}
