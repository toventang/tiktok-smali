package com.ss.android.ugc.aweme.notice.repo.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class a {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final String f112781a;
    @c(a = "link_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f112782b;
    @c(a = "item_id")

    /* renamed from: c  reason: collision with root package name */
    public final String f112783c;

    static {
        Covode.recordClassIndex(72501);
    }

    public a() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f112781a, aVar.f112781a) && l.a(this.f112782b, aVar.f112782b) && l.a(this.f112783c, aVar.f112783c);
    }

    public final int hashCode() {
        String str = this.f112781a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f112782b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f112783c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "LinkBusinessExtra(type=" + this.f112781a + ", linkId=" + this.f112782b + ", itemId=" + this.f112783c + ")";
    }

    public static /* synthetic */ a a(a aVar) {
        String str = aVar.f112781a;
        String str2 = aVar.f112782b;
        String str3 = aVar.f112783c;
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new a(str, str2, str3);
    }

    public a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f112781a = str;
        this.f112782b = str2;
        this.f112783c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, String str2, String str3, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3);
    }
}
