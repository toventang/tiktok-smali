package com.ss.android.ugc.aweme.profile.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final c f116620a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ g f116621b = h.f116622a.favoritesMobUtilsService();

    @Override // com.ss.android.ugc.aweme.profile.service.g
    public final boolean isDataSetChangedOnStart() {
        return this.f116621b.isDataSetChangedOnStart();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.g
    public final void onVideoItemActionShow(Aweme aweme) {
        l.d(aweme, "");
        this.f116621b.onVideoItemActionShow(aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.g
    public final void setDataSetChangedOnStart(boolean z) {
        this.f116621b.setDataSetChangedOnStart(z);
    }

    static {
        Covode.recordClassIndex(75344);
    }

    private c() {
    }
}
