package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class AlbumServiceImpl$subscribeAlbumOpen$1 extends y {
    public static final k INSTANCE = new AlbumServiceImpl$subscribeAlbumOpen$1();

    static {
        Covode.recordClassIndex(79414);
    }

    AlbumServiceImpl$subscribeAlbumOpen$1() {
        super(ChooseMediaState.class, "openingChooseMediaPageState", "getOpeningChooseMediaPageState()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/OpeningChooseMediaPageState;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
    }
}
