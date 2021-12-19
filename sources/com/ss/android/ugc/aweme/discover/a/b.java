package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "text_sug_count")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f80190a;
    @c(a = "rich_sug_count")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f80191b;

    static {
        Covode.recordClassIndex(49909);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f80190a, bVar.f80190a) && l.a(this.f80191b, bVar.f80191b);
    }

    public final int hashCode() {
        Integer num = this.f80190a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f80191b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AccountSugExperimentConfig(textSugCount=" + this.f80190a + ", richSugCount=" + this.f80191b + ")";
    }

    private b() {
        this.f80190a = null;
        this.f80191b = null;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
