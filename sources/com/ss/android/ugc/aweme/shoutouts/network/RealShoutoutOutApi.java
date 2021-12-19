package com.ss.android.ugc.aweme.shoutouts.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import l.b.o;

public final class RealShoutoutOutApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133229a = new a((byte) 0);

    public interface Api {
        static {
            Covode.recordClassIndex(87127);
        }

        @o(a = "/tiktok/shoutouts/opt_out/v1")
        b<BaseResponse> get();
    }

    static {
        Covode.recordClassIndex(87126);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87128);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
