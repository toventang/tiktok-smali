package com.ss.android.ugc.aweme.lego.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.l;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Map<ae, List<n>> f107528a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private Context f107529b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<ae, List<n>> f107530c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(68807);
    }

    public final boolean a() {
        MethodCollector.i(12940);
        boolean z = false;
        if (!l.b()) {
            MethodCollector.o(12940);
            return false;
        }
        synchronized (this.f107528a) {
            try {
                List<n> list = this.f107528a.get(ae.BOOT_FINISH);
                if (list == null) {
                    h.f.b.l.b();
                }
                if (!list.isEmpty()) {
                    List<n> list2 = this.f107528a.get(ae.BOOT_FINISH);
                    if (list2 == null) {
                        h.f.b.l.b();
                    }
                    List<n> list3 = list2;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list3) {
                        if ((t instanceof a) && t.d() == 2) {
                            arrayList.add(t);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        list3.removeAll(arrayList);
                        list3.addAll(0, arrayList);
                        z = true;
                    }
                }
            } finally {
                MethodCollector.o(12940);
            }
        }
        return z;
    }

    public final boolean a(ae aeVar) {
        h.f.b.l.d(aeVar, "");
        List<n> list = this.f107528a.get(aeVar);
        if (list == null) {
            h.f.b.l.b();
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void a(Context context) {
        h.f.b.l.d(context, "");
        this.f107529b = context;
        ae[] values = ae.values();
        for (ae aeVar : values) {
            this.f107528a.put(aeVar, new ArrayList());
            this.f107530c.put(aeVar, new ArrayList());
        }
    }

    public final w b(ae aeVar) {
        MethodCollector.i(12717);
        h.f.b.l.d(aeVar, "");
        synchronized (this.f107528a) {
            try {
                List<n> list = this.f107528a.get(aeVar);
                if (list == null) {
                    h.f.b.l.b();
                }
                if (!list.isEmpty()) {
                    List<n> list2 = this.f107528a.get(aeVar);
                    if (list2 == null) {
                        h.f.b.l.b();
                    }
                    n remove = list2.remove(0);
                    synchronized (this.f107530c) {
                        try {
                            Map<ae, List<n>> map = this.f107530c;
                            if (remove != null) {
                                List<n> list3 = map.get(((w) remove).b());
                                if (list3 == null) {
                                    h.f.b.l.b();
                                }
                                list3.add(remove);
                            } else {
                                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
                                MethodCollector.o(12717);
                                throw nullPointerException;
                            }
                        } finally {
                            MethodCollector.o(12717);
                        }
                    }
                    return (w) remove;
                }
                MethodCollector.o(12717);
                return null;
            } finally {
                MethodCollector.o(12717);
            }
        }
    }

    public final w c(ae aeVar) {
        MethodCollector.i(12840);
        h.f.b.l.d(aeVar, "");
        synchronized (this.f107528a) {
            try {
                List<n> list = this.f107528a.get(aeVar);
                if (list == null) {
                    h.f.b.l.b();
                }
                if (!list.isEmpty()) {
                    List<n> list2 = this.f107528a.get(aeVar);
                    if (list2 == null) {
                        h.f.b.l.b();
                    }
                    return (w) list2.get(0);
                }
                MethodCollector.o(12840);
                return null;
            } finally {
                MethodCollector.o(12840);
            }
        }
    }

    public final void a(w wVar) {
        MethodCollector.i(12713);
        h.f.b.l.d(wVar, "");
        List<n> list = this.f107528a.get(wVar.b());
        if (list == null) {
            h.f.b.l.b();
        }
        if (list.contains(wVar)) {
            synchronized (this.f107528a) {
                try {
                    List<n> list2 = this.f107528a.get(wVar.b());
                    if (list2 == null) {
                        h.f.b.l.b();
                    }
                    list2.remove(wVar);
                } finally {
                    MethodCollector.o(12713);
                }
            }
            synchronized (this.f107530c) {
                try {
                    List<n> list3 = this.f107530c.get(wVar.b());
                    if (list3 == null) {
                        h.f.b.l.b();
                    }
                    if (!list3.contains(wVar)) {
                        List<n> list4 = this.f107530c.get(wVar.b());
                        if (list4 == null) {
                            h.f.b.l.b();
                        }
                        list4.add(wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        List<n> list5 = this.f107530c.get(wVar.b());
        if (list5 == null) {
            h.f.b.l.b();
        }
        if (list5.contains(wVar)) {
            com.ss.android.ugc.aweme.lego.a.d dVar = f.f107542g;
            if (dVar != null) {
                dVar.a(wVar);
            }
            b(wVar);
            com.ss.android.ugc.aweme.lego.a.d dVar2 = f.f107542g;
            if (dVar2 != null) {
                dVar2.b(wVar);
                MethodCollector.o(12713);
                return;
            }
        }
        MethodCollector.o(12713);
    }

    public final void b(w wVar) {
        MethodCollector.i(12715);
        h.f.b.l.d(wVar, "");
        synchronized (wVar) {
            try {
                List<n> list = this.f107530c.get(wVar.b());
                if (list == null) {
                    h.f.b.l.b();
                }
                if (list.contains(wVar)) {
                    com.ss.android.ugc.aweme.lego.a.d dVar = f.f107542g;
                    if (dVar != null) {
                        dVar.a(wVar);
                    }
                    Context context = this.f107529b;
                    if (context == null) {
                        h.f.b.l.a("context");
                    }
                    wVar.a(context);
                    List<n> j2 = wVar.j();
                    if (j2 != null) {
                        f.d e2 = f.e();
                        for (T t : j2) {
                            h.f.b.l.b(t, "");
                            e2.a(t);
                        }
                        e2.a();
                    }
                    com.ss.android.ugc.aweme.lego.a.d dVar2 = f.f107542g;
                    if (dVar2 != null) {
                        dVar2.b(wVar);
                    }
                    synchronized (this.f107530c) {
                        try {
                            List<n> list2 = this.f107530c.get(wVar.b());
                            if (list2 == null) {
                                h.f.b.l.b();
                            }
                            list2.remove(wVar);
                        } catch (Throwable th) {
                            MethodCollector.o(12715);
                            throw th;
                        }
                    }
                }
            } finally {
                MethodCollector.o(12715);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.lego.n> */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<n> a(ae aeVar, List<? extends n> list) {
        MethodCollector.i(13038);
        h.f.b.l.d(aeVar, "");
        h.f.b.l.d(list, "");
        synchronized (this.f107528a) {
            try {
                for (n nVar : list) {
                    List<n> list2 = this.f107528a.get(aeVar);
                    if (list2 == null) {
                        h.f.b.l.b();
                    }
                    list2.remove(nVar);
                }
                synchronized (this.f107530c) {
                    try {
                        List<n> list3 = this.f107530c.get(aeVar);
                        if (list3 == null) {
                            h.f.b.l.b();
                        }
                        list3.addAll(list);
                    } finally {
                        MethodCollector.o(13038);
                    }
                }
            } finally {
                MethodCollector.o(13038);
            }
        }
        return list;
    }
}
