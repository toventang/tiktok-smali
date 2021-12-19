package com.ss.ugc.aweme.performance.core.monitor.d;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.aweme.performance.core.monitor.a;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a {

    /* renamed from: e  reason: collision with root package name */
    public static final int f153368e = 50;

    /* renamed from: f  reason: collision with root package name */
    public static final int f153369f = 200;

    /* renamed from: g  reason: collision with root package name */
    public static final C4079a f153370g = new C4079a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, com.ss.ugc.aweme.performance.core.monitor.b.b> f153371a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f153372b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f153373c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f153374d;

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a$a  reason: collision with other inner class name */
    public static final class C4079a {
        static {
            Covode.recordClassIndex(101815);
        }

        private C4079a() {
        }

        public /* synthetic */ C4079a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(101814);
    }

    public a() {
        boolean z;
        com.ss.ugc.aweme.performance.core.monitor.a.a aVar = a.C4078a.a().f153329b;
        boolean z2 = false;
        if (aVar != null) {
            z = aVar.c();
        } else {
            z = false;
        }
        this.f153372b = z;
        com.ss.ugc.aweme.performance.core.monitor.a.a aVar2 = a.C4078a.a().f153329b;
        this.f153373c = aVar2 != null ? aVar2.d() : z2;
        this.f153374d = a.C4078a.a().f153328a;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f153375a;

        static {
            Covode.recordClassIndex(101816);
        }

        b(a aVar) {
            this.f153375a = aVar;
        }

        public final void run() {
            synchronized (com.ss.ugc.aweme.performance.core.monitor.b.f153337d) {
                this.f153375a.f153371a.size();
                Set<Map.Entry<String, com.ss.ugc.aweme.performance.core.monitor.b.c>> entrySet = com.ss.ugc.aweme.performance.core.monitor.b.f153334a.entrySet();
                l.a((Object) entrySet, "");
                ArrayList arrayList = new ArrayList(entrySet);
                n.a((List) arrayList, (Comparator) C4080a.f153376a);
                if (arrayList.size() > 0) {
                    for (Map.Entry<String, com.ss.ugc.aweme.performance.core.monitor.b.b> entry : this.f153375a.f153371a.entrySet()) {
                        if (entry.getValue().f153353e < ((com.ss.ugc.aweme.performance.core.monitor.b.c) ((Map.Entry) arrayList.get(0)).getValue()).f153360a) {
                            this.f153375a.f153371a.remove(entry.getKey());
                        }
                    }
                    this.f153375a.f153371a.size();
                }
            }
        }

        /* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a$b$a  reason: collision with other inner class name */
        static final class C4080a<T> implements Comparator<Map.Entry<String, com.ss.ugc.aweme.performance.core.monitor.b.c>> {

            /* renamed from: a  reason: collision with root package name */
            public static final C4080a f153376a = new C4080a();

            static {
                Covode.recordClassIndex(101817);
            }

            C4080a() {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Map.Entry<String, com.ss.ugc.aweme.performance.core.monitor.b.c> entry, Map.Entry<String, com.ss.ugc.aweme.performance.core.monitor.b.c> entry2) {
                long j2;
                com.ss.ugc.aweme.performance.core.monitor.b.c value;
                com.ss.ugc.aweme.performance.core.monitor.b.c value2;
                Map.Entry<String, com.ss.ugc.aweme.performance.core.monitor.b.c> entry3 = entry;
                Map.Entry<String, com.ss.ugc.aweme.performance.core.monitor.b.c> entry4 = entry2;
                long j3 = 0;
                if (entry3 == null || (value2 = entry3.getValue()) == null) {
                    j2 = 0;
                } else {
                    j2 = value2.f153360a;
                }
                if (!(entry4 == null || (value = entry4.getValue()) == null)) {
                    j3 = value.f153360a;
                }
                if (j2 > j3) {
                    return 1;
                }
                return -1;
            }
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f153377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.aweme.performance.core.monitor.b.c f153378b;

        static {
            Covode.recordClassIndex(101818);
        }

        public c(a aVar, com.ss.ugc.aweme.performance.core.monitor.b.c cVar) {
            this.f153377a = aVar;
            this.f153378b = cVar;
        }

        public final void run() {
            ArrayList arrayList;
            com.ss.ugc.aweme.performance.core.monitor.b.b bVar;
            long j2;
            com.ss.ugc.aweme.performance.core.monitor.a.b bVar2;
            Map<String, Object> a2;
            Set<String> keySet;
            synchronized (this.f153377a.f153371a) {
                arrayList = new ArrayList(this.f153377a.f153371a.entrySet());
                if (this.f153378b == null) {
                    this.f153377a.f153371a.clear();
                }
            }
            n.a((List) arrayList, (Comparator) AnonymousClass1.f153379a);
            Iterator it = arrayList.iterator();
            long j3 = 0;
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry != null && (bVar = (com.ss.ugc.aweme.performance.core.monitor.b.b) entry.getValue()) != null && bVar.f153354f != 0) {
                    if (this.f153377a.f153372b) {
                        if (this.f153377a.f153374d && (bVar2 = a.C4078a.a().f153331d) != null && (a2 = bVar2.a()) != null && (keySet = a2.keySet()) != null) {
                            Iterator<T> it2 = keySet.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (p.e((CharSequence) bVar.f153350b, (CharSequence) it2.next())) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        com.ss.ugc.aweme.performance.core.monitor.b.a aVar = new com.ss.ugc.aweme.performance.core.monitor.b.a(bVar.f153350b, 2, (byte) 0);
                        aVar.f153345h = bVar.f153351c;
                        aVar.f153346i = bVar.f153352d;
                        aVar.f153339b = 1;
                        aVar.f153340c = bVar.f153349a;
                        aVar.e(com.ss.ugc.aweme.performance.core.monitor.f.b.a(com.ss.ugc.aweme.performance.core.monitor.f.b.b(bVar.f153359k)) + "\n" + bVar.f153357i);
                        aVar.c(bVar.f153356h);
                        aVar.a(bVar.f153358j);
                        com.ss.ugc.aweme.performance.core.monitor.b.c cVar = this.f153378b;
                        if (cVar == null) {
                            aVar.b("applicaiton");
                        } else if (cVar.f153360a < bVar.f153353e && this.f153378b.f153361b > bVar.f153354f) {
                            aVar.b(this.f153378b.f153363d);
                            com.ss.ugc.aweme.performance.core.monitor.b.c cVar2 = this.f153378b;
                            l.c(bVar, "");
                            l.c(cVar2, "");
                        }
                        a.C4078a.a();
                    }
                    com.ss.ugc.aweme.performance.core.monitor.b.c cVar3 = this.f153378b;
                    if (cVar3 == null) {
                        i2++;
                        bVar.f153349a = (bVar.f153354f - bVar.f153353e) / 1000000;
                        j2 = bVar.f153349a;
                    } else if (cVar3.f153360a < bVar.f153353e && this.f153378b.f153361b > bVar.f153354f) {
                        i2++;
                        bVar.f153349a = (bVar.f153354f - bVar.f153353e) / 1000000;
                        j2 = bVar.f153349a;
                    }
                    j3 += j2;
                }
            }
            com.ss.ugc.aweme.performance.core.monitor.b.a aVar2 = new com.ss.ugc.aweme.performance.core.monitor.b.a("phase", 1);
            aVar2.f153339b = i2;
            aVar2.f153340c = j3;
            com.ss.ugc.aweme.performance.core.monitor.b.c cVar4 = this.f153378b;
            if (cVar4 != null) {
                aVar2.b(cVar4.f153363d);
            }
            a.C4078a.a();
            if (this.f153377a.f153371a.size() > a.f153369f) {
                com.ss.ugc.aweme.performance.core.monitor.e.b.f153380a.a(new b(this.f153377a));
            }
        }
    }
}
