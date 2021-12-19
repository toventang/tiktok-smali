package com.ss.android.ugc.aweme.choosemusic.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f70741a;

    /* renamed from: b  reason: collision with root package name */
    public long f70742b;

    /* renamed from: c  reason: collision with root package name */
    private long f70743c;

    /* renamed from: d  reason: collision with root package name */
    private int f70744d;

    static {
        Covode.recordClassIndex(43610);
    }

    public final int c(String str) {
        if (!l.a((Object) this.f70741a, (Object) str)) {
            return 0;
        }
        return this.f70744d;
    }

    public final void a(String str) {
        if (!l.a((Object) this.f70741a, (Object) str)) {
            this.f70742b = -1;
            this.f70743c = 0;
            return;
        }
        this.f70743c = System.currentTimeMillis() - this.f70742b;
    }

    public final long b(String str) {
        if (!l.a((Object) this.f70741a, (Object) str)) {
            return 0;
        }
        if (this.f70743c <= 0 && this.f70742b > 0) {
            this.f70743c = System.currentTimeMillis() - this.f70742b;
        }
        return this.f70743c;
    }

    public final void a(String str, int i2) {
        this.f70741a = str;
        this.f70743c = 0;
        this.f70742b = System.currentTimeMillis();
        this.f70744d = i2;
    }
}
