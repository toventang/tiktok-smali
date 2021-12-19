package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoCaptionUpdateParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.l;
import h.z;

public final class ck implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<Integer> f91779a;

    /* renamed from: b  reason: collision with root package name */
    public final a<String> f91780b;

    /* renamed from: c  reason: collision with root package name */
    public final a<z> f91781c;

    /* renamed from: d  reason: collision with root package name */
    public final a<z> f91782d;

    /* renamed from: e  reason: collision with root package name */
    public final a<z> f91783e;

    /* renamed from: f  reason: collision with root package name */
    public final a<Aweme> f91784f;

    /* renamed from: g  reason: collision with root package name */
    public final a<VideoItemParams> f91785g;

    /* renamed from: h  reason: collision with root package name */
    public final a<VideoItemParams> f91786h;

    /* renamed from: i  reason: collision with root package name */
    public final a<Integer> f91787i;

    /* renamed from: j  reason: collision with root package name */
    public final a<VideoCaptionUpdateParams> f91788j;

    /* renamed from: k  reason: collision with root package name */
    public final a<Boolean> f91789k;

    /* renamed from: l  reason: collision with root package name */
    public final a<Boolean> f91790l;

    static {
        Covode.recordClassIndex(57777);
    }

    private static ck a(a<Integer> aVar, a<String> aVar2, a<z> aVar3, a<z> aVar4, a<z> aVar5, a<? extends Aweme> aVar6, a<? extends VideoItemParams> aVar7, a<? extends VideoItemParams> aVar8, a<Integer> aVar9, a<VideoCaptionUpdateParams> aVar10, a<Boolean> aVar11, a<Boolean> aVar12) {
        return new ck(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12);
    }

    public static /* synthetic */ ck a(ck ckVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, int i2) {
        a aVar13 = aVar12;
        a aVar14 = aVar11;
        a aVar15 = aVar4;
        a aVar16 = aVar3;
        a aVar17 = aVar2;
        a aVar18 = aVar;
        a aVar19 = aVar5;
        a aVar20 = aVar6;
        a aVar21 = aVar7;
        a aVar22 = aVar8;
        a aVar23 = aVar9;
        a aVar24 = aVar10;
        if ((i2 & 1) != 0) {
            aVar18 = ckVar.f91779a;
        }
        if ((i2 & 2) != 0) {
            aVar17 = ckVar.f91780b;
        }
        if ((i2 & 4) != 0) {
            aVar16 = ckVar.f91781c;
        }
        if ((i2 & 8) != 0) {
            aVar15 = ckVar.f91782d;
        }
        if ((i2 & 16) != 0) {
            aVar19 = ckVar.f91783e;
        }
        if ((i2 & 32) != 0) {
            aVar20 = ckVar.f91784f;
        }
        if ((i2 & 64) != 0) {
            aVar21 = ckVar.f91785g;
        }
        if ((i2 & 128) != 0) {
            aVar22 = ckVar.f91786h;
        }
        if ((i2 & 256) != 0) {
            aVar23 = ckVar.f91787i;
        }
        if ((i2 & 512) != 0) {
            aVar24 = ckVar.f91788j;
        }
        if ((i2 & 1024) != 0) {
            aVar14 = ckVar.f91789k;
        }
        if ((i2 & 2048) != 0) {
            aVar13 = ckVar.f91790l;
        }
        return a(aVar18, aVar17, aVar16, aVar15, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar14, aVar13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return l.a(this.f91779a, ckVar.f91779a) && l.a(this.f91780b, ckVar.f91780b) && l.a(this.f91781c, ckVar.f91781c) && l.a(this.f91782d, ckVar.f91782d) && l.a(this.f91783e, ckVar.f91783e) && l.a(this.f91784f, ckVar.f91784f) && l.a(this.f91785g, ckVar.f91785g) && l.a(this.f91786h, ckVar.f91786h) && l.a(this.f91787i, ckVar.f91787i) && l.a(this.f91788j, ckVar.f91788j) && l.a(this.f91789k, ckVar.f91789k) && l.a(this.f91790l, ckVar.f91790l);
    }

    public final int hashCode() {
        a<Integer> aVar = this.f91779a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a<String> aVar2 = this.f91780b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a<z> aVar3 = this.f91781c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        a<z> aVar4 = this.f91782d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        a<z> aVar5 = this.f91783e;
        int hashCode5 = (hashCode4 + (aVar5 != null ? aVar5.hashCode() : 0)) * 31;
        a<Aweme> aVar6 = this.f91784f;
        int hashCode6 = (hashCode5 + (aVar6 != null ? aVar6.hashCode() : 0)) * 31;
        a<VideoItemParams> aVar7 = this.f91785g;
        int hashCode7 = (hashCode6 + (aVar7 != null ? aVar7.hashCode() : 0)) * 31;
        a<VideoItemParams> aVar8 = this.f91786h;
        int hashCode8 = (hashCode7 + (aVar8 != null ? aVar8.hashCode() : 0)) * 31;
        a<Integer> aVar9 = this.f91787i;
        int hashCode9 = (hashCode8 + (aVar9 != null ? aVar9.hashCode() : 0)) * 31;
        a<VideoCaptionUpdateParams> aVar10 = this.f91788j;
        int hashCode10 = (hashCode9 + (aVar10 != null ? aVar10.hashCode() : 0)) * 31;
        a<Boolean> aVar11 = this.f91789k;
        int hashCode11 = (hashCode10 + (aVar11 != null ? aVar11.hashCode() : 0)) * 31;
        a<Boolean> aVar12 = this.f91790l;
        if (aVar12 != null) {
            i2 = aVar12.hashCode();
        }
        return hashCode11 + i2;
    }

    public final String toString() {
        return "VideoViewState(onPageSelectedEvent=" + this.f91779a + ", onHolderUnSelectedEvent=" + this.f91780b + ", onPageUnSelectedEvent=" + this.f91781c + ", onHolderPauseEvent=" + this.f91782d + ", onHolderResumeEvent=" + this.f91783e + ", doubleClickEvent=" + this.f91784f + ", updateLegacyBackupDataEvent=" + this.f91785g + ", updateLegacyDataEvent=" + this.f91786h + ", onHolderSelectedEvent=" + this.f91787i + ", updateCaptionTextEvent=" + this.f91788j + ", onProgressBarStateChangedEvent=" + this.f91789k + ", onBottomLayerClickedEvent=" + this.f91790l + ")";
    }

    public /* synthetic */ ck() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.VideoItemParams> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.VideoItemParams> */
    /* JADX WARN: Multi-variable type inference failed */
    private ck(a<Integer> aVar, a<String> aVar2, a<z> aVar3, a<z> aVar4, a<z> aVar5, a<? extends Aweme> aVar6, a<? extends VideoItemParams> aVar7, a<? extends VideoItemParams> aVar8, a<Integer> aVar9, a<VideoCaptionUpdateParams> aVar10, a<Boolean> aVar11, a<Boolean> aVar12) {
        this.f91779a = aVar;
        this.f91780b = aVar2;
        this.f91781c = aVar3;
        this.f91782d = aVar4;
        this.f91783e = aVar5;
        this.f91784f = aVar6;
        this.f91785g = aVar7;
        this.f91786h = aVar8;
        this.f91787i = aVar9;
        this.f91788j = aVar10;
        this.f91789k = aVar11;
        this.f91790l = aVar12;
    }
}
