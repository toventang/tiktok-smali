package com.ss.android.ugc.aweme.fe.method.feeds.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import f.a.t;
import h.f.b.l;
import java.util.Map;
import l.b.f;
import l.b.u;
import l.b.x;

public interface IDynamicApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91294a = a.f91295a;

    static {
        Covode.recordClassIndex(57458);
    }

    @f
    t<com.ss.android.ugc.aweme.fe.method.feeds.b.a> loadVideos(@x String str, @u Map<String, String> map);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f91295a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(57459);
        }

        public static IDynamicApi a(String str) {
            l.d(str, "");
            Object a2 = RetrofitFactory.a().a(str).a(IDynamicApi.class);
            l.b(a2, "");
            return (IDynamicApi) a2;
        }
    }
}
