package com.bytedance.sdk.bridge;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bridge.a.a;
import com.bytedance.sdk.bridge.b.c;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class BridgeLifeCycleObserver implements au {

    /* renamed from: a  reason: collision with root package name */
    private final Object f43823a;

    /* renamed from: b  reason: collision with root package name */
    private final i f43824b;

    static {
        Covode.recordClassIndex(26798);
    }

    @v(a = i.a.ON_ANY)
    public final void onAny() {
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        onAny();
        if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestory$bridge_release();
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        Object obj = this.f43823a;
        i iVar = this.f43824b;
        l.c(obj, "");
        g.a(f.f43867a, " disableBridgeMethods " + obj.getClass().getSimpleName());
        h a2 = a.a(obj.getClass());
        if (a2 != null) {
            for (d dVar : a2.a()) {
                l.a((Object) dVar, "");
                String str = dVar.f43858b;
                com.bytedance.sdk.bridge.b.a a3 = f.a(f.f43868b.get(str), iVar);
                if (a3 != null) {
                    a3.f43842c = false;
                }
                g.a(f.f43867a, " disable  " + str + '\n');
            }
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        Object obj = this.f43823a;
        i iVar = this.f43824b;
        l.c(obj, "");
        g.a(f.f43867a, " enableBridgeMethods " + obj.getClass().getSimpleName());
        h a2 = a.a(obj.getClass());
        if (a2 != null) {
            for (d dVar : a2.a()) {
                l.a((Object) dVar, "");
                String str = dVar.f43858b;
                com.bytedance.sdk.bridge.b.a a3 = f.a(f.f43868b.get(str), iVar);
                if (a3 != null) {
                    a3.f43842c = true;
                }
                g.a(f.f43867a, " enable  " + str + '\n');
            }
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestory$bridge_release() {
        MethodCollector.i(4145);
        Object obj = this.f43823a;
        i iVar = this.f43824b;
        l.c(obj, "");
        l.c(iVar, "");
        h a2 = a.a(obj.getClass());
        if (a2 != null) {
            for (d dVar : a2.a()) {
                l.a((Object) dVar, "");
                String str = dVar.f43858b;
                List<com.bytedance.sdk.bridge.b.a> list = f.f43868b.get(str);
                com.bytedance.sdk.bridge.b.a a3 = f.a(list, iVar);
                if (!(list == null || a3 == null)) {
                    list.remove(a3);
                    g.a(f.f43867a, "unregister  " + iVar + " -- " + str);
                }
            }
        }
        synchronized (f.f43869c) {
            try {
                Iterator<c> it = f.f43869c.iterator();
                l.a((Object) it, "");
                while (it.hasNext()) {
                    c next = it.next();
                    if (l.a(obj, next.f43849a)) {
                        f.f43869c.remove(next);
                    }
                }
            } finally {
                MethodCollector.o(4145);
            }
        }
    }
}
