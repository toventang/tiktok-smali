package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.setting.model.k;
import com.ss.android.ugc.aweme.setting.model.m;
import java.util.concurrent.ExecutionException;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public final class RestrictApi {

    /* renamed from: a  reason: collision with root package name */
    private static final RealApi f122062a = ((RealApi) a.a(b.f59141e, RealApi.class));

    interface RealApi {
        static {
            Covode.recordClassIndex(80026);
        }

        @f(a = "/aweme/v1/item/restrict/info/")
        q<m> getRestrictInfo(@t(a = "target_iid") String str);

        @o(a = "/aweme/v1/item/restrict/")
        @e
        q<com.ss.android.ugc.aweme.setting.model.f> restrictAweme(@c(a = "target_iid") String str);

        @o(a = "/aweme/v1/user/restrict/")
        @e
        q<com.ss.android.ugc.aweme.setting.model.f> restrictUser(@c(a = "target_uid") String str);
    }

    static {
        Covode.recordClassIndex(80025);
    }

    public static k a(String str) {
        try {
            m mVar = f122062a.getRestrictInfo(str).get();
            if (mVar == null) {
                return null;
            }
            mVar.f122338a.f122333a = str;
            return mVar.f122338a;
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static com.ss.android.ugc.aweme.setting.model.f b(String str) {
        try {
            return f122062a.restrictAweme(str).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static com.ss.android.ugc.aweme.setting.model.f c(String str) {
        try {
            return f122062a.restrictUser(str).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }
}
