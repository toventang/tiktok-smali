package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.d.g;
import com.google.android.gms.signin.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class f implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static final Status f50222a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: b  reason: collision with root package name */
    static final Status f50223b = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: f  reason: collision with root package name */
    static final Object f50224f = new Object();
    private static f p;

    /* renamed from: c  reason: collision with root package name */
    long f50225c = 5000;

    /* renamed from: d  reason: collision with root package name */
    long f50226d = 120000;

    /* renamed from: e  reason: collision with root package name */
    long f50227e = 10000;

    /* renamed from: g  reason: collision with root package name */
    final Context f50228g;

    /* renamed from: h  reason: collision with root package name */
    final GoogleApiAvailability f50229h;

    /* renamed from: i  reason: collision with root package name */
    final k f50230i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicInteger f50231j = new AtomicInteger(1);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f50232k = new AtomicInteger(0);

    /* renamed from: l  reason: collision with root package name */
    final Map<b<?>, a<?>> f50233l = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: m  reason: collision with root package name */
    x f50234m = null;
    final Set<b<?>> n = new androidx.c.b();
    public final Handler o;
    private final Set<b<?>> q = new androidx.c.b();

    public class a<O extends a.d> implements i.c, co {

        /* renamed from: a  reason: collision with root package name */
        public final a.f f50235a;

        /* renamed from: b  reason: collision with root package name */
        final Set<cg> f50236b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final Map<k.a<?>, bm> f50237c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public final int f50238d;

        /* renamed from: e  reason: collision with root package name */
        final br f50239e;

        /* renamed from: f  reason: collision with root package name */
        boolean f50240f;

        /* renamed from: g  reason: collision with root package name */
        final List<c> f50241g = new ArrayList();

        /* renamed from: i  reason: collision with root package name */
        private final Queue<bn> f50243i = new LinkedList();

        /* renamed from: j  reason: collision with root package name */
        private final a.b f50244j;

        /* renamed from: k  reason: collision with root package name */
        private final b<O> f50245k;

        /* renamed from: l  reason: collision with root package name */
        private final cv f50246l;

        /* renamed from: m  reason: collision with root package name */
        private ConnectionResult f50247m = null;

        static {
            Covode.recordClassIndex(31304);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(boolean z) {
            r.a(f.this.o);
            if (!this.f50235a.g() || this.f50237c.size() != 0) {
                return false;
            }
            if (this.f50246l.a()) {
                if (z) {
                    j();
                }
                return false;
            }
            this.f50235a.f();
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void a(c cVar) {
            Feature[] a2;
            if (this.f50241g.remove(cVar)) {
                f.this.o.removeMessages(15, cVar);
                f.this.o.removeMessages(16, cVar);
                Feature feature = cVar.f50255b;
                ArrayList arrayList = new ArrayList(this.f50243i.size());
                for (bn bnVar : this.f50243i) {
                    if ((bnVar instanceof as) && (a2 = ((as) bnVar).a((a<?>) this)) != null && com.google.android.gms.common.util.b.a(a2, feature)) {
                        arrayList.add(bnVar);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    bn bnVar2 = (bn) obj;
                    this.f50243i.remove(bnVar2);
                    bnVar2.a(new u(feature));
                }
            }
        }

        public final boolean i() {
            return this.f50235a.i();
        }

        public final void e() {
            r.a(f.this.o);
            this.f50247m = null;
        }

        public final ConnectionResult f() {
            r.a(f.this.o);
            return this.f50247m;
        }

        /* access modifiers changed from: package-private */
        public final void g() {
            if (this.f50240f) {
                f.this.o.removeMessages(11, this.f50245k);
                f.this.o.removeMessages(9, this.f50245k);
                this.f50240f = false;
            }
        }

        private final void j() {
            f.this.o.removeMessages(12, this.f50245k);
            f.this.o.sendMessageDelayed(f.this.o.obtainMessage(12, this.f50245k), f.this.f50227e);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            e();
            c(ConnectionResult.f49941a);
            g();
            Iterator<bm> it = this.f50237c.values().iterator();
            while (it.hasNext()) {
                if (a(it.next().f50102a.f50268b) != null) {
                    it.remove();
                }
            }
            c();
            j();
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            e();
            this.f50240f = true;
            this.f50246l.c();
            f.this.o.sendMessageDelayed(Message.obtain(f.this.o, 9, this.f50245k), f.this.f50225c);
            f.this.o.sendMessageDelayed(Message.obtain(f.this.o, 11, this.f50245k), f.this.f50226d);
            f.this.f50230i.f50425a.clear();
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            ArrayList arrayList = new ArrayList(this.f50243i);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                bn bnVar = (bn) obj;
                if (!this.f50235a.g()) {
                    return;
                }
                if (b(bnVar)) {
                    this.f50243i.remove(bnVar);
                }
            }
        }

        public final void d() {
            r.a(f.this.o);
            a(f.f50222a);
            this.f50246l.b();
            for (k.a aVar : (k.a[]) this.f50237c.keySet().toArray(new k.a[this.f50237c.size()])) {
                a(new ce(aVar, new com.google.android.gms.c.i()));
            }
            c(new ConnectionResult(4));
            if (this.f50235a.g()) {
                this.f50235a.a(new be(this));
            }
        }

        public final void h() {
            r.a(f.this.o);
            if (!this.f50235a.g() && !this.f50235a.h()) {
                int a2 = f.this.f50230i.a(f.this.f50228g, this.f50235a);
                if (a2 != 0) {
                    a(new ConnectionResult(a2, null));
                    return;
                }
                b bVar = new b(this.f50235a, this.f50245k);
                if (this.f50235a.i()) {
                    this.f50239e.a(bVar);
                }
                this.f50235a.a(bVar);
            }
        }

        private final void c(bn bnVar) {
            bnVar.a(this.f50246l, i());
            try {
                bnVar.c(this);
            } catch (DeadObjectException unused) {
                b(1);
                this.f50235a.f();
            }
        }

        @Override // com.google.android.gms.common.api.internal.e
        public final void a(Bundle bundle) {
            if (Looper.myLooper() == f.this.o.getLooper()) {
                a();
            } else {
                f.this.o.post(new ba(this));
            }
        }

        @Override // com.google.android.gms.common.api.internal.e
        public final void b(int i2) {
            if (Looper.myLooper() == f.this.o.getLooper()) {
                b();
            } else {
                f.this.o.post(new bc(this));
            }
        }

        private final boolean b(ConnectionResult connectionResult) {
            MethodCollector.i(9914);
            synchronized (f.f50224f) {
                try {
                    if (f.this.f50234m == null || !f.this.n.contains(this.f50245k)) {
                        MethodCollector.o(9914);
                        return false;
                    }
                    f.this.f50234m.b(connectionResult, this.f50238d);
                    return true;
                } finally {
                    MethodCollector.o(9914);
                }
            }
        }

        private final void c(ConnectionResult connectionResult) {
            for (cg cgVar : this.f50236b) {
                String str = null;
                if (p.a(connectionResult, ConnectionResult.f49941a)) {
                    str = this.f50235a.j();
                }
                cgVar.a(this.f50245k, connectionResult, str);
            }
            this.f50236b.clear();
        }

        private final Feature a(Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] k2 = this.f50235a.k();
                if (k2 == null) {
                    k2 = new Feature[0];
                }
                androidx.c.a aVar = new androidx.c.a(k2.length);
                for (Feature feature : k2) {
                    aVar.put(feature.f49946a, Long.valueOf(feature.a()));
                }
                for (Feature feature2 : featureArr) {
                    if (!aVar.containsKey(feature2.f49946a) || ((Long) aVar.get(feature2.f49946a)).longValue() < feature2.a()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        private final boolean b(bn bnVar) {
            if (!(bnVar instanceof as)) {
                c(bnVar);
                return true;
            }
            as asVar = (as) bnVar;
            Feature a2 = a(asVar.a((a<?>) this));
            if (a2 == null) {
                c(bnVar);
                return true;
            }
            if (asVar.b(this)) {
                c cVar = new c(this.f50245k, a2, (byte) 0);
                int indexOf = this.f50241g.indexOf(cVar);
                if (indexOf >= 0) {
                    c cVar2 = this.f50241g.get(indexOf);
                    f.this.o.removeMessages(15, cVar2);
                    f.this.o.sendMessageDelayed(Message.obtain(f.this.o, 15, cVar2), f.this.f50225c);
                } else {
                    this.f50241g.add(cVar);
                    f.this.o.sendMessageDelayed(Message.obtain(f.this.o, 15, cVar), f.this.f50225c);
                    f.this.o.sendMessageDelayed(Message.obtain(f.this.o, 16, cVar), f.this.f50226d);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!b(connectionResult)) {
                        f.this.a(connectionResult, this.f50238d);
                    }
                }
            } else {
                asVar.a(new u(a2));
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.internal.m
        public final void a(ConnectionResult connectionResult) {
            r.a(f.this.o);
            br brVar = this.f50239e;
            if (brVar != null) {
                brVar.a();
            }
            e();
            f.this.f50230i.f50425a.clear();
            c(connectionResult);
            if (connectionResult.f49942b == 4) {
                a(f.f50223b);
            } else if (this.f50243i.isEmpty()) {
                this.f50247m = connectionResult;
            } else if (!b(connectionResult) && !f.this.a(connectionResult, this.f50238d)) {
                if (connectionResult.f49942b == 18) {
                    this.f50240f = true;
                }
                if (this.f50240f) {
                    f.this.o.sendMessageDelayed(Message.obtain(f.this.o, 9, this.f50245k), f.this.f50225c);
                    return;
                }
                String str = this.f50245k.f50085b.f49972b;
                String valueOf = String.valueOf(connectionResult);
                a(new Status(17, new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(valueOf).length()).append("API: ").append(str).append(" is not available on this device. Connection failed with: ").append(valueOf).toString()));
            }
        }

        public final void a(Status status) {
            r.a(f.this.o);
            for (bn bnVar : this.f50243i) {
                bnVar.a(status);
            }
            this.f50243i.clear();
        }

        public final void a(bn bnVar) {
            r.a(f.this.o);
            if (!this.f50235a.g()) {
                this.f50243i.add(bnVar);
                ConnectionResult connectionResult = this.f50247m;
                if (connectionResult == null || !connectionResult.a()) {
                    h();
                } else {
                    a(this.f50247m);
                }
            } else if (b(bnVar)) {
                j();
            } else {
                this.f50243i.add(bnVar);
            }
        }

        public a(h<O> hVar) {
            a.f a2 = hVar.a(f.this.o.getLooper(), this);
            this.f50235a = a2;
            if (a2 instanceof s) {
                this.f50244j = ((s) a2).f50431a;
            } else {
                this.f50244j = a2;
            }
            this.f50245k = hVar.f49979d;
            this.f50246l = new cv();
            this.f50238d = hVar.f49981f;
            if (a2.i()) {
                this.f50239e = hVar.a(f.this.f50228g, f.this.o);
            } else {
                this.f50239e = null;
            }
        }

        @Override // com.google.android.gms.common.api.internal.co
        public final void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, boolean z) {
            if (Looper.myLooper() == f.this.o.getLooper()) {
                a(connectionResult);
            } else {
                f.this.o.post(new bb(this, connectionResult));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements bs, c.AbstractC1210c {

        /* renamed from: a  reason: collision with root package name */
        final a.f f50248a;

        /* renamed from: b  reason: collision with root package name */
        final b<?> f50249b;

        /* renamed from: c  reason: collision with root package name */
        boolean f50250c;

        /* renamed from: e  reason: collision with root package name */
        private l f50252e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Scope> f50253f;

        static {
            Covode.recordClassIndex(31305);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            l lVar;
            if (this.f50250c && (lVar = this.f50252e) != null) {
                this.f50248a.a(lVar, this.f50253f);
            }
        }

        @Override // com.google.android.gms.common.internal.c.AbstractC1210c
        public final void a(ConnectionResult connectionResult) {
            f.this.o.post(new bg(this, connectionResult));
        }

        @Override // com.google.android.gms.common.api.internal.bs
        public final void b(ConnectionResult connectionResult) {
            a<?> aVar = f.this.f50233l.get(this.f50249b);
            r.a(f.this.o);
            aVar.f50235a.f();
            aVar.a(connectionResult);
        }

        @Override // com.google.android.gms.common.api.internal.bs
        public final void a(l lVar, Set<Scope> set) {
            if (lVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new ConnectionResult(4));
                return;
            }
            this.f50252e = lVar;
            this.f50253f = set;
            a();
        }

        public b(a.f fVar, b<?> bVar) {
            this.f50248a = fVar;
            this.f50249b = bVar;
        }
    }

    public final void c() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final b<?> f50254a;

        /* renamed from: b  reason: collision with root package name */
        final Feature f50255b;

        static {
            Covode.recordClassIndex(31306);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f50254a, this.f50255b});
        }

        public final String toString() {
            return p.a(this).a("key", this.f50254a).a("feature", this.f50255b).toString();
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                if (!p.a(this.f50254a, cVar.f50254a) || !p.a(this.f50255b, cVar.f50255b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        private c(b<?> bVar, Feature feature) {
            this.f50254a = bVar;
            this.f50255b = feature;
        }

        /* synthetic */ c(b bVar, Feature feature, byte b2) {
            this(bVar, feature);
        }
    }

    static {
        Covode.recordClassIndex(31303);
    }

    public static f a() {
        f fVar;
        MethodCollector.i(12887);
        synchronized (f50224f) {
            try {
                r.a(p, "Must guarantee manager is non-null before using getInstance");
                fVar = p;
            } finally {
                MethodCollector.o(12887);
            }
        }
        return fVar;
    }

    public static void b() {
        MethodCollector.i(12888);
        synchronized (f50224f) {
            try {
                f fVar = p;
                if (fVar != null) {
                    fVar.f50232k.incrementAndGet();
                    Handler handler = fVar.o;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } finally {
                MethodCollector.o(12888);
            }
        }
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final void a(h<?> hVar) {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(7, hVar));
    }

    public static f a(Context context) {
        f fVar;
        MethodCollector.i(12781);
        synchronized (f50224f) {
            try {
                if (p == null) {
                    HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                    handlerThread.start();
                    p = new f(b(context), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
                }
                fVar = p;
            } finally {
                MethodCollector.o(12781);
            }
        }
        return fVar;
    }

    private final void b(h<?> hVar) {
        b<O> bVar = hVar.f49979d;
        a<?> aVar = this.f50233l.get(bVar);
        if (aVar == null) {
            aVar = new a<>(hVar);
            this.f50233l.put(bVar, aVar);
        }
        if (aVar.i()) {
            this.q.add(bVar);
        }
        aVar.h();
    }

    public final com.google.android.gms.c.h<Map<b<?>, String>> a(Iterable<? extends j<?>> iterable) {
        cg cgVar = new cg(iterable);
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(2, cgVar));
        return cgVar.f50153b.f49902a;
    }

    public final void a(x xVar) {
        MethodCollector.i(12988);
        synchronized (f50224f) {
            try {
                if (this.f50234m != xVar) {
                    this.f50234m = xVar;
                    this.n.clear();
                }
                this.n.addAll(xVar.f50281b);
            } finally {
                MethodCollector.o(12988);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        Status status;
        long j2 = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.f50227e = j2;
                this.o.removeMessages(12);
                for (b<?> bVar : this.f50233l.keySet()) {
                    Handler handler = this.o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f50227e);
                }
                break;
            case 2:
                cg cgVar = (cg) message.obj;
                Iterator<b<?>> it = cgVar.f50152a.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b<?> next = it.next();
                        a<?> aVar = this.f50233l.get(next);
                        if (aVar == null) {
                            cgVar.a(next, new ConnectionResult(13), null);
                            break;
                        } else if (aVar.f50235a.g()) {
                            cgVar.a(next, ConnectionResult.f49941a, aVar.f50235a.j());
                        } else if (aVar.f() != null) {
                            cgVar.a(next, aVar.f(), null);
                        } else {
                            r.a(f.this.o);
                            aVar.f50236b.add(cgVar);
                            aVar.h();
                        }
                    }
                }
            case 3:
                for (a<?> aVar2 : this.f50233l.values()) {
                    aVar2.e();
                    aVar2.h();
                }
                break;
            case 4:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                bl blVar = (bl) message.obj;
                a<?> aVar3 = this.f50233l.get(blVar.f50101c.f49979d);
                if (aVar3 == null) {
                    b(blVar.f50101c);
                    aVar3 = this.f50233l.get(blVar.f50101c.f49979d);
                }
                if (!aVar3.i() || this.f50232k.get() == blVar.f50100b) {
                    aVar3.a(blVar.f50099a);
                    break;
                } else {
                    blVar.f50099a.a(f50222a);
                    aVar3.d();
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<a<?>> it2 = this.f50233l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a<?> next2 = it2.next();
                        if (next2.f50238d == i2) {
                            String errorString = this.f50229h.getErrorString(connectionResult.f49942b);
                            String str = connectionResult.f49944d;
                            next2.a(new Status(17, new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(str).length()).append("Error resolution was canceled by the user, original error message: ").append(errorString).append(": ").append(str).toString()));
                            break;
                        }
                    } else {
                        Log.wtf("GoogleApiManager", new StringBuilder(76).append("Could not find API instance ").append(i2).append(" while trying to fail enqueued calls.").toString(), new Exception());
                        break;
                    }
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                if (b(this.f50228g) instanceof Application) {
                    c.a((Application) b(this.f50228g));
                    c.f50136a.a(new az(this));
                    c cVar = c.f50136a;
                    if (!cVar.f50138c.get()) {
                        int i3 = Build.VERSION.SDK_INT;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!cVar.f50138c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            cVar.f50137b.set(true);
                        }
                    }
                    if (!cVar.f50137b.get()) {
                        this.f50227e = 300000;
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                b((h) message.obj);
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                if (this.f50233l.containsKey(message.obj)) {
                    a<?> aVar4 = this.f50233l.get(message.obj);
                    r.a(f.this.o);
                    if (aVar4.f50240f) {
                        aVar4.h();
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                for (b<?> bVar2 : this.q) {
                    this.f50233l.remove(bVar2).d();
                }
                this.q.clear();
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                if (this.f50233l.containsKey(message.obj)) {
                    a<?> aVar5 = this.f50233l.get(message.obj);
                    r.a(f.this.o);
                    if (aVar5.f50240f) {
                        aVar5.g();
                        if (f.this.f50229h.isGooglePlayServicesAvailable(f.this.f50228g) == 18) {
                            status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        aVar5.a(status);
                        aVar5.f50235a.f();
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                if (this.f50233l.containsKey(message.obj)) {
                    this.f50233l.get(message.obj).a(true);
                    break;
                }
                break;
            case ABRConfig.ABR_SELECT_SCENE:
                y yVar = (y) message.obj;
                b<?> bVar3 = yVar.f50283a;
                if (!this.f50233l.containsKey(bVar3)) {
                    yVar.f50284b.a((Boolean) false);
                    break;
                } else {
                    yVar.f50284b.a(Boolean.valueOf(this.f50233l.get(bVar3).a(false)));
                    break;
                }
            case 15:
                c cVar2 = (c) message.obj;
                if (this.f50233l.containsKey(cVar2.f50254a)) {
                    a<?> aVar6 = this.f50233l.get(cVar2.f50254a);
                    if (aVar6.f50241g.contains(cVar2) && !aVar6.f50240f) {
                        if (!aVar6.f50235a.g()) {
                            aVar6.h();
                            break;
                        } else {
                            aVar6.c();
                            break;
                        }
                    }
                }
                break;
            case 16:
                c cVar3 = (c) message.obj;
                if (this.f50233l.containsKey(cVar3.f50254a)) {
                    this.f50233l.get(cVar3.f50254a).a(cVar3);
                    break;
                }
                break;
            default:
                int i4 = message.what;
                return false;
        }
        return true;
    }

    public final void b(ConnectionResult connectionResult, int i2) {
        if (!a(connectionResult, i2)) {
            Handler handler = this.o;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult));
        }
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent a(b<?> bVar, int i2) {
        d dVar;
        a<?> aVar = this.f50233l.get(bVar);
        if (aVar == null || aVar.f50239e == null || (dVar = aVar.f50239e.f50109b) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f50228g, i2, dVar.d(), 134217728);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ConnectionResult connectionResult, int i2) {
        return this.f50229h.zaa(this.f50228g, connectionResult, i2);
    }

    private f(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f50228g = context;
        g gVar = new g(looper, this);
        this.o = gVar;
        this.f50229h = googleApiAvailability;
        this.f50230i = new com.google.android.gms.common.internal.k(googleApiAvailability);
        gVar.sendMessage(gVar.obtainMessage(6));
    }
}
