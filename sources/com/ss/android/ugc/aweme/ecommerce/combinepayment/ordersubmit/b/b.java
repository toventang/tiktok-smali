package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f84812a;

    /* renamed from: b  reason: collision with root package name */
    public final String f84813b;

    /* renamed from: c  reason: collision with root package name */
    public final Image f84814c;

    /* renamed from: d  reason: collision with root package name */
    public final String f84815d;

    /* renamed from: e  reason: collision with root package name */
    public final Image f84816e;

    static {
        Covode.recordClassIndex(52997);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f84812a, bVar.f84812a) && l.a(this.f84813b, bVar.f84813b) && l.a(this.f84814c, bVar.f84814c) && l.a(this.f84815d, bVar.f84815d) && l.a(this.f84816e, bVar.f84816e);
    }

    public final int hashCode() {
        String str = this.f84812a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84813b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.f84814c;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
        String str3 = this.f84815d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Image image2 = this.f84816e;
        if (image2 != null) {
            i2 = image2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "AnnounceVO(announcementId=" + this.f84812a + ", text=" + this.f84813b + ", icon=" + this.f84814c + ", link=" + this.f84815d + ", background=" + this.f84816e + ")";
    }

    public b(String str, String str2, Image image, String str3, Image image2) {
        l.d(str2, "");
        l.d(str3, "");
        this.f84812a = str;
        this.f84813b = str2;
        this.f84814c = image;
        this.f84815d = str3;
        this.f84816e = image2;
    }
}
