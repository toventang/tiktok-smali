package com.bytedance.im.core.internal.d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.c.f;

public final class m extends a {

    /* renamed from: e  reason: collision with root package name */
    private k f38733e;

    static {
        Covode.recordClassIndex(23105);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public final String c() {
        return "IM-REQUEST-QUEUE-S";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public final void a() {
        super.a();
        this.f38733e = null;
    }

    private synchronized void f() {
        MethodCollector.i(10052);
        if (this.f38688d.isEmpty()) {
            f.b("imsdk", b() + "sendNextRequest, mQueue empty", (Throwable) null);
            MethodCollector.o(10052);
        } else if (this.f38733e != null) {
            f.b("imsdk", b() + "sendNextRequest, has waitingItem", (Throwable) null);
            MethodCollector.o(10052);
        } else {
            k kVar = (k) this.f38688d.peek();
            if (kVar == null) {
                f.b("imsdk", b() + "sendNextRequest, peeked item null", (Throwable) null);
                MethodCollector.o(10052);
                return;
            }
            if (kVar.r <= 0) {
                kVar.r = SystemClock.uptimeMillis();
            }
            this.f38733e = kVar;
            a(kVar);
            MethodCollector.o(10052);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public final void c(k kVar) {
        if (kVar == this.f38733e) {
            this.f38733e = null;
            f();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public final void d(k kVar) {
        super.d(kVar);
        if (kVar == this.f38733e) {
            g(kVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public final void g(k kVar) {
        super.g(kVar);
        this.f38733e = null;
        f();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public final void h(k kVar) {
        super.h(kVar);
        this.f38733e = null;
        f();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public final void b(k kVar) {
        if (!this.f38688d.contains(kVar)) {
            this.f38688d.add(kVar);
            kVar.q = SystemClock.uptimeMillis();
        }
        if (i(kVar)) {
            f();
        }
    }
}
