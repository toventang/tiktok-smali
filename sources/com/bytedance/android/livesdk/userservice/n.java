package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f22103a;

    static {
        Covode.recordClassIndex(13014);
    }

    n(c cVar) {
        this.f22103a = cVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f22103a;
        User user = (User) obj;
        cVar.f22061d.onNext(user);
        cVar.a(user);
    }
}
