package com.ss.android.ugc.aweme.im.sdk.notification.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f102868a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f102869b;

    /* renamed from: c  reason: collision with root package name */
    public final String f102870c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f102871d;

    /* renamed from: e  reason: collision with root package name */
    public final UrlModel f102872e;

    /* renamed from: f  reason: collision with root package name */
    public final String f102873f;

    /* renamed from: g  reason: collision with root package name */
    public final UrlModel f102874g;

    /* renamed from: h  reason: collision with root package name */
    public final UrlModel f102875h;

    /* renamed from: i  reason: collision with root package name */
    public String f102876i;

    /* renamed from: j  reason: collision with root package name */
    public String f102877j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f102878k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f102879l;

    /* renamed from: m  reason: collision with root package name */
    public final String f102880m;
    public final Long n;
    public final Integer o;
    public final boolean p;
    public final List<String> q;
    public final String r;
    public final Set<IMContact> s;
    public final Integer t;
    public final String u;

    static {
        Covode.recordClassIndex(65953);
    }

    public k() {
        this(0, null, null, null, null, null, null, null, null, false, null, null, null, 2097151);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f102868a == kVar.f102868a && l.a(this.f102869b, kVar.f102869b) && l.a(this.f102870c, kVar.f102870c) && l.a(this.f102871d, kVar.f102871d) && l.a(this.f102872e, kVar.f102872e) && l.a(this.f102873f, kVar.f102873f) && l.a(this.f102874g, kVar.f102874g) && l.a(this.f102875h, kVar.f102875h) && l.a(this.f102876i, kVar.f102876i) && l.a(this.f102877j, kVar.f102877j) && l.a(this.f102878k, kVar.f102878k) && l.a(this.f102879l, kVar.f102879l) && l.a(this.f102880m, kVar.f102880m) && l.a(this.n, kVar.n) && l.a(this.o, kVar.o) && this.p == kVar.p && l.a(this.q, kVar.q) && l.a(this.r, kVar.r) && l.a(this.s, kVar.s) && l.a(this.t, kVar.t) && l.a(this.u, kVar.u);
    }

    public final int hashCode() {
        int i2 = this.f102868a * 31;
        Integer num = this.f102869b;
        int i3 = 0;
        int hashCode = (i2 + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f102870c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.f102871d;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f102872e;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.f102873f;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.f102874g;
        int hashCode6 = (hashCode5 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        UrlModel urlModel3 = this.f102875h;
        int hashCode7 = (hashCode6 + (urlModel3 != null ? urlModel3.hashCode() : 0)) * 31;
        String str3 = this.f102876i;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f102877j;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31;
        CharSequence charSequence = this.f102878k;
        int hashCode10 = (hashCode9 + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.f102879l;
        int hashCode11 = (hashCode10 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
        String str5 = this.f102880m;
        int hashCode12 = (hashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Long l2 = this.n;
        int hashCode13 = (hashCode12 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Integer num3 = this.o;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        boolean z = this.p;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode14 + i4) * 31;
        List<String> list = this.q;
        int hashCode15 = (i7 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.r;
        int hashCode16 = (hashCode15 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set<IMContact> set = this.s;
        int hashCode17 = (hashCode16 + (set != null ? set.hashCode() : 0)) * 31;
        Integer num4 = this.t;
        int hashCode18 = (hashCode17 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str7 = this.u;
        if (str7 != null) {
            i3 = str7.hashCode();
        }
        return hashCode18 + i3;
    }

    public final String toString() {
        return "NotificationContent(type=" + this.f102868a + ", conversationType=" + this.f102869b + ", conversationId=" + this.f102870c + ", messageType=" + this.f102871d + ", avatar=" + this.f102872e + ", avatarUrl=" + this.f102873f + ", assembleAvatar1=" + this.f102874g + ", assembleAvatar2=" + this.f102875h + ", name=" + this.f102876i + ", secondName=" + this.f102877j + ", description=" + this.f102878k + ", firstDescription=" + this.f102879l + ", schema=" + this.f102880m + ", anchorId=" + this.n + ", anchorType=" + this.o + ", isAssemble=" + this.p + ", pushAssembleAvatarUrl=" + this.q + ", pushType=" + this.r + ", userSet=" + this.s + ", msgNumber=" + this.t + ", fromUserId=" + this.u + ")";
    }

    private k(int i2, Integer num, String str, Integer num2, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str2, CharSequence charSequence, boolean z, Set<IMContact> set, Integer num3, String str3) {
        l.d(set, "");
        l.d(str3, "");
        this.f102868a = i2;
        this.f102869b = num;
        this.f102870c = str;
        this.f102871d = num2;
        this.f102872e = urlModel;
        this.f102873f = null;
        this.f102874g = urlModel2;
        this.f102875h = urlModel3;
        this.f102876i = str2;
        this.f102877j = null;
        this.f102878k = charSequence;
        this.f102879l = null;
        this.f102880m = null;
        this.n = null;
        this.o = null;
        this.p = z;
        this.q = null;
        this.r = null;
        this.s = set;
        this.t = num3;
        this.u = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i2, Integer num, String str, Integer num2, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str2, CharSequence charSequence, boolean z, Set set, Integer num3, String str3, int i3) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : num2, (i3 & 16) != 0 ? null : urlModel, (i3 & 64) != 0 ? null : urlModel2, (i3 & 128) != 0 ? null : urlModel3, (i3 & 256) != 0 ? null : str2, (i3 & 1024) == 0 ? charSequence : null, (32768 & i3) != 0 ? false : z, (262144 & i3) != 0 ? new LinkedHashSet() : set, (524288 & i3) != 0 ? 0 : num3, (i3 & 1048576) != 0 ? "" : str3);
    }
}
