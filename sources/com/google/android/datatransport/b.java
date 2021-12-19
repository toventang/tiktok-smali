package com.google.android.datatransport;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f49297a;

    static {
        Covode.recordClassIndex(30852);
    }

    public final int hashCode() {
        return this.f49297a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Encoding{name=\"" + this.f49297a + "\"}";
    }

    public static b a(String str) {
        return new b(str);
    }

    private b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f49297a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f49297a.equals(((b) obj).f49297a);
    }
}
