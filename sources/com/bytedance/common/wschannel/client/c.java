package com.bytedance.common.wschannel.client;

import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.b.b;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends b {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, d> f27184b;

    public interface a {
        static {
            Covode.recordClassIndex(16015);
        }

        void a(int i2, com.bytedance.common.wschannel.b.c cVar);

        void a(b bVar, JSONObject jSONObject);

        void a(WsChannelMsg wsChannelMsg);

        void b(WsChannelMsg wsChannelMsg);
    }

    static {
        Covode.recordClassIndex(16014);
    }

    public c(a aVar) {
        super(aVar);
        HashMap hashMap = new HashMap();
        hashMap.put("com.bytedance.article.wschannel.receive.connection", new e(aVar));
        hashMap.put("com.bytedance.article.wschannel.syncconnectstate", new i(aVar));
        hashMap.put("com.bytedance.article.wschannel.receive.progress", new g(aVar));
        hashMap.put("com.bytedance.article.wschannel.receive.payload", new f(aVar));
        hashMap.put("com.bytedance.article.wschannel.send.payload", new h(aVar));
        this.f27184b = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.bytedance.common.wschannel.client.d
    public final void a(Intent intent, com.bytedance.common.wschannel.model.a aVar) {
        try {
            d dVar = this.f27184b.get(intent.getAction());
            if (dVar != null) {
                dVar.a(intent, aVar);
            }
        } catch (Throwable unused) {
        }
        if (Logger.debug()) {
            intent.getIntExtra("msg_count", -1);
        }
    }
}
