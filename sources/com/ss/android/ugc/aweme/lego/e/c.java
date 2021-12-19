package com.ss.android.ugc.aweme.lego.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lego.a.d;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.d.b;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.u;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, u> f107523a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, u> f107524b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<ae, List<String>> f107525c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Context f107526d;

    static {
        Covode.recordClassIndex(68806);
    }

    public final void a(Context context) {
        l.d(context, "");
        this.f107526d = context;
        for (ae aeVar : ae.values()) {
            this.f107525c.put(aeVar, new ArrayList());
        }
    }

    public final boolean a(ae aeVar) {
        l.d(aeVar, "");
        List<String> list = this.f107525c.get(aeVar);
        if (list == null) {
            l.b();
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final List<String> c(ae aeVar) {
        ArrayList arrayList;
        MethodCollector.i(10487);
        l.d(aeVar, "");
        synchronized (this.f107525c) {
            try {
                List<String> list = this.f107525c.get(aeVar);
                if (list == null) {
                    l.b();
                }
                arrayList = new ArrayList(list);
                List<String> list2 = this.f107525c.get(aeVar);
                if (list2 == null) {
                    l.b();
                }
                list2.clear();
            } finally {
                MethodCollector.o(10487);
            }
        }
        return arrayList;
    }

    public final String b(ae aeVar) {
        MethodCollector.i(10484);
        l.d(aeVar, "");
        synchronized (this.f107525c) {
            try {
                List<String> list = this.f107525c.get(aeVar);
                if (list == null) {
                    l.b();
                }
                if (!list.isEmpty()) {
                    List<String> list2 = this.f107525c.get(aeVar);
                    if (list2 == null) {
                        l.b();
                    }
                    return list2.remove(0);
                }
                MethodCollector.o(10484);
                return null;
            } finally {
                MethodCollector.o(10484);
            }
        }
    }

    public final u a(String str) {
        u uVar;
        MethodCollector.i(10334);
        l.d(str, "");
        u uVar2 = this.f107524b.get(str);
        if (uVar2 == null) {
            l.b();
        }
        u uVar3 = uVar2;
        synchronized (uVar3) {
            try {
                if (!this.f107523a.containsKey(str)) {
                    if (b.f107492a || b.a(uVar3)) {
                        d dVar = f.f107542g;
                        if (dVar != null) {
                            dVar.a(uVar3);
                        }
                        Context context = this.f107526d;
                        if (context == null) {
                            l.a("context");
                        }
                        uVar3.a(context);
                        List<n> j2 = uVar3.j();
                        if (j2 != null && j2.size() > 0) {
                            f.d e2 = f.e();
                            for (T t : j2) {
                                l.b(t, "");
                                e2.a(t);
                            }
                            e2.a();
                        }
                        d dVar2 = f.f107542g;
                        if (dVar2 != null) {
                            dVar2.b(uVar3);
                        }
                    }
                    this.f107523a.put(str, uVar3);
                }
                u uVar4 = this.f107523a.get(str);
                if (uVar4 == null) {
                    l.b();
                }
                uVar = uVar4;
            } finally {
                MethodCollector.o(10334);
            }
        }
        return uVar;
    }
}
