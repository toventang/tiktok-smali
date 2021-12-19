package com.ss.android.ugc.aweme.geofencing.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.geofencing.c.b;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.tools.AVApi;
import f.a.n;
import h.f.b.l;
import l.b.f;

public interface TranslatedRegionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f99036a = a.f99037a;

    static {
        Covode.recordClassIndex(62967);
    }

    @f(a = "/aweme/v1/translations/regions/")
    n<b> getTranslatedRegions();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f99037a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(62968);
        }

        public static TranslatedRegionApi a() {
            au C = g.a().C();
            AVApi b2 = AVApiImpl.b();
            l.b(b2, "");
            String a2 = b2.a();
            l.b(a2, "");
            return (TranslatedRegionApi) C.createRetrofit(a2, true, TranslatedRegionApi.class);
        }
    }
}
