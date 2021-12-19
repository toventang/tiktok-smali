package com.bytedance.b.b.a.d;

import com.bytedance.android.livesdk.livesetting.feed.BackRefreshTimeoutSetting;
import com.bytedance.b.k.f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class c {
    private static final long[] n = {120000, 300000, 600000, 1800000, 3600000};

    /* renamed from: a  reason: collision with root package name */
    volatile int f25928a;

    /* renamed from: b  reason: collision with root package name */
    volatile int f25929b;

    /* renamed from: c  reason: collision with root package name */
    volatile int f25930c;

    /* renamed from: d  reason: collision with root package name */
    volatile int f25931d;

    /* renamed from: e  reason: collision with root package name */
    volatile int f25932e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f25933f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f25934g;

    /* renamed from: h  reason: collision with root package name */
    List<String> f25935h;

    /* renamed from: i  reason: collision with root package name */
    volatile boolean f25936i;

    /* renamed from: j  reason: collision with root package name */
    AtomicLong f25937j;

    /* renamed from: k  reason: collision with root package name */
    AtomicLong f25938k;

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.b.b.a.a.a f25939l;

    /* renamed from: m  reason: collision with root package name */
    volatile boolean f25940m;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static c f25941a = new c((byte) 0);

        static {
            Covode.recordClassIndex(15123);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f25936i = false;
        this.f25937j.set(System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f25936i || System.currentTimeMillis() - this.f25937j.get() > d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long d() {
        int i2;
        if (this.f25929b > this.f25931d) {
            i2 = this.f25929b;
        } else {
            i2 = this.f25931d;
        }
        long j2 = (long) i2;
        if (j2 > ((long) this.f25932e)) {
            return j2;
        }
        return (long) this.f25932e;
    }

    static {
        Covode.recordClassIndex(15122);
    }

    private c() {
        this.f25936i = true;
        this.f25933f = new ArrayList();
        this.f25934g = new ArrayList();
        this.f25935h = new ArrayList();
        this.f25937j = new AtomicLong(0);
        this.f25938k = new AtomicLong();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f25928a == 0) {
            this.f25928a = 1;
            this.f25929b = 300000;
        } else if (this.f25928a == 1) {
            this.f25928a = 2;
            this.f25929b = 900000;
        } else if (this.f25928a == 2) {
            this.f25928a = 3;
            this.f25929b = BackRefreshTimeoutSetting.DEFAULT;
        } else {
            this.f25928a = 4;
            this.f25929b = BackRefreshTimeoutSetting.DEFAULT;
        }
        com.bytedance.b.e.a.a.r();
        c();
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    static long a(int i2) {
        int i3 = i2 - 1;
        if (i3 < 0) {
            return 0;
        }
        long[] jArr = n;
        if (i3 >= jArr.length) {
            return jArr[jArr.length - 1];
        }
        return jArr[i3];
    }

    public final void a(List<String> list) {
        if (!f.a(list)) {
            this.f25935h.clear();
            this.f25935h.addAll(list);
        }
    }
}
