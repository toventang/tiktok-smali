package com.bytedance.android.livesdk.ab.b;

import com.bytedance.android.livesdk.ab.c.f;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class c implements b<f> {
    static {
        Covode.recordClassIndex(7478);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.ab.b.b
    public final /* synthetic */ void a(Map map, f fVar) {
        f fVar2 = fVar;
        if (fVar2 != null) {
            if (fVar2.f13506a > 0) {
                map.put("channel_id", String.valueOf(fVar2.f13506a));
            }
            if (fVar2.f13507b > 0) {
                map.put("right_user_id", String.valueOf(fVar2.f13507b));
            }
            map.put("is_oncemore", String.valueOf(fVar2.f13514i));
            if (fVar2.f13508c > 0) {
                map.put("pk_time", String.valueOf(fVar2.f13508c));
                map.put("connection_type", fVar2.f13509d);
                map.put("match_type", fVar2.f13510e);
                if (fVar2.f13511f > 0) {
                    map.put("pk_id", String.valueOf(fVar2.f13511f));
                }
                if (m.a(fVar2.f13512g)) {
                    map.put("title", fVar2.f13512g);
                }
                if (fVar2.f13513h > 0) {
                    map.put("backdoor_time", String.valueOf(fVar2.f13513h));
                    return;
                }
                return;
            }
            map.put("connection_type", fVar2.f13509d);
        }
    }
}
