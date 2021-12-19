package com.bytedance.android.live.broadcast.preview.virtual;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.google.gson.a.c;
import f.a.t;

public final class LiveSettingApi {

    public interface WebcastAPI {
        static {
            Covode.recordClassIndex(4225);
        }

        @h(a = "/webcast/room/live_podcast/")
        t<d<a>> getLivePodCast();
    }

    public class a {
        @c(a = "can_be_live_podcast")

        /* renamed from: a  reason: collision with root package name */
        public boolean f8307a;
        @c(a = "live_scenario")

        /* renamed from: b  reason: collision with root package name */
        public b f8308b;
        @c(a = "live_permission_apply")

        /* renamed from: c  reason: collision with root package name */
        public a f8309c;

        static {
            Covode.recordClassIndex(4226);
        }
    }

    static {
        Covode.recordClassIndex(4224);
    }
}
