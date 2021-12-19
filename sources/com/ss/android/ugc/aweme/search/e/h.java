package com.ss.android.ugc.aweme.search.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class h {
    @c(a = "enabled")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f121017a;
    @c(a = "preload_interval_ms")

    /* renamed from: b  reason: collision with root package name */
    public final Long f121018b;
    @c(a = "resource_channel")

    /* renamed from: c  reason: collision with root package name */
    public final String f121019c;
    @c(a = "lynx_channel")

    /* renamed from: d  reason: collision with root package name */
    public final String f121020d;

    static {
        Covode.recordClassIndex(78841);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f121017a, hVar.f121017a) && l.a(this.f121018b, hVar.f121018b) && l.a(this.f121019c, hVar.f121019c) && l.a(this.f121020d, hVar.f121020d);
    }

    public final int hashCode() {
        Integer num = this.f121017a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Long l2 = this.f121018b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.f121019c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f121020d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "Settings(enabled=" + this.f121017a + ", preloadIntervalMillis=" + this.f121018b + ", resourceChannel=" + this.f121019c + ", lynxTemplateChannel=" + this.f121020d + ")";
    }

    private h() {
        this.f121017a = null;
        this.f121018b = null;
        this.f121019c = null;
        this.f121020d = null;
    }

    public /* synthetic */ h(byte b2) {
        this();
    }
}
