package com.ss.android.ugc.aweme.profile.edit.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.ies.ugc.aweme.network.f;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import java.util.concurrent.ExecutionException;
import l.b.c;
import l.b.e;
import l.b.o;

public final class TwitterApi {

    /* renamed from: a  reason: collision with root package name */
    private static final f f116090a = a.a(Api.f66569d);

    /* access modifiers changed from: package-private */
    public interface RealApi {
        static {
            Covode.recordClassIndex(74887);
        }

        @o(a = "/aweme/v1/twitter/bind/")
        @e
        q<String> bindTwitter(@c(a = "twitter_id") String str, @c(a = "twitter_name") String str2, @c(a = "access_token") String str3, @c(a = "secret_token") String str4);

        @l.b.f(a = "/aweme/v1/twitter/unbind/")
        q<String> unbindYouTube();
    }

    static {
        Covode.recordClassIndex(74886);
    }

    public static String a() {
        try {
            return ((RealApi) f116090a.a(RealApi.class)).unbindYouTube().get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    public static String a(String str, String str2, String str3, String str4) {
        try {
            return ((RealApi) f116090a.a(RealApi.class)).bindTwitter(str, str2, str3, str4).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }
}
