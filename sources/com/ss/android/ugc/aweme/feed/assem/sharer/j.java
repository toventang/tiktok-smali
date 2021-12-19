package com.ss.android.ugc.aweme.feed.assem.sharer;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j implements com.bytedance.assem.arch.viewModel.j {

    /* renamed from: a  reason: collision with root package name */
    public final String f92529a;

    /* renamed from: b  reason: collision with root package name */
    public final String f92530b;

    /* renamed from: c  reason: collision with root package name */
    public UrlModel f92531c;

    /* renamed from: d  reason: collision with root package name */
    public a<Boolean> f92532d;

    /* renamed from: e  reason: collision with root package name */
    public a<Boolean> f92533e;

    /* renamed from: f  reason: collision with root package name */
    public int f92534f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f92535g;

    static {
        Covode.recordClassIndex(58607);
    }

    public static /* synthetic */ j a(j jVar, String str, String str2, UrlModel urlModel, a aVar, a aVar2, int i2, boolean z, int i3) {
        boolean z2 = z;
        int i4 = i2;
        a aVar3 = aVar2;
        String str3 = str;
        String str4 = str2;
        UrlModel urlModel2 = urlModel;
        a aVar4 = aVar;
        if ((i3 & 1) != 0) {
            str3 = jVar.f92529a;
        }
        if ((i3 & 2) != 0) {
            str4 = jVar.f92530b;
        }
        if ((i3 & 4) != 0) {
            urlModel2 = jVar.f92531c;
        }
        if ((i3 & 8) != 0) {
            aVar4 = jVar.f92532d;
        }
        if ((i3 & 16) != 0) {
            aVar3 = jVar.f92533e;
        }
        if ((i3 & 32) != 0) {
            i4 = jVar.f92534f;
        }
        if ((i3 & 64) != 0) {
            z2 = jVar.f92535g;
        }
        return a(str3, str4, urlModel2, aVar4, aVar3, i4, z2);
    }

    private static j a(String str, String str2, UrlModel urlModel, a<Boolean> aVar, a<Boolean> aVar2, int i2, boolean z) {
        l.d(str2, "");
        return new j(str, str2, urlModel, aVar, aVar2, i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f92529a, jVar.f92529a) && l.a(this.f92530b, jVar.f92530b) && l.a(this.f92531c, jVar.f92531c) && l.a(this.f92532d, jVar.f92532d) && l.a(this.f92533e, jVar.f92533e) && this.f92534f == jVar.f92534f && this.f92535g == jVar.f92535g;
    }

    public final int hashCode() {
        String str = this.f92529a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f92530b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f92531c;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        a<Boolean> aVar = this.f92532d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<Boolean> aVar2 = this.f92533e;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        int i3 = (((hashCode4 + i2) * 31) + this.f92534f) * 31;
        boolean z = this.f92535g;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "VideoExposeSharerState(nickName=" + this.f92529a + ", callerId=" + this.f92530b + ", avatar=" + this.f92531c + ", followAnimation=" + this.f92532d + ", unfollow=" + this.f92533e + ", followText=" + this.f92534f + ", hasAnimationPlayed=" + this.f92535g + ")";
    }

    public /* synthetic */ j() {
        this("", "", null, null, null, R.string.d88, false);
    }

    private j(String str, String str2, UrlModel urlModel, a<Boolean> aVar, a<Boolean> aVar2, int i2, boolean z) {
        l.d(str2, "");
        this.f92529a = str;
        this.f92530b = str2;
        this.f92531c = urlModel;
        this.f92532d = aVar;
        this.f92533e = aVar2;
        this.f92534f = i2;
        this.f92535g = z;
    }
}
