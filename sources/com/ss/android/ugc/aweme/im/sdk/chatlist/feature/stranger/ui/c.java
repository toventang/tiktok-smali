package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.m.a;
import f.a.d.f;

final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f102012a;

    static {
        Covode.recordClassIndex(65277);
    }

    c(a aVar) {
        this.f102012a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f102012a;
        Integer num = (Integer) obj;
        a.c("DmHelper", "BaseStrangerListAdapter need update -> position:".concat(String.valueOf(num)));
        aVar.notifyItemChanged(num.intValue());
    }
}
