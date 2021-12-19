package com.ss.android.ugc.aweme.ftc.b;

import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import h.p;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final l<Boolean> f97455a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Boolean> f97456b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Boolean> f97457c;

    /* renamed from: d  reason: collision with root package name */
    public final l<p<Float, Float>> f97458d;

    /* renamed from: e  reason: collision with root package name */
    public final k<Void> f97459e;

    /* renamed from: f  reason: collision with root package name */
    public final l<Boolean> f97460f;

    /* renamed from: g  reason: collision with root package name */
    public final k<com.ss.android.ugc.aweme.shortvideo.c> f97461g;

    /* renamed from: h  reason: collision with root package name */
    public final l<Boolean> f97462h;

    /* renamed from: i  reason: collision with root package name */
    public final k<Integer> f97463i;

    /* renamed from: j  reason: collision with root package name */
    public final k<Void> f97464j;

    /* renamed from: k  reason: collision with root package name */
    public final k<z> f97465k;

    static {
        Covode.recordClassIndex(61926);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.f.b.l.a(this.f97455a, cVar.f97455a) && h.f.b.l.a(this.f97456b, cVar.f97456b) && h.f.b.l.a(this.f97457c, cVar.f97457c) && h.f.b.l.a(this.f97458d, cVar.f97458d) && h.f.b.l.a(this.f97459e, cVar.f97459e) && h.f.b.l.a(this.f97460f, cVar.f97460f) && h.f.b.l.a(this.f97461g, cVar.f97461g) && h.f.b.l.a(this.f97462h, cVar.f97462h) && h.f.b.l.a(this.f97463i, cVar.f97463i) && h.f.b.l.a(this.f97464j, cVar.f97464j) && h.f.b.l.a(this.f97465k, cVar.f97465k);
    }

    public final int hashCode() {
        l<Boolean> lVar = this.f97455a;
        int i2 = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        l<Boolean> lVar2 = this.f97456b;
        int hashCode2 = (hashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        l<Boolean> lVar3 = this.f97457c;
        int hashCode3 = (hashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l<p<Float, Float>> lVar4 = this.f97458d;
        int hashCode4 = (hashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        k<Void> kVar = this.f97459e;
        int hashCode5 = (hashCode4 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        l<Boolean> lVar5 = this.f97460f;
        int hashCode6 = (hashCode5 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        k<com.ss.android.ugc.aweme.shortvideo.c> kVar2 = this.f97461g;
        int hashCode7 = (hashCode6 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        l<Boolean> lVar6 = this.f97462h;
        int hashCode8 = (hashCode7 + (lVar6 != null ? lVar6.hashCode() : 0)) * 31;
        k<Integer> kVar3 = this.f97463i;
        int hashCode9 = (hashCode8 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        k<Void> kVar4 = this.f97464j;
        int hashCode10 = (hashCode9 + (kVar4 != null ? kVar4.hashCode() : 0)) * 31;
        k<z> kVar5 = this.f97465k;
        if (kVar5 != null) {
            i2 = kVar5.hashCode();
        }
        return hashCode10 + i2;
    }

    public final String toString() {
        return "FTCChooseMusicStates(chooseMusicVisible=" + this.f97455a + ", ivChooseMusicVisible=" + this.f97456b + ", tvChooseMusicVisible=" + this.f97457c + ", chooseMusicAlphaAnim=" + this.f97458d + ", setMusicChange=" + this.f97459e + ", uiEnabledState=" + this.f97460f + ", uiHasMusic=" + this.f97461g + ", setupClickListener=" + this.f97462h + ", setupMusicTips=" + this.f97463i + ", initStitch=" + this.f97464j + ", chooseMusicClickedEvent=" + this.f97465k + ")";
    }

    public /* synthetic */ c() {
        this(new l(false), new l(false), new l(false), new l(null), new k(), new l(true), new k(), new l(true), new k(), new k(), new k());
    }

    private c(l<Boolean> lVar, l<Boolean> lVar2, l<Boolean> lVar3, l<p<Float, Float>> lVar4, k<Void> kVar, l<Boolean> lVar5, k<com.ss.android.ugc.aweme.shortvideo.c> kVar2, l<Boolean> lVar6, k<Integer> kVar3, k<Void> kVar4, k<z> kVar5) {
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(lVar2, "");
        h.f.b.l.d(lVar3, "");
        h.f.b.l.d(lVar4, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(lVar5, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(lVar6, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        this.f97455a = lVar;
        this.f97456b = lVar2;
        this.f97457c = lVar3;
        this.f97458d = lVar4;
        this.f97459e = kVar;
        this.f97460f = lVar5;
        this.f97461g = kVar2;
        this.f97462h = lVar6;
        this.f97463i = kVar3;
        this.f97464j = kVar4;
        this.f97465k = kVar5;
    }
}
