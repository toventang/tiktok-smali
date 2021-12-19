package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.c.p;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class an implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74074a;

    /* renamed from: b  reason: collision with root package name */
    private final p f74075b;

    static {
        Covode.recordClassIndex(45626);
    }

    an(h hVar, p pVar) {
        this.f74074a = hVar;
        this.f74075b = pVar;
    }

    public final void run() {
        h hVar = this.f74074a;
        this.f74075b.f65606b.onEvent(new com.bytedance.ies.bullet.c.c.a.p(hVar.L().longValue()) {
            /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f74236a;

            static {
                Covode.recordClassIndex(45808);
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final String a() {
                return "progressUpdate";
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final Object b() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("current_time", this.f74236a);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                return jSONObject;
            }

            {
                this.f74236a = r2;
            }
        });
    }
}
