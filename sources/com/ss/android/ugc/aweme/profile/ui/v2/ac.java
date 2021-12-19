package com.ss.android.ugc.aweme.profile.ui.v2;

import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.z;

public final class ac implements a {

    /* renamed from: a */
    public final String f117243a;

    /* renamed from: b */
    public final String f117244b;

    /* renamed from: c */
    public final String f117245c;

    /* renamed from: d */
    public final String f117246d;

    /* renamed from: e */
    public final String f117247e;

    /* renamed from: f */
    public final String f117248f;

    /* renamed from: g */
    public final Aweme f117249g;

    /* renamed from: h */
    public final String f117250h;

    /* renamed from: i */
    public final com.bytedance.assem.arch.extensions.a<z> f117251i;

    /* renamed from: j */
    public final boolean f117252j;

    /* renamed from: k */
    public final com.bytedance.assem.arch.extensions.a<Boolean> f117253k;

    /* renamed from: l */
    public final com.bytedance.assem.arch.extensions.a<z> f117254l;

    /* renamed from: m */
    public final com.bytedance.assem.arch.extensions.a<z> f117255m;
    public final com.bytedance.assem.arch.extensions.a<z> n;

    static {
        Covode.recordClassIndex(75707);
    }

    public static /* synthetic */ ac a(ac acVar, String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, com.bytedance.assem.arch.extensions.a aVar, boolean z, com.bytedance.assem.arch.extensions.a aVar2, com.bytedance.assem.arch.extensions.a aVar3, com.bytedance.assem.arch.extensions.a aVar4, com.bytedance.assem.arch.extensions.a aVar5, int i2) {
        com.bytedance.assem.arch.extensions.a aVar6 = aVar5;
        com.bytedance.assem.arch.extensions.a aVar7 = aVar4;
        com.bytedance.assem.arch.extensions.a aVar8 = aVar3;
        com.bytedance.assem.arch.extensions.a aVar9 = aVar2;
        String str8 = str4;
        String str9 = str3;
        String str10 = str2;
        String str11 = str;
        String str12 = str5;
        String str13 = str6;
        Aweme aweme2 = aweme;
        String str14 = str7;
        com.bytedance.assem.arch.extensions.a aVar10 = aVar;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            str11 = acVar.f117243a;
        }
        if ((i2 & 2) != 0) {
            str10 = acVar.f117244b;
        }
        if ((i2 & 4) != 0) {
            str9 = acVar.f117245c;
        }
        if ((i2 & 8) != 0) {
            str8 = acVar.f117246d;
        }
        if ((i2 & 16) != 0) {
            str12 = acVar.f117247e;
        }
        if ((i2 & 32) != 0) {
            str13 = acVar.f117248f;
        }
        if ((i2 & 64) != 0) {
            aweme2 = acVar.f117249g;
        }
        if ((i2 & 128) != 0) {
            str14 = acVar.f117250h;
        }
        if ((i2 & 256) != 0) {
            aVar10 = acVar.f117251i;
        }
        if ((i2 & 512) != 0) {
            z2 = acVar.f117252j;
        }
        if ((i2 & 1024) != 0) {
            aVar9 = acVar.f117253k;
        }
        if ((i2 & 2048) != 0) {
            aVar8 = acVar.f117254l;
        }
        if ((i2 & 4096) != 0) {
            aVar7 = acVar.f117255m;
        }
        if ((i2 & 8192) != 0) {
            aVar6 = acVar.n;
        }
        return a(str11, str10, str9, str8, str12, str13, aweme2, str14, aVar10, z2, aVar9, aVar8, aVar7, aVar6);
    }

    private static ac a(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, com.bytedance.assem.arch.extensions.a<z> aVar, boolean z, com.bytedance.assem.arch.extensions.a<Boolean> aVar2, com.bytedance.assem.arch.extensions.a<z> aVar3, com.bytedance.assem.arch.extensions.a<z> aVar4, com.bytedance.assem.arch.extensions.a<z> aVar5) {
        return new ac(str, str2, str3, str4, str5, str6, aweme, str7, aVar, z, aVar2, aVar3, aVar4, aVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return l.a(this.f117243a, acVar.f117243a) && l.a(this.f117244b, acVar.f117244b) && l.a(this.f117245c, acVar.f117245c) && l.a(this.f117246d, acVar.f117246d) && l.a(this.f117247e, acVar.f117247e) && l.a(this.f117248f, acVar.f117248f) && l.a(this.f117249g, acVar.f117249g) && l.a(this.f117250h, acVar.f117250h) && l.a(this.f117251i, acVar.f117251i) && this.f117252j == acVar.f117252j && l.a(this.f117253k, acVar.f117253k) && l.a(this.f117254l, acVar.f117254l) && l.a(this.f117255m, acVar.f117255m) && l.a(this.n, acVar.n);
    }

    public final int hashCode() {
        String str = this.f117243a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f117244b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f117245c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f117246d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f117247e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f117248f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Aweme aweme = this.f117249g;
        int hashCode7 = (hashCode6 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        String str7 = this.f117250h;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<z> aVar = this.f117251i;
        int hashCode9 = (hashCode8 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z = this.f117252j;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode9 + i3) * 31;
        com.bytedance.assem.arch.extensions.a<Boolean> aVar2 = this.f117253k;
        int hashCode10 = (i6 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<z> aVar3 = this.f117254l;
        int hashCode11 = (hashCode10 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<z> aVar4 = this.f117255m;
        int hashCode12 = (hashCode11 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<z> aVar5 = this.n;
        if (aVar5 != null) {
            i2 = aVar5.hashCode();
        }
        return hashCode12 + i2;
    }

    public final String toString() {
        return "UserProfileData(uid=" + this.f117243a + ", secUid=" + this.f117244b + ", previousPage=" + this.f117245c + ", eventType=" + this.f117246d + ", showWindowSource=" + this.f117247e + ", previousPagePosition=" + this.f117248f + ", aweme=" + this.f117249g + ", feedsAwemeId=" + this.f117250h + ", clearDataEvent=" + this.f117251i + ", isVisible=" + this.f117252j + ", visibleChangeEvent=" + this.f117253k + ", clearDataForBlock=" + this.f117254l + ", setUserEvent=" + this.f117255m + ", setLazy=" + this.n + ")";
    }

    public /* synthetic */ ac() {
        this(null, null, null, null, null, null, null, null, null, true, null, null, null, null);
    }

    private ac(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, com.bytedance.assem.arch.extensions.a<z> aVar, boolean z, com.bytedance.assem.arch.extensions.a<Boolean> aVar2, com.bytedance.assem.arch.extensions.a<z> aVar3, com.bytedance.assem.arch.extensions.a<z> aVar4, com.bytedance.assem.arch.extensions.a<z> aVar5) {
        this.f117243a = str;
        this.f117244b = str2;
        this.f117245c = str3;
        this.f117246d = str4;
        this.f117247e = str5;
        this.f117248f = str6;
        this.f117249g = aweme;
        this.f117250h = str7;
        this.f117251i = aVar;
        this.f117252j = z;
        this.f117253k = aVar2;
        this.f117254l = aVar3;
        this.f117255m = aVar4;
        this.n = aVar5;
    }
}
