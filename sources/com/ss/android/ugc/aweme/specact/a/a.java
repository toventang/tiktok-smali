package com.ss.android.ugc.aweme.specact.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "activity_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f134044a;
    @c(a = "resource_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f134045b;
    @c(a = "resource_md5")

    /* renamed from: c  reason: collision with root package name */
    public final String f134046c;

    static {
        Covode.recordClassIndex(87685);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f134044a, aVar.f134044a) && l.a(this.f134045b, aVar.f134045b) && l.a(this.f134046c, aVar.f134046c);
    }

    public final int hashCode() {
        String str = this.f134044a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f134045b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f134046c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "UniversalActivityVideoResource(activityId=" + this.f134044a + ", resourceUrl=" + this.f134045b + ", resourceMd5=" + this.f134046c + ")";
    }

    private /* synthetic */ a() {
        this("", "", "");
    }

    private a(String str, String str2, String str3) {
        this.f134044a = str;
        this.f134045b = str2;
        this.f134046c = str3;
    }
}
