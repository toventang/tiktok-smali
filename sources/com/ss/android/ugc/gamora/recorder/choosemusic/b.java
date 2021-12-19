package com.ss.android.ugc.gamora.recorder.choosemusic;

import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import h.p;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final l<Boolean> f147531a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Boolean> f147532b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Boolean> f147533c;

    /* renamed from: d  reason: collision with root package name */
    public final l<p<Float, Float>> f147534d;

    /* renamed from: e  reason: collision with root package name */
    public final k<z> f147535e;

    /* renamed from: f  reason: collision with root package name */
    public final l<Boolean> f147536f;

    /* renamed from: g  reason: collision with root package name */
    public final k<c> f147537g;

    /* renamed from: h  reason: collision with root package name */
    public final k<Boolean> f147538h;

    /* renamed from: i  reason: collision with root package name */
    public final k<z> f147539i;

    /* renamed from: j  reason: collision with root package name */
    public final k<Boolean> f147540j;

    /* renamed from: k  reason: collision with root package name */
    public final l<Boolean> f147541k;

    /* renamed from: l  reason: collision with root package name */
    public final k<Integer> f147542l;

    /* renamed from: m  reason: collision with root package name */
    public final k<z> f147543m;
    public final k<z> n;
    public final l<Boolean> o;
    public final k<Boolean> p;
    public final k<Boolean> q;

    static {
        Covode.recordClassIndex(97216);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.f.b.l.a(this.f147531a, bVar.f147531a) && h.f.b.l.a(this.f147532b, bVar.f147532b) && h.f.b.l.a(this.f147533c, bVar.f147533c) && h.f.b.l.a(this.f147534d, bVar.f147534d) && h.f.b.l.a(this.f147535e, bVar.f147535e) && h.f.b.l.a(this.f147536f, bVar.f147536f) && h.f.b.l.a(this.f147537g, bVar.f147537g) && h.f.b.l.a(this.f147538h, bVar.f147538h) && h.f.b.l.a(this.f147539i, bVar.f147539i) && h.f.b.l.a(this.f147540j, bVar.f147540j) && h.f.b.l.a(this.f147541k, bVar.f147541k) && h.f.b.l.a(this.f147542l, bVar.f147542l) && h.f.b.l.a(this.f147543m, bVar.f147543m) && h.f.b.l.a(this.n, bVar.n) && h.f.b.l.a(this.o, bVar.o) && h.f.b.l.a(this.p, bVar.p) && h.f.b.l.a(this.q, bVar.q);
    }

    public final int hashCode() {
        l<Boolean> lVar = this.f147531a;
        int i2 = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        l<Boolean> lVar2 = this.f147532b;
        int hashCode2 = (hashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        l<Boolean> lVar3 = this.f147533c;
        int hashCode3 = (hashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l<p<Float, Float>> lVar4 = this.f147534d;
        int hashCode4 = (hashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        k<z> kVar = this.f147535e;
        int hashCode5 = (hashCode4 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        l<Boolean> lVar5 = this.f147536f;
        int hashCode6 = (hashCode5 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        k<c> kVar2 = this.f147537g;
        int hashCode7 = (hashCode6 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        k<Boolean> kVar3 = this.f147538h;
        int hashCode8 = (hashCode7 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        k<z> kVar4 = this.f147539i;
        int hashCode9 = (hashCode8 + (kVar4 != null ? kVar4.hashCode() : 0)) * 31;
        k<Boolean> kVar5 = this.f147540j;
        int hashCode10 = (hashCode9 + (kVar5 != null ? kVar5.hashCode() : 0)) * 31;
        l<Boolean> lVar6 = this.f147541k;
        int hashCode11 = (hashCode10 + (lVar6 != null ? lVar6.hashCode() : 0)) * 31;
        k<Integer> kVar6 = this.f147542l;
        int hashCode12 = (hashCode11 + (kVar6 != null ? kVar6.hashCode() : 0)) * 31;
        k<z> kVar7 = this.f147543m;
        int hashCode13 = (hashCode12 + (kVar7 != null ? kVar7.hashCode() : 0)) * 31;
        k<z> kVar8 = this.n;
        int hashCode14 = (hashCode13 + (kVar8 != null ? kVar8.hashCode() : 0)) * 31;
        l<Boolean> lVar7 = this.o;
        int hashCode15 = (hashCode14 + (lVar7 != null ? lVar7.hashCode() : 0)) * 31;
        k<Boolean> kVar9 = this.p;
        int hashCode16 = (hashCode15 + (kVar9 != null ? kVar9.hashCode() : 0)) * 31;
        k<Boolean> kVar10 = this.q;
        if (kVar10 != null) {
            i2 = kVar10.hashCode();
        }
        return hashCode16 + i2;
    }

    public final String toString() {
        return "ChooseMusicStates(chooseMusicVisible=" + this.f147531a + ", ivChooseMusicVisible=" + this.f147532b + ", tvChooseMusicVisible=" + this.f147533c + ", chooseMusicAlphaAnim=" + this.f147534d + ", setMusicChange=" + this.f147535e + ", uiEnabledState=" + this.f147536f + ", uiHasMusic=" + this.f147537g + ", uiLoadingMusicChangeEvent=" + this.f147538h + ", removeMusicByBtnEvent=" + this.f147539i + ", uiCancelMusicEvent=" + this.f147540j + ", setupClickListener=" + this.f147541k + ", setupMusicTips=" + this.f147542l + ", initStitch=" + this.f147543m + ", chooseMusicClickedEvent=" + this.n + ", autoPlayMusicState=" + this.o + ", pauseOrContinueAutoPlayByIcon=" + this.p + ", autoPlayUiSwitchEvent=" + this.q + ")";
    }

    public /* synthetic */ b() {
        this(new l(false), new l(false), new l(false), new l(null), new k(), new l(true), new k(), new k(), new k(), new k(), new l(true), new k(), new k(), new k(), new l(false), new k(), new k());
    }

    private b(l<Boolean> lVar, l<Boolean> lVar2, l<Boolean> lVar3, l<p<Float, Float>> lVar4, k<z> kVar, l<Boolean> lVar5, k<c> kVar2, k<Boolean> kVar3, k<z> kVar4, k<Boolean> kVar5, l<Boolean> lVar6, k<Integer> kVar6, k<z> kVar7, k<z> kVar8, l<Boolean> lVar7, k<Boolean> kVar9, k<Boolean> kVar10) {
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(lVar2, "");
        h.f.b.l.d(lVar3, "");
        h.f.b.l.d(lVar4, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(lVar5, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(lVar6, "");
        h.f.b.l.d(kVar6, "");
        h.f.b.l.d(kVar7, "");
        h.f.b.l.d(kVar8, "");
        h.f.b.l.d(lVar7, "");
        h.f.b.l.d(kVar9, "");
        h.f.b.l.d(kVar10, "");
        this.f147531a = lVar;
        this.f147532b = lVar2;
        this.f147533c = lVar3;
        this.f147534d = lVar4;
        this.f147535e = kVar;
        this.f147536f = lVar5;
        this.f147537g = kVar2;
        this.f147538h = kVar3;
        this.f147539i = kVar4;
        this.f147540j = kVar5;
        this.f147541k = lVar6;
        this.f147542l = kVar6;
        this.f147543m = kVar7;
        this.n = kVar8;
        this.o = lVar7;
        this.p = kVar9;
        this.q = kVar10;
    }
}
