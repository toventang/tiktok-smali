package com.ss.android.ugc.aweme.views.mention;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f144661a;

    /* renamed from: b  reason: collision with root package name */
    public int f144662b;

    static {
        Covode.recordClassIndex(94647);
    }

    public b(int i2, int i3) {
        this.f144661a = i2;
        this.f144662b = i3;
    }

    public final boolean a(int i2, int i3) {
        if (this.f144661a > i2 || this.f144662b < i3) {
            return false;
        }
        return true;
    }
}
