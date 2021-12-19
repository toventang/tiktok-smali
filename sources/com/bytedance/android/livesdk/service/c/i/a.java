package com.bytedance.android.livesdk.service.c.i;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.message.z;
import com.bytedance.android.livesdk.service.c.f.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21427a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(12613);
    }

    public static void a(String str) {
        l.d(str, "");
        b.a.a("gift_tray_gift_click").a().a("click_type", str).b();
    }

    private static long b(com.bytedance.android.livesdk.gifttray.a.a aVar) {
        l.d(aVar, "");
        y yVar = aVar.C;
        String str = null;
        if (yVar != null && yVar.w != null) {
            return aVar.C.w.f19716e;
        }
        y yVar2 = aVar.C;
        if (yVar2 != null) {
            str = yVar2.v;
        }
        try {
            String str2 = e.a(str).get("send_gift_req_start_ms");
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static Map<String, String> a(com.bytedance.android.livesdk.gifttray.a.a aVar) {
        String str;
        y yVar = aVar.C;
        String str2 = null;
        if (yVar == null || yVar.w == null) {
            y yVar2 = aVar.C;
            if (yVar2 != null) {
                str2 = yVar2.v;
            }
            return e.a(str2);
        }
        y yVar3 = aVar.C;
        z zVar = yVar3.w;
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(zVar.f19712a));
        User user = yVar3.f19705g;
        l.b(user, "");
        hashMap.put("from_user_id", String.valueOf(user.getId()));
        hashMap.put("gift_id", String.valueOf(yVar3.f19707i));
        hashMap.put("msg_id", String.valueOf(yVar3.getMessageId()));
        hashMap.put("profitapi_message_dur", String.valueOf(zVar.f19713b));
        hashMap.put("repeat_count", String.valueOf(yVar3.f19708j));
        hashMap.put("repeat_end", String.valueOf(yVar3.f19711m));
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        l.b(str, "");
        hashMap.put("room_id", str);
        hashMap.put("send_gift_profit_api_start_ms", String.valueOf(zVar.f19714c));
        hashMap.put("send_gift_profit_core_start_ms", String.valueOf(zVar.f19715d));
        hashMap.put("send_gift_req_start_ms", String.valueOf(zVar.f19716e));
        hashMap.put("send_gift_send_message_success_ms", String.valueOf(zVar.f19717f));
        hashMap.put("send_profitapi_dur", String.valueOf(zVar.f19718g));
        hashMap.put("to_user_id", String.valueOf(zVar.f19719h));
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.bytedance.android.livesdk.gifttray.a.a r11, int r12) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.service.c.i.a.a(com.bytedance.android.livesdk.gifttray.a.a, int):void");
    }
}
