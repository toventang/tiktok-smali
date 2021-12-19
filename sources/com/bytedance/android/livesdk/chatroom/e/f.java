package com.bytedance.android.livesdk.chatroom.e;

import android.os.SystemClock;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.c.af;
import com.bytedance.android.livesdk.chatroom.c.ah;
import com.bytedance.android.livesdk.chatroom.e.c;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final c f15349a;

    /* renamed from: b  reason: collision with root package name */
    private final ah f15350b;

    /* renamed from: c  reason: collision with root package name */
    private final i f15351c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15352d;

    static {
        Covode.recordClassIndex(8485);
    }

    f(c cVar, ah ahVar, i iVar, long j2) {
        this.f15349a = cVar;
        this.f15350b = ahVar;
        this.f15351c = iVar;
        this.f15352d = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f15349a;
        ah ahVar = this.f15350b;
        i iVar = this.f15351c;
        long j2 = this.f15352d;
        Throwable th = (Throwable) obj;
        a.a().a(new af(ahVar, false));
        if (cVar.y != null) {
            if (th instanceof Exception) {
                ((c.a) cVar.y).a(ahVar, (Exception) th);
                cVar.w.c(com.bytedance.android.live.n.a.class, iVar);
            }
            if (th instanceof com.bytedance.android.live.a.a.a) {
                long uptimeMillis = SystemClock.uptimeMillis() - j2;
                int errorCode = ((com.bytedance.android.live.a.a.a) th).getErrorCode();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", uptimeMillis);
                    jSONObject.put("error_code", errorCode);
                    com.bytedance.android.livesdk.at.f b2 = u.a().b();
                    l.b(b2, "");
                    jSONObject.put("user_id", b2.c());
                    Room room = com.bytedance.android.livesdk.chatroom.g.f.f15527b;
                    jSONObject.put("room_id", room != null ? Long.valueOf(room.getId()) : null);
                    Room room2 = com.bytedance.android.livesdk.chatroom.g.f.f15527b;
                    jSONObject.put("anchor_id", room2 != null ? Long.valueOf(room2.getOwnerUserId()) : null);
                } catch (JSONException unused) {
                }
                d.a("ttlive_chat", null, null, jSONObject);
            }
        }
    }
}
