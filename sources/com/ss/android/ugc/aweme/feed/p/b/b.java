package com.ss.android.ugc.aweme.feed.p.b;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.experiment.h;
import com.ss.android.ugc.aweme.feed.p.a.e;
import com.ss.android.ugc.aweme.feed.p.b.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.n;
import h.q;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f93653a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final List<e> f93654b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private e f93655c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.g.a.b f93656d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, HashMap<String, Object>> f93657e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.g.a.c.b f93658f;

    /* renamed from: g  reason: collision with root package name */
    private final C2274b f93659g = new C2274b();

    /* renamed from: h  reason: collision with root package name */
    private final List<h.f.a.b<Boolean, z>> f93660h = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b  reason: collision with other inner class name */
    public static final class C2274b {

        /* renamed from: b  reason: collision with root package name */
        public static final C2275b f93661b = new C2275b((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final AtomicBoolean f93662a = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        private final AtomicLong f93663c = new AtomicLong(-1);

        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$a */
        public enum a {
            SHOW_TOAST,
            SHOW_BAR,
            SHOW_NO_NET_SCREEN;

            static {
                Covode.recordClassIndex(59596);
            }
        }

        static {
            Covode.recordClassIndex(59595);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$b  reason: collision with other inner class name */
        public static final class C2275b {
            static {
                Covode.recordClassIndex(59597);
            }

            private C2275b() {
            }

            public /* synthetic */ C2275b(byte b2) {
                this();
            }

            public static void a(a aVar, com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
                Object obj;
                z zVar;
                String str;
                l.d(aVar, "");
                if (bVar != null && hashMap != null) {
                    try {
                        HashMap<String, Object> hashMap2 = hashMap.get("extra_info");
                        if (hashMap2 != null) {
                            Object obj2 = hashMap2.get("start_time");
                            if (obj2 != null && (obj2 instanceof Long)) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long longValue = currentTimeMillis - ((Number) obj2).longValue();
                                int i2 = c.f93670a[aVar.ordinal()];
                                int i3 = 2;
                                if (i2 == 1) {
                                    str = "T";
                                } else if (i2 == 2) {
                                    str = "B";
                                } else if (i2 == 3) {
                                    str = "S";
                                } else {
                                    throw new n();
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("start_time", obj2);
                                linkedHashMap.put("show_notice_time", Long.valueOf(currentTimeMillis));
                                linkedHashMap.put("notice_time", Long.valueOf(longValue));
                                int i4 = c.f93671b[bVar.ordinal()];
                                if (i4 == 1) {
                                    i3 = 0;
                                } else if (i4 == 2) {
                                    i3 = 1;
                                } else if (i4 != 3) {
                                    i3 = -1;
                                }
                                linkedHashMap.put("detect_res", Integer.valueOf(i3));
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("extra_info", linkedHashMap);
                                r.a(com.ss.android.ugc.g.a.a.e.f145591a, new com.ss.android.ugc.aweme.app.f.d().a(com.ss.android.ugc.g.a.a.e.f145600j, str).a(com.ss.android.ugc.g.a.a.e.f145601k, hashMap3).f66730a);
                            }
                            zVar = z.f158842a;
                        } else {
                            zVar = null;
                        }
                        obj = q.m223constructorimpl(zVar);
                    } catch (Throwable th) {
                        obj = q.m223constructorimpl(h.r.a(th));
                    }
                    q.m222boximpl(obj);
                }
            }
        }

        private final void b() {
            this.f93663c.set(System.currentTimeMillis());
        }

        private static boolean c() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$c */
        public static final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f93665a;

            static {
                Covode.recordClassIndex(59598);
            }

            c(List list) {
                this.f93665a = list;
            }

            public final void run() {
                for (h.f.a.b bVar : this.f93665a) {
                    bVar.invoke(false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$f */
        public static final class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static final f f93669a = new f();

            static {
                Covode.recordClassIndex(59601);
            }

            f() {
            }

            public final void run() {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.h5u).a();
            }
        }

        private final boolean a() {
            if (System.currentTimeMillis() - this.f93663c.get() < 60000) {
                return true;
            }
            return false;
        }

        private static boolean d() {
            if (j.f107229h && j.b() && !j.c()) {
                return j.f107229h;
            }
            boolean c2 = c();
            j.f107229h = c2;
            return c2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$d */
        public static final class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2274b f93666a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f93667b;

            static {
                Covode.recordClassIndex(59599);
            }

            d(C2274b bVar, List list) {
                this.f93666a = bVar;
                this.f93667b = list;
            }

            public final void run() {
                this.f93666a.f93662a.set(true);
                for (h.f.a.b bVar : this.f93667b) {
                    bVar.invoke(true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.p.b.b$b$e */
        public static final class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static final e f93668a = new e();

            static {
                Covode.recordClassIndex(59600);
            }

            e() {
            }

            public final void run() {
                MethodCollector.i(8932);
                if (!com.ss.android.ugc.aweme.feed.p.b.a()) {
                    MethodCollector.o(8932);
                } else if (f.f93678d == null || f.f93678d.f93684a == null) {
                    MethodCollector.o(8932);
                } else {
                    synchronized (f.f93679e) {
                        try {
                            Message obtain = Message.obtain();
                            obtain.what = 0;
                            obtain.obj = new f.b("Detector can't find net");
                            if (!(f.f93678d == null || f.f93678d.f93684a == null)) {
                                try {
                                    f.f93678d.f93684a.sendMessage(obtain);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        } finally {
                            MethodCollector.o(8932);
                        }
                    }
                }
            }
        }

        public final boolean a(boolean z) {
            boolean z2;
            boolean a2 = com.ss.android.ugc.aweme.feed.p.b.a();
            com.bytedance.ies.ugc.appcontext.d.a();
            boolean d2 = a2 & d();
            if (!z || !a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            return z2 & d2;
        }

        public final boolean a(com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            if (!a(true)) {
                return false;
            }
            if ((!a.b() && !a.a()) || this.f93662a.get()) {
                return false;
            }
            b();
            m.a(f.f93669a);
            C2275b.a(a.SHOW_TOAST, bVar, hashMap);
            return true;
        }
    }

    static {
        Covode.recordClassIndex(59593);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59594);
        }

        private a() {
        }

        public static boolean a() {
            if (!f.a().booleanValue()) {
                return true;
            }
            return false;
        }

        public static boolean b() {
            Boolean b2 = f.b();
            l.b(b2, "");
            return b2.booleanValue();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.p.b.a
    public final synchronized void a() {
        MethodCollector.i(9320);
        d();
        MethodCollector.o(9320);
    }

    private final synchronized void c() {
        Integer num;
        MethodCollector.i(9503);
        if (!com.ss.android.ugc.aweme.feed.p.b.a()) {
            MethodCollector.o(9503);
        } else if (this.f93658f != null) {
            MethodCollector.o(9503);
        } else if (this.f93656d == null) {
            MethodCollector.o(9503);
        } else {
            e eVar = this.f93655c;
            if (eVar != null) {
                num = Integer.valueOf(eVar.hashCode());
            } else {
                num = null;
            }
            com.ss.android.ugc.g.a.c.b bVar = new com.ss.android.ugc.g.a.c.b();
            bVar.a(h.f93065a, new c(this, num));
            this.f93658f = bVar;
            MethodCollector.o(9503);
        }
    }

    private synchronized void d() {
        MethodCollector.i(9653);
        try {
            C2274b bVar = this.f93659g;
            List<h.f.a.b<Boolean, z>> list = this.f93660h;
            l.d(list, "");
            try {
                bVar.f93662a.set(false);
                m.a(new C2274b.c(list));
                q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                q.m223constructorimpl(h.r.a(th));
            }
            q.m223constructorimpl(z.f158842a);
        } catch (Throwable th2) {
            q.m223constructorimpl(h.r.a(th2));
        }
        try {
            this.f93655c = null;
            this.f93657e = null;
            this.f93656d = null;
            com.ss.android.ugc.g.a.c.b bVar2 = this.f93658f;
            if (bVar2 != null) {
                bVar2.a();
            }
            this.f93658f = null;
            Iterator<T> it = this.f93654b.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
            this.f93654b.clear();
            q.m223constructorimpl(z.f158842a);
            MethodCollector.o(9653);
        } catch (Throwable th3) {
            q.m223constructorimpl(h.r.a(th3));
            MethodCollector.o(9653);
        }
    }

    public final synchronized void b() {
        z zVar;
        MethodCollector.i(9322);
        try {
            if (!com.ss.android.ugc.aweme.feed.p.b.a()) {
                MethodCollector.o(9322);
            } else if (!this.f93659g.a(true)) {
                MethodCollector.o(9322);
            } else if (a.b() || a.a()) {
                com.ss.android.ugc.g.a.b bVar = this.f93656d;
                if (bVar != null) {
                    int i2 = d.f93672a[bVar.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        this.f93659g.a(this.f93656d, this.f93657e);
                    } else if (i2 == 3 && this.f93659g.a(this.f93656d, this.f93657e)) {
                        c();
                    }
                    zVar = z.f158842a;
                } else {
                    zVar = null;
                }
                q.m223constructorimpl(zVar);
                MethodCollector.o(9322);
            } else {
                MethodCollector.o(9322);
            }
        } catch (Throwable th) {
            q.m223constructorimpl(h.r.a(th));
            MethodCollector.o(9322);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<Long, z> {
        final /* synthetic */ Integer $lastInterceptorHashCode$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(59602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, Integer num) {
            super(1);
            this.this$0 = bVar;
            this.$lastInterceptorHashCode$inlined = num;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Long l2) {
            l2.longValue();
            this.this$0.a(this.$lastInterceptorHashCode$inlined);
            return z.f158842a;
        }
    }

    public final synchronized void b(h.f.a.b<? super Boolean, z> bVar) {
        MethodCollector.i(8931);
        l.d(bVar, "");
        this.f93660h.remove(bVar);
        MethodCollector.o(8931);
    }

    public final synchronized void a(e eVar) {
        MethodCollector.i(9129);
        l.d(eVar, "");
        if (this.f93655c == null) {
            this.f93655c = eVar;
        }
        this.f93654b.add(eVar);
        MethodCollector.o(9129);
    }

    public final synchronized void a(h.f.a.b<? super Boolean, z> bVar) {
        MethodCollector.i(8716);
        l.d(bVar, "");
        if (!com.ss.android.ugc.aweme.feed.p.b.a()) {
            MethodCollector.o(8716);
            return;
        }
        if (this.f93659g.f93662a.get()) {
            bVar.invoke(true);
        }
        this.f93660h.add(bVar);
        MethodCollector.o(8716);
    }

    public final synchronized void a(Integer num) {
        MethodCollector.i(9651);
        if (!com.ss.android.ugc.aweme.feed.p.b.a()) {
            MethodCollector.o(9651);
        } else if (a.b() || a.a()) {
            e eVar = this.f93655c;
            if (!(eVar == null || !l.a(Integer.valueOf(eVar.hashCode()), num) || this.f93656d == null)) {
                if (a.a()) {
                    C2274b bVar = this.f93659g;
                    com.ss.android.ugc.g.a.b bVar2 = this.f93656d;
                    HashMap<String, HashMap<String, Object>> hashMap = this.f93657e;
                    if (bVar.a(false) && a.a() && a.b()) {
                        m.a(C2274b.e.f93668a);
                        C2274b.C2275b.a(C2274b.a.SHOW_NO_NET_SCREEN, bVar2, hashMap);
                    }
                } else if (a.b()) {
                    C2274b bVar3 = this.f93659g;
                    List<h.f.a.b<Boolean, z>> list = this.f93660h;
                    com.ss.android.ugc.g.a.b bVar4 = this.f93656d;
                    HashMap<String, HashMap<String, Object>> hashMap2 = this.f93657e;
                    l.d(list, "");
                    if (bVar3.a(false) && a.b()) {
                        m.a(new C2274b.d(bVar3, list));
                        C2274b.C2275b.a(C2274b.a.SHOW_BAR, bVar4, hashMap2);
                    }
                }
            }
            this.f93658f = null;
            MethodCollector.o(9651);
        } else {
            MethodCollector.o(9651);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.p.b.a
    public final synchronized void a(e eVar, com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
        MethodCollector.i(9318);
        l.d(eVar, "");
        l.d(bVar, "");
        l.d(hashMap, "");
        if (!com.ss.android.ugc.aweme.feed.p.b.a()) {
            MethodCollector.o(9318);
            return;
        }
        if (l.a(this.f93655c, eVar) && this.f93656d == null) {
            this.f93656d = bVar;
            this.f93657e = hashMap;
            if (a.a() || a.b()) {
                b();
                MethodCollector.o(9318);
                return;
            }
        }
        MethodCollector.o(9318);
    }
}
