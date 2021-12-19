package com.ss.android.ugc.aweme.discover.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class SearchEffectListViewModel$fetch$1<TTaskResult, TContinuationResult> implements g {
    final /* synthetic */ SearchEffectListViewModel this$0;

    static {
        Covode.recordClassIndex(50927);
    }

    SearchEffectListViewModel$fetch$1(SearchEffectListViewModel searchEffectListViewModel) {
        this.this$0 = searchEffectListViewModel;
    }

    @Override // b.g
    public final Void then(i<SearchEffectListResponse> iVar) {
        l.b(iVar, "");
        if (!iVar.a() || iVar.d() == null) {
            this.this$0.mData.setValue(null);
        } else {
            SearchEffectListResponse d2 = iVar.d();
            l.b(d2, "");
            SearchEffectListResponse searchEffectListResponse = d2;
            if (searchEffectListResponse.status_code == 0) {
                this.this$0.mData.setValue(searchEffectListResponse.propsList);
            } else {
                this.this$0.mData.setValue(null);
            }
        }
        return null;
    }
}
