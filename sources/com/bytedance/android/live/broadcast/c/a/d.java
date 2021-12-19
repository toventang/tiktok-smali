package com.bytedance.android.live.broadcast.c.a;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.a.a;
import com.bytedance.android.livesdk.ab.a.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class d extends e {
    static {
        Covode.recordClassIndex(3853);
    }

    @Override // com.bytedance.android.live.broadcast.c.a.e
    public final void a() {
        c.a("ttlive_load_sticker_list_all", 0, c(), new JSONObject());
    }

    @Override // com.bytedance.android.live.broadcast.c.a.e
    public final void b() {
        c.a("ttlive_download_sticker_all", 0, d(), new JSONObject());
    }

    @Override // com.bytedance.android.live.broadcast.c.a.e
    public final void a(int i2, String str) {
        c();
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "error_code", (long) i2);
        a(jSONObject, "error_msg", str);
        c.b("ttlive_load_sticker_list_all", 1, jSONObject);
        c.a("ttlive_load_sticker_list_error", 1, jSONObject);
        a.a();
        a.a(b.Room.info, "ttlive_load_sticker_list", 1, jSONObject);
    }

    @Override // com.bytedance.android.live.broadcast.c.a.e
    public final void b(int i2, String str) {
        d();
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "error_code", (long) i2);
        a(jSONObject, "error_msg", str);
        c.b("ttlive_download_sticker_all", 1, jSONObject);
        c.a("ttlive_download_sticker_error", 1, jSONObject);
        a.a();
        a.a(b.Room.info, "ttlive_download_sticker", 1, jSONObject);
    }
}
