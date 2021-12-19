package com.bytedance.android.monitor.lynx.c.b;

import com.bytedance.android.monitor.b.a;
import com.bytedance.android.monitor.lynx.c.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import h.f.b.l;

public final class c extends a<b> {
    static {
        Covode.recordClassIndex(14023);
    }

    /* renamed from: c */
    public final synchronized b b(LynxView lynxView) {
        b bVar;
        MethodCollector.i(11592);
        l.c(lynxView, "");
        bVar = (b) super.b(lynxView);
        MethodCollector.o(11592);
        return bVar;
    }

    /* renamed from: d */
    public final synchronized b a(LynxView lynxView) {
        b bVar;
        MethodCollector.i(11593);
        l.c(lynxView, "");
        bVar = (b) super.a(lynxView);
        MethodCollector.o(11593);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.android.monitor.lynx.c.b.b
    public final /* synthetic */ a a(LynxView lynxView) {
        String str;
        LynxView lynxView2 = lynxView;
        String str2 = "";
        l.c(lynxView2, str2);
        com.bytedance.android.monitor.lynx.b.b a2 = com.bytedance.android.monitor.lynx.b.f23580f.f23583a.a(lynxView2);
        b bVar = new b();
        if (!(a2 == null || (str = a2.f23602j) == null)) {
            str2 = str;
        }
        bVar.f23495f = str2;
        bVar.f23621l = 999;
        return bVar;
    }
}
