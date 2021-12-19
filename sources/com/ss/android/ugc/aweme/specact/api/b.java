package com.ss.android.ugc.aweme.specact.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "activity_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f134049a;
    @c(a = "background_image_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f134050b;
    @c(a = "title_image_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f134051c;
    @c(a = "schema_url")

    /* renamed from: d  reason: collision with root package name */
    public final String f134052d;

    static {
        Covode.recordClassIndex(87689);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f134049a, bVar.f134049a) && l.a(this.f134050b, bVar.f134050b) && l.a(this.f134051c, bVar.f134051c) && l.a(this.f134052d, bVar.f134052d);
    }

    public final int hashCode() {
        String str = this.f134049a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f134050b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f134051c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f134052d;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "MesEntraSetting(activityId=" + this.f134049a + ", bgImgUrl=" + this.f134050b + ", titleImgUrl=" + this.f134051c + ", schemaUrl=" + this.f134052d + ")";
    }
}
