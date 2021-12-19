package com.ss.android.ugc.aweme.share;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.trill.share.api.a;
import com.zhiliaoapp.musically.R;

public final class b implements n {

    /* renamed from: a  reason: collision with root package name */
    public a f123371a;

    /* renamed from: b  reason: collision with root package name */
    private Fragment f123372b;

    static {
        Covode.recordClassIndex(81025);
    }

    @Override // com.ss.android.ugc.aweme.share.n
    public final void b() {
        new com.bytedance.tux.g.b(this.f123372b).e(R.string.g4v).b();
    }

    @Override // com.ss.android.ugc.aweme.share.n
    public final void a() {
        SharePrefCache.inst().getTwitterSecret().a();
        SharePrefCache.inst().getFacebookAccessToken().a();
        SharePrefCache.inst().getTwitterAccessToken().a();
        new com.bytedance.tux.g.b(this.f123372b).e(R.string.fu6).b();
    }

    public b(Fragment fragment) {
        this.f123372b = fragment;
        a aVar = new a();
        this.f123371a = aVar;
        aVar.a_(this);
    }
}
