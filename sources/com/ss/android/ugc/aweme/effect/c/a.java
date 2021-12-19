package com.ss.android.ugc.aweme.effect.c;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f88902a = -1;

    /* renamed from: b  reason: collision with root package name */
    public long f88903b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Long> f88904c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public Map<String, Long> f88905d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public boolean f88906e;

    /* renamed from: f  reason: collision with root package name */
    private int f88907f;

    static {
        Covode.recordClassIndex(55918);
    }

    public final long a() {
        long j2 = this.f88902a;
        if (j2 < 0) {
            return 0;
        }
        return j2;
    }

    public final void a(int i2) {
        if (this.f88907f != i2) {
            this.f88907f = i2;
            this.f88902a = 0;
            this.f88903b = 0;
            this.f88904c.clear();
            this.f88905d.clear();
            a(false);
        }
    }

    public final void a(boolean z) {
        this.f88906e = z;
        if (!z) {
            this.f88904c.clear();
            this.f88905d.clear();
        }
    }

    public final void a(int i2, int i3) {
        if (a() > 0) {
            this.f88902a = ((long) i2) - a();
        }
        long j2 = this.f88903b;
        if (j2 > 0) {
            this.f88903b = ((long) i3) - j2;
        }
    }
}
