package com.bytedance.sdk.a.j.a;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.j.a.e;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class c implements WeakHandler.IHandler, e, Comparable<e>, Runnable {

    /* renamed from: g  reason: collision with root package name */
    private static f f43354g = f.a();

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicBoolean f43355a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    protected final AtomicBoolean f43356b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    WeakHandler f43357c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d  reason: collision with root package name */
    int f43358d;

    /* renamed from: e  reason: collision with root package name */
    public final String f43359e;

    /* renamed from: f  reason: collision with root package name */
    protected final e.a f43360f;

    public void run() {
    }

    @Override // com.bytedance.sdk.a.j.a.e
    public final e.a d() {
        return this.f43360f;
    }

    @Override // com.bytedance.sdk.a.j.a.e
    public final int e() {
        return this.f43358d;
    }

    public final boolean a() {
        return this.f43356b.get();
    }

    public final void c() {
        this.f43356b.compareAndSet(false, true);
    }

    public final void g() {
        this.f43357c.removeMessages(0);
    }

    static {
        Covode.recordClassIndex(26568);
    }

    public final void f() {
        g();
        this.f43357c.sendEmptyMessageDelayed(0, 1000);
    }

    public final void b() {
        if (this.f43355a.compareAndSet(false, true)) {
            if (f43354g == null) {
                f43354g = f.a();
            }
            f43354g.a(this);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    f43354g.b();
                } else if (i2 == 1) {
                    f43354g.c();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(e eVar) {
        e eVar2 = eVar;
        e.a aVar = this.f43360f;
        e.a d2 = eVar2.d();
        if (aVar == null) {
            aVar = e.a.NORMAL;
        }
        if (d2 == null) {
            d2 = e.a.NORMAL;
        }
        if (aVar == d2) {
            return this.f43358d - eVar2.e();
        }
        return d2.ordinal() - aVar.ordinal();
    }

    public c(String str, e.a aVar) {
        this.f43360f = aVar;
        this.f43359e = m.a(null) ? getClass().getSimpleName() : str;
    }
}
