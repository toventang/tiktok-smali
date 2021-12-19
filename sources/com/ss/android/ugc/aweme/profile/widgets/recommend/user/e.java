package com.ss.android.ugc.aweme.profile.widgets.recommend.user;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class e implements j {

    /* renamed from: a */
    public final f<RecommendList> f118056a;

    /* renamed from: b */
    public final RecommendList f118057b;

    /* renamed from: c */
    public final long f118058c;

    /* renamed from: d */
    public final List<String> f118059d;

    /* renamed from: e */
    public final boolean f118060e;

    /* renamed from: f */
    public final int f118061f;

    /* renamed from: g */
    public final int f118062g;

    static {
        Covode.recordClassIndex(76635);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f118056a, eVar.f118056a) && l.a(this.f118057b, eVar.f118057b) && this.f118058c == eVar.f118058c && l.a(this.f118059d, eVar.f118059d) && this.f118060e == eVar.f118060e && this.f118061f == eVar.f118061f && this.f118062g == eVar.f118062g;
    }

    public final String toString() {
        return "RecommendUserState(request=" + this.f118056a + ", data=" + this.f118057b + ", lastClickTime=" + this.f118058c + ", mobUsers=" + this.f118059d + ", isShowRecommendCardByFollowAction=" + this.f118060e + ", recommendUserCardUIState=" + this.f118061f + ", clickWhenRecommendFriendEmptyCount=" + this.f118062g + ")";
    }

    public /* synthetic */ e() {
        this(t.f25669a, null, 0, new ArrayList(), false, -1, 0);
    }

    public final int hashCode() {
        int i2;
        int i3;
        f<RecommendList> fVar = this.f118056a;
        int i4 = 0;
        if (fVar != null) {
            i2 = fVar.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i2 * 31;
        RecommendList recommendList = this.f118057b;
        if (recommendList != null) {
            i3 = recommendList.hashCode();
        } else {
            i3 = 0;
        }
        long j2 = this.f118058c;
        int i6 = (((i5 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<String> list = this.f118059d;
        if (list != null) {
            i4 = list.hashCode();
        }
        int i7 = (i6 + i4) * 31;
        boolean z = this.f118060e;
        if (z) {
            z = true;
        }
        int i8 = z ? 1 : 0;
        int i9 = z ? 1 : 0;
        int i10 = z ? 1 : 0;
        return ((((i7 + i8) * 31) + this.f118061f) * 31) + this.f118062g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.friends.model.RecommendList> */
    /* JADX WARN: Multi-variable type inference failed */
    private e(f<? extends RecommendList> fVar, RecommendList recommendList, long j2, List<String> list, boolean z, int i2, int i3) {
        l.d(fVar, "");
        l.d(list, "");
        this.f118056a = fVar;
        this.f118057b = recommendList;
        this.f118058c = j2;
        this.f118059d = list;
        this.f118060e = z;
        this.f118061f = i2;
        this.f118062g = i3;
    }

    public static /* synthetic */ e a(e eVar, f fVar, RecommendList recommendList, long j2, List list, boolean z, int i2, int i3, int i4) {
        boolean z2 = z;
        int i5 = i2;
        f fVar2 = fVar;
        int i6 = i3;
        RecommendList recommendList2 = recommendList;
        List list2 = list;
        long j3 = j2;
        if ((i4 & 1) != 0) {
            fVar2 = eVar.f118056a;
        }
        if ((i4 & 2) != 0) {
            recommendList2 = eVar.f118057b;
        }
        if ((i4 & 4) != 0) {
            j3 = eVar.f118058c;
        }
        if ((i4 & 8) != 0) {
            list2 = eVar.f118059d;
        }
        if ((i4 & 16) != 0) {
            z2 = eVar.f118060e;
        }
        if ((i4 & 32) != 0) {
            i5 = eVar.f118061f;
        }
        if ((i4 & 64) != 0) {
            i6 = eVar.f118062g;
        }
        l.d(fVar2, "");
        l.d(list2, "");
        return new e(fVar2, recommendList2, j3, list2, z2, i5, i6);
    }
}
