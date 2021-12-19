package com.ss.android.ugc.aweme.shortvideo.view;

import com.bytedance.covode.number.Covode;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public int f132667a;

    /* renamed from: b  reason: collision with root package name */
    public int f132668b;

    static {
        Covode.recordClassIndex(86803);
    }

    public r(int i2, int i3) {
        this.f132667a = i2;
        this.f132668b = i3;
    }

    public final boolean a(int i2, int i3) {
        if (this.f132667a > i2 || this.f132668b < i3) {
            return false;
        }
        return true;
    }
}
