package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.host.c.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.services.BaseUserService;

final /* synthetic */ class ah implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f108458a;

    static {
        Covode.recordClassIndex(69499);
    }

    ah(a aVar) {
        this.f108458a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void a() {
        this.f108458a.a(s.a(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser()));
    }
}
