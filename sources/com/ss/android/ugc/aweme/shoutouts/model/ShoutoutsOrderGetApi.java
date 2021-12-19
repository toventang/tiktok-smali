package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import l.b.f;
import l.b.t;

public interface ShoutoutsOrderGetApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133189a = a.f133190a;

    static {
        Covode.recordClassIndex(87096);
    }

    @f(a = "/tiktok/shoutouts/order/get/v1")
    ab<c> getOrder(@t(a = "order_id") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f133190a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(87097);
        }
    }
}
