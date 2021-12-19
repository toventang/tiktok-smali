package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.ad;
import com.bytedance.android.live.broadcast.ag;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ap.b;
import com.bytedance.android.livesdk.chatroom.model.n;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.f;
import h.f.b.l;
import java.util.Map;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static long f8290a;

    static {
        Covode.recordClassIndex(4218);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8291a;

        static {
            Covode.recordClassIndex(4219);
        }

        a(String str) {
            this.f8291a = str;
        }

        public final void run() {
            String str;
            com.bytedance.android.livesdk.ab.a a2 = c.a.a("ttlive_enter_preview_all");
            b<Float> bVar = com.bytedance.android.livesdk.ap.a.Q;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ab.a a3 = a2.a("beauty_skin", bVar.a());
            b<Float> bVar2 = com.bytedance.android.livesdk.ap.a.R;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ab.a a4 = a3.a("big_eyes", bVar2.a());
            b<Float> bVar3 = com.bytedance.android.livesdk.ap.a.S;
            l.b(bVar3, "");
            com.bytedance.android.livesdk.ab.a a5 = a4.a("face_lift", bVar3.a()).a("beauty_skin_default", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f18944b.f18949b)).a("beauty_skin_scale", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f18944b.f18948a)).a("big_eyes_default", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18949b)).a("big_eyes_scale", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18948a)).a("face_lift_default", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18949b)).a("face_lift_scale", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18948a));
            b<Integer> bVar4 = com.bytedance.android.livesdk.ap.a.f14015i;
            l.b(bVar4, "");
            Integer a6 = bVar4.a();
            if (a6 != null && a6.intValue() == 1) {
                str = "front";
            } else {
                str = "back";
            }
            com.bytedance.android.livesdk.ab.a a7 = a5.a("camera_type", str).a("live_mode", this.f8291a);
            b<Integer> bVar5 = com.bytedance.android.livesdk.ap.a.O;
            l.b(bVar5, "");
            com.bytedance.android.livesdk.ab.a a8 = a7.a("filter_position", bVar5.a());
            a8.f13426c = true;
            a8.a();
        }
    }

    public static final int a(i iVar) {
        String str;
        f fVar = e.a.f9628b;
        b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.M;
        l.b(bVar, "");
        Map<String, String> a2 = bVar.a();
        if (iVar != null) {
            str = iVar.name();
        } else {
            str = null;
        }
        n nVar = (n) fVar.a(a2.get(str), n.class);
        if (nVar != null) {
            return nVar.f15795a;
        }
        return -1;
    }

    public static final void a(DataChannel dataChannel) {
        String str;
        String str2;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("live_edit_features").a(dataChannel).c("click").b("live").d("live_action").e("title").a("live_edit_type", "title");
        if (dataChannel != null) {
            str = (String) dataChannel.b(ad.class);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str2 = "off";
        } else {
            str2 = "on";
        }
        a2.a("title_status", str2).b();
        a(dataChannel, false);
    }

    public static final void a(DataChannel dataChannel, String str) {
        b.a.a("livesdk_more_icon_click").a(dataChannel).d("live_take_page").a("direction", str).b();
    }

    public static final String a(String str, String str2) {
        int hashCode;
        if (str2 != null && ((hashCode = str2.hashCode()) == -1572049565 ? str2.equals("notification_page") : !(hashCode == 3452698 ? !str2.equals("push") : hashCode != 823500643 || !str2.equals("inner_push")))) {
            return str2;
        }
        if (str == null) {
            return "camera";
        }
        return str;
    }

    public static final void b(String str, DataChannel dataChannel) {
        String str2;
        Long l2;
        i streamType;
        l.d(str, "");
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_back_to_live").a(dataChannel);
        String str3 = null;
        if (room != null) {
            str2 = room.getIdStr();
        } else {
            str2 = null;
        }
        com.bytedance.android.livesdk.ab.b h2 = a2.h(str2);
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        } else {
            l2 = null;
        }
        com.bytedance.android.livesdk.ab.b g2 = h2.g(String.valueOf(l2));
        if (!(room == null || (streamType = room.getStreamType()) == null)) {
            str3 = j.a(streamType);
        }
        g2.a(str3).f(str).b();
    }

    public static final void a(DataChannel dataChannel, boolean z) {
        boolean z2;
        String str;
        String str2;
        i iVar;
        if (LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.bytedance.android.livesdk.ab.b a2 = com.bytedance.android.livesdk.ab.c.a(b.a.a("live_action").a(dataChannel).c("click").b("live").d("live_action").e("action"), dataChannel);
        String str3 = (String) DataChannelGlobal.f34575d.b(ag.class);
        String str4 = null;
        if (dataChannel != null) {
            str = (String) dataChannel.b(com.bytedance.android.live.broadcast.i.class);
        } else {
            str = null;
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("enter_from", a(str3, str));
        if (!(dataChannel == null || (iVar = (i) dataChannel.b(x.class)) == null)) {
            str4 = j.a(iVar);
        }
        com.bytedance.android.livesdk.ab.b a4 = a3.a("live_type", str4);
        String str5 = "1";
        if (z2) {
            str2 = str5;
        } else {
            str2 = "0";
        }
        com.bytedance.android.livesdk.ab.b a5 = a4.a("is_pc_guidance", str2);
        if (!z) {
            str5 = "0";
        }
        a5.a("is_application_needed", str5).b();
    }

    public static final void a(String str, DataChannel dataChannel) {
        Long l2;
        i iVar;
        o oVar;
        l.d(str, "");
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("anchor_enter_room").a(dataChannel);
        String str2 = null;
        if (dataChannel == null || (oVar = (o) dataChannel.b(dg.class)) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(oVar.f7941c);
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("room_id", (Number) l2);
        if (!(dataChannel == null || (iVar = (i) dataChannel.b(x.class)) == null)) {
            str2 = j.a(iVar);
        }
        a3.a("live_type", str2).a("action_type", str).b();
    }

    public static final void a(String str, String str2, i iVar, boolean z) {
        String str3;
        String str4;
        l.d(str, "");
        l.d(str2, "");
        com.bytedance.android.livesdk.ab.a a2 = c.a.a("ttlive_open_room").a("title", str).a("cover", str2);
        if (iVar != null) {
            str3 = iVar.name();
        } else {
            str3 = null;
        }
        com.bytedance.android.livesdk.ab.a a3 = a2.a("live_mode", str3);
        com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.O;
        l.b(bVar, "");
        com.bytedance.android.livesdk.ab.a a4 = a3.a("filter_position", bVar.a());
        if (z) {
            str4 = "front";
        } else {
            str4 = "back";
        }
        com.bytedance.android.livesdk.ab.a a5 = a4.a("camera_type", str4);
        com.bytedance.android.livesdk.ap.b<Float> bVar2 = com.bytedance.android.livesdk.ap.a.Q;
        l.b(bVar2, "");
        com.bytedance.android.livesdk.ab.a a6 = a5.a("beauty_skin", bVar2.a());
        com.bytedance.android.livesdk.ap.b<Float> bVar3 = com.bytedance.android.livesdk.ap.a.R;
        l.b(bVar3, "");
        com.bytedance.android.livesdk.ab.a a7 = a6.a("big_eyes", bVar3.a());
        com.bytedance.android.livesdk.ap.b<Float> bVar4 = com.bytedance.android.livesdk.ap.a.S;
        l.b(bVar4, "");
        a7.a("face_lift", bVar4.a()).a();
    }
}
