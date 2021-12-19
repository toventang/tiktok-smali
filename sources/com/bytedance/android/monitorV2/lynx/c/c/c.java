package com.bytedance.android.monitorV2.lynx.c.c;

import com.bytedance.android.monitorV2.a.a;
import com.bytedance.android.monitorV2.lynx.c.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import h.f.b.l;

public final class c extends a<b> {
    static {
        Covode.recordClassIndex(14206);
    }

    /* renamed from: c */
    public final synchronized b b(LynxView lynxView) {
        b bVar;
        MethodCollector.i(9851);
        l.c(lynxView, "");
        bVar = (b) super.b(lynxView);
        MethodCollector.o(9851);
        return bVar;
    }

    /* renamed from: d */
    public final synchronized b a(LynxView lynxView) {
        b bVar;
        MethodCollector.i(9852);
        l.c(lynxView, "");
        bVar = (b) super.a(lynxView);
        MethodCollector.o(9852);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.android.monitorV2.lynx.c.c.b
    public final /* synthetic */ a a(LynxView lynxView) {
        String str;
        LynxView lynxView2 = lynxView;
        String str2 = "";
        l.c(lynxView2, str2);
        com.bytedance.android.monitorV2.lynx.b.b a2 = com.bytedance.android.monitorV2.lynx.c.f24075j.f24080c.a(lynxView2);
        b bVar = new b();
        if (!(a2 == null || (str = a2.f24071f) == null)) {
            str2 = str;
        }
        bVar.f23906e = str2;
        bVar.f24102k = 999;
        return bVar;
    }
}
