package com.ss.android.ugc.aweme.request_combine.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.u;
import f.a.t;
import java.util.Map;

public interface SettingCombineApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120612a = a.f120614b;

    static {
        Covode.recordClassIndex(78527);
    }

    @h(a = "tfe/api/request_combine/v1/")
    t<u<String>> request(@aa Map<String, String> map);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String f120613a = ("https://" + d.f34604k.f34586a);

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f120614b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(78528);
        }
    }
}
