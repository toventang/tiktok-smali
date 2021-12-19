package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.mq;

final /* synthetic */ class gj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final gk f51683a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f51684b;

    static {
        Covode.recordClassIndex(32258);
    }

    gj(gk gkVar, Bundle bundle) {
        this.f51683a = gkVar;
        this.f51684b = bundle;
    }

    public final void run() {
        gk gkVar = this.f51683a;
        Bundle bundle = this.f51684b;
        mq.b();
        if (gkVar.s().d(null, p.aN)) {
            if (bundle == null) {
                gkVar.r().y.a(new Bundle());
                return;
            }
            Bundle a2 = gkVar.r().y.a();
            for (String str : bundle.keySet()) {
                Object a3 = a(bundle, str);
                if (a3 != null && !(a3 instanceof String) && !(a3 instanceof Long) && !(a3 instanceof Double)) {
                    gkVar.o();
                    if (jz.a(a3)) {
                        gkVar.o().a(27, (String) null, (String) null, 0);
                    }
                    gkVar.q().f51473h.a("Invalid default event parameter type. Name, value", str, a3);
                } else if (jz.e(str)) {
                    gkVar.q().f51473h.a("Invalid default event parameter name. Name", str);
                } else if (a3 == null) {
                    a2.remove(str);
                } else if (gkVar.o().a("param", str, 100, a3)) {
                    gkVar.o().a(a2, str, a3);
                }
            }
            gkVar.o();
            if (jz.a(a2, gkVar.s().d())) {
                gkVar.o().a(26, (String) null, (String) null, 0);
                gkVar.q().f51473h.a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            gkVar.r().y.a(a2);
            gkVar.g().a(a2);
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
