package com.ss.android.ugc.aweme.publish.core.upload;

import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f118639a;

    static {
        Covode.recordClassIndex(77048);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && this.f118639a == ((d) obj).f118639a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f118639a;
    }

    public final String toString() {
        return "SmartSliceSetting(sliceSize=" + this.f118639a + ")";
    }

    public final int a() {
        return this.f118639a * 1024;
    }

    public d(int i2) {
        this.f118639a = i2;
    }
}
