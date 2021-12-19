package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class n {
    @c(a = "screen_title")

    /* renamed from: a  reason: collision with root package name */
    public final String f104869a;
    @c(a = "screen_subtitle")

    /* renamed from: b  reason: collision with root package name */
    public final String f104870b;
    @c(a = "skippable")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f104871c;
    @c(a = "choices")

    /* renamed from: d  reason: collision with root package name */
    public final a f104872d;

    static {
        Covode.recordClassIndex(67253);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f104869a, nVar.f104869a) && l.a(this.f104870b, nVar.f104870b) && l.a(this.f104871c, nVar.f104871c) && l.a(this.f104872d, nVar.f104872d);
    }

    public final int hashCode() {
        String str = this.f104869a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104870b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f104871c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        a aVar = this.f104872d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "JourneyGenderSelectionWrapper(screen_title=" + this.f104869a + ", screen_subtitle=" + this.f104870b + ", skippable=" + this.f104871c + ", choices=" + this.f104872d + ")";
    }
}
