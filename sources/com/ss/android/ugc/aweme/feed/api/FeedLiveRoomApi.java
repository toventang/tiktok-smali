package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.response.Extra;
import com.ss.android.ugc.aweme.live.response.a;

public final class FeedLiveRoomApi {

    /* renamed from: a  reason: collision with root package name */
    private static final RoomApi f91930a = ((RoomApi) RetrofitFactory.a().b("https://" + LiveOuterService.s().f().a()).d().a(RoomApi.class));

    public interface RoomApi {
        static {
            Covode.recordClassIndex(57874);
        }

        @h(a = "webcast/d/topview_room/")
        b<a<Room, Extra>> queryRoomInfo(@z(a = "uid") long j2, @z(a = "sec_uid") String str);

        @h(a = "/webcast/topview/room/")
        b<a<Room, Extra>> queryTopViewLiveRoomInfo(@z(a = "uid") long j2, @z(a = "sec_uid") String str);
    }

    static {
        Covode.recordClassIndex(57873);
    }

    public static b<a<Room, Extra>> a(long j2, String str) {
        return f91930a.queryTopViewLiveRoomInfo(j2, str);
    }
}
