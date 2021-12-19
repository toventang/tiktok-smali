package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class aq extends i implements bk {

    /* renamed from: b  reason: collision with root package name */
    final Lock f50053b;

    /* renamed from: c  reason: collision with root package name */
    final Queue<d.a<?, ?>> f50054c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    final Map<a.c<?>, a.f> f50055d;

    /* renamed from: e  reason: collision with root package name */
    Set<Scope> f50056e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    Set<bv> f50057f = null;

    /* renamed from: g  reason: collision with root package name */
    final bz f50058g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f50059h;

    /* renamed from: i  reason: collision with root package name */
    private final h f50060i;

    /* renamed from: j  reason: collision with root package name */
    private bj f50061j;

    /* renamed from: k  reason: collision with root package name */
    private final int f50062k;

    /* renamed from: l  reason: collision with root package name */
    private final Context f50063l;

    /* renamed from: m  reason: collision with root package name */
    private final Looper f50064m;
    private volatile boolean n;
    private long o = 120000;
    private long p = 5000;
    private final ar q;
    private final GoogleApiAvailability r;
    private bi s;
    private final com.google.android.gms.common.internal.d t;
    private final Map<a<?>, Boolean> u;
    private final a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> v;
    private final l w = new l();
    private final ArrayList<cm> x;
    private Integer y = null;
    private final h.a z;

    static {
        Covode.recordClassIndex(31233);
    }

    private static String c(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    @Override // com.google.android.gms.common.api.i
    public final Context b() {
        return this.f50063l;
    }

    @Override // com.google.android.gms.common.api.i
    public final Looper c() {
        return this.f50064m;
    }

    @Override // com.google.android.gms.common.api.internal.bk
    public final void a(ConnectionResult connectionResult) {
        MethodCollector.i(9893);
        if (!this.r.isPlayServicesPossiblyUpdating(this.f50063l, connectionResult.f49942b)) {
            i();
        }
        if (!this.n) {
            h hVar = this.f50060i;
            r.a(hVar.f50412h, "onConnectionFailure must only be called on the Handler thread");
            hVar.f50412h.removeMessages(1);
            synchronized (hVar.f50413i) {
                try {
                    ArrayList arrayList = new ArrayList(hVar.f50408d);
                    int i2 = hVar.f50410f.get();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i3);
                        i3++;
                        i.c cVar = (i.c) obj;
                        if (hVar.f50409e && hVar.f50410f.get() == i2) {
                            if (hVar.f50408d.contains(cVar)) {
                                cVar.a(connectionResult);
                            }
                        }
                    }
                } finally {
                    MethodCollector.o(9893);
                }
            }
            this.f50060i.a();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean a(p pVar) {
        bj bjVar = this.f50061j;
        return bjVar != null && bjVar.a(pVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final void a(bv bvVar) {
        this.f50053b.lock();
        try {
            if (this.f50057f == null) {
                this.f50057f = new HashSet();
            }
            this.f50057f.add(bvVar);
        } finally {
            this.f50053b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f50063l);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.n);
        printWriter.append(" mWorkQueue.size()=").print(this.f50054c.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f50058g.f50133c.size());
        bj bjVar = this.f50061j;
        if (bjVar != null) {
            bjVar.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void d() {
        bj bjVar = this.f50061j;
        if (bjVar != null) {
            bjVar.e();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean g() {
        bj bjVar = this.f50061j;
        if (bjVar == null || !bjVar.d()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.f50060i.f50409e = true;
        this.f50061j.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        if (!this.n) {
            return false;
        }
        this.n = false;
        this.q.removeMessages(2);
        this.q.removeMessages(1);
        bi biVar = this.s;
        if (biVar != null) {
            biVar.a();
            this.s = null;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String k() {
        StringWriter stringWriter = new StringWriter();
        a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final boolean j() {
        this.f50053b.lock();
        try {
            Set<bv> set = this.f50057f;
            if (set == null) {
                this.f50053b.unlock();
                return false;
            }
            boolean z2 = !set.isEmpty();
            this.f50053b.unlock();
            return z2;
        } catch (Throwable th) {
            this.f50053b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void e() {
        this.f50053b.lock();
        try {
            boolean z2 = false;
            if (this.f50062k >= 0) {
                if (this.y != null) {
                    z2 = true;
                }
                r.a(z2, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.y;
                if (num == null) {
                    this.y = Integer.valueOf(a((Iterable<a.f>) this.f50055d.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            a(this.y.intValue());
        } finally {
            this.f50053b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void f() {
        this.f50053b.lock();
        try {
            this.f50058g.a();
            bj bjVar = this.f50061j;
            if (bjVar != null) {
                bjVar.b();
            }
            l lVar = this.w;
            for (k<?> kVar : lVar.f50266a) {
                kVar.f50263a = null;
            }
            lVar.f50266a.clear();
            for (d.a<?, ?> aVar : this.f50054c) {
                aVar.a((ca) null);
                aVar.a();
            }
            this.f50054c.clear();
            if (this.f50061j != null) {
                i();
                this.f50060i.a();
                this.f50053b.unlock();
            }
        } finally {
            this.f50053b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void a(i.c cVar) {
        this.f50060i.a(cVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final <C extends a.f> C a(a.c<C> cVar) {
        C c2 = (C) this.f50055d.get(cVar);
        r.a(c2, "Appropriate Api was not requested.");
        return c2;
    }

    static /* synthetic */ void a(aq aqVar) {
        aqVar.f50053b.lock();
        try {
            if (aqVar.n) {
                aqVar.h();
            }
        } finally {
            aqVar.f50053b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void b(i.c cVar) {
        MethodCollector.i(9728);
        h hVar = this.f50060i;
        r.a(cVar);
        synchronized (hVar.f50413i) {
            try {
                if (!hVar.f50408d.remove(cVar)) {
                    String.valueOf(String.valueOf(cVar)).length();
                }
            } finally {
                MethodCollector.o(9728);
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t2) {
        boolean z2;
        String str;
        if (t2.f50220a != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        r.b(z2, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f50055d.containsKey(t2.f50220a);
        if (t2.f50221b != null) {
            str = t2.f50221b.f49972b;
        } else {
            str = "the API";
        }
        r.b(containsKey, new StringBuilder(String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.f50053b.lock();
        try {
            bj bjVar = this.f50061j;
            if (bjVar == null) {
                this.f50054c.add(t2);
                return t2;
            }
            T t3 = (T) bjVar.a(t2);
            this.f50053b.unlock();
            return t3;
        } finally {
            this.f50053b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void b(bv bvVar) {
        this.f50053b.lock();
        try {
            Set<bv> set = this.f50057f;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!set.remove(bvVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!j()) {
                this.f50061j.f();
            }
        } finally {
            this.f50053b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void a(int i2) {
        this.f50053b.lock();
        boolean z2 = true;
        if (!(i2 == 3 || i2 == 1 || i2 == 2)) {
            z2 = false;
        }
        try {
            r.b(z2, new StringBuilder(33).append("Illegal sign-in mode: ").append(i2).toString());
            b(i2);
            h();
        } finally {
            this.f50053b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final <A extends a.b, T extends d.a<? extends p, A>> T b(T t2) {
        boolean z2;
        String str;
        if (t2.f50220a != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        r.b(z2, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f50055d.containsKey(t2.f50220a);
        if (t2.f50221b != null) {
            str = t2.f50221b.f49972b;
        } else {
            str = "the API";
        }
        r.b(containsKey, new StringBuilder(String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.f50053b.lock();
        try {
            if (this.f50061j == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.n) {
                this.f50054c.add(t2);
                while (!this.f50054c.isEmpty()) {
                    d.a<?, ?> remove = this.f50054c.remove();
                    this.f50058g.a(remove);
                    remove.b(Status.f49962c);
                }
                return t2;
            } else {
                T t3 = (T) this.f50061j.b(t2);
                this.f50053b.unlock();
                return t3;
            }
        } finally {
            this.f50053b.unlock();
        }
    }

    private final void b(int i2) {
        Integer num = this.y;
        if (num == null) {
            this.y = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            String c2 = c(i2);
            String c3 = c(this.y.intValue());
            throw new IllegalStateException(new StringBuilder(String.valueOf(c2).length() + 51 + String.valueOf(c3).length()).append("Cannot use sign-in mode: ").append(c2).append(". Mode was already set to ").append(c3).toString());
        }
        if (this.f50061j == null) {
            boolean z2 = false;
            boolean z3 = false;
            for (a.f fVar : this.f50055d.values()) {
                if (fVar.i()) {
                    z2 = true;
                }
                if (fVar.c()) {
                    z3 = true;
                }
            }
            int intValue = this.y.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z2) {
                    if (this.f50059h) {
                        this.f50061j = new cs(this.f50063l, this.f50053b, this.f50064m, this.r, this.f50055d, this.t, this.u, this.v, this.x, this, true);
                        return;
                    } else {
                        this.f50061j = cn.a(this.f50063l, this, this.f50053b, this.f50064m, this.r, this.f50055d, this.t, this.u, this.v, this.x);
                        return;
                    }
                }
            } else if (!z2) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z3) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.f50059h || z3) {
                this.f50061j = new aw(this.f50063l, this, this.f50053b, this.f50064m, this.r, this.f50055d, this.t, this.u, this.v, this.x, this);
            } else {
                this.f50061j = new cs(this.f50063l, this.f50053b, this.f50064m, this.r, this.f50055d, this.t, this.u, this.v, this.x, this, false);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.bk
    public final void a(Bundle bundle) {
        boolean z2;
        MethodCollector.i(9731);
        while (!this.f50054c.isEmpty()) {
            b(this.f50054c.remove());
        }
        h hVar = this.f50060i;
        r.a(hVar.f50412h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (hVar.f50413i) {
            try {
                boolean z3 = true;
                if (!hVar.f50411g) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                r.a(z2);
                hVar.f50412h.removeMessages(1);
                hVar.f50411g = true;
                if (hVar.f50407c.size() != 0) {
                    z3 = false;
                }
                r.a(z3);
                ArrayList arrayList = new ArrayList(hVar.f50406b);
                int i2 = hVar.f50410f.get();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    i.b bVar = (i.b) obj;
                    if (!hVar.f50409e || !hVar.f50405a.g() || hVar.f50410f.get() != i2) {
                        break;
                    } else if (!hVar.f50407c.contains(bVar)) {
                        bVar.a(bundle);
                    }
                }
                hVar.f50407c.clear();
                hVar.f50411g = false;
            } finally {
                MethodCollector.o(9731);
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void a(e eVar) {
        i iVar = new i(eVar);
        if (this.f50062k >= 0) {
            cf.b(iVar).a(this.f50062k);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    public static int a(Iterable<a.f> iterable, boolean z2) {
        boolean z3 = false;
        boolean z4 = false;
        for (a.f fVar : iterable) {
            if (fVar.i()) {
                z3 = true;
            }
            if (fVar.c()) {
                z4 = true;
            }
        }
        if (!z3) {
            return 3;
        }
        if (!z4 || !z2) {
            return 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.common.api.internal.bk
    public final void a(int i2, boolean z2) {
        MethodCollector.i(9896);
        if (i2 == 1 && !z2 && !this.n) {
            this.n = true;
            if (this.s == null) {
                try {
                    GoogleApiAvailability googleApiAvailability = this.r;
                    Context applicationContext = this.f50063l.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                        if (applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                    }
                    this.s = googleApiAvailability.zaa(applicationContext, new au(this));
                } catch (SecurityException unused) {
                }
            }
            ar arVar = this.q;
            arVar.sendMessageDelayed(arVar.obtainMessage(1), this.o);
            ar arVar2 = this.q;
            arVar2.sendMessageDelayed(arVar2.obtainMessage(2), this.p);
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f50058g.f50133c.toArray(bz.f50132b)) {
            basePendingResult.c(bz.f50131a);
        }
        h hVar = this.f50060i;
        r.a(hVar.f50412h, "onUnintentionalDisconnection must only be called on the Handler thread");
        hVar.f50412h.removeMessages(1);
        synchronized (hVar.f50413i) {
            try {
                hVar.f50411g = true;
                ArrayList arrayList = new ArrayList(hVar.f50406b);
                int i3 = hVar.f50410f.get();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    i.b bVar = (i.b) obj;
                    if (!hVar.f50409e || hVar.f50410f.get() != i3) {
                        break;
                    } else if (hVar.f50406b.contains(bVar)) {
                        bVar.b(i2);
                    }
                }
                hVar.f50407c.clear();
                hVar.f50411g = false;
            } finally {
                MethodCollector.o(9896);
            }
        }
        this.f50060i.a();
        if (i2 == 2) {
            h();
        }
    }

    public aq(Context context, Lock lock, Looper looper, com.google.android.gms.common.internal.d dVar, GoogleApiAvailability googleApiAvailability, a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> aVar, Map<a<?>, Boolean> map, List<i.b> list, List<i.c> list2, Map<a.c<?>, a.f> map2, int i2, int i3, ArrayList<cm> arrayList) {
        MethodCollector.i(9563);
        ap apVar = new ap(this);
        this.z = apVar;
        this.f50063l = context;
        this.f50053b = lock;
        this.f50059h = false;
        this.f50060i = new h(looper, apVar);
        this.f50064m = looper;
        this.q = new ar(this, looper);
        this.r = googleApiAvailability;
        this.f50062k = i2;
        if (i2 >= 0) {
            this.y = Integer.valueOf(i3);
        }
        this.u = map;
        this.f50055d = map2;
        this.x = arrayList;
        this.f50058g = new bz(map2);
        for (i.b bVar : list) {
            h hVar = this.f50060i;
            r.a(bVar);
            synchronized (hVar.f50413i) {
                try {
                    if (hVar.f50406b.contains(bVar)) {
                        String.valueOf(String.valueOf(bVar)).length();
                    } else {
                        hVar.f50406b.add(bVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9563);
                    throw th;
                }
            }
            if (hVar.f50405a.g()) {
                hVar.f50412h.sendMessage(hVar.f50412h.obtainMessage(1, bVar));
            }
        }
        for (i.c cVar : list2) {
            this.f50060i.a(cVar);
        }
        this.t = dVar;
        this.v = aVar;
        MethodCollector.o(9563);
    }
}
