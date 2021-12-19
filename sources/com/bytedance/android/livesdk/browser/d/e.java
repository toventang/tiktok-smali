package com.bytedance.android.livesdk.browser.d;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.depend.e.b;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f14351a;

    static {
        Covode.recordClassIndex(7949);
    }

    e(a aVar) {
        this.f14351a = aVar;
    }

    public final void onClick(View view) {
        a aVar = this.f14351a;
        c.a a2 = c.a();
        a2.f22989l = aVar.f14334i;
        a2.N = ((com.bytedance.android.live.s.e) a.a(com.bytedance.android.live.s.e.class)).getReportScene();
        if (aVar.f14332g) {
            a2.E = "live_links";
            a2.M = aVar.f14333h;
        }
        ((com.bytedance.android.live.share.c) a.a(com.bytedance.android.live.share.c.class)).share().a(aVar.getActivity(), a2.a(), new b() {
            /* class com.bytedance.android.livesdk.browser.d.a.AnonymousClass5 */

            static {
                Covode.recordClassIndex(7943);
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.b
            public final void a(String str, String str2, Bundle bundle) {
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.b
            public final void a(Throwable th) {
            }
        });
    }
}
