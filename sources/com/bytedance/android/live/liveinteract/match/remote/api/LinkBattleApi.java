package com.bytedance.android.live.liveinteract.match.remote.api;

import com.bytedance.android.live.liveinteract.match.d.a;
import com.bytedance.android.live.liveinteract.match.d.b;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;

public interface LinkBattleApi {
    static {
        Covode.recordClassIndex(5785);
    }

    @t(a = "/webcast/battle/cancel/")
    @g
    f.a.t<d<Void>> cancel(@e(a = "room_id") long j2, @e(a = "channel_id") long j3, @e(a = "battle_id") long j4);

    @h(a = "/webcast/battle/check_permission/")
    f.a.t<d<Void>> checkPermission();

    @t(a = "/webcast/battle/finish/")
    @g
    f.a.t<d<a>> finish(@e(a = "channel_id") long j2, @e(a = "battle_id") long j3, @e(a = "cut_short") boolean z, @e(a = "other_party_left") boolean z2, @e(a = "other_party_user_id") long j4);

    @h(a = "/webcast/battle/info/")
    f.a.t<d<com.bytedance.android.livesdkapi.depend.model.live.a.e>> getInfo(@z(a = "room_id") long j2, @z(a = "channel_id") long j3, @z(a = "anchor_id") long j4);

    @h(a = "/webcast/battle/info/")
    f.a.t<d<com.bytedance.android.livesdkapi.depend.model.live.a.e>> getInfo(@z(a = "room_id") long j2, @z(a = "channel_id") long j3, @z(a = "battle_id") long j4, @z(a = "anchor_id") long j5);

    @t(a = "/webcast/battle/invite/")
    @g
    f.a.t<d<b>> invite(@e(a = "room_id") long j2, @e(a = "channel_id") long j3, @e(a = "target_user_id") long j4, @e(a = "invite_type") int i2);

    @t(a = "/webcast/battle/open/")
    @g
    f.a.t<d<Void>> open(@e(a = "channel_id") long j2, @e(a = "battle_id") long j3, @e(a = "duration") long j4, @e(a = "actual_duration") long j5);

    @t(a = "/webcast/battle/punish/finish/")
    @g
    f.a.t<d<Void>> punish(@e(a = "room_id") long j2, @e(a = "channel_id") long j3, @e(a = "cut_short") boolean z);

    @t(a = "/webcast/battle/reject/")
    @g
    f.a.t<d<Void>> reject(@e(a = "channel_id") long j2, @e(a = "battle_id") long j3, @e(a = "invite_type") int i2);
}
