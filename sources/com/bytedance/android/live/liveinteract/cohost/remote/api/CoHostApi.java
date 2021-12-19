package com.bytedance.android.live.liveinteract.cohost.remote.api;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.b;
import com.bytedance.android.livesdk.chatroom.interact.model.f;
import com.bytedance.android.livesdk.chatroom.interact.model.g;
import com.bytedance.android.livesdk.chatroom.interact.model.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.ab;
import f.a.t;

public interface CoHostApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10229a = a.f10230a;

    static {
        Covode.recordClassIndex(5384);
    }

    @h(a = "/webcast/linkmic/cancel/")
    ab<d<Void>> cancel(@z(a = "channel_id") long j2, @z(a = "room_id") long j3, @z(a = "to_room_id") long j4, @z(a = "to_user_id") long j5, @z(a = "sec_to_user_id") String str, @z(a = "cancel_reason") String str2, @z(a = "transparent_extra") String str3);

    @h(a = "/webcast/linkmic/check_permission/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    ab<d<b>> checkPermissionV3(@z(a = "room_id") long j2);

    @h(a = "/webcast/linkmic/finish/")
    ab<d<Void>> finishV3(@z(a = "channel_id") long j2, @z(a = "transparent_extra") String str);

    @h(a = "/webcast/linkmic/finish/")
    ab<d<Void>> finishV3(@z(a = "channel_id") long j2, @z(a = "transparent_extra") String str, @z(a = "not_suggest_to_uid") long j3);

    @h(a = "/webcast/linkmic/invite/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    ab<d<f>> invite(@z(a = "vendor") int i2, @z(a = "to_room_id") long j2, @z(a = "to_user_id") long j3, @z(a = "sec_to_user_id") String str, @z(a = "room_id") long j4, @z(a = "invite_type") int i3, @z(a = "match_type") int i4, @z(a = "effective_seconds") int i5);

    @h(a = "/webcast/linkmic/join_channel/")
    ab<d<Void>> joinChannelV3(@z(a = "channel_id") long j2, @z(a = "transparent_extra") String str);

    @h(a = "/webcast/linkmic_match/auto_match/")
    t<d<g>> randomLinkMicAutoMatch(@z(a = "room_id") long j2, @z(a = "user_id") long j3, @z(a = "sec_user_id") String str, @z(a = "tz_name") String str2, @z(a = "tz_offset") int i2);

    @h(a = "/webcast/linkmic_match/cancel_match/")
    t<d<Void>> randomLinkMicCancelMatch(@z(a = "room_id") long j2, @z(a = "user_id") long j3, @z(a = "sec_user_id") String str);

    @h(a = "/webcast/linkmic/reply/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    ab<d<com.bytedance.android.livesdk.chatroom.model.b.f>> reply(@z(a = "channel_id") long j2, @z(a = "room_id") long j3, @z(a = "reply_status") int i2, @z(a = "invite_user_id") long j4, @z(a = "transparent_extra") String str);

    @h(a = "/webcast/linkmic/rivals/")
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    t<com.bytedance.android.live.network.response.b<i, RivalsListExtra>> rivalsList(@z(a = "rivals_type") int i2, @z(a = "room_id") long j2, @z(a = "tz_name") String str, @z(a = "tz_offset") int i3);

    @h(a = "/webcast/linkmic/send_signal/")
    ab<d<Void>> sendSignalV3(@z(a = "channel_id") long j2, @z(a = "content") String str, @z(a = "to_user_ids") long[] jArr);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f10230a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(5385);
        }
    }
}
