package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.aq;
import com.google.android.gms.common.api.internal.bv;
import com.google.android.gms.common.api.internal.cf;
import com.google.android.gms.common.api.internal.cm;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    static final Set<i> f49990a = Collections.newSetFromMap(new WeakHashMap());

    public interface b extends e {
        static {
            Covode.recordClassIndex(31210);
        }
    }

    public interface c extends m {
        static {
            Covode.recordClassIndex(31211);
        }
    }

    public abstract void a(androidx.fragment.app.e eVar);

    public abstract void a(c cVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void b(c cVar);

    public abstract void e();

    public abstract void f();

    public abstract boolean g();

    public static Set<i> a() {
        Set<i> set = f49990a;
        synchronized (set) {
        }
        return set;
    }

    public Context b() {
        throw new UnsupportedOperationException();
    }

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public void d() {
        throw new UnsupportedOperationException();
    }

    static {
        Covode.recordClassIndex(31208);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Scope> f49991a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final Set<Scope> f49992b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final Map<a<?>, a.d> f49993c = new androidx.c.a();

        /* renamed from: d  reason: collision with root package name */
        private Account f49994d;

        /* renamed from: e  reason: collision with root package name */
        private int f49995e;

        /* renamed from: f  reason: collision with root package name */
        private View f49996f;

        /* renamed from: g  reason: collision with root package name */
        private String f49997g;

        /* renamed from: h  reason: collision with root package name */
        private String f49998h;

        /* renamed from: i  reason: collision with root package name */
        private final Map<a<?>, d.b> f49999i = new androidx.c.a();

        /* renamed from: j  reason: collision with root package name */
        private boolean f50000j = false;

        /* renamed from: k  reason: collision with root package name */
        private final Context f50001k;

        /* renamed from: l  reason: collision with root package name */
        private com.google.android.gms.common.api.internal.i f50002l;

        /* renamed from: m  reason: collision with root package name */
        private int f50003m = -1;
        private c n;
        private Looper o;
        private GoogleApiAvailability p = GoogleApiAvailability.getInstance();
        private a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> q = com.google.android.gms.signin.c.f52109a;
        private final ArrayList<b> r = new ArrayList<>();
        private final ArrayList<c> s = new ArrayList<>();
        private boolean t = false;

        static {
            Covode.recordClassIndex(31209);
        }

        public final i a() {
            boolean z;
            boolean z2;
            MethodCollector.i(12777);
            r.b(!this.f49993c.isEmpty(), "must call addApi() to add at least one API");
            com.google.android.gms.signin.a aVar = com.google.android.gms.signin.a.f52099a;
            if (this.f49993c.containsKey(com.google.android.gms.signin.c.f52110b)) {
                aVar = (com.google.android.gms.signin.a) this.f49993c.get(com.google.android.gms.signin.c.f52110b);
            }
            d dVar = new d(this.f49994d, this.f49991a, this.f49999i, this.f49995e, this.f49996f, this.f49997g, this.f49998h, aVar, false);
            a<?> aVar2 = null;
            Map<a<?>, d.b> map = dVar.f50385d;
            androidx.c.a aVar3 = new androidx.c.a();
            androidx.c.a aVar4 = new androidx.c.a();
            ArrayList arrayList = new ArrayList();
            Iterator<a<?>> it = this.f49993c.keySet().iterator();
            while (true) {
                boolean z3 = false;
                if (it.hasNext()) {
                    a<?> next = it.next();
                    a.d dVar2 = this.f49993c.get(next);
                    if (map.get(next) != null) {
                        z3 = true;
                    }
                    aVar3.put(next, Boolean.valueOf(z3));
                    cm cmVar = new cm(next, z3);
                    arrayList.add(cmVar);
                    a.f a2 = next.a().a(this.f50001k, this.o, dVar, (Object) dVar2, (b) cmVar, (c) cmVar);
                    aVar4.put(next.b(), a2);
                    if (a2.c()) {
                        if (aVar2 == null) {
                            aVar2 = next;
                        } else {
                            String str = next.f49972b;
                            String str2 = aVar2.f49972b;
                            IllegalStateException illegalStateException = new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length()).append(str).append(" cannot be used with ").append(str2).toString());
                            MethodCollector.o(12777);
                            throw illegalStateException;
                        }
                    }
                } else {
                    if (aVar2 != null) {
                        if (this.f49994d == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z = true;
                        r.a(z2, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar2.f49972b);
                        r.a(this.f49991a.equals(this.f49992b), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar2.f49972b);
                    } else {
                        z = true;
                    }
                    aq aqVar = new aq(this.f50001k, new ReentrantLock(), this.o, dVar, this.p, this.q, aVar3, this.r, this.s, aVar4, this.f50003m, aq.a(aVar4.values(), z), arrayList);
                    synchronized (i.f49990a) {
                        try {
                            i.f49990a.add(aqVar);
                        } finally {
                            MethodCollector.o(12777);
                        }
                    }
                    if (this.f50003m >= 0) {
                        cf.b(this.f50002l).a(this.f50003m, aqVar, this.n);
                    }
                    return aqVar;
                }
            }
        }

        public final a a(b bVar) {
            r.a(bVar, "Listener must not be null");
            this.r.add(bVar);
            return this;
        }

        public final a a(a<? extends c> aVar) {
            r.a(aVar, "Api must not be null");
            this.f49993c.put(aVar, null);
            List<Scope> a2 = aVar.f49971a.a(null);
            this.f49992b.addAll(a2);
            this.f49991a.addAll(a2);
            return this;
        }

        public a(Context context) {
            this.f50001k = context;
            this.o = context.getMainLooper();
            this.f49997g = context.getPackageName();
            this.f49998h = context.getClass().getName();
        }

        public final a a(androidx.fragment.app.e eVar, c cVar) {
            com.google.android.gms.common.api.internal.i iVar = new com.google.android.gms.common.api.internal.i(eVar);
            r.b(true, "clientId must be non-negative");
            this.f50003m = 0;
            this.n = cVar;
            this.f50002l = iVar;
            return this;
        }
    }

    public <C extends a.f> C a(a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    public <A extends a.b, T extends d.a<? extends p, A>> T b(T t) {
        throw new UnsupportedOperationException();
    }

    public <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public void b(bv bvVar) {
        throw new UnsupportedOperationException();
    }

    public void a(int i2) {
        throw new UnsupportedOperationException();
    }

    public void a(bv bvVar) {
        throw new UnsupportedOperationException();
    }

    public boolean a(p pVar) {
        throw new UnsupportedOperationException();
    }
}
