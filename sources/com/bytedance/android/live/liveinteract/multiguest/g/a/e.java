package com.bytedance.android.live.liveinteract.multiguest.g.a;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import f.a.d.g;

final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f11210a = new e();

    static {
        Covode.recordClassIndex(6022);
    }

    private e() {
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        return ((IBroadcastService) a.a(IBroadcastService.class)).convertStickerBean((Effect) obj);
    }
}
