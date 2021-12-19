package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f8985a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f8986b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8987c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8988d;

    static {
        Covode.recordClassIndex(4582);
    }

    k(long j2, Map map, String str, int i2) {
        this.f8985a = j2;
        this.f8986b = map;
        this.f8987c = str;
        this.f8988d = i2;
    }

    public final void run() {
        c.a(this.f8987c, this.f8988d, c.a(this.f8985a), c.a(this.f8986b));
    }
}
