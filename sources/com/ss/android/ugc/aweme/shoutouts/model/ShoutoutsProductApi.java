package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import f.a.ab;
import h.f.b.l;
import l.b.f;
import l.b.t;

public interface ShoutoutsProductApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133193a = a.f133194a;

    static {
        Covode.recordClassIndex(87103);
    }

    @f(a = "/tiktok/shoutouts/product/get/v1")
    ab<g> getProduct(@t(a = "creator_uid") String str, @t(a = "product_id") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f133194a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(87104);
        }

        public static ShoutoutsProductApi a() {
            Object a2 = RetrofitFactory.a().b(b.f59141e).d().a(ShoutoutsProductApi.class);
            l.b(a2, "");
            return (ShoutoutsProductApi) a2;
        }
    }
}
