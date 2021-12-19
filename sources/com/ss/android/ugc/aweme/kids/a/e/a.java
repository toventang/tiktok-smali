package com.ss.android.ugc.aweme.kids.a.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f105303a;

    /* renamed from: b  reason: collision with root package name */
    public final String f105304b;

    static {
        Covode.recordClassIndex(67501);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f105303a, aVar.f105303a) && l.a(this.f105304b, aVar.f105304b);
    }

    public final int hashCode() {
        String str = this.f105303a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f105304b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MusicCategory(categoryName=" + this.f105303a + ", categoryId=" + this.f105304b + ")";
    }

    private /* synthetic */ a() {
        this("", "");
    }

    private a(String str, String str2) {
        this.f105303a = str;
        this.f105304b = str2;
    }
}
