package com.bytedance.ies.ugc.aweme.commercialize.splash.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.api.SplashAdApi;
import com.ss.android.ugc.aweme.commercialize.util.c;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f34779a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final h f34780b = i.a((h.f.a.a) a.f34782a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f34781c = i.a((h.f.a.a) b.f34783a);

    public static SplashAdApi a() {
        return (SplashAdApi) f34780b.getValue();
    }

    public static SplashAdApi b() {
        return (SplashAdApi) f34781c.getValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<SplashAdApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34782a = new a();

        static {
            Covode.recordClassIndex(20866);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SplashAdApi invoke() {
            return com.bytedance.ies.ugc.aweme.network.ext.a.a().a(c.f75475a).a(SplashAdApi.class);
        }
    }

    static final class b extends m implements h.f.a.a<SplashAdApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34783a = new b();

        static {
            Covode.recordClassIndex(20867);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SplashAdApi invoke() {
            return com.bytedance.ies.ugc.aweme.network.ext.a.b(c.f75475a).a().d().a(SplashAdApi.class);
        }
    }

    static {
        Covode.recordClassIndex(20865);
    }
}
