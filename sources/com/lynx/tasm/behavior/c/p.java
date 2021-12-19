package com.lynx.tasm.behavior.c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.utils.m;

public final class p extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f55865a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55866c;

    static {
        Covode.recordClassIndex(34923);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.k
    public final void a(q qVar) {
        if (!this.f55866c) {
            int i2 = this.f55846b.f55847a;
            Object obj = this.f55865a;
            m.b();
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                String str = "UIOwner.updateViewExtra" + lynxBaseUI.mTagName;
                TraceEvent.a(0, str);
                lynxBaseUI.updateExtraData(obj);
                TraceEvent.b(0, str);
            }
            this.f55866c = true;
        }
    }

    public p(int i2, Object obj) {
        super(i2, 7);
        this.f55865a = obj;
    }
}
