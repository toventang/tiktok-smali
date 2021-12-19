package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class AlbumServiceImpl$subscribeAlbumClose$1 extends y {
    public static final k INSTANCE = new AlbumServiceImpl$subscribeAlbumClose$1();

    static {
        Covode.recordClassIndex(79412);
    }

    AlbumServiceImpl$subscribeAlbumClose$1() {
        super(ChooseMediaState.class, "closingChooseMediaPageState", "getClosingChooseMediaPageState()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/ClosingChooseMediaPageState;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((ChooseMediaState) obj).getClosingChooseMediaPageState();
    }
}
