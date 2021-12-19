package com.bytedance.im.core.internal.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.i;
import com.bytedance.im.core.internal.utils.h;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f38719a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(23098);
    }

    public static void a(i iVar, k kVar) {
        l.c(iVar, "");
        l.c(kVar, "");
        try {
            JSONObject jSONObject = new JSONObject(h.f38770a.b(kVar.f38724e.body));
            Iterator<String> keys = jSONObject.keys();
            l.a((Object) keys, "");
            while (keys.hasNext()) {
                JSONObject optJSONObject = jSONObject.optJSONObject(keys.next());
                if (optJSONObject != null) {
                    Iterator<String> keys2 = optJSONObject.keys();
                    l.a((Object) keys2, "");
                    while (keys2.hasNext()) {
                        String next = keys2.next();
                        if (l.a((Object) next, (Object) "conversation_id")) {
                            iVar.a("conversation_id", optJSONObject.opt(next));
                        }
                        if (l.a((Object) next, (Object) "client_message_id")) {
                            iVar.a("uuid", optJSONObject.opt(next));
                        }
                    }
                }
            }
            if (kVar.f38725f != null) {
                iVar.a("log_id", kVar.f38725f.log_id);
                iVar.a("status", kVar.f38725f.status_code);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            e.a(e2);
        }
    }

    public static void a(k kVar, long j2, boolean z) {
        String str;
        l.c(kVar, "");
        i a2 = i.a().a("imsdk_network_request").a("imsdk_cmd", Integer.valueOf(kVar.k())).a("url_path", n.a(kVar.k())).a("imsdk_result", 1).a("seq_id", Long.valueOf(kVar.f38720a)).a("duration", Long.valueOf(j2));
        if (z) {
            str = "ws";
        } else {
            str = "http";
        }
        i a3 = a2.a("net_type", str).a("retry_times", kVar.f38724e.retry_count);
        l.a((Object) a3, "");
        a(a3, kVar);
        a3.b();
    }
}
