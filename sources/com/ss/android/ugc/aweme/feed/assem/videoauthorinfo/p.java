package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import h.f.b.l;

public final class p implements j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f92582a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f92583b;

    /* renamed from: c  reason: collision with root package name */
    public final MutualStruct f92584c;

    /* renamed from: d  reason: collision with root package name */
    public final String f92585d;

    /* renamed from: e  reason: collision with root package name */
    public final Aweme f92586e;

    /* renamed from: f  reason: collision with root package name */
    public final h.p<Integer, Integer> f92587f;

    /* renamed from: g  reason: collision with root package name */
    public final a<Boolean> f92588g;

    static {
        Covode.recordClassIndex(58662);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f92582a == pVar.f92582a && l.a(this.f92583b, pVar.f92583b) && l.a(this.f92584c, pVar.f92584c) && l.a(this.f92585d, pVar.f92585d) && l.a(this.f92586e, pVar.f92586e) && l.a(this.f92587f, pVar.f92587f) && l.a(this.f92588g, pVar.f92588g);
    }

    public final int hashCode() {
        boolean z = this.f92582a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        Boolean bool = this.f92583b;
        int i6 = 0;
        int hashCode = (i5 + (bool != null ? bool.hashCode() : 0)) * 31;
        MutualStruct mutualStruct = this.f92584c;
        int hashCode2 = (hashCode + (mutualStruct != null ? mutualStruct.hashCode() : 0)) * 31;
        String str = this.f92585d;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Aweme aweme = this.f92586e;
        int hashCode4 = (hashCode3 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        h.p<Integer, Integer> pVar = this.f92587f;
        int hashCode5 = (hashCode4 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        a<Boolean> aVar = this.f92588g;
        if (aVar != null) {
            i6 = aVar.hashCode();
        }
        return hashCode5 + i6;
    }

    public final String toString() {
        return "VideoAuthorInfoRelationState(showRelation=" + this.f92582a + ", hideRelationAnimation=" + this.f92583b + ", mutualRelation=" + this.f92584c + ", relationText=" + this.f92585d + ", aweme=" + this.f92586e + ", followBtnStatus=" + this.f92587f + ", updateSocialTaggedView=" + this.f92588g + ")";
    }

    public /* synthetic */ p() {
        this(false, null, null, null, null, null, null);
    }

    private p(boolean z, Boolean bool, MutualStruct mutualStruct, String str, Aweme aweme, h.p<Integer, Integer> pVar, a<Boolean> aVar) {
        this.f92582a = z;
        this.f92583b = bool;
        this.f92584c = mutualStruct;
        this.f92585d = str;
        this.f92586e = aweme;
        this.f92587f = pVar;
        this.f92588g = aVar;
    }

    public static /* synthetic */ p a(p pVar, boolean z, Boolean bool, MutualStruct mutualStruct, String str, Aweme aweme, h.p pVar2, a aVar, int i2) {
        a aVar2 = aVar;
        h.p pVar3 = pVar2;
        Aweme aweme2 = aweme;
        boolean z2 = z;
        Boolean bool2 = bool;
        MutualStruct mutualStruct2 = mutualStruct;
        String str2 = str;
        if ((i2 & 1) != 0) {
            z2 = pVar.f92582a;
        }
        if ((i2 & 2) != 0) {
            bool2 = pVar.f92583b;
        }
        if ((i2 & 4) != 0) {
            mutualStruct2 = pVar.f92584c;
        }
        if ((i2 & 8) != 0) {
            str2 = pVar.f92585d;
        }
        if ((i2 & 16) != 0) {
            aweme2 = pVar.f92586e;
        }
        if ((i2 & 32) != 0) {
            pVar3 = pVar.f92587f;
        }
        if ((i2 & 64) != 0) {
            aVar2 = pVar.f92588g;
        }
        return new p(z2, bool2, mutualStruct2, str2, aweme2, pVar3, aVar2);
    }
}
