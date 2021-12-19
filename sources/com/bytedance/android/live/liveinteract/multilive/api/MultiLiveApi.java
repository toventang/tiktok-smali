package com.bytedance.android.live.liveinteract.multilive.api;

import com.bytedance.android.live.liveinteract.multilive.c.g;
import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.c.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import f.a.ab;

public interface MultiLiveApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11747a = a.f11748a;

    static {
        Covode.recordClassIndex(6397);
    }

    @h(a = "/webcast/linkmic_audience/list_by_type/")
    ab<d<g>> getListByType(@z(a = "room_id") long j2, @z(a = "anchor_id") long j3, @z(a = "channel_id") long j4, @z(a = "list_type") int i2);

    @com.bytedance.retrofit2.b.g
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    @t(a = "/webcast/linkmic_audience/turn_off_invitation/")
    f.a.t<d<h.z>> turnOffInvitation(@e(a = "room_id") long j2);

    @com.bytedance.retrofit2.b.g
    @com.bytedance.android.live.network.a.a(a = a.EnumC0254a.LINK_MIC)
    @t(a = "/webcast/linkmic_audience/update_setting/")
    f.a.t<d<c>> updateAnchorPanelSettings(@e(a = "room_id") long j2, @e(a = "channel_id") long j3, @e(a = "live_id") long j4, @e(a = "new_layout") int i2, @e(a = "new_fix_mic_num") int i3, @e(a = "new_allow_request_from_user") int i4, @e(a = "new_allow_request_from_follower_only") int i5);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f11748a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(6398);
        }
    }
}
