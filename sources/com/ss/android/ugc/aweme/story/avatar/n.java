package com.ss.android.ugc.aweme.story.avatar;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.detail.i.k;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class n implements k, aa {

    /* renamed from: a  reason: collision with root package name */
    public final a<?, ?> f136838a;

    /* renamed from: b  reason: collision with root package name */
    private ad f136839b;

    static {
        Covode.recordClassIndex(89425);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean deleteItem(String str) {
        l.d(str, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final int getPageType(int i2) {
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final Object getViewModel() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        l.d(fragment, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, b bVar, int i3, boolean z) {
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.util.List<?>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    @Override // com.ss.android.ugc.aweme.detail.i.k
    public final List<Aweme> a() {
        a<?, ?> aVar = this.f136838a;
        if (!(aVar instanceof com.ss.android.ugc.aweme.story.avatar.entry.b)) {
            return new ArrayList();
        }
        l.b(aVar, "");
        return aVar.getItems();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        List<?> items;
        a<?, ?> aVar = this.f136838a;
        if (aVar == null || (items = aVar.getItems()) == null || items.isEmpty()) {
            return true;
        }
        return false;
    }

    public n(a<?, ?> aVar) {
        this.f136838a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void bindView(ad adVar) {
        l.d(adVar, "");
        this.f136839b = adVar;
    }
}
