package com.ss.android.ugc.aweme.prop;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Effect f118275a;

    static {
        Covode.recordClassIndex(76810);
    }

    c(Effect effect) {
        this.f118275a = effect;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return ((StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(StickerPropApi.class)).getStickerDetail(this.f118275a.getEffectId()).get();
    }
}
