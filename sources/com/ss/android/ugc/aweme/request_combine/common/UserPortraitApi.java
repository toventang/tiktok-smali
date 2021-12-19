package com.ss.android.ugc.aweme.request_combine.common;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.google.gson.o;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import l.b.f;
import l.b.t;

public final class UserPortraitApi {

    /* renamed from: a  reason: collision with root package name */
    private static final IRetrofit f120624a = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e);

    /* access modifiers changed from: package-private */
    public interface RealApi {
        static {
            Covode.recordClassIndex(78539);
        }

        @f(a = "/tiktok/v1/efficiency_portrait/")
        q<o> fetchPortraits(@t(a = "group_list") String str);
    }

    static {
        Covode.recordClassIndex(78538);
    }

    public static o a(String str) {
        int errorCode;
        try {
            return ((RealApi) f120624a.create(RealApi.class)).fetchPortraits(str).get();
        } catch (ExecutionException e2) {
            if ((e2.getCause() instanceof a) && ((errorCode = ((com.ss.android.ugc.aweme.base.api.a.a) e2.getCause()).getErrorCode()) == 9 || errorCode == 14)) {
                return null;
            }
            throw e2;
        } catch (IncompatibleClassChangeError e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
