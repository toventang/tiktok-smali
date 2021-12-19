package com.bytedance.android.livesdk.share;

import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.android.live.share.c;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.j.cd;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;
import java.util.HashMap;

final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveShareWidget f21443a;

    static {
        Covode.recordClassIndex(12625);
    }

    a(LiveShareWidget liveShareWidget) {
        this.f21443a = liveShareWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LiveShareWidget liveShareWidget = this.f21443a;
        String str = (String) liveShareWidget.dataChannel.b(cd.class);
        com.bytedance.android.live.share.a share = ((c) com.bytedance.android.live.t.a.a(c.class)).share();
        e a2 = p.a(liveShareWidget.context);
        c.a a3 = com.bytedance.android.livesdkapi.depend.e.c.a(liveShareWidget.f21439b);
        a3.n = liveShareWidget.f21438a ? liveShareWidget.f21439b.getAnchorShareText() : liveShareWidget.f21439b.getUserShareText();
        a3.q = liveShareWidget.f21438a;
        a3.N = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
        a3.u = str;
        share.a(a2, a3.a(), new com.bytedance.android.livesdkapi.depend.e.b() {
            /* class com.bytedance.android.livesdk.share.LiveShareWidget.AnonymousClass1 */

            static {
                Covode.recordClassIndex(12624);
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.b
            public final void a(Throwable th) {
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.b
            public final void a(String str, String str2, Bundle bundle) {
                String str3 = "";
                if (bundle != null) {
                    str3 = bundle.getString("shareIdList", str3);
                }
                LiveShareWidget liveShareWidget = LiveShareWidget.this;
                ((com.bytedance.android.live.share.c) a.a(com.bytedance.android.live.share.c.class)).sendShare(liveShareWidget.f21439b.getId(), str2, 1, LiveShareWidget.this.f21439b.getLabels(), str3).a(new b(liveShareWidget), i.f22196a);
                if (com.bytedance.android.livesdk.utils.a.a(LiveShareWidget.this.dataChannel) && LiveShareWidget.this.f21439b.author() != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(LiveShareWidget.this.f21439b.author().getId()));
                    hashMap.put("room_id", String.valueOf(LiveShareWidget.this.f21439b.getId()));
                    com.bytedance.android.livesdk.utils.a.a("live_ad", "live_share", null, hashMap);
                }
            }
        });
        return z.f158842a;
    }
}
