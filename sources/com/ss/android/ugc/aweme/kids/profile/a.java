package com.ss.android.ugc.aweme.kids.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final UrlModel f106736a;

    /* renamed from: b  reason: collision with root package name */
    public final String f106737b;

    /* renamed from: c  reason: collision with root package name */
    public final String f106738c;

    /* renamed from: d  reason: collision with root package name */
    public final String f106739d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.kids.api.account.a.a f106740e;

    static {
        Covode.recordClassIndex(68228);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f106736a, aVar.f106736a) && l.a(this.f106737b, aVar.f106737b) && l.a(this.f106738c, aVar.f106738c) && l.a(this.f106739d, aVar.f106739d) && l.a(this.f106740e, aVar.f106740e);
    }

    public final int hashCode() {
        UrlModel urlModel = this.f106736a;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.f106737b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f106738c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f106739d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.kids.api.account.a.a aVar = this.f106740e;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "KidsProfileHeaderData(avatarModel=" + this.f106736a + ", userId=" + this.f106737b + ", secId=" + this.f106738c + ", username=" + this.f106739d + ", kidsUser=" + this.f106740e + ")";
    }

    public a(UrlModel urlModel, String str, String str2, String str3, com.ss.android.ugc.aweme.kids.api.account.a.a aVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(aVar, "");
        this.f106736a = urlModel;
        this.f106737b = str;
        this.f106738c = str2;
        this.f106739d = str3;
        this.f106740e = aVar;
    }
}
