package com.ss.android.ugc.aweme.cn;

import com.bytedance.covode.number.Covode;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f71230a;

    /* renamed from: b  reason: collision with root package name */
    public final int f71231b;

    static {
        Covode.recordClassIndex(43843);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f71230a == hVar.f71230a && this.f71231b == hVar.f71231b;
    }

    public final int hashCode() {
        return (this.f71230a * 31) + this.f71231b;
    }

    public final String toString() {
        return "SensitiveApiContextInfo(switchToAllowOpenCamera=" + this.f71230a + ", switchToAllowOpenMic=" + this.f71231b + ")";
    }

    private /* synthetic */ h() {
        this(0, 0);
    }

    public h(int i2, int i3) {
        this.f71230a = i2;
        this.f71231b = i3;
    }
}
