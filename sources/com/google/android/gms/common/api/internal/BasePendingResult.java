package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.d.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult<R extends p> extends k<R> {

    /* renamed from: c  reason: collision with root package name */
    static final ThreadLocal<Boolean> f50004c = new cl();

    /* renamed from: a  reason: collision with root package name */
    private final Object f50005a;

    /* renamed from: b  reason: collision with root package name */
    private final a<R> f50006b;

    /* renamed from: d  reason: collision with root package name */
    R f50007d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<i> f50008e;

    /* renamed from: f  reason: collision with root package name */
    private final CountDownLatch f50009f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<k.a> f50010g;

    /* renamed from: h  reason: collision with root package name */
    private q<? super R> f50011h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference<ca> f50012i;

    /* renamed from: j  reason: collision with root package name */
    private Status f50013j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f50014k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f50015l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f50016m;
    private b mResultGuardian;
    private m n;
    private volatile bv<R> o;
    private boolean p;

    /* access modifiers changed from: protected */
    public abstract R a(Status status);

    @Override // com.google.android.gms.common.api.k
    public final Integer c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final class b {
        static {
            Covode.recordClassIndex(31214);
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            super.finalize();
        }

        private b() {
        }

        /* synthetic */ b(BasePendingResult basePendingResult, byte b2) {
            this();
        }
    }

    public static class a<R extends p> extends g {
        static {
            Covode.recordClassIndex(31213);
        }

        public a() {
            this(Looper.getMainLooper());
        }

        public a(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.google.android.gms.common.api.q */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                try {
                    ((q) pair.first).a((p) pair.second);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } else if (i2 != 2) {
                Log.wtf("BasePendingResult", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).c(Status.f49963d);
            }
        }

        public final void a(q<? super R> qVar, R r) {
            sendMessage(obtainMessage(1, new Pair(qVar, r)));
        }
    }

    static {
        Covode.recordClassIndex(31212);
    }

    private boolean f() {
        if (this.f50009f.getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.k
    public final boolean b() {
        boolean z;
        synchronized (this.f50005a) {
            z = this.f50015l;
        }
        return z;
    }

    @Override // com.google.android.gms.common.api.k
    public final void a() {
        synchronized (this.f50005a) {
            if (!this.f50015l && !this.f50014k) {
                this.f50015l = true;
                b(a(Status.f49964e));
            }
        }
    }

    public final boolean d() {
        boolean b2;
        synchronized (this.f50005a) {
            if (this.f50008e.get() == null || !this.p) {
                a();
            }
            b2 = b();
        }
        return b2;
    }

    public final void e() {
        boolean z;
        if (this.p || f50004c.get().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
    }

    BasePendingResult() {
        this.f50005a = new Object();
        this.f50009f = new CountDownLatch(1);
        this.f50010g = new ArrayList<>();
        this.f50012i = new AtomicReference<>();
        this.p = false;
        this.f50006b = new a<>(Looper.getMainLooper());
        this.f50008e = new WeakReference<>(null);
    }

    private final R g() {
        boolean z;
        R r;
        synchronized (this.f50005a) {
            if (!this.f50014k) {
                z = true;
            } else {
                z = false;
            }
            r.a(z, "Result has already been consumed.");
            r.a(f(), "Result is not ready.");
            r = this.f50007d;
            this.f50007d = null;
            this.f50011h = null;
            this.f50014k = true;
        }
        ca andSet = this.f50012i.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    public final void a(ca caVar) {
        this.f50012i.set(caVar);
    }

    public final void c(Status status) {
        synchronized (this.f50005a) {
            if (!f()) {
                a(a(status));
                this.f50016m = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final R a(TimeUnit timeUnit) {
        boolean z = true;
        r.a(!this.f50014k, "Result has already been consumed.");
        if (this.o != null) {
            z = false;
        }
        r.a(z, "Cannot await if then() has been called.");
        try {
            if (!this.f50009f.await(0, timeUnit)) {
                c(Status.f49963d);
            }
        } catch (InterruptedException unused) {
            c(Status.f49961b);
        }
        r.a(f(), "Result is not ready.");
        return g();
    }

    public BasePendingResult(i iVar) {
        Looper mainLooper;
        this.f50005a = new Object();
        this.f50009f = new CountDownLatch(1);
        this.f50010g = new ArrayList<>();
        this.f50012i = new AtomicReference<>();
        this.p = false;
        if (iVar != null) {
            mainLooper = iVar.c();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f50006b = new a<>(mainLooper);
        this.f50008e = new WeakReference<>(iVar);
    }

    private final void b(R r) {
        this.f50007d = r;
        this.n = null;
        this.f50009f.countDown();
        this.f50013j = this.f50007d.D_();
        int i2 = 0;
        if (this.f50015l) {
            this.f50011h = null;
        } else if (this.f50011h != null) {
            this.f50006b.removeMessages(2);
            this.f50006b.a(this.f50011h, g());
        } else if (this.f50007d instanceof com.google.android.gms.common.api.m) {
            this.mResultGuardian = new b(this, (byte) 0);
        }
        ArrayList<k.a> arrayList = this.f50010g;
        int size = arrayList.size();
        while (i2 < size) {
            k.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.f50013j);
        }
        this.f50010g.clear();
    }

    @Override // com.google.android.gms.common.api.k
    public final void a(k.a aVar) {
        r.b(true, "Callback cannot be null.");
        synchronized (this.f50005a) {
            if (f()) {
                aVar.a(this.f50013j);
            } else {
                this.f50010g.add(aVar);
            }
        }
    }

    public final void a(R r) {
        boolean z;
        synchronized (this.f50005a) {
            if (!this.f50016m && !this.f50015l) {
                f();
                boolean z2 = true;
                if (!f()) {
                    z = true;
                } else {
                    z = false;
                }
                r.a(z, "Results have already been set");
                if (this.f50014k) {
                    z2 = false;
                }
                r.a(z2, "Result has already been consumed");
                b(r);
            }
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void a(q<? super R> qVar) {
        boolean z;
        synchronized (this.f50005a) {
            if (qVar == null) {
                this.f50011h = null;
                return;
            }
            boolean z2 = true;
            if (!this.f50014k) {
                z = true;
            } else {
                z = false;
            }
            r.a(z, "Result has already been consumed.");
            if (this.o != null) {
                z2 = false;
            }
            r.a(z2, "Cannot set callbacks if then() has been called.");
            if (!b()) {
                if (f()) {
                    this.f50006b.a(qVar, g());
                } else {
                    this.f50011h = qVar;
                }
            }
        }
    }
}
