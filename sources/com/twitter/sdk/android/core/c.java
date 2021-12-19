package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private int f155897a = 4;

    static {
        Covode.recordClassIndex(103586);
    }

    @Override // com.twitter.sdk.android.core.f
    public final void b() {
        a(3);
    }

    @Override // com.twitter.sdk.android.core.f
    public final void c() {
        a(5);
    }

    @Override // com.twitter.sdk.android.core.f
    public final void d() {
        a(6);
    }

    @Override // com.twitter.sdk.android.core.f
    public final void e() {
        a(4);
    }

    @Override // com.twitter.sdk.android.core.f
    public final void a() {
        a(6);
    }

    private boolean a(int i2) {
        if (this.f155897a <= i2) {
            return true;
        }
        return false;
    }
}
