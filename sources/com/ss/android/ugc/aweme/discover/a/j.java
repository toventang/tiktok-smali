package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class j {
    @c(a = "enabled")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f80206a;
    @c(a = "show_tips")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f80207b;
    @c(a = "show_tips_delay")

    /* renamed from: c  reason: collision with root package name */
    public final Long f80208c;

    static {
        Covode.recordClassIndex(49919);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f80206a, jVar.f80206a) && l.a(this.f80207b, jVar.f80207b) && l.a(this.f80208c, jVar.f80208c);
    }

    public final int hashCode() {
        Integer num = this.f80206a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f80207b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Long l2 = this.f80208c;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "FeedSearchEntrance(enabled=" + this.f80206a + ", showTips=" + this.f80207b + ", showTipsDelay=" + this.f80208c + ")";
    }

    private j() {
        this.f80206a = null;
        this.f80207b = null;
        this.f80208c = null;
    }

    public /* synthetic */ j(byte b2) {
        this();
    }
}
