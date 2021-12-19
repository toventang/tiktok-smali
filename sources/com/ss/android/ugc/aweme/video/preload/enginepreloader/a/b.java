package com.ss.android.ugc.aweme.video.preload.enginepreloader.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.g;
import com.ss.mediakit.net.AVMDLNetClient;
import com.ss.mediakit.net.Error;
import java.util.Map;
import org.json.JSONObject;

public final class b extends AVMDLNetClient {

    /* renamed from: a  reason: collision with root package name */
    private g f143690a;

    static {
        Covode.recordClassIndex(94012);
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public final void cancel() {
        this.f143690a.b();
    }

    public b(g gVar) {
        this.f143690a = gVar;
    }

    private g.a a(final AVMDLNetClient.CompletionListener completionListener) {
        return new g.a() {
            /* class com.ss.android.ugc.aweme.video.preload.enginepreloader.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94013);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.g.a
            public final void a(JSONObject jSONObject, g.b bVar) {
                if (bVar != null) {
                    completionListener.onCompletion(null, new Error(bVar.code, "", bVar.toString()));
                } else {
                    completionListener.onCompletion(jSONObject, null);
                }
            }
        };
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public final void startTask(String str, AVMDLNetClient.CompletionListener completionListener) {
        this.f143690a.a(str, a(completionListener));
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public final void startTask(String str, Map<String, String> map, AVMDLNetClient.CompletionListener completionListener) {
        this.f143690a.a(str, map, a(completionListener));
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public final void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i2, AVMDLNetClient.CompletionListener completionListener) {
        this.f143690a.a(str, map, jSONObject, i2, a(completionListener));
    }
}
