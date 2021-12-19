package com.bytedance.ies.powerpreload.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final h f34562a = i.a((h.f.a.a) b.f34563a);

    static {
        Covode.recordClassIndex(20676);
    }

    private final HashMap<d, Set<h>> a() {
        return (HashMap) this.f34562a.getValue();
    }

    static final class b extends m implements h.f.a.a<HashMap<d, Set<h>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34563a = new b();

        static {
            Covode.recordClassIndex(20678);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<d, Set<h>> invoke() {
            return new HashMap();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f34564a;

        static {
            Covode.recordClassIndex(20679);
        }

        c(f fVar) {
            this.f34564a = fVar;
        }

        public final void run() {
            try {
                this.f34564a.run();
            } catch (Exception e2) {
                com.bytedance.ies.powerpreload.a.a.a(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ f $task;

        static {
            Covode.recordClassIndex(20677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.$task = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return "addTask >>> task is same, new task:" + this.$task;
        }
    }

    public final Set<h> a(d dVar) {
        l.c(dVar, "");
        return a().get(dVar);
    }

    public final d a(String str) {
        l.c(str, "");
        Set<d> keySet = a().keySet();
        l.a((Object) keySet, "");
        for (T t : keySet) {
            if (l.a((Object) str, (Object) t.f34521f)) {
                return t;
            }
        }
        return null;
    }

    public final d b(String str) {
        l.c(str, "");
        Set<d> keySet = a().keySet();
        l.a((Object) keySet, "");
        for (T t : keySet) {
            if (l.a((Object) str, (Object) t.f34522g)) {
                return t;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(d dVar, com.bytedance.ies.powerpreload.b.d dVar2, f<?> fVar, String str) {
        l.c(dVar, "");
        l.c(dVar2, "");
        l.c(fVar, "");
        if (a().containsKey(dVar)) {
            Set<h> set = a().get(dVar);
            T t = null;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.a(dVar2.getClass(), str)) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    a aVar = new a(fVar);
                    l.c(aVar, "");
                    if (com.bytedance.ies.powerpreload.a.a.b()) {
                        aVar.invoke();
                    }
                    t2.a(fVar);
                } else if (set != null) {
                    h hVar = new h(dVar2.getClass(), str);
                    hVar.a(fVar);
                    set.add(hVar);
                }
            }
        } else {
            HashMap<d, Set<h>> a2 = a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            new h(dVar2.getClass(), str).a(fVar);
            a2.put(dVar, linkedHashSet);
        }
        com.bytedance.ies.powerpreload.a.a.a().f34483d.invoke().execute(new c(fVar));
    }
}
