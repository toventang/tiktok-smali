package com.ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i.j;
import com.ss.android.ugc.aweme.feed.param.b;
import java.lang.ref.WeakReference;

public final class i implements aa {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.detail.i.i f79806a = new com.ss.android.ugc.aweme.detail.i.i();

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<ad> f79807b = null;

    /* renamed from: c  reason: collision with root package name */
    private j f79808c = new j();

    static {
        Covode.recordClassIndex(49643);
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
        return 7000;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final Object getViewModel() {
        return this.f79806a;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        return this.f79808c.j();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
        this.f79807b = null;
        this.f79808c.cd_();
        this.f79808c.h();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void bindView(ad adVar) {
        this.f79807b = new WeakReference<>(adVar);
        this.f79808c.a_(adVar);
        this.f79808c.a(this.f79806a);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean deleteItem(String str) {
        WeakReference<ad> weakReference = this.f79807b;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        this.f79807b.get().l();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, b bVar, int i3, boolean z) {
        this.f79808c.a(bVar.getAid(), bVar.getEventType());
    }
}
