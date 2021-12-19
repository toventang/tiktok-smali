package com.bytedance.android.livesdk.chatroom.g;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.chatroom.c.m;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.j.bc;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import h.f.b.m;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f15516a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(8575);
    }

    public static final class a extends m implements h.f.a.b<EmoteModel, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15517a = new a();

        static {
            Covode.recordClassIndex(8576);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(EmoteModel emoteModel) {
            EmoteModel emoteModel2 = emoteModel;
            l.d(emoteModel2, "");
            String str = emoteModel2.f7390g;
            l.b(str, "");
            return str;
        }
    }

    public static void a(com.bytedance.android.livesdk.ab.b bVar) {
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
        l.b(a2, "");
        bVar.a("send_comment_scene", ((com.bytedance.android.live.liveinteract.api.b) a2).getRoomScene());
    }

    public static void a(DataChannel dataChannel) {
        if (dataChannel != null) {
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_anchor_live_message");
            a2.a(dataChannel);
            a(a2);
            a2.b();
        }
    }

    public static void a(com.bytedance.android.livesdk.ab.b bVar, DataChannel dataChannel) {
        String str;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.b(df.class);
            f b2 = u.a().b();
            l.b(b2, "");
            long c2 = b2.c();
            if (room == null || c2 != room.getOwnerUserId()) {
                com.bytedance.android.live.base.model.user.b a2 = b2.a();
                l.b(a2, "");
                ba userAttr = a2.getUserAttr();
                if (userAttr == null || !userAttr.f19030b) {
                    str = "user";
                } else {
                    str = "admin";
                }
            } else {
                str = "anchor";
            }
            bVar.a("admin_type", str);
        }
    }

    public static void a(DataChannel dataChannel, boolean z, long j2, String str, boolean z2, boolean z3, m.a aVar, long j3) {
        boolean z4;
        String str2;
        String str3;
        Long l2;
        String str4;
        String str5;
        String str6;
        String str7;
        User owner;
        l.d(str, "");
        l.d(aVar, "");
        if (dataChannel != null) {
            String g2 = e.g();
            boolean z5 = false;
            if (TextUtils.isEmpty(g2) || !l.a((Object) "click_push_live_cd_user", (Object) g2)) {
                z4 = false;
            } else {
                z4 = true;
            }
            Room room = (Room) dataChannel.b(df.class);
            Boolean bool = (Boolean) dataChannel.b(ee.class);
            if (bool != null) {
                z5 = bool.booleanValue();
            }
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_audience_live_message");
            a2.a(dataChannel);
            a2.b("live_interact");
            String str8 = "0";
            if (z) {
                str2 = "1";
            } else {
                str2 = str8;
            }
            a2.a("with_emoji", str2);
            Object b2 = dataChannel.b(bc.class);
            if (b2 == null) {
                l.b();
            }
            String str9 = "chat_room";
            if (((Boolean) b2).booleanValue()) {
                str3 = str9;
            } else {
                str3 = "bubble";
            }
            a2.a("comment_pannel_type", str3);
            d a3 = d.a();
            l.b(a3, "");
            a2.a("enter_live_method", a3.e());
            a2.a("comment_id", String.valueOf(j2));
            if (room == null || (owner = room.getOwner()) == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(owner.getId());
            }
            a2.a("to_user_id", String.valueOf(l2));
            a2.a("live_source", str);
            if (room != null) {
                str4 = room.getSourceType();
            } else {
                str4 = null;
            }
            a2.a("moment_room_source", str4);
            if (!l.a(dataChannel.b(bc.class), (Object) true)) {
                str9 = "bubble";
            }
            a2.a("comment_pannel_type", str9);
            if (j3 != 0) {
                str5 = "1";
            } else {
                str5 = str8;
            }
            a2.a("is_message_reply", str5);
            if (z4) {
                str8 = "1";
            }
            a2.a("is_subscribe", str8);
            if (z2) {
                str6 = "portrait";
            } else {
                str6 = "landscape";
            }
            a2.a("room_orientation", str6);
            if (!z5) {
                com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
                l.b(a4, "");
                if (((com.bytedance.android.live.liveinteract.api.b) a4).isRoomInBattle()) {
                    a2.a("connection_type", "manual_pk");
                    com.bytedance.android.live.base.a a5 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
                    l.b(a5, "");
                    a2.a("pk_id", String.valueOf(((com.bytedance.android.live.liveinteract.api.b) a5).getBattleId()));
                }
            }
            if (z3) {
                str7 = "sub_only";
            } else {
                str7 = "normal";
            }
            a2.a("mode", str7);
            if (aVar == m.a.QA) {
                a2.a("is_from_denied_qa", "1");
            }
            if (j3 != 0) {
                a2.a("reply_user_id", j3);
            }
            a(a2);
            a2.b();
        }
    }
}
