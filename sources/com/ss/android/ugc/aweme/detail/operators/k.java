package com.ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i.i;
import com.ss.android.ugc.aweme.detail.i.j;
import com.ss.android.ugc.aweme.feed.param.b;
import java.lang.ref.WeakReference;

public class k implements aa {

    /* renamed from: a  reason: collision with root package name */
    protected i f79809a = new i();

    /* renamed from: b  reason: collision with root package name */
    protected j f79810b = new j();

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<ad> f79811c;

    static {
        Covode.recordClassIndex(49645);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public int getPageType(int i2) {
        return i2 + 3000;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean init(Fragment fragment) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean isDataEmpty() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public Object getViewModel() {
        return this.f79809a;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean isLoading() {
        return this.f79810b.j();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void unInit() {
        this.f79810b.cd_();
        this.f79810b.h();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void bindView(ad adVar) {
        this.f79811c = new e(adVar);
        this.f79810b.a_(adVar);
        this.f79810b.a(this.f79809a);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean deleteItem(String str) {
        WeakReference<ad> weakReference = this.f79811c;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        this.f79811c.get().l();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void request(int i2, b bVar, int i3, boolean z) {
        int i4 = !TextUtils.isEmpty(bVar.getUpvoteId()) ? 1 : 0;
        this.f79810b.a(bVar.getAid(), bVar.getEventType(), Integer.valueOf(i4), bVar.getTranslatorId());
    }
}
