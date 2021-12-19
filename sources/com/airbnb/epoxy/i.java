package com.airbnb.epoxy;

import com.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class i implements ak {

    /* renamed from: a  reason: collision with root package name */
    private final String f5044a;

    /* renamed from: b  reason: collision with root package name */
    private long f5045b;

    /* renamed from: c  reason: collision with root package name */
    private String f5046c;

    static {
        Covode.recordClassIndex(2130);
    }

    private void b() {
        this.f5045b = -1;
        this.f5046c = null;
    }

    @Override // com.airbnb.epoxy.ak
    public final void a() {
        if (this.f5045b != -1) {
            a.a(this.f5046c + ": %.3fms", new Object[]{Float.valueOf(((float) (System.nanoTime() - this.f5045b)) / 1000000.0f)});
            b();
            return;
        }
        throw new IllegalStateException("Timer was not started");
    }

    i(String str) {
        this.f5044a = str;
        b();
    }

    @Override // com.airbnb.epoxy.ak
    public final void a(String str) {
        if (this.f5045b == -1) {
            this.f5045b = System.nanoTime();
            this.f5046c = str;
            return;
        }
        throw new IllegalStateException("Timer was already started");
    }
}
