package com.bytedance.android.monitorV2.j;

import com.bytedance.android.monitorV2.lynx.b.b;
import com.bytedance.android.monitorV2.lynx.c;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24002a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(14148);
    }

    public static final void a(LynxView lynxView, b bVar) {
        l.c(lynxView, "");
        l.c(bVar, "");
        if (bVar.f24067b) {
            c cVar = c.f24075j;
            l.c(lynxView, "");
            l.c(bVar, "");
            com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "registerLynxViewMonitor");
            com.bytedance.android.monitorV2.lynx.b.a aVar = cVar.f24080c;
            l.c(lynxView, "");
            l.c(bVar, "");
            aVar.f24065a.put(lynxView, bVar);
            String str = bVar.f24066a;
            b a2 = cVar.f24080c.a(lynxView);
            if (a2 != null) {
                l.c(str, "");
                a2.f24066a = str;
            }
            lynxView.addLynxViewClient(new b(lynxView));
        }
    }
}
