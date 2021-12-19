package emotes.b;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f157098a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(104324);
    }

    public static void a(String str) {
        l.d(str, "");
        if (DataChannelGlobal.f34575d.b(ac.class) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_entrance", str);
            a(hashMap);
            b.a.a("livesdk_subscribe_icon_show").a().a((Map<String, String>) hashMap).b();
        }
    }

    public static void b(String str) {
        l.d(str, "");
        if (DataChannelGlobal.f34575d.b(ac.class) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("click_position", str);
            a(hashMap);
            hashMap.put("action_type", "click");
            b.a.a("livesdk_subscribe_icon_click").a().a((Map<String, String>) hashMap).b();
        }
    }

    public static void a(Map<String, String> map) {
        String str;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            l.b(idStr, "");
            map.put("room_id", idStr);
            map.put("enter_method", e.d());
            map.put("enter_from_merge", e.a());
            map.put("action_type", e.e());
            map.put("request_id", e.k());
            map.put("video_id", e.f());
            if (room.getOwner() != null) {
                if (room.getOwner().isFollowing()) {
                    str = "1";
                } else {
                    str = "0";
                }
                map.put("is_follow", str);
            }
        }
    }
}
