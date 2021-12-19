package com.ss.android.ugc.aweme.ecommercebase.view.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercebase.dto.GImage;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f87719a;

    /* renamed from: b  reason: collision with root package name */
    public final String f87720b;

    /* renamed from: c  reason: collision with root package name */
    public final GImage f87721c;

    static {
        Covode.recordClassIndex(55179);
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
        return l.a(this.f87719a, aVar.f87719a) && l.a(this.f87720b, aVar.f87720b) && l.a(this.f87721c, aVar.f87721c);
    }

    public final int hashCode() {
        Integer num = this.f87719a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f87720b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        GImage gImage = this.f87721c;
        if (gImage != null) {
            i2 = gImage.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CommonData(style=" + this.f87719a + ", text=" + this.f87720b + ", image=" + this.f87721c + ")";
    }

    private a(Integer num, String str, GImage gImage) {
        this.f87719a = num;
        this.f87720b = str;
        this.f87721c = gImage;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Integer num, String str, GImage gImage, int i2) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : gImage);
    }
}
