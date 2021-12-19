package com.bytedance.android.livesdk.n;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.n;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f19827a = new b();

    public enum a {
        LONG_PRESS,
        SHARING_PANEL;

        static {
            Covode.recordClassIndex(11753);
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(11752);
    }

    public static void a(Room room, String str, String str2, a aVar) {
        String str3;
        Long l2;
        l.d(room, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(aVar, "");
        int i2 = c.f19829a[aVar.ordinal()];
        if (i2 == 1) {
            str3 = "long_press";
        } else if (i2 == 2) {
            str3 = "sharing_panel";
        } else {
            throw new n();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.bytedance.android.livesdk.watch.chatroom.b.a(linkedHashMap, room, str, str2, "");
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("dislike").a();
        Hashtag hashtag = room.hashtag;
        String str4 = null;
        if (hashtag != null) {
            l2 = hashtag.id;
        } else {
            l2 = null;
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("hashtag_id", (Number) l2);
        Hashtag hashtag2 = room.hashtag;
        if (hashtag2 != null) {
            str4 = hashtag2.title;
        }
        a3.a("hashtag_type", str4).a((Map<String, String>) linkedHashMap).a("request_page", str3).b();
    }
}
