package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final g f20926a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f20927b;

    static {
        Covode.recordClassIndex(12385);
    }

    i(g gVar, Room room) {
        this.f20926a = gVar;
        this.f20927b = room;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String th;
        g gVar = this.f20926a;
        Room room = this.f20927b;
        Throwable th2 = (Throwable) obj;
        gVar.f20914b = false;
        String str = "";
        if (th2 == null) {
            th = str;
        } else {
            th = th2.toString();
        }
        gVar.a(-1, (String) null, (String) null, th);
        gVar.c();
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "room_id", room.getId());
        a.a(jSONObject, "user_id", u.a().b().c());
        a.a(jSONObject, "error_code", "1");
        if (th2 != null) {
            str = th2.toString();
        }
        a.a(jSONObject, "error_msg", str);
        c.a("ttlive_hourly_rank_entrance", 1, jSONObject);
    }
}
