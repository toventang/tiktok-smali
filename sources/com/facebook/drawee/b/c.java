package com.facebook.drawee.b;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f47294a;

    /* renamed from: b  reason: collision with root package name */
    public int f47295b;

    /* renamed from: c  reason: collision with root package name */
    public int f47296c;

    static {
        Covode.recordClassIndex(28745);
    }

    public c() {
        a();
    }

    public final void a() {
        this.f47294a = false;
        this.f47295b = 4;
        this.f47296c = 0;
    }

    public final boolean b() {
        if (!this.f47294a || this.f47296c >= this.f47295b) {
            return false;
        }
        return true;
    }
}
