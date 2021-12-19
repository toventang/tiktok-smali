package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.livesdk.event.n;
import com.bytedance.android.livesdkapi.depend.f.b;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import f.a.ae;

final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final c f22087a;

    /* renamed from: b  reason: collision with root package name */
    private final IHostUser f22088b;

    static {
        Covode.recordClassIndex(13007);
    }

    g(c cVar, IHostUser iHostUser) {
        this.f22087a = cVar;
        this.f22088b = iHostUser;
    }

    @Override // com.bytedance.android.livesdkapi.depend.f.b
    public final void a(boolean z) {
        c cVar = this.f22087a;
        IHostUser iHostUser = this.f22088b;
        if (z) {
            cVar.b(iHostUser.getCurUser());
            cVar.i().a_(new ae<com.bytedance.android.live.base.model.user.b>() {
                /* class com.bytedance.android.livesdk.userservice.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(13001);
                }

                @Override // f.a.ae
                public final void onError(Throwable th) {
                }

                @Override // f.a.ae
                public final void onSubscribe(f.a.b.b bVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.ae
                public final /* synthetic */ void onSuccess(com.bytedance.android.live.base.model.user.b bVar) {
                    c.this.b(bVar);
                }
            });
            return;
        }
        cVar.b(new b());
        cVar.f22060c.onNext(new n(b.a.Logout, cVar.f22058a));
    }
}
