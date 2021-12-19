package com.ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i.g;
import com.ss.android.ugc.aweme.detail.i.h;
import com.ss.android.ugc.aweme.feed.param.b;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class m implements aa {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<ad> f79812a;

    /* renamed from: b  reason: collision with root package name */
    private final g f79813b = new g();

    /* renamed from: c  reason: collision with root package name */
    private final h f79814c = new h();

    static {
        Covode.recordClassIndex(49647);
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
    public final int getPageType(int i2) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        l.d(fragment, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final Object getViewModel() {
        return this.f79813b;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        return this.f79814c.j();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
        this.f79814c.cd_();
        this.f79814c.h();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void bindView(ad adVar) {
        l.d(adVar, "");
        this.f79812a = new e(adVar);
        this.f79814c.a_(adVar);
        this.f79814c.a(this.f79813b);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean deleteItem(String str) {
        ad adVar;
        l.d(str, "");
        WeakReference<ad> weakReference = this.f79812a;
        if (weakReference == null || (adVar = weakReference.get()) == null) {
            return false;
        }
        adVar.l();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, b bVar, int i3, boolean z) {
        l.d(bVar, "");
        this.f79814c.a(bVar.getAid(), bVar.getInboxExtra());
    }
}
