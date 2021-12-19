package com.ss.android.ugc.aweme.social.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "group")

    /* renamed from: a  reason: collision with root package name */
    public final int f133629a;
    @c(a = "unclick_suggestcard_limit")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f133630b;
    @c(a = "untoplist_suggestcard_day")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f133631c;
    @c(a = "hidden_suggestcard_day")

    /* renamed from: d  reason: collision with root package name */
    public final Integer f133632d;

    static {
        Covode.recordClassIndex(87420);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f133629a == aVar.f133629a && l.a(this.f133630b, aVar.f133630b) && l.a(this.f133631c, aVar.f133631c) && l.a(this.f133632d, aVar.f133632d);
    }

    public final int hashCode() {
        int i2 = this.f133629a * 31;
        Integer num = this.f133630b;
        int i3 = 0;
        int hashCode = (i2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f133631c;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f133632d;
        if (num3 != null) {
            i3 = num3.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        return "FollowingListFreqParams(group=" + this.f133629a + ", maxClickSuggestCardCount=" + this.f133630b + ", unTopListSuggestCardDay=" + this.f133631c + ", hideSuggestCardDay=" + this.f133632d + ")";
    }

    private a() {
        this.f133629a = 1;
        this.f133630b = null;
        this.f133631c = null;
        this.f133632d = null;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
