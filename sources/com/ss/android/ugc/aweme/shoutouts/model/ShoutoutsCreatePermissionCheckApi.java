package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import l.b.f;
import l.b.t;

public interface ShoutoutsCreatePermissionCheckApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133187a = a.f133188a;

    static {
        Covode.recordClassIndex(87094);
    }

    @f(a = "/tiktok/shoutouts/product/rating/create_permission/check/v1")
    ab<a> checkPermission(@t(a = "product_id") String str, @t(a = "order_id") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f133188a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(87095);
        }
    }
}
