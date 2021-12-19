package com.ss.android.ugc.aweme.shoutouts.review.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f133363a;

    /* renamed from: b  reason: collision with root package name */
    public String f133364b;

    /* renamed from: c  reason: collision with root package name */
    public String f133365c;

    /* renamed from: d  reason: collision with root package name */
    public String f133366d;

    /* renamed from: e  reason: collision with root package name */
    public int f133367e;

    /* renamed from: f  reason: collision with root package name */
    public final String f133368f;

    /* renamed from: g  reason: collision with root package name */
    public final String f133369g;

    /* renamed from: h  reason: collision with root package name */
    public final String f133370h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f133371i;

    /* renamed from: j  reason: collision with root package name */
    public String f133372j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f133373k;

    /* renamed from: l  reason: collision with root package name */
    public int f133374l;

    static {
        Covode.recordClassIndex(87234);
    }

    public b() {
        this(null, null, null, null, 0, null, null, null, false, 4095);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f133363a, bVar.f133363a) && l.a(this.f133364b, bVar.f133364b) && l.a(this.f133365c, bVar.f133365c) && l.a(this.f133366d, bVar.f133366d) && this.f133367e == bVar.f133367e && l.a(this.f133368f, bVar.f133368f) && l.a(this.f133369g, bVar.f133369g) && l.a(this.f133370h, bVar.f133370h) && this.f133371i == bVar.f133371i && l.a(this.f133372j, bVar.f133372j) && this.f133373k == bVar.f133373k && this.f133374l == bVar.f133374l;
    }

    public final int hashCode() {
        String str = this.f133363a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f133364b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f133365c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f133366d;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f133367e) * 31;
        String str5 = this.f133368f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f133369g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f133370h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        boolean z = this.f133371i;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode7 + i4) * 31;
        String str8 = this.f133372j;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        if (!this.f133373k) {
            i3 = 0;
        }
        return ((i8 + i3) * 31) + this.f133374l;
    }

    public final String toString() {
        return "ShoutoutsReviewsItem(ratingId=" + this.f133363a + ", userName=" + this.f133364b + ", ratingText=" + this.f133365c + ", createdTime=" + this.f133366d + ", ratingCount=" + this.f133367e + ", uid=" + this.f133368f + ", secUid=" + this.f133369g + ", userAvatar=" + this.f133370h + ", userVerified=" + this.f133371i + ", ratingTextTranslated=" + this.f133372j + ", isShowingTranslatedContent=" + this.f133373k + ", status=" + this.f133374l + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    private b(String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, boolean z) {
        this.f133363a = str;
        this.f133364b = str2;
        this.f133365c = str3;
        this.f133366d = str4;
        this.f133367e = i2;
        this.f133368f = str5;
        this.f133369g = str6;
        this.f133370h = str7;
        this.f133371i = z;
        this.f133372j = null;
        this.f133373k = false;
        this.f133374l = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, boolean z, int i3) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, (i3 & 128) == 0 ? str7 : null, (i3 & 256) == 0 ? z : false);
    }
}
