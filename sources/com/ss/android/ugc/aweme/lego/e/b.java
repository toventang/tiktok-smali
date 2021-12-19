package com.ss.android.ugc.aweme.lego.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lego.a.d;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private Context f107520a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<aa, List<r>> f107521b = new HashMap();

    static {
        Covode.recordClassIndex(68805);
    }

    public final void a(Context context) {
        l.d(context, "");
        this.f107520a = context;
        for (aa aaVar : aa.values()) {
            this.f107521b.put(aaVar, new ArrayList());
        }
    }

    private final void a(r rVar) {
        MethodCollector.i(12591);
        synchronized (this.f107521b) {
            try {
                List<r> list = this.f107521b.get(rVar.b());
                if (list == null) {
                    l.b();
                }
                list.remove(rVar);
            } finally {
                MethodCollector.o(12591);
            }
        }
    }

    public final r b(aa aaVar) {
        MethodCollector.i(12705);
        l.d(aaVar, "");
        synchronized (this.f107521b) {
            try {
                List<r> list = this.f107521b.get(aaVar);
                if (list == null) {
                    l.b();
                }
                if (!list.isEmpty()) {
                    List<r> list2 = this.f107521b.get(aaVar);
                    if (list2 == null) {
                        l.b();
                    }
                    return list2.get(0);
                }
                MethodCollector.o(12705);
                return null;
            } finally {
                MethodCollector.o(12705);
            }
        }
    }

    public final boolean a(aa aaVar) {
        l.d(aaVar, "");
        List<r> list = this.f107521b.get(aaVar);
        if (list == null) {
            l.b();
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void a(aa aaVar, r rVar) {
        MethodCollector.i(12704);
        l.d(aaVar, "");
        l.d(rVar, "");
        synchronized (this.f107521b) {
            try {
                List<r> list = this.f107521b.get(aaVar);
                if (list == null) {
                    l.b();
                }
                list.add(rVar);
            } finally {
                MethodCollector.o(12704);
            }
        }
    }

    public final void a(r rVar, boolean z) {
        MethodCollector.i(12468);
        l.d(rVar, "");
        synchronized (rVar) {
            try {
                List<r> list = this.f107521b.get(rVar.b());
                if (list == null) {
                    l.b();
                }
                if (list.contains(rVar)) {
                    a(rVar);
                    d dVar = f.f107542g;
                    if (dVar != null) {
                        dVar.a(rVar);
                    }
                    Context context = this.f107520a;
                    if (context == null) {
                        l.a("context");
                    }
                    rVar.a(context, z);
                    d dVar2 = f.f107542g;
                    if (dVar2 != null) {
                        dVar2.b(rVar);
                    }
                }
            } finally {
                MethodCollector.o(12468);
            }
        }
    }
}
