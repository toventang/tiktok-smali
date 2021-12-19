package com.ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.presenter.n;
import h.f.b.l;

public final class o implements j {

    /* renamed from: a  reason: collision with root package name */
    public final n f117820a;

    /* renamed from: b  reason: collision with root package name */
    public final f<FollowStatus> f117821b;

    /* renamed from: c  reason: collision with root package name */
    public final f<BaseResponse> f117822c;

    /* renamed from: d  reason: collision with root package name */
    public final a<a> f117823d;

    static {
        Covode.recordClassIndex(76319);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f117820a, oVar.f117820a) && l.a(this.f117821b, oVar.f117821b) && l.a(this.f117822c, oVar.f117822c) && l.a(this.f117823d, oVar.f117823d);
    }

    public final int hashCode() {
        n nVar = this.f117820a;
        int i2 = 0;
        int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
        f<FollowStatus> fVar = this.f117821b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        f<BaseResponse> fVar2 = this.f117822c;
        int hashCode3 = (hashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        a<a> aVar = this.f117823d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "UserProfileFollowState(followParams=" + this.f117820a + ", followRequest=" + this.f117821b + ", removeRequest=" + this.f117822c + ", checkEventEnum=" + this.f117823d + ")";
    }

    public /* synthetic */ o() {
        this(null, t.f25669a, t.f25669a, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.base.api.BaseResponse> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.widgets.follow.a> */
    /* JADX WARN: Multi-variable type inference failed */
    private o(n nVar, f<FollowStatus> fVar, f<? extends BaseResponse> fVar2, a<? extends a> aVar) {
        l.d(fVar, "");
        l.d(fVar2, "");
        this.f117820a = nVar;
        this.f117821b = fVar;
        this.f117822c = fVar2;
        this.f117823d = aVar;
    }

    public static /* synthetic */ o a(o oVar, n nVar, f fVar, f fVar2, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            nVar = oVar.f117820a;
        }
        if ((i2 & 2) != 0) {
            fVar = oVar.f117821b;
        }
        if ((i2 & 4) != 0) {
            fVar2 = oVar.f117822c;
        }
        if ((i2 & 8) != 0) {
            aVar = oVar.f117823d;
        }
        l.d(fVar, "");
        l.d(fVar2, "");
        return new o(nVar, fVar, fVar2, aVar);
    }
}
