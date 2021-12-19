package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ap {

    /* renamed from: d  reason: collision with root package name */
    public static final a f80161d = new a((byte) 0);
    @c(a = "highlight_type")

    /* renamed from: a  reason: collision with root package name */
    public final int f80162a;
    @c(a = "font_color")

    /* renamed from: b  reason: collision with root package name */
    public final String f80163b;
    @c(a = "background_color")

    /* renamed from: c  reason: collision with root package name */
    public final String f80164c;

    static {
        Covode.recordClassIndex(49893);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return this.f80162a == apVar.f80162a && l.a(this.f80163b, apVar.f80163b) && l.a(this.f80164c, apVar.f80164c);
    }

    public final int hashCode() {
        int i2 = this.f80162a * 31;
        String str = this.f80163b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f80164c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "UserRelationTagStyle(highlightType=" + this.f80162a + ", fontColor=" + this.f80163b + ", backgroundColor=" + this.f80164c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49894);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ ap() {
        this("#80161823", "#FFF1F1F2");
    }

    private ap(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f80162a = 3;
        this.f80163b = str;
        this.f80164c = str2;
    }
}
