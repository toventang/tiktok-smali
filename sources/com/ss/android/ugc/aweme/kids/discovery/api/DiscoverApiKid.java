package com.ss.android.ugc.aweme.kids.discovery.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;
import h.f.b.l;

public interface DiscoverApiKid {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106422a = a.f106424b;

    public static final class b {
        static {
            Covode.recordClassIndex(68009);
        }
    }

    static {
        Covode.recordClassIndex(68007);
    }

    @h(a = "/tiktok/v1/kids/category/list/")
    t<com.ss.android.ugc.aweme.kids.discovery.c.b> getCategoryV2List(@z(a = "cursor") int i2, @z(a = "count") int i3, @z(a = "is_complete") Integer num);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final DiscoverApiKid f106423a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f106424b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(68008);
            Object a2 = RetrofitFactory.a().b(com.ss.android.ugc.aweme.kids.common.a.a.f105880a).d().a(DiscoverApiKid.class);
            l.b(a2, "");
            f106423a = (DiscoverApiKid) a2;
        }
    }
}
