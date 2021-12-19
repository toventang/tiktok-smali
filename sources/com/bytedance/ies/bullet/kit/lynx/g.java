package com.bytedance.ies.bullet.kit.lynx;

import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f32346a;

    static {
        Covode.recordClassIndex(18991);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && this.f32346a == ((g) obj).f32346a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f32346a;
    }

    public final String toString() {
        return "LynxGlobalSettings(maxScriptCacheSizeInBytes=" + this.f32346a + ")";
    }

    private g() {
        this.f32346a = 10485760;
    }

    public /* synthetic */ g(byte b2) {
        this();
    }
}
