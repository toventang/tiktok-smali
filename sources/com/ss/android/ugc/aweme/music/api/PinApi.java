package com.ss.android.ugc.aweme.music.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import h.f.b.l;
import l.b.o;

public final class PinApi {

    /* renamed from: a  reason: collision with root package name */
    public static PinOperatorApi f111100a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f111101b = new a((byte) 0);

    public interface PinOperatorApi {
        static {
            Covode.recordClassIndex(71296);
        }

        @o(a = "/tiktok/user/pinned_pgc_music/create/v1/")
        @g
        t<BaseResponse> pinMusic(@e(a = "sec_user_id") String str, @e(a = "music_id") String str2);

        @o(a = "/tiktok/user/pinned_pgc_music/delete/v1/")
        @g
        t<BaseResponse> unpinMusic(@e(a = "sec_user_id") String str, @e(a = "music_id") String str2);
    }

    static {
        Covode.recordClassIndex(71295);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71297);
        }

        private a() {
        }

        static PinOperatorApi a() {
            if (PinApi.f111100a == null) {
                PinApi.f111100a = (PinOperatorApi) RetrofitFactory.a().a(b.f59141e).a(PinOperatorApi.class);
            }
            PinOperatorApi pinOperatorApi = PinApi.f111100a;
            if (pinOperatorApi == null) {
                l.b();
            }
            return pinOperatorApi;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
