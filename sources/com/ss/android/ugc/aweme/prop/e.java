package com.ss.android.ugc.aweme.prop;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Effect f118301a;

    static {
        Covode.recordClassIndex(76823);
    }

    e(Effect effect) {
        this.f118301a = effect;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return ((StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(StickerPropApi.class)).getStickerDetail(this.f118301a.getEffectId()).get();
    }
}
