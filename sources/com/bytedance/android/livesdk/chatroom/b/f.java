package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.util.Base64;
import com.bytedance.android.live.n.o;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.android.livesdk.utils.k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.service.b;
import com.bytedance.covode.number.Covode;
import com.facebook.common.k.c;
import f.a.t;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public final class f implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final f f14958a = new f();

    /* renamed from: b  reason: collision with root package name */
    boolean f14959b;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.live.n.o.a r10) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.b.f.a(com.bytedance.android.live.n.o$a):void");
    }

    public final void a(Handler handler, long j2, String str, String str2, String str3, String str4, String str5) {
        HashMap<String, String> hashMap = new k().a("common_label_list", str3).a("enter_source", str4).a("request_id", str).a("enter_type", str2).a("live_reason", str5).f22332a;
        g.a(new w(this));
        ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).enterRoom(j2, 1, u.a().b().e() ? 1 : 0, hashMap).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new x(this, handler, j2), new y(this, handler, j2));
    }

    public static void a(Handler handler, long j2, boolean z) {
        ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).sendPlayingPing(j2, z ? 1 : 0).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new z(handler), new aa(handler));
    }

    @Override // com.bytedance.android.live.n.o
    public final void a(long j2, int i2, String str, String str2) {
        ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).digg(new k().a("room_id", String.valueOf(j2)).a("count", String.valueOf(i2)).a("duration", "2000").a("common_label_list", String.valueOf(str)).a("icon", str2).f22332a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(i.f22197b, i.f22196a);
    }

    static {
        Covode.recordClassIndex(8302);
    }

    public static t<d<Map<String, Room>>> a(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        if (jArr != null) {
            for (int i2 = 0; i2 < jArr.length; i2++) {
                sb.append(jArr[i2]);
                if (jArr.length - 1 != i2) {
                    sb.append(",");
                }
            }
        }
        return ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).getMultipleRoomInfo(sb.toString()).a(new com.bytedance.android.livesdk.util.rxutils.f());
    }

    public static void b(Handler handler) {
        ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).getRoomDebugInfoPermission().a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new p(handler), new q(handler));
    }

    public static void a(long j2) {
        ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).leaveRoom(j2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(i.f22197b, i.f22196a);
    }

    static Room a(Room room) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", String.valueOf(room.getOwnerUserId()));
            jSONObject.put("roomId", String.valueOf(room.getId()));
            jSONObject.put("aid", String.valueOf(((IHostContext) a.a(IHostContext.class)).appId()));
            jSONObject.put("timestamp", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a() / 1000));
            String jSONObject2 = jSONObject.toString();
            String b2 = com.bytedance.common.utility.d.b(String.valueOf(room.getId()));
            byte[] bArr = {8, 9, 7, 5, 7, 5, 6, 7, 8, 9, 10, 11, 12, com.ss.ugc.effectplatform.b.a.e.f153515b, 14, 15};
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, new SecretKeySpec(c.a(b2), "AES"), new IvParameterSpec(bArr));
            room.authenticationValue = "bytedmediasdkandroid:" + Base64.encodeToString(instance.doFinal(jSONObject2.getBytes(Charset.forName("UTF-8"))), 2);
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("AuthenticationCalculate", e2);
        }
        return room;
    }

    public static void a(Handler handler) {
        ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).finishRoomAbnormal().a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new l(handler), new m(handler));
    }

    public static void a(long j2, b bVar) {
        if (bVar != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("room_id", String.valueOf(j2));
            ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).fetchRoom(hashMap).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new n(bVar), new o(bVar));
        }
    }

    public static void a(Handler handler, long j2) {
        ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).unblockRoom(j2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(i.f22197b, new i(handler));
    }

    public final void a(Handler handler, boolean z, long j2, int i2) {
        a(handler, z, j2, 3, i2);
    }

    public final void a(Handler handler, final boolean z, final long j2, final int i2, int i3) {
        com.bytedance.ies.e.a.a.a().a(handler, new Callable() {
            /* class com.bytedance.android.livesdk.chatroom.b.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8303);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                T t = ((RoomRetrofitApi) e.a().a(RoomRetrofitApi.class)).getRoomStats(z, j2, i2).execute().f42630b;
                if (((d) t).extra != null) {
                    ((Room) ((d) t).data).nowTime = ((d) t).extra.now / 1000;
                }
                return ((d) t).data;
            }
        }, i3);
    }
}
