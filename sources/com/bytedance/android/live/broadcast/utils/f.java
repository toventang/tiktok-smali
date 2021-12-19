package com.bytedance.android.live.broadcast.utils;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.model.n;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.v;
import com.bytedance.android.livesdk.j.w;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8642a = new a((byte) 0);

    static {
        Covode.recordClassIndex(4418);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4419);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Room room) {
            if (room != null) {
                ((e) com.bytedance.android.live.t.a.a(e.class)).onStartStreaming(room.getId());
            }
        }

        public static void a(Room room, DataChannel dataChannel) {
            long j2;
            long j3;
            String str;
            long currentTimeMillis;
            String str2;
            String str3;
            i streamType;
            e eVar = (e) com.bytedance.android.live.t.a.a(e.class);
            long j4 = 0;
            if (room != null) {
                j2 = room.getId();
            } else {
                j2 = 0;
            }
            eVar.onStopStreaming(j2);
            e eVar2 = (e) com.bytedance.android.live.t.a.a(e.class);
            if (room != null) {
                j3 = room.getId();
            } else {
                j3 = 0;
            }
            long hotDuration = eVar2.getHotDuration(j3);
            e eVar3 = (e) com.bytedance.android.live.t.a.a(e.class);
            if (room != null) {
                j4 = room.getId();
            }
            eVar3.resetDuration(j4);
            n.a aVar = (n.a) DataChannelGlobal.f34575d.b(v.class);
            if (aVar == null || (str = aVar.f7938b) == null) {
                str = "";
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            Long l2 = (Long) DataChannelGlobal.f34575d.b(w.class);
            if (l2 != null) {
                currentTimeMillis = l2.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j5 = currentTimeMillis2 - currentTimeMillis;
            b a2 = b.a.a("livesdk_live_over");
            if (room == null || (streamType = room.getStreamType()) == null) {
                str2 = null;
            } else {
                str2 = j.a(streamType);
            }
            b a3 = a2.a("live_type", str2).a("hot_duration", TimeUnit.MILLISECONDS.toSeconds(hotDuration)).a(dataChannel).d("live_take_detail").a("duration", String.valueOf(j5 / 1000)).a("take_definition", str);
            if (room != null && room.isScreenshot) {
                if (room.gameCategoryInfo != null) {
                    if (TextUtils.isEmpty(room.gameCategoryInfo.f19755a)) {
                        a3.a("selected_app_name", "none");
                    } else {
                        a3.a("selected_app_name", room.gameCategoryInfo.f19755a);
                    }
                    if (TextUtils.isEmpty(room.gameCategoryInfo.f19756b)) {
                        a3.a("selected_app_id", "none");
                    } else {
                        a3.a("selected_app_id", room.gameCategoryInfo.f19756b);
                    }
                }
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ah;
                l.b(bVar, "");
                Boolean a4 = bVar.a();
                l.b(a4, "");
                String str4 = "on";
                if (a4.booleanValue()) {
                    str3 = str4;
                } else {
                    str3 = "off";
                }
                b a5 = a3.a("screen_share_comment_push_setting", str3);
                com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.ai;
                l.b(bVar2, "");
                Boolean a6 = bVar2.a();
                l.b(a6, "");
                if (!a6.booleanValue()) {
                    str4 = "off";
                }
                a5.a("screen_share_gift_push_setting", str4);
            }
            a3.b();
        }

        public static void a(String str, int i2, long j2, long j3) {
            Long l2;
            Long l3;
            i streamType;
            l.d(str, "");
            if (!TextUtils.isEmpty(str) && !l.a((Object) str, (Object) "0")) {
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                b a2 = b.a.a("livesdk_live_filter_use_time").a("event_page", "live_take_detail");
                String str2 = null;
                if (room != null) {
                    l2 = Long.valueOf(room.getOwnerUserId());
                } else {
                    l2 = null;
                }
                b a3 = a2.a("anchor_id", (Number) l2);
                if (room != null) {
                    l3 = Long.valueOf(room.getId());
                } else {
                    l3 = null;
                }
                b a4 = a3.a("room_id", (Number) l3).a("filter_id", str).a("impr_position", i2).a("use_time", j3 - j2);
                if (!(room == null || (streamType = room.getStreamType()) == null)) {
                    str2 = j.a(streamType);
                }
                a4.a("live_type", str2).b();
            }
        }
    }
}
