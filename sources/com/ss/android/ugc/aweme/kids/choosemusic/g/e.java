package com.ss.android.ugc.aweme.kids.choosemusic.g;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f105654a;

    /* renamed from: b  reason: collision with root package name */
    public long f105655b;

    /* renamed from: c  reason: collision with root package name */
    long f105656c;

    /* renamed from: d  reason: collision with root package name */
    int f105657d;

    static {
        Covode.recordClassIndex(67675);
    }

    public final void a(String str) {
        if (!l.a((Object) this.f105654a, (Object) str)) {
            this.f105655b = -1;
            this.f105656c = 0;
            return;
        }
        this.f105656c = System.currentTimeMillis() - this.f105655b;
    }
}
