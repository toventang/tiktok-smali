package com.ss.android.ugc.aweme.player.sdk.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.g;
import com.ss.ttvideoengine.k.k;
import com.ss.ttvideoengine.s.c;
import java.util.Map;
import org.json.JSONObject;

public final class l extends k {

    /* renamed from: a  reason: collision with root package name */
    private g f115267a;

    static {
        Covode.recordClassIndex(74033);
    }

    @Override // com.ss.ttvideoengine.k.k
    public final void a() {
        this.f115267a.b();
    }

    public l(g gVar) {
        this.f115267a = gVar;
    }

    private g.a a(final k.a aVar) {
        return new g.a() {
            /* class com.ss.android.ugc.aweme.player.sdk.a.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(74034);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.g.a
            public final void a(JSONObject jSONObject, g.b bVar) {
                if (bVar != null) {
                    aVar.a(null, new c("", -9994, bVar.toString()));
                } else {
                    aVar.a(jSONObject, null);
                }
            }
        };
    }

    @Override // com.ss.ttvideoengine.k.k
    public final void a(String str, k.a aVar) {
        this.f115267a.a(str, a(aVar));
    }

    @Override // com.ss.ttvideoengine.k.k
    public final void b(String str, Map<String, String> map, k.a aVar) {
        this.f115267a.a(str, map, a(aVar));
    }

    @Override // com.ss.ttvideoengine.k.k
    public final void a(String str, Map<String, String> map, k.a aVar) {
        this.f115267a.a(str, map, null, 0, a(aVar));
    }
}
