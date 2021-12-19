package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.ss.android.ugc.aweme.bh.a;
import com.ss.android.ugc.aweme.experiment.dt;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<T extends IInterface> {

    /* renamed from: a  reason: collision with root package name */
    private static final Feature[] f50354a = new Feature[0];
    public static final String[] q = {"service_esmobile", "service_googleme"};
    private int A;
    private final int B;
    private final String C;

    /* renamed from: b  reason: collision with root package name */
    int f50355b;

    /* renamed from: c  reason: collision with root package name */
    long f50356c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f50357d;

    /* renamed from: e  reason: collision with root package name */
    public final Looper f50358e;

    /* renamed from: f  reason: collision with root package name */
    final Handler f50359f;

    /* renamed from: g  reason: collision with root package name */
    final Object f50360g;

    /* renamed from: h  reason: collision with root package name */
    o f50361h;

    /* renamed from: i  reason: collision with root package name */
    protected AbstractC1210c f50362i;

    /* renamed from: j  reason: collision with root package name */
    final ArrayList<g<?>> f50363j;

    /* renamed from: k  reason: collision with root package name */
    final a f50364k;

    /* renamed from: l  reason: collision with root package name */
    final b f50365l;

    /* renamed from: m  reason: collision with root package name */
    ConnectionResult f50366m;
    boolean n;
    public volatile zza o;
    protected AtomicInteger p;
    private long r;
    private int s;
    private long t;
    private ai u;
    private final i v;
    private final com.google.android.gms.common.c w;
    private final Object x;
    private T y;
    private j z;

    public interface a {
        static {
            Covode.recordClassIndex(31384);
        }

        void a();

        void a(int i2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(31385);
        }

        void a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    public interface AbstractC1210c {
        static {
            Covode.recordClassIndex(31386);
        }

        void a(ConnectionResult connectionResult);
    }

    public interface e {
        static {
            Covode.recordClassIndex(31388);
        }

        void a();
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract String b();

    public boolean c() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public Account n() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t() {
        return false;
    }

    public int e() {
        return com.google.android.gms.common.c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public Feature[] o() {
        return f50354a;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> r() {
        return Collections.EMPTY_SET;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, int i3, T t2) {
        synchronized (this.x) {
            if (this.A != i2) {
                return false;
            }
            a(i3, t2);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        a(8, null, null, r5.p.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.common.internal.l r6, java.util.Set<com.google.android.gms.common.api.Scope> r7) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.a(com.google.android.gms.common.internal.l, java.util.Set):void");
    }

    public final void a(String str, PrintWriter printWriter) {
        int i2;
        T t2;
        o oVar;
        synchronized (this.x) {
            i2 = this.A;
            t2 = this.y;
        }
        synchronized (this.f50360g) {
            oVar = this.f50361h;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t2 == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) b()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t2.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (oVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(oVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.r > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.r;
            String format = simpleDateFormat.format(new Date(this.r));
            append.println(new StringBuilder(String.valueOf(format).length() + 21).append(j2).append(" ").append(format).toString());
        }
        if (this.f50356c > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.f50355b;
            if (i3 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 != 2) {
                printWriter.append((CharSequence) String.valueOf(i3));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.f50356c;
            String format2 = simpleDateFormat.format(new Date(this.f50356c));
            append2.println(new StringBuilder(String.valueOf(format2).length() + 21).append(j3).append(" ").append(format2).toString());
        }
        if (this.t > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.g.a(this.s));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.t;
            String format3 = simpleDateFormat.format(new Date(this.t));
            append3.println(new StringBuilder(String.valueOf(format3).length() + 21).append(j4).append(" ").append(format3).toString());
        }
    }

    public Intent d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public Bundle p() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public abstract class g<TListener> {

        /* renamed from: a  reason: collision with root package name */
        private TListener f50371a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f50372b;

        static {
            Covode.recordClassIndex(31390);
        }

        /* access modifiers changed from: protected */
        public abstract void a(TListener tlistener);

        public final void d() {
            synchronized (this) {
                this.f50371a = null;
            }
        }

        public final void c() {
            d();
            synchronized (c.this.f50363j) {
                c.this.f50363j.remove(this);
            }
        }

        public final void b() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f50371a;
                if (this.f50372b) {
                    String.valueOf(String.valueOf(this)).length();
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
            synchronized (this) {
                this.f50372b = true;
            }
            c();
        }

        public g(TListener tlistener) {
            this.f50371a = tlistener;
        }
    }

    private final String u() {
        String str = this.C;
        if (str == null) {
            return this.f50357d.getClass().getName();
        }
        return str;
    }

    private final boolean v() {
        boolean z2;
        synchronized (this.x) {
            if (this.A == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final boolean g() {
        boolean z2;
        synchronized (this.x) {
            if (this.A == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final Feature[] k() {
        zza zza = this.o;
        if (zza == null) {
            return null;
        }
        return zza.f50444b;
    }

    /* access modifiers changed from: protected */
    public final class k extends f {
        static {
            Covode.recordClassIndex(31394);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.f
        public final boolean a() {
            c.this.f50362i.a(ConnectionResult.f49941a);
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.f
        public final void a(ConnectionResult connectionResult) {
            c.this.f50362i.a(connectionResult);
            c.this.a(connectionResult);
        }

        public k(int i2) {
            super(i2, null);
        }
    }

    static {
        Covode.recordClassIndex(31383);
    }

    public final boolean h() {
        boolean z2;
        synchronized (this.x) {
            int i2 = this.A;
            if (i2 == 2 || i2 == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final String j() {
        ai aiVar;
        if (g() && (aiVar = this.u) != null) {
            return aiVar.f50346b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public final void f() {
        this.p.incrementAndGet();
        synchronized (this.f50363j) {
            int size = this.f50363j.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f50363j.get(i2).d();
            }
            this.f50363j.clear();
        }
        synchronized (this.f50360g) {
            this.f50361h = null;
        }
        a(1, (IInterface) null);
    }

    public final void m() {
        int isGooglePlayServicesAvailable = this.w.isGooglePlayServicesAvailable(this.f50357d, e());
        if (isGooglePlayServicesAvailable != 0) {
            a(1, (IInterface) null);
            this.f50362i = (AbstractC1210c) r.a(new d(), "Connection progress callbacks cannot be null.");
            Handler handler = this.f50359f;
            handler.sendMessage(handler.obtainMessage(3, this.p.get(), isGooglePlayServicesAvailable, null));
            return;
        }
        a(new d());
    }

    public final T q() {
        boolean z2;
        T t2;
        synchronized (this.x) {
            if (this.A == 5) {
                throw new DeadObjectException();
            } else if (g()) {
                if (this.y != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                r.a(z2, "Client is connected but service is null");
                t2 = this.y;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return t2;
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        if (this.n || TextUtils.isEmpty(b()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(b());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final class l extends f {

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f50380a;

        static {
            Covode.recordClassIndex(31395);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.google.android.gms.common.internal.c */
        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: com.google.android.gms.common.internal.c */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.f
        public final boolean a() {
            try {
                String interfaceDescriptor = this.f50380a.getInterfaceDescriptor();
                if (!c.this.b().equals(interfaceDescriptor)) {
                    String.valueOf(c.this.b()).length();
                    String.valueOf(interfaceDescriptor).length();
                    return false;
                }
                IInterface a2 = c.this.a(this.f50380a);
                if (a2 == null) {
                    return false;
                }
                if (!c.this.a(2, 4, a2) && !c.this.a(3, 4, a2)) {
                    return false;
                }
                c.this.f50366m = null;
                if (c.this.f50364k != null) {
                    c.this.f50364k.a();
                }
                return true;
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.f
        public final void a(ConnectionResult connectionResult) {
            if (c.this.f50365l != null) {
                c.this.f50365l.a(connectionResult);
            }
            c.this.a(connectionResult);
        }

        public l(int i2, IBinder iBinder, Bundle bundle) {
            super(i2, bundle);
            this.f50380a = iBinder;
        }
    }

    public class d implements AbstractC1210c {
        static {
            Covode.recordClassIndex(31387);
        }

        public d() {
        }

        @Override // com.google.android.gms.common.internal.c.AbstractC1210c
        public final void a(ConnectionResult connectionResult) {
            if (dt.a()) {
                com.ss.android.ugc.aweme.cw.g.a().execute(new a.b(this, connectionResult));
            } else {
                b(connectionResult);
            }
        }

        public void b(ConnectionResult connectionResult) {
            if (connectionResult.b()) {
                c cVar = c.this;
                cVar.a((l) null, cVar.r());
            } else if (c.this.f50365l != null) {
                c.this.f50365l.a(connectionResult);
            }
        }
    }

    final class h extends com.google.android.gms.internal.e.g {
        static {
            Covode.recordClassIndex(31391);
        }

        private static void a(Message message) {
            ((g) message.obj).c();
        }

        private static boolean b(Message message) {
            if (message.what == 2 || message.what == 1 || message.what == 7) {
                return true;
            }
            return false;
        }

        public final void handleMessage(Message message) {
            ConnectionResult connectionResult;
            ConnectionResult connectionResult2;
            if (c.this.p.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                }
            } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !c.this.h()) {
                a(message);
            } else if (message.what == 4) {
                c.this.f50366m = new ConnectionResult(message.arg2);
                if (!c.this.s() || c.this.n) {
                    if (c.this.f50366m != null) {
                        connectionResult2 = c.this.f50366m;
                    } else {
                        connectionResult2 = new ConnectionResult(8);
                    }
                    c.this.f50362i.a(connectionResult2);
                    c.this.a(connectionResult2);
                    return;
                }
                c.this.a((c) 3, (int) null);
            } else if (message.what == 5) {
                if (c.this.f50366m != null) {
                    connectionResult = c.this.f50366m;
                } else {
                    connectionResult = new ConnectionResult(8);
                }
                c.this.f50362i.a(connectionResult);
                c.this.a(connectionResult);
            } else {
                PendingIntent pendingIntent = null;
                if (message.what == 3) {
                    if (message.obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) message.obj;
                    }
                    ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
                    c.this.f50362i.a(connectionResult3);
                    c.this.a(connectionResult3);
                } else if (message.what == 6) {
                    c.this.a((c) 5, (int) null);
                    if (c.this.f50364k != null) {
                        c.this.f50364k.a(message.arg2);
                    }
                    c cVar = c.this;
                    cVar.f50355b = message.arg2;
                    cVar.f50356c = System.currentTimeMillis();
                    c.this.a(5, 1, null);
                } else if (message.what == 2 && !c.this.g()) {
                    a(message);
                } else if (b(message)) {
                    ((g) message.obj).b();
                } else {
                    Log.wtf("GmsClient", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
                }
            }
        }

        public h(Looper looper) {
            super(looper);
        }
    }

    static /* synthetic */ void a(c cVar) {
        int i2;
        if (cVar.v()) {
            i2 = 5;
            cVar.n = true;
        } else {
            i2 = 4;
        }
        Handler handler = cVar.f50359f;
        handler.sendMessage(handler.obtainMessage(i2, cVar.p.get(), 16));
    }

    public final class j implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final int f50377a;

        static {
            Covode.recordClassIndex(31393);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            MethodCollector.i(10649);
            synchronized (c.this.f50360g) {
                try {
                    c.this.f50361h = null;
                } catch (Throwable th) {
                    MethodCollector.o(10649);
                    throw th;
                }
            }
            c.this.f50359f.sendMessage(c.this.f50359f.obtainMessage(6, this.f50377a, 1));
            MethodCollector.o(10649);
        }

        public j(int i2) {
            this.f50377a = i2;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o aVar;
            MethodCollector.i(10647);
            if (iBinder == null) {
                c.a(c.this);
                MethodCollector.o(10647);
                return;
            }
            synchronized (c.this.f50360g) {
                try {
                    c cVar = c.this;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof o)) {
                        aVar = new o.a.C1212a(iBinder);
                    } else {
                        aVar = (o) queryLocalInterface;
                    }
                    cVar.f50361h = aVar;
                } catch (Throwable th) {
                    MethodCollector.o(10647);
                    throw th;
                }
            }
            c.this.a(0, this.f50377a);
            MethodCollector.o(10647);
        }
    }

    abstract class f extends g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final int f50368a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f50369b;

        static {
            Covode.recordClassIndex(31389);
        }

        /* access modifiers changed from: protected */
        public abstract void a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        public abstract boolean a();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.g
        public final /* synthetic */ void a(Boolean bool) {
            if (bool == null) {
                c.this.a((c) 1, (int) null);
                return;
            }
            int i2 = this.f50368a;
            PendingIntent pendingIntent = null;
            if (i2 != 0) {
                if (i2 != 10) {
                    c.this.a((c) 1, (int) null);
                    Bundle bundle = this.f50369b;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    a(new ConnectionResult(this.f50368a, pendingIntent));
                    return;
                }
                c.this.a((c) 1, (int) null);
                throw new IllegalStateException(com.a.a("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), c.this.a(), c.this.b()}));
            } else if (!a()) {
                c.this.a((c) 1, (int) null);
                a(new ConnectionResult(8, null));
            }
        }

        protected f(int i2, Bundle bundle) {
            super(true);
            this.f50368a = i2;
            this.f50369b = bundle;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ConnectionResult connectionResult) {
        this.s = connectionResult.f49942b;
        this.t = System.currentTimeMillis();
    }

    public final void a(AbstractC1210c cVar) {
        this.f50362i = (AbstractC1210c) r.a(cVar, "Connection progress callbacks cannot be null.");
        a(2, (IInterface) null);
    }

    public final void a(e eVar) {
        eVar.a();
    }

    public static final class i extends n.a {

        /* renamed from: a  reason: collision with root package name */
        private c f50375a;

        /* renamed from: b  reason: collision with root package name */
        private final int f50376b;

        static {
            Covode.recordClassIndex(31392);
        }

        public i(c cVar, int i2) {
            this.f50375a = cVar;
            this.f50376b = i2;
        }

        @Override // com.google.android.gms.common.internal.n
        public final void a(int i2, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.n
        public final void a(int i2, IBinder iBinder, Bundle bundle) {
            r.a(this.f50375a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f50375a.a(i2, iBinder, bundle, this.f50376b);
            this.f50375a = null;
        }

        @Override // com.google.android.gms.common.internal.n
        public final void a(int i2, IBinder iBinder, zza zza) {
            r.a(this.f50375a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            r.a(zza);
            this.f50375a.o = zza;
            a(i2, iBinder, zza.f50443a);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3) {
        Handler handler = this.f50359f;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new k(i2)));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(int i2, T t2) {
        boolean z2;
        boolean z3;
        String str;
        ai aiVar;
        boolean z4 = false;
        if (i2 == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (t2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 == z3) {
            z4 = true;
        }
        r.b(z4);
        synchronized (this.x) {
            this.A = i2;
            this.y = t2;
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (!(this.z == null || (aiVar = this.u) == null)) {
                        String str2 = aiVar.f50345a;
                        String str3 = this.u.f50346b;
                        String.valueOf(str2).length();
                        String.valueOf(str3).length();
                        i iVar = this.v;
                        String str4 = this.u.f50345a;
                        String str5 = this.u.f50346b;
                        int i3 = this.u.f50347c;
                        j jVar = this.z;
                        u();
                        iVar.a(str4, str5, i3, jVar, this.u.f50348d);
                        this.p.incrementAndGet();
                    }
                    this.z = new j(this.p.get());
                    ai aiVar2 = new ai("com.google.android.gms", a(), t());
                    this.u = aiVar2;
                    if (!aiVar2.f50348d || e() >= 17895000) {
                        i iVar2 = this.v;
                        String str6 = this.u.f50345a;
                        String str7 = this.u.f50346b;
                        int i4 = this.u.f50347c;
                        j jVar2 = this.z;
                        u();
                        if (!iVar2.a(new i.a(str6, str7, i4, this.u.f50348d), jVar2)) {
                            String str8 = this.u.f50345a;
                            String str9 = this.u.f50346b;
                            String.valueOf(str8).length();
                            String.valueOf(str9).length();
                            a(16, this.p.get());
                        }
                    } else {
                        String valueOf = String.valueOf(this.u.f50345a);
                        if (valueOf.length() != 0) {
                            str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf);
                        } else {
                            str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                        }
                        throw new IllegalStateException(str);
                    }
                } else if (i2 == 4) {
                    this.r = System.currentTimeMillis();
                }
            } else if (this.z != null) {
                i iVar3 = this.v;
                String str10 = this.u.f50345a;
                String str11 = this.u.f50346b;
                int i5 = this.u.f50347c;
                j jVar3 = this.z;
                u();
                iVar3.a(str10, str11, i5, jVar3, this.u.f50348d);
                this.z = null;
            }
        }
    }

    public c(Context context, Looper looper, a aVar, b bVar) {
        this(context, looper, i.a(context), com.google.android.gms.common.c.getInstance(), 93, (a) r.a(aVar), (b) r.a(bVar), null);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.f50359f;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new l(i2, iBinder, bundle)));
    }

    protected c(Context context, Looper looper, i iVar, com.google.android.gms.common.c cVar, int i2, a aVar, b bVar, String str) {
        this.x = new Object();
        this.f50360g = new Object();
        this.f50363j = new ArrayList<>();
        this.A = 1;
        this.f50366m = null;
        this.n = false;
        this.o = null;
        this.p = new AtomicInteger(0);
        this.f50357d = (Context) r.a(context, "Context must not be null");
        this.f50358e = (Looper) r.a(looper, "Looper must not be null");
        this.v = (i) r.a(iVar, "Supervisor must not be null");
        this.w = (com.google.android.gms.common.c) r.a(cVar, "API availability must not be null");
        this.f50359f = new h(looper);
        this.B = i2;
        this.f50364k = aVar;
        this.f50365l = bVar;
        this.C = str;
    }
}
