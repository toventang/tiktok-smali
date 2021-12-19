package com.ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f140198a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f140199b = true;

    static {
        Covode.recordClassIndex(91592);
    }

    public static g a() {
        return new g(true);
    }

    public static g b() {
        return new g(false);
    }

    public final String toString() {
        return "FrontRearChangeEvent{toFront=" + this.f140198a + '}';
    }

    private g(boolean z) {
        this.f140198a = z;
    }
}
