package com.ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.e.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class af implements aa {

    /* renamed from: a  reason: collision with root package name */
    private a f79785a;

    /* renamed from: b  reason: collision with root package name */
    private b f79786b = new b();

    static {
        Covode.recordClassIndex(49623);
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
        return 9;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final Object getViewModel() {
        return this.f79785a;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        return this.f79785a.isDataEmpty();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        return this.f79786b.j();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
        this.f79786b.cd_();
        this.f79786b.h();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        if (this.f79785a != null) {
            return true;
        }
        return false;
    }

    public af(a aVar) {
        this.f79785a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void bindView(ad adVar) {
        this.f79786b.a_(adVar);
        this.f79786b.a((d) adVar);
        this.f79786b.a((com.ss.android.ugc.aweme.common.b) this.f79785a);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean deleteItem(String str) {
        Aweme b2 = AwemeService.b().b(str);
        if (b2 == null && (b2 = AwemeService.b().a(str)) == null) {
            return false;
        }
        return this.f79786b.a(b2);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        this.f79786b.c();
    }
}
