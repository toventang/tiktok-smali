package com.bytedance.im.core.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import java.util.HashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f37645a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<Long, g> f37646b = new HashMap<>();

    private h() {
    }

    static {
        Covode.recordClassIndex(22641);
    }

    public static g a(long j2) {
        g gVar = new g(j2);
        a(gVar);
        return gVar;
    }

    public static g b(long j2) {
        return f37646b.get(Long.valueOf(j2));
    }

    private static void a(g gVar) {
        l.c(gVar, "");
        f37646b.put(Long.valueOf(gVar.f37644j), gVar);
    }

    public static void a(ai aiVar) {
        l.c(aiVar, "");
        g b2 = b(aiVar.getMsgId());
        if (b2 == null) {
            b2 = a(aiVar.getMsgId());
        }
        i a2 = i.a().a("imsdk_recieve_msg").a("conversation_id", aiVar.getConversationId()).a("msg_uuid", aiVar.getUuid()).a("result", 1).a("msg_type", Integer.valueOf(aiVar.getMsgType())).a("is_background", Boolean.valueOf(f.f37629a)).a("is_connected", Boolean.valueOf(f.f37629a)).a("is_background", Boolean.valueOf(f.f37629a));
        d a3 = d.a();
        l.a((Object) a3, "");
        b bVar = a3.f37562b;
        l.a((Object) bVar, "");
        a2.a("net_connected", Boolean.valueOf(bVar.e())).a("recieve_cost_time", b2.f37638d).a("recieve_start_time", b2.f37635a).a("recieve_end_time", b2.f37637c).a("send_start_time", b2.f37636b).a("pull_msg_reaseon", b2.f37641g).a("is_ws", Integer.valueOf(b2.f37642h ? 1 : 0)).a("logid", b2.f37643i).b();
    }

    public static void b(ai aiVar) {
        l.c(aiVar, "");
        g b2 = b(aiVar.getMsgId());
        if (b2 == null) {
            b2 = a(aiVar.getMsgId());
        }
        i a2 = i.a().a("imsdk_load_msg").a("conversation_id", aiVar.getConversationId()).a("msg_uuid", aiVar.getUuid()).a("result", 1).a("msg_type", Integer.valueOf(aiVar.getMsgType())).a("is_background", Boolean.valueOf(f.f37629a)).a("is_connected", Boolean.valueOf(f.f37629a)).a("is_background", Boolean.valueOf(f.f37629a));
        d a3 = d.a();
        l.a((Object) a3, "");
        b bVar = a3.f37562b;
        l.a((Object) bVar, "");
        a2.a("net_connected", Boolean.valueOf(bVar.e())).a("load_cost_time", b2.f37639e).a("recieve_end_time", b2.f37637c).a("send_start_time", b2.f37636b).a("total_cost_time", b2.f37640f).a("is_ws", Integer.valueOf(b2.f37642h ? 1 : 0)).a("logid", b2.f37643i).b();
        f37646b.remove(Long.valueOf(aiVar.getMsgId()));
    }
}
