package com.bytedance.android.livesdk.live.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "enable")

    /* renamed from: a  reason: collision with root package name */
    public final String f18682a;
    @c(a = "is_follow")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18683b;
    @c(a = "param")

    /* renamed from: c  reason: collision with root package name */
    public final String f18684c;
    @c(a = "channel_id")

    /* renamed from: d  reason: collision with root package name */
    public final int f18685d;

    static {
        Covode.recordClassIndex(10471);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f18682a, bVar.f18682a) && this.f18683b == bVar.f18683b && l.a(this.f18684c, bVar.f18684c) && this.f18685d == bVar.f18685d;
    }

    public final int hashCode() {
        String str = this.f18682a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f18683b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str2 = this.f18684c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i6 + i2) * 31) + this.f18685d;
    }

    public final String toString() {
        return "LiveFeedSettings(enable=" + this.f18682a + ", isFollow=" + this.f18683b + ", param=" + this.f18684c + ", channel_id=" + this.f18685d + ")";
    }

    public /* synthetic */ b() {
        this("0", "");
    }

    private b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f18682a = str;
        this.f18683b = false;
        this.f18684c = str2;
        this.f18685d = 0;
    }
}
