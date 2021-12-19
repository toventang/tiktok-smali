package com.ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface LiveRoomInfoApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f108375a = a.f108376a;

    static {
        Covode.recordClassIndex(69437);
    }

    @h(a = "/webcast/room/info_by_user/")
    t<LiveRoomInfoResponse> fetchUserRoom(@z(a = "user_id") long j2, @z(a = "sec_user_id") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f108376a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(69438);
        }
    }
}
