package com.ss.android.ugc.aweme.scheduler;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.scheduler.i;
import com.ss.android.ugc.aweme.shortvideo.publish.a.b;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.a.n;
import h.a.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final b f120956a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<String, i.a> f120957b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private i.a f120958c;

    /* renamed from: d  reason: collision with root package name */
    private final int f120959d;

    /* renamed from: e  reason: collision with root package name */
    private final int f120960e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f120961f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f120962g;

    static {
        Covode.recordClassIndex(78783);
    }

    private synchronized boolean b() {
        MethodCollector.i(11330);
        Collection<i.a> values = this.f120957b.values();
        h.f.b.l.b(values, "");
        ArrayList arrayList = new ArrayList();
        for (T t : values) {
            if (true ^ (t.f120913b instanceof x.a)) {
                arrayList.add(t);
            }
        }
        if (arrayList.size() >= this.f120959d) {
            MethodCollector.o(11330);
            return true;
        }
        MethodCollector.o(11330);
        return false;
    }

    public final synchronized void a() {
        MethodCollector.i(11828);
        Collection<i.a> values = this.f120957b.values();
        h.f.b.l.b(values, "");
        ArrayList arrayList = new ArrayList();
        for (T t : values) {
            if (t.f120913b instanceof x.a) {
                arrayList.add(t);
            }
        }
        for (i.a aVar : n.c(n.a((Iterable) arrayList, (Comparator) new a()), this.f120960e)) {
            this.f120957b.remove(aVar.f120912a);
        }
        MethodCollector.o(11828);
    }

    public final synchronized void c(String str) {
        MethodCollector.i(11829);
        h.f.b.l.d(str, "");
        this.f120957b.remove(str);
        MethodCollector.o(11829);
    }

    public final synchronized i.a a(String str) {
        MethodCollector.i(11333);
        if (str == null) {
            i.a aVar = this.f120958c;
            MethodCollector.o(11333);
            return aVar;
        }
        i.a aVar2 = this.f120957b.get(str);
        i.a aVar3 = this.f120958c;
        if (aVar2 == null) {
            a(str, aVar3);
            MethodCollector.o(11333);
            return aVar3;
        } else if (!(aVar2.f120913b instanceof x.a) || aVar3 == null) {
            MethodCollector.o(11333);
            return aVar2;
        } else {
            a(str, aVar3);
            MethodCollector.o(11333);
            return aVar3;
        }
    }

    public final synchronized List<i.a> b(String str) {
        MethodCollector.i(11664);
        if (str == null) {
            Set<Map.Entry<String, i.a>> entrySet = this.f120957b.entrySet();
            h.f.b.l.b(entrySet, "");
            ArrayList arrayList = new ArrayList(n.a(entrySet, 10));
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Object value = it.next().getValue();
                h.f.b.l.b(value, "");
                arrayList.add((i.a) value);
            }
            ArrayList arrayList2 = arrayList;
            MethodCollector.o(11664);
            return arrayList2;
        }
        i.a aVar = this.f120957b.get(str);
        i.a aVar2 = this.f120958c;
        if (aVar == null) {
            if (aVar2 != null) {
                a(str, aVar2);
                List<i.a> a2 = n.a(aVar2);
                MethodCollector.o(11664);
                return a2;
            }
            z zVar = z.INSTANCE;
            MethodCollector.o(11664);
            return zVar;
        } else if (!(aVar.f120913b instanceof x.a) || aVar2 == null) {
            List<i.a> a3 = n.a(aVar);
            MethodCollector.o(11664);
            return a3;
        } else {
            a(str, aVar2);
            List<i.a> a4 = n.a(aVar2);
            MethodCollector.o(11664);
            return a4;
        }
    }

    public final synchronized boolean a(i.a aVar) {
        MethodCollector.i(11171);
        h.f.b.l.d(aVar, "");
        if (b()) {
            h.c("RunningTaskFull startNewFailed cancelLast:" + this.f120962g);
            if (this.f120962g) {
                com.ss.android.ugc.aweme.shortvideo.publish.a.a a2 = b.a.a().a("cancel_last_task_while_adding").a();
                Collection<i.a> values = this.f120957b.values();
                h.f.b.l.b(values, "");
                ArrayList<i.a> arrayList = new ArrayList();
                for (T t : values) {
                    if (!(t.f120913b instanceof x.a)) {
                        arrayList.add(t);
                    }
                }
                for (i.a aVar2 : arrayList) {
                    i iVar = aVar2.f120916e;
                    if (iVar != null) {
                        iVar.a(a2);
                    }
                }
            } else {
                MethodCollector.o(11171);
                return false;
            }
        }
        this.f120957b.put(aVar.f120912a, aVar);
        this.f120958c = aVar;
        MethodCollector.o(11171);
        return true;
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(78784);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t.f120915d), Long.valueOf(t2.f120915d));
        }
    }

    private static void a(String str, i.a aVar) {
        String str2;
        StringBuilder append = new StringBuilder("PublishScheduler | RedirectRecord oldId:").append(str).append(" newId:");
        if (aVar != null) {
            str2 = aVar.f120912a;
        } else {
            str2 = null;
        }
        bj.a(append.append(str2).toString());
    }

    public final synchronized i.a a(String str, q qVar, k kVar) {
        MethodCollector.i(11497);
        h.f.b.l.d(str, "");
        h.f.b.l.d(qVar, "");
        if (kVar == null) {
            kVar = this.f120956a;
        }
        i.a a2 = a(str);
        if (a2 != null) {
            if (kVar.a(qVar, a2.f120917f)) {
                MethodCollector.o(11497);
                return a2;
            }
            bj.a("PublishScheduler | Find unequal creationId src:" + qVar.f129873b + " result:" + a2.f120917f.f129873b);
        }
        MethodCollector.o(11497);
        return null;
    }

    public l(int i2, int i3, boolean z, boolean z2) {
        this.f120959d = i2;
        this.f120960e = i3;
        this.f120961f = z;
        this.f120962g = z2;
        this.f120956a = new b(z);
    }
}
