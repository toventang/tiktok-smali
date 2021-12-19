package com.ss.android.ugc.aweme.shoutouts.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;

public final class ShoutoutOrderListApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133230a = new a((byte) 0);

    public interface Api {
        static {
            Covode.recordClassIndex(87130);
        }

        @h(a = "/tiktok/shoutouts/order/list/v1")
        b<b> get(@z(a = "filter") int i2, @z(a = "product_id") String str, @z(a = "count") int i3);
    }

    static {
        Covode.recordClassIndex(87129);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87131);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
