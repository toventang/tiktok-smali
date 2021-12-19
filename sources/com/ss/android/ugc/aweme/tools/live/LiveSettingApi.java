package com.ss.android.ugc.aweme.tools.live;

import b.i;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.cg;
import com.ss.android.ugc.aweme.ch;
import l.b.f;

public final class LiveSettingApi {

    /* renamed from: a  reason: collision with root package name */
    public static WebcastAPI f140209a = ((WebcastAPI) com.bytedance.ies.ugc.aweme.network.ext.a.a("https://webcast.tiktokv.com", WebcastAPI.class));

    public interface WebcastAPI {
        static {
            Covode.recordClassIndex(91605);
        }

        @f(a = "/webcast/room/create_info/")
        i<a> createInfo();

        @f(a = "/webcast/room/live_podcast/")
        i<b> getLivePodCast();
    }

    public class a extends BaseResponse {
        @c(a = "data")

        /* renamed from: a  reason: collision with root package name */
        public C3697a f140210a;

        /* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi$a$a  reason: collision with other inner class name */
        public class C3697a {
            @c(a = "never_go_live_flag")

            /* renamed from: a  reason: collision with root package name */
            public boolean f140211a;

            static {
                Covode.recordClassIndex(91607);
            }
        }

        static {
            Covode.recordClassIndex(91606);
        }
    }

    public class b extends BaseResponse {
        @c(a = "data")

        /* renamed from: a  reason: collision with root package name */
        public a f140212a;

        public class a {
            @c(a = "can_be_live_podcast")

            /* renamed from: a  reason: collision with root package name */
            public boolean f140213a;
            @c(a = "live_scenario")

            /* renamed from: b  reason: collision with root package name */
            public ch f140214b;
            @c(a = "live_permission_apply")

            /* renamed from: c  reason: collision with root package name */
            public cg f140215c;

            static {
                Covode.recordClassIndex(91609);
            }
        }

        static {
            Covode.recordClassIndex(91608);
        }
    }

    static {
        Covode.recordClassIndex(91604);
    }
}
