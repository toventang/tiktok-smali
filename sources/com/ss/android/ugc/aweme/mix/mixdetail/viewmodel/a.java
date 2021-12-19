package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a implements j {

    /* renamed from: a */
    public final List<Aweme> f110133a;

    /* renamed from: b */
    public final List<String> f110134b;

    /* renamed from: c */
    public final List<String> f110135c;

    /* renamed from: d */
    public final com.bytedance.assem.arch.extensions.a<Boolean> f110136d;

    /* renamed from: e */
    public final com.bytedance.assem.arch.extensions.a<Boolean> f110137e;

    /* renamed from: f */
    public final List<Aweme> f110138f;

    /* renamed from: g */
    public final List<String> f110139g;

    static {
        Covode.recordClassIndex(70693);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f110133a, aVar.f110133a) && l.a(this.f110134b, aVar.f110134b) && l.a(this.f110135c, aVar.f110135c) && l.a(this.f110136d, aVar.f110136d) && l.a(this.f110137e, aVar.f110137e) && l.a(this.f110138f, aVar.f110138f) && l.a(this.f110139g, aVar.f110139g);
    }

    public final int hashCode() {
        List<Aweme> list = this.f110133a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f110134b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f110135c;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<Boolean> aVar = this.f110136d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<Boolean> aVar2 = this.f110137e;
        int hashCode5 = (hashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        List<Aweme> list4 = this.f110138f;
        int hashCode6 = (hashCode5 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<String> list5 = this.f110139g;
        if (list5 != null) {
            i2 = list5.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "MixVideosManageState(mixVideos=" + this.f110133a + ", removeFeedsID=" + this.f110134b + ", addFeedsID=" + this.f110135c + ", onEditType=" + this.f110136d + ", onPlayListChanged=" + this.f110137e + ", addFeedsAweme=" + this.f110138f + ", removeFeedsIdForAddPage=" + this.f110139g + ")";
    }

    public /* synthetic */ a() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new com.bytedance.assem.arch.extensions.a(true), new com.bytedance.assem.arch.extensions.a(false), new ArrayList(), new ArrayList());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    private a(List<? extends Aweme> list, List<String> list2, List<String> list3, com.bytedance.assem.arch.extensions.a<Boolean> aVar, com.bytedance.assem.arch.extensions.a<Boolean> aVar2, List<? extends Aweme> list4, List<String> list5) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f110133a = list;
        this.f110134b = list2;
        this.f110135c = list3;
        this.f110136d = aVar;
        this.f110137e = aVar2;
        this.f110138f = list4;
        this.f110139g = list5;
    }

    public static /* synthetic */ a a(a aVar, List list, List list2, List list3, com.bytedance.assem.arch.extensions.a aVar2, com.bytedance.assem.arch.extensions.a aVar3, List list4, List list5, int i2) {
        List list6 = list5;
        List list7 = list4;
        com.bytedance.assem.arch.extensions.a aVar4 = aVar3;
        List list8 = list;
        List list9 = list2;
        List list10 = list3;
        com.bytedance.assem.arch.extensions.a aVar5 = aVar2;
        if ((i2 & 1) != 0) {
            list8 = aVar.f110133a;
        }
        if ((i2 & 2) != 0) {
            list9 = aVar.f110134b;
        }
        if ((i2 & 4) != 0) {
            list10 = aVar.f110135c;
        }
        if ((i2 & 8) != 0) {
            aVar5 = aVar.f110136d;
        }
        if ((i2 & 16) != 0) {
            aVar4 = aVar.f110137e;
        }
        if ((i2 & 32) != 0) {
            list7 = aVar.f110138f;
        }
        if ((i2 & 64) != 0) {
            list6 = aVar.f110139g;
        }
        l.d(aVar5, "");
        l.d(aVar4, "");
        return new a(list8, list9, list10, aVar5, aVar4, list7, list6);
    }
}
