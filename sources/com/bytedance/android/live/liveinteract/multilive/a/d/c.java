package com.bytedance.android.live.liveinteract.multilive.a.d;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import f.a.d.g;

final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f11518a = new c();

    static {
        Covode.recordClassIndex(6224);
    }

    private c() {
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        return ((IBroadcastService) a.a(IBroadcastService.class)).convertStickerBean((Effect) obj);
    }
}
