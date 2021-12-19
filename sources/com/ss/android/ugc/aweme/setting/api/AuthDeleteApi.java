package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import java.util.LinkedHashMap;
import l.b.d;
import l.b.e;
import l.b.o;

public interface AuthDeleteApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122039a = a.f122040a;

    static {
        Covode.recordClassIndex(80003);
    }

    @o(a = "/aweme/v1/openapi/authorized/app/remove/")
    @e
    t<BaseResponse> deleteAuthInfoApp(@d LinkedHashMap<String, String> linkedHashMap);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f122040a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80004);
        }
    }
}
