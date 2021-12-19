package com.ss.android.ugc.aweme.profile.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f116332a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static EffectProfileListApi f116333b;

    private g() {
    }

    static {
        Covode.recordClassIndex(75108);
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e).create(EffectProfileListApi.class);
        l.b(create, "");
        f116333b = (EffectProfileListApi) create;
    }

    public static t<StickerItemList> a(String str, long j2) {
        l.d(str, "");
        return f116333b.fetch(str, j2, 10);
    }
}
