package com.ss.android.ugc.aweme.follow.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static IFollowFeedApiV1 f96208a;

    /* renamed from: b  reason: collision with root package name */
    public static final C2319a f96209b = new C2319a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static IRetrofitService f96210c;

    /* renamed from: com.ss.android.ugc.aweme.follow.api.a$a  reason: collision with other inner class name */
    public static final class C2319a {
        static {
            Covode.recordClassIndex(60947);
        }

        private C2319a() {
        }

        public /* synthetic */ C2319a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(60946);
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        l.b(createIRetrofitServicebyMonsterPlugin, "");
        f96210c = createIRetrofitServicebyMonsterPlugin;
        Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(b.f59141e).create(IFollowFeedApiV1.class);
        l.b(create, "");
        f96208a = (IFollowFeedApiV1) create;
    }
}
