package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import java.util.LinkedHashMap;
import l.b.c;
import l.b.d;
import l.b.e;
import l.b.o;

public final class CreateAwemeApi {

    /* renamed from: a  reason: collision with root package name */
    public static API f129659a = ((API) RetrofitFactory.a().a(Api.f66569d).a(API.class));

    public interface API {
        static {
            Covode.recordClassIndex(85113);
        }

        @o(a = "/aweme/v1/create/aweme/")
        @e
        q<CreateAwemeResponse> createAweme(@c(a = "material_id") String str, @d LinkedHashMap<String, String> linkedHashMap);
    }

    static {
        Covode.recordClassIndex(85112);
    }
}
