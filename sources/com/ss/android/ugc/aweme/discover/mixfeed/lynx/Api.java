package com.ss.android.ugc.aweme.discover.mixfeed.lynx;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.y;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import h.f.b.l;

public interface Api {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81811a = a.f81813b;

    static {
        Covode.recordClassIndex(50811);
    }

    @h(a = "/aweme/v1/search/forecast/")
    @y(a = 3)
    i<a> fetchSchema(@z(a = "keyword") String str, @z(a = "count") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final Api f81812a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f81813b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(50812);
            Object a2 = SearchApiNew.f80776b.a(Api.class);
            l.b(a2, "");
            f81812a = (Api) a2;
        }
    }
}
