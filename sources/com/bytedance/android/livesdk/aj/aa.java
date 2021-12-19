package com.bytedance.android.livesdk.aj;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.aj.g;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.videoarch.a.a;
import java.util.HashMap;
import org.json.JSONObject;

public final class aa implements a {

    /* renamed from: a  reason: collision with root package name */
    public g.a f13805a;

    /* renamed from: b  reason: collision with root package name */
    public g.b f13806b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.android.livesdk.aj.b.a f13807c;

    static {
        Covode.recordClassIndex(7676);
    }

    @Override // com.ss.videoarch.a.a
    public final void b() {
        a(g.c.BUFFERING_START, 0, "player start buffer");
    }

    @Override // com.ss.videoarch.a.a
    public final void c() {
        a(g.c.BUFFERING_END, 0, "player end buffer");
    }

    @Override // com.ss.videoarch.a.a
    public final void d() {
        a(g.c.PLAY_COMPLETED, 0, "play complete");
    }

    @Override // com.ss.videoarch.a.a
    public final void e() {
        a(g.c.PREPARED, 0, "player is prepared");
    }

    @Override // com.ss.videoarch.a.a
    public final void a() {
        g.b bVar = this.f13806b;
        if (bVar != null) {
            bVar.i();
        }
        a(g.c.RENDERING_START, 0, "player start render");
    }

    public aa(com.bytedance.android.livesdk.aj.b.a aVar) {
        this.f13807c = aVar;
    }

    @Override // com.ss.videoarch.a.a
    public final void a(String str) {
        a(g.c.SEI_UPDATE, 0, str);
    }

    @Override // com.ss.videoarch.a.a
    public final void c(String str) {
        a(g.c.RESOLUTION_DEGRADE, 0, str);
    }

    @Override // com.ss.videoarch.a.a
    public final void b(String str) {
        if (((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isOffline()) {
            com.bytedance.android.live.core.c.a.a(6, "TTLivePlayerReportALog", str);
        }
    }

    @Override // com.ss.videoarch.a.a
    public final void a(com.ss.videoarch.a.a.a aVar) {
        HashMap hashMap;
        g.c cVar;
        if (aVar != null) {
            f fVar = e.a.f9629c;
            if (aVar.info == null) {
                hashMap = new HashMap(2);
            } else {
                hashMap = new HashMap(aVar.info);
            }
            hashMap.put("error_code", String.valueOf(aVar.code));
            if (aVar.code != 0) {
                cVar = g.c.PREPARE_FAILED;
            } else {
                cVar = g.c.MEDIA_ERROR;
            }
            hashMap.put("error_description", cVar.name());
            String b2 = fVar.b(hashMap);
            if (aVar.code != 0) {
                a(g.c.PREPARE_FAILED, aVar.code, "prepare failed.code:" + aVar.code);
            }
            a(g.c.MEDIA_ERROR, aVar.code, b2);
        }
    }

    @Override // com.ss.videoarch.a.a
    public final void a(int i2, int i3) {
        a(g.c.VIDEO_SIZE_CHANGED, (i3 << 16) | i2, "videoSizeChanged, width: " + i2 + ", height: " + i3);
    }

    @Override // com.ss.videoarch.a.a
    public final void a(JSONObject jSONObject, String str) {
        boolean z;
        String str2;
        StringBuilder sb = new StringBuilder("player==>liveLogSender==null is ");
        if (this.f13807c == null) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.android.live.core.c.a.a(3, "LiveAppBundleUtils", sb.append(z).toString());
        StringBuilder sb2 = new StringBuilder("player==>player info ");
        if (jSONObject == null) {
            str2 = "event is null";
        } else {
            str2 = "event is not null";
        }
        com.bytedance.android.live.core.c.a.a(3, "LiveAppBundleUtils", sb2.append(str2).toString());
        if (this.f13807c != null) {
            com.bytedance.android.live.core.c.a.a(3, "PlayerLogger", jSONObject.optString("event_key"));
            this.f13807c.a(jSONObject, str);
        }
    }

    private void a(g.c cVar, int i2, String str) {
        g.a aVar = this.f13805a;
        if (aVar != null) {
            aVar.a(cVar, i2, str);
        }
    }
}
