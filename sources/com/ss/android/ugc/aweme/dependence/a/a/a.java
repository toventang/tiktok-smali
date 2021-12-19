package com.ss.android.ugc.aweme.dependence.a.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.c.c.ao;
import com.google.c.c.as;
import com.ss.android.ugc.aweme.dependence.a.a.a.b;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class a<Param, Target> implements b<Param, Target> {

    /* renamed from: h  reason: collision with root package name */
    public static final C1854a f79548h = new C1854a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f79549a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f79550b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79551c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dependence.a.a.b.d f79552d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f79553e;

    /* renamed from: f  reason: collision with root package name */
    final Queue<com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target>> f79554f;

    /* renamed from: g  reason: collision with root package name */
    final List<Param> f79555g;

    /* renamed from: i  reason: collision with root package name */
    private final Queue<com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target>> f79556i;

    /* renamed from: j  reason: collision with root package name */
    private final Queue<com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target>> f79557j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f79558k;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f79559l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f79560m;
    private AtomicInteger n;
    private final int o = 3;
    private final com.ss.android.ugc.aweme.dependence.a.a.b.c<Param, Target> p;

    static {
        Covode.recordClassIndex(49408);
    }

    public final ao<Param, com.ss.android.ugc.aweme.dependence.a.a.a.a<Param, Target>> a() {
        return (ao) this.f79558k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.dependence.a.a.a$a  reason: collision with other inner class name */
    public static final class C1854a {
        static {
            Covode.recordClassIndex(49409);
        }

        private C1854a() {
        }

        public /* synthetic */ C1854a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f79565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f79566b;

        static {
            Covode.recordClassIndex(49417);
        }

        i(a aVar, h.f.a.a aVar2) {
            this.f79565a = aVar;
            this.f79566b = aVar2;
        }

        public final void run() {
            this.f79565a.b(this.f79566b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.c();
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<Thread> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f79561a = new e();

        static {
            Covode.recordClassIndex(49413);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Thread invoke() {
            Looper mainLooper = Looper.getMainLooper();
            h.f.b.l.b(mainLooper, "");
            return mainLooper.getThread();
        }
    }

    static final class f extends m implements h.f.a.a<ao<Param, com.ss.android.ugc.aweme.dependence.a.a.a.a<Param, Target>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f79562a = new f();

        static {
            Covode.recordClassIndex(49414);
        }

        f() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return as.a().b().b();
        }
    }

    private final void d() {
        a((h.f.a.a<? extends Object>) new j(this));
    }

    public final void b() {
        a((h.f.a.a<? extends Object>) new k(this));
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.dependence.a.a.b.b $task;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, com.ss.android.ugc.aweme.dependence.a.a.b.b bVar) {
            super(0);
            this.this$0 = aVar;
            this.$task = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f79551c) {
                this.$task.f79570d.set(true);
                this.this$0.a((com.ss.android.ugc.aweme.dependence.a.a.b.b) this.$task);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.dependence.a.a.b.b $task;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, com.ss.android.ugc.aweme.dependence.a.a.b.b bVar) {
            super(0);
            this.this$0 = aVar;
            this.$task = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f79551c) {
                this.$task.f79570d.set(true);
                this.this$0.a((com.ss.android.ugc.aweme.dependence.a.a.b.b) this.$task);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.a<Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.dependence.a.a.a.a $callback;
        final /* synthetic */ h.f.a.a $finallyBlock;
        final /* synthetic */ Object $param;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, Object obj, com.ss.android.ugc.aweme.dependence.a.a.a.a aVar2, h.f.a.a aVar3) {
            super(0);
            this.this$0 = aVar;
            this.$param = obj;
            this.$callback = aVar2;
            this.$finallyBlock = aVar3;
        }

        @Override // h.f.a.a
        public final Object invoke() {
            com.ss.android.ugc.aweme.dependence.a.a.a.a aVar;
            Object obj = this.$param;
            if (!(obj == null || (aVar = this.$callback) == null)) {
                this.this$0.a().put(obj, aVar);
            }
            h.f.a.a aVar2 = this.$finallyBlock;
            if (aVar2 == null) {
                return null;
            }
            aVar2.invoke();
            return aVar2;
        }
    }

    public static final class l extends m implements h.f.a.a<Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.dependence.a.a.a.a $callback;
        final /* synthetic */ Object $param;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(a aVar, Object obj, com.ss.android.ugc.aweme.dependence.a.a.a.a aVar2) {
            super(0);
            this.this$0 = aVar;
            this.$param = obj;
            this.$callback = aVar2;
        }

        @Override // h.f.a.a
        public final Object invoke() {
            return Boolean.valueOf(this.this$0.a().remove(this.$param, this.$callback));
        }
    }

    private final boolean e() {
        return h.f.b.l.a(this.f79560m.getValue(), Thread.currentThread());
    }

    /* access modifiers changed from: package-private */
    public static final class g<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f79563a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.dependence.a.a.b.b f79564b;

        static {
            Covode.recordClassIndex(49415);
        }

        g(a aVar, com.ss.android.ugc.aweme.dependence.a.a.b.b bVar) {
            this.f79563a = aVar;
            this.f79564b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            try {
                this.f79564b.a(this.f79563a);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.dependence.a.a.b.d dVar = this.f79563a.f79552d;
                if (dVar != null) {
                    dVar.a(e2);
                }
                com.ss.android.ugc.tools.c.f149151f.a(e2);
                this.f79563a.c((com.ss.android.ugc.aweme.dependence.a.a.b.b) this.f79564b);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f79553e = true;
            a aVar = this.this$0;
            aVar.f79554f.clear();
            List<Param> list = aVar.f79555g;
            h.f.b.l.b(list, "");
            for (Param param : list) {
                com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target> a2 = aVar.a((Object) param);
                a2.f79569c = false;
                aVar.f79554f.offer(a2);
            }
            aVar.f79555g.clear();
            this.this$0.c();
            return z.f158842a;
        }
    }

    public final void c() {
        com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target> poll;
        while (this.f79553e && this.n.get() > 0) {
            if (!this.f79556i.isEmpty()) {
                poll = this.f79556i.poll();
            } else if (!this.f79554f.isEmpty()) {
                poll = this.f79554f.poll();
            } else {
                return;
            }
            if (poll != null) {
                this.f79557j.offer(poll);
                b.i.a((Callable) new g(this, poll));
                this.n.decrementAndGet();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.dependence.a.a.b.b $task;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, com.ss.android.ugc.aweme.dependence.a.a.b.b bVar) {
            super(0);
            this.this$0 = aVar;
            this.$task = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2 = this.$task.f79567a.get();
            if (i2 == 2) {
                List<com.ss.android.ugc.aweme.dependence.a.a.a.a<Param, Target>> list = this.this$0.a().get(this.$task.f79574h);
                if (list != null) {
                    for (T t : list) {
                        if (t != null) {
                            t.a(this.$task.f79574h);
                        }
                    }
                }
                a.a("task " + this.$task.f79573g + " state: running, info: " + ((Object) this.$task.f79574h));
            } else if (i2 == 3) {
                List<com.ss.android.ugc.aweme.dependence.a.a.a.a<Param, Target>> list2 = this.this$0.a().get(this.$task.f79574h);
                if (list2 != null) {
                    for (T t2 : list2) {
                        if (t2 != null) {
                            t2.b(this.$task.f79574h);
                        }
                    }
                }
                a.a("task " + this.$task.f79573g + " state: success, info: " + ((Object) this.$task.f79574h));
            } else if (i2 != 4) {
                a.a("task " + this.$task.f79573g + " state: unknown, info: " + ((Object) this.$task.f79574h));
            } else {
                List<com.ss.android.ugc.aweme.dependence.a.a.a.a<Param, Target>> list3 = this.this$0.a().get(this.$task.f79574h);
                if (list3 != null) {
                    for (T t3 : list3) {
                        if (t3 != null) {
                            Param param = this.$task.f79574h;
                            com.ss.android.ugc.aweme.dependence.a.a.b.e eVar = this.$task.f79572f;
                            Exception exc = null;
                            Integer num = eVar != null ? eVar.f79576a : null;
                            com.ss.android.ugc.aweme.dependence.a.a.b.e eVar2 = this.$task.f79572f;
                            if (eVar2 != null) {
                                exc = eVar2.f79578c;
                            }
                            t3.a(param, num, exc);
                        }
                    }
                }
                a.a("task " + this.$task.f79573g + " state: failed, info: " + ((Object) this.$task.f79574h));
            }
            return z.f158842a;
        }
    }

    private final void d(com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target> bVar) {
        this.f79557j.remove(bVar);
    }

    public static void a(String str) {
        com.ss.android.ugc.tools.c.f149151f.a(str);
    }

    private final void e(com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target> bVar) {
        a((h.f.a.a<? extends Object>) new d(this, bVar));
    }

    @Override // com.ss.android.ugc.aweme.dependence.a.a.a.b
    public final void b(com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target> bVar) {
        h.f.b.l.d(bVar, "");
        bVar.a(3);
        d(bVar);
        e(bVar);
        this.n.incrementAndGet();
        d();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target> a(Param param) {
        return this.p.a(param);
    }

    public final void b(h.f.a.a<? extends Object> aVar) {
        try {
            aVar.invoke();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.dependence.a.a.b.d dVar = this.f79552d;
            if (dVar != null) {
                dVar.a(e2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dependence.a.a.a.b
    public final void c(com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target> bVar) {
        h.f.b.l.d(bVar, "");
        bVar.a(4);
        d(bVar);
        if (bVar.f79568b < this.f79549a) {
            bVar.f79568b++;
            this.f79554f.offer(bVar);
        }
        e(bVar);
        this.n.incrementAndGet();
        d();
    }

    public a(com.ss.android.ugc.aweme.dependence.a.a.b.c<Param, Target> cVar) {
        h.f.b.l.d(cVar, "");
        this.p = cVar;
        this.f79550b = true;
        this.f79554f = new ConcurrentLinkedQueue();
        this.f79556i = new ConcurrentLinkedQueue();
        this.f79557j = new ConcurrentLinkedQueue();
        this.f79558k = h.i.a((h.f.a.a) f.f79562a);
        this.f79559l = new Handler(Looper.getMainLooper());
        this.f79560m = h.i.a((h.f.a.a) e.f79561a);
        this.n = new AtomicInteger(3);
        this.f79555g = Collections.synchronizedList(new ArrayList());
    }

    @Override // com.ss.android.ugc.aweme.dependence.a.a.a.b
    public final void a(com.ss.android.ugc.aweme.dependence.a.a.b.b<Param, Target> bVar) {
        int i2;
        h.f.b.l.d(bVar, "");
        if (bVar == null || !(3 == (i2 = bVar.f79567a.get()) || 4 == i2)) {
            bVar.a(2);
        }
        e(bVar);
    }

    public final void a(h.f.a.a<? extends Object> aVar) {
        if (e()) {
            b(aVar);
        } else {
            this.f79559l.post(new i(this, aVar));
        }
    }

    public final boolean b(Param param) {
        if (param == null) {
            return false;
        }
        Iterator<T> it = this.f79557j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Param param2 = next.f79574h;
            if (param2 != null && param2.equals(param)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(Param param) {
        if (param == null) {
            return false;
        }
        Iterator<T> it = this.f79556i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Param param2 = next.f79574h;
            if (param2 != null && param2.equals(param)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(List<? extends Param> list) {
        if (list != null) {
            for (T t : list) {
                if (t != null) {
                    this.f79555g.add(t);
                }
            }
        }
    }

    public final void b(Param param, com.ss.android.ugc.aweme.dependence.a.a.a.a<Param, Target> aVar) {
        if (param != null) {
            T t = null;
            if (!c((Object) param) && !b((Object) param)) {
                Iterator<T> it = this.f79554f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    Param param2 = next.f79574h;
                    if (param2 != null && param2.equals(param)) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    this.f79554f.remove(t2);
                } else {
                    t2 = a((Object) param);
                    if (t2 == null) {
                        return;
                    }
                }
                t2.f79569c = true;
                this.f79556i.offer(t2);
                this.f79553e = true;
                a(param, aVar, new c(this, t2));
                c();
            } else if (this.f79550b) {
                a("add priority task, download is already started, no reentrance, info: ".concat(String.valueOf(param)));
            } else {
                a(param, aVar, null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r6.f79550b == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        a("add normal task, download is already started, no reentrance, info: ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        a(r7, r8, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r1 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r1 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r1 != null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(Param r7, com.ss.android.ugc.aweme.dependence.a.a.a.a<Param, Target> r8) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dependence.a.a.a.a(java.lang.Object, com.ss.android.ugc.aweme.dependence.a.a.a.a):void");
    }

    public final void a(Param param, com.ss.android.ugc.aweme.dependence.a.a.a.a<Param, Target> aVar, h.f.a.a<? extends Object> aVar2) {
        a((h.f.a.a<? extends Object>) new h(this, param, aVar, aVar2));
    }
}
