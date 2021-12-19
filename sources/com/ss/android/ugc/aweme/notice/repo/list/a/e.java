package com.ss.android.ugc.aweme.notice.repo.list.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class e {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final int f112819a;
    @c(a = "text")

    /* renamed from: b  reason: collision with root package name */
    public final String f112820b;
    @c(a = "schema_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f112821c;
    @c(a = "schema_type")

    /* renamed from: d  reason: collision with root package name */
    public final int f112822d;
    @c(a = "need_track")

    /* renamed from: e  reason: collision with root package name */
    public final boolean f112823e;

    static {
        Covode.recordClassIndex(72511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f112819a == eVar.f112819a && l.a(this.f112820b, eVar.f112820b) && l.a(this.f112821c, eVar.f112821c) && this.f112822d == eVar.f112822d && this.f112823e == eVar.f112823e;
    }

    public final int hashCode() {
        int i2 = this.f112819a * 31;
        String str = this.f112820b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f112821c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i4 = (((hashCode + i3) * 31) + this.f112822d) * 31;
        boolean z = this.f112823e;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        return i4 + i5;
    }

    public final String toString() {
        return "TextLinkConfig(type=" + this.f112819a + ", text=" + this.f112820b + ", schemaUrl=" + this.f112821c + ", schemaType=" + this.f112822d + ", needTrack=" + this.f112823e + ")";
    }
}
