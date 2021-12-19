package com.ss.android.ugc.aweme.shoutouts.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import l.b.c;
import l.b.e;
import l.b.o;

public final class EditProductApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133228a = new a((byte) 0);

    public interface Api {
        static {
            Covode.recordClassIndex(87124);
        }

        @o(a = "/tiktok/shoutouts/product/edit/v1")
        @e
        b<BaseResponse> get(@c(a = "product_id") String str, @c(a = "product") String str2);
    }

    static {
        Covode.recordClassIndex(87123);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87125);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
