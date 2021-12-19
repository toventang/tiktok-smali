package com.ss.android.ugc.aweme.prop.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f118300a;

    static {
        Covode.recordClassIndex(76822);
    }

    c(String str) {
        this.f118300a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return ((StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(StickerPropApi.class)).getStickerDetail(this.f118300a).get();
    }
}
