package com.ss.android.ugc.aweme.ct;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ct.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f79080a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f79081b;

    /* renamed from: c  reason: collision with root package name */
    String f79082c;

    /* renamed from: d  reason: collision with root package name */
    public final c.a f79083d;

    /* renamed from: e  reason: collision with root package name */
    public volatile int f79084e;

    static {
        Covode.recordClassIndex(49102);
    }

    public final void a() {
        int i2 = this.f79084e;
        if (i2 == 0 || i2 == 1) {
            a(2);
        } else if (i2 == 3) {
            a(6);
        } else if (i2 == 4) {
            a(5);
        }
    }

    public final void a(int i2) {
        if (i2 > this.f79084e && this.f79084e != 2 && this.f79084e != 5 && this.f79084e != 6) {
            this.f79084e = i2;
        }
    }

    public f(Aweme aweme, int i2, String str, c.a aVar) {
        this.f79081b = aweme;
        this.f79080a = i2;
        this.f79083d = aVar;
        this.f79082c = str;
    }
}
