package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.z;

public final class bd implements j {

    /* renamed from: a */
    public final a<Boolean> f91686a;

    /* renamed from: b */
    public final a<Integer> f91687b;

    /* renamed from: c */
    public final a<Boolean> f91688c;

    /* renamed from: d */
    public final a<z> f91689d;

    /* renamed from: e */
    public final a<z> f91690e;

    /* renamed from: f */
    public final a<z> f91691f;

    /* renamed from: g */
    public final a<z> f91692g;

    /* renamed from: h */
    public final a<Float> f91693h;

    /* renamed from: i */
    public final Double f91694i;

    /* renamed from: j */
    public final a<Aweme> f91695j;

    static {
        Covode.recordClassIndex(57733);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return l.a(this.f91686a, bdVar.f91686a) && l.a(this.f91687b, bdVar.f91687b) && l.a(this.f91688c, bdVar.f91688c) && l.a(this.f91689d, bdVar.f91689d) && l.a(this.f91690e, bdVar.f91690e) && l.a(this.f91691f, bdVar.f91691f) && l.a(this.f91692g, bdVar.f91692g) && l.a(this.f91693h, bdVar.f91693h) && l.a(this.f91694i, bdVar.f91694i) && l.a(this.f91695j, bdVar.f91695j);
    }

    public final int hashCode() {
        a<Boolean> aVar = this.f91686a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a<Integer> aVar2 = this.f91687b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a<Boolean> aVar3 = this.f91688c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        a<z> aVar4 = this.f91689d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        a<z> aVar5 = this.f91690e;
        int hashCode5 = (hashCode4 + (aVar5 != null ? aVar5.hashCode() : 0)) * 31;
        a<z> aVar6 = this.f91691f;
        int hashCode6 = (hashCode5 + (aVar6 != null ? aVar6.hashCode() : 0)) * 31;
        a<z> aVar7 = this.f91692g;
        int hashCode7 = (hashCode6 + (aVar7 != null ? aVar7.hashCode() : 0)) * 31;
        a<Float> aVar8 = this.f91693h;
        int hashCode8 = (hashCode7 + (aVar8 != null ? aVar8.hashCode() : 0)) * 31;
        Double d2 = this.f91694i;
        int hashCode9 = (hashCode8 + (d2 != null ? d2.hashCode() : 0)) * 31;
        a<Aweme> aVar9 = this.f91695j;
        if (aVar9 != null) {
            i2 = aVar9.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "VideoPlayState(playAnimationEvent=" + this.f91686a + ", pauseAnimationEvent=" + this.f91687b + ", stopAnimationEvent=" + this.f91688c + ", onRenderReadyEvent=" + this.f91689d + ", onRenderFirstFrameEvent=" + this.f91690e + ", onPlayCompletedFirstTime=" + this.f91691f + ", onResumePlayEvent=" + this.f91692g + ", playProgressEvent=" + this.f91693h + ", playGetDurationEvent=" + this.f91694i + ", resumePlayEvent=" + this.f91695j + ")";
    }

    public /* synthetic */ bd() {
        this(new a(false), new a(0), new a(false), null, null, null, null, null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    private bd(a<Boolean> aVar, a<Integer> aVar2, a<Boolean> aVar3, a<z> aVar4, a<z> aVar5, a<z> aVar6, a<z> aVar7, a<Float> aVar8, Double d2, a<? extends Aweme> aVar9) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        this.f91686a = aVar;
        this.f91687b = aVar2;
        this.f91688c = aVar3;
        this.f91689d = aVar4;
        this.f91690e = aVar5;
        this.f91691f = aVar6;
        this.f91692g = aVar7;
        this.f91693h = aVar8;
        this.f91694i = d2;
        this.f91695j = aVar9;
    }

    public static /* synthetic */ bd a(bd bdVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, Double d2, a aVar9, int i2) {
        a aVar10 = aVar4;
        a aVar11 = aVar3;
        a aVar12 = aVar2;
        a aVar13 = aVar;
        a aVar14 = aVar5;
        a aVar15 = aVar6;
        a aVar16 = aVar7;
        a aVar17 = aVar8;
        Double d3 = d2;
        a aVar18 = aVar9;
        if ((i2 & 1) != 0) {
            aVar13 = bdVar.f91686a;
        }
        if ((i2 & 2) != 0) {
            aVar12 = bdVar.f91687b;
        }
        if ((i2 & 4) != 0) {
            aVar11 = bdVar.f91688c;
        }
        if ((i2 & 8) != 0) {
            aVar10 = bdVar.f91689d;
        }
        if ((i2 & 16) != 0) {
            aVar14 = bdVar.f91690e;
        }
        if ((i2 & 32) != 0) {
            aVar15 = bdVar.f91691f;
        }
        if ((i2 & 64) != 0) {
            aVar16 = bdVar.f91692g;
        }
        if ((i2 & 128) != 0) {
            aVar17 = bdVar.f91693h;
        }
        if ((i2 & 256) != 0) {
            d3 = bdVar.f91694i;
        }
        if ((i2 & 512) != 0) {
            aVar18 = bdVar.f91695j;
        }
        l.d(aVar13, "");
        l.d(aVar12, "");
        l.d(aVar11, "");
        return new bd(aVar13, aVar12, aVar11, aVar10, aVar14, aVar15, aVar16, aVar17, d3, aVar18);
    }
}
