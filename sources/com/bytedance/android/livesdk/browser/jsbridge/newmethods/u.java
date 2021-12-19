package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import com.bytedance.android.live.base.model.user.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.l.a;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.ae;
import h.f.a.b;
import java.io.File;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements b {

    /* renamed from: a  reason: collision with root package name */
    private final t f14786a;

    static {
        Covode.recordClassIndex(8196);
    }

    u(t tVar) {
        this.f14786a = tVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        byte[] a2;
        t tVar = this.f14786a;
        String str = (String) obj;
        if (tVar.f14745d == null) {
            tVar.f14745d = new a.C0382a(tVar.f14744c.getActivity()).a();
            tVar.f14745d.a(y.a((int) R.string.gv7));
            tVar.f14745d.setCancelable(false);
        }
        if (!tVar.f14745d.isShowing()) {
            tVar.f14745d.show();
        }
        File file = new File(str);
        if (!file.exists() || (a2 = g.a(file)) == null || a2.length == 0) {
            return null;
        }
        ab.a(tVar.f14748g).b(f.a.h.a.b(f.a.k.a.f158006c)).c(new w(tVar, a2)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ae<d<c>>(str, a2) {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.AnonymousClass9 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f14774a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ byte[] f14775b;

            static {
                Covode.recordClassIndex(8192);
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
                t.this.f14743b = bVar;
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                Context context = t.this.f14744c.getContext();
                if (context != null) {
                    com.bytedance.android.live.core.e.b.a.a(context, th, null);
                }
                if (this.f14775b.length > 0 || t.this.f14747f >= 10) {
                    ao.a(y.e(), (int) R.string.gxj);
                    t.this.c();
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(d<com.bytedance.android.live.base.model.user.c> dVar) {
                d<com.bytedance.android.live.base.model.user.c> dVar2 = dVar;
                ((com.bytedance.android.live.base.model.user.c) dVar2.data).f7456b = ((com.bytedance.android.live.base.model.user.c) dVar2.data).f7456b;
                t tVar = t.this;
                String str = this.f14774a;
                tVar.a();
                a aVar = new a();
                aVar.f14777a = ((com.bytedance.android.live.base.model.user.c) dVar2.data).f7455a;
                com.bytedance.android.livesdk.browser.f.d.a();
                aVar.f14779c = com.bytedance.android.livesdk.browser.f.d.a(str);
                tVar.finishWithResult(new b(0, y.a((int) R.string.gne), aVar, (byte) 0));
            }

            {
                this.f14774a = r2;
                this.f14775b = r3;
            }
        });
        return null;
    }
}
