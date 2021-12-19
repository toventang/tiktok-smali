package com.bytedance.android.livesdk.ab.b;

import com.bytedance.android.livesdk.ab.c.g;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class d implements b<g> {
    static {
        Covode.recordClassIndex(7479);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.ab.b.b
    public final /* synthetic */ void a(Map map, g gVar) {
        g gVar2 = gVar;
        if (gVar2 != null) {
            if (gVar2.f13521g > 0) {
                map.put("channel_id", String.valueOf(gVar2.f13521g));
            }
            if (gVar2.f13516b > 0) {
                map.put("invitee_id", String.valueOf(gVar2.f13516b));
            }
            if (gVar2.f13515a > 0) {
                map.put("inviter_id", String.valueOf(gVar2.f13515a));
            }
            if (!m.a(gVar2.f13525k)) {
                map.put("match_type", gVar2.f13525k);
            }
            if (!m.a(gVar2.f13517c)) {
                map.put("end_type", gVar2.f13517c);
            }
            if (!m.a(gVar2.f13518d)) {
                map.put("connection_time", gVar2.f13518d);
            }
            if (!m.a(gVar2.f13519e)) {
                map.put("invitee_list", gVar2.f13519e);
            }
            if (!m.a(gVar2.f13520f)) {
                map.put("is_rematch", gVar2.f13520f);
            }
            map.put("pk_time", String.valueOf(gVar2.f13524j));
            if (!m.a(gVar2.f13522h)) {
                map.put("connection_type", gVar2.f13522h);
                if (gVar2.f13522h.equals("pk")) {
                    if (!m.a(gVar2.f13523i)) {
                        map.put("title", gVar2.f13523i);
                    }
                    if (gVar2.f13524j > 0) {
                        map.put("pk_time", String.valueOf(gVar2.f13524j));
                    }
                }
            }
        }
    }
}
