package com.ss.android.ugc.aweme.ecommerce.review;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.review.a.a;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import h.f.b.l;
import h.n;

public final class d extends j.e<a> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f87007a = true;

    static {
        Covode.recordClassIndex(54579);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ Object c(a aVar, a aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        return aVar2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean a(a aVar, a aVar2) {
        ReviewItemStruct reviewItemStruct;
        ReviewItemStruct.MainReview mainReview;
        a aVar3 = aVar;
        a aVar4 = aVar2;
        l.d(aVar3, "");
        l.d(aVar4, "");
        if (!this.f87007a) {
            return false;
        }
        if (aVar3 instanceof a.C2096a) {
            String str = null;
            if (!(aVar4 instanceof a.C2096a)) {
                aVar4 = null;
            }
            a.C2096a aVar5 = (a.C2096a) aVar4;
            if (!(aVar5 == null || (reviewItemStruct = aVar5.f86985a) == null || (mainReview = reviewItemStruct.f87055a) == null)) {
                str = mainReview.f87068a;
            }
            if (l.a((Object) str, (Object) ((a.C2096a) aVar3).f86985a.f87055a.f87068a)) {
                return true;
            }
            return false;
        }
        throw new n();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean b(a aVar, a aVar2) {
        a aVar3 = aVar2;
        l.d(aVar, "");
        l.d(aVar3, "");
        if (!this.f87007a) {
            return false;
        }
        if (aVar instanceof a.C2096a) {
            if (!(aVar3 instanceof a.C2096a)) {
                aVar3 = null;
            }
            if (l.a(aVar3, aVar)) {
                return true;
            }
            return false;
        }
        throw new n();
    }
}
