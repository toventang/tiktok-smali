package com.ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f142479a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Long f142480b;

    /* renamed from: c  reason: collision with root package name */
    private final long f142481c;

    static {
        Covode.recordClassIndex(93186);
    }

    private final void b() {
        this.f142479a = true;
        this.f142480b = Long.valueOf(System.currentTimeMillis());
    }

    public final boolean a() {
        if (this.f142480b == null) {
            b();
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l2 = this.f142480b;
        if (l2 == null) {
            l.b();
        }
        if (currentTimeMillis - l2.longValue() >= this.f142481c) {
            b();
            return false;
        } else if (this.f142479a) {
            return true;
        } else {
            b();
            return false;
        }
    }

    public a(long j2) {
        this.f142481c = j2;
    }
}
