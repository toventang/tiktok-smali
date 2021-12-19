package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import com.bytedance.android.live.core.f.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import f.a.z;

public final class aj extends e<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    public b f14508a;

    static {
        Covode.recordClassIndex(8064);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        b bVar = this.f14508a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void invoke(Object obj, g gVar) {
        if (a.a(gVar.f35646a) == null) {
            finishWithFailure();
        }
        f b2 = u.a().b();
        Context context = gVar.f35646a;
        j.a a2 = j.a();
        a2.f14158a = y.a((int) R.string.gw3);
        b2.a(context, a2.a()).b(new z<com.bytedance.android.live.base.model.user.b>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.aj.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8065);
            }

            @Override // f.a.z
            public final void onComplete() {
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
                aj.this.finishWithFailure(th);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.z
            public final /* synthetic */ void onNext(com.bytedance.android.live.base.model.user.b bVar) {
                aj.this.finishWithSuccess();
            }

            @Override // f.a.z
            public final void onSubscribe(b bVar) {
                aj.this.f14508a = bVar;
            }
        });
    }
}
