package com.lynx.tasm.behavior.c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public final class b extends l {

    /* renamed from: a  reason: collision with root package name */
    private final int f55839a;

    static {
        Covode.recordClassIndex(34908);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.k
    public final void a(q qVar) {
        int i2 = this.f55839a;
        int i3 = this.f55846b.f55847a;
        TraceEvent.a(0, "UIOwner.destroy");
        if (qVar.f55935e.size() > 0) {
            LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            LynxBaseUI lynxBaseUI2 = qVar.f55935e.get(Integer.valueOf(i3));
            if (lynxBaseUI == null || lynxBaseUI2 == null) {
                TraceEvent.b(0, "UIOwner.destroy");
                return;
            }
            if (qVar.f55933c.r) {
                q.a(lynxBaseUI2);
            }
            lynxBaseUI.removeChild(lynxBaseUI2);
            qVar.f55935e.remove(Integer.valueOf(i3));
            lynxBaseUI2.destroy();
            qVar.b(lynxBaseUI2);
        }
        TraceEvent.b(0, "UIOwner.destroy");
    }

    public b(int i2, int i3) {
        super(i3, 1);
        this.f55839a = i2;
    }
}
