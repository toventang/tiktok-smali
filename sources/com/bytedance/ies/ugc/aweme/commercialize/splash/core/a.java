package com.bytedance.ies.ugc.aweme.commercialize.splash.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.a.b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService;
import com.ss.android.ugc.aweme.commercialize.service.SplashAdOutService;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.eb;
import h.f.b.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34759a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final dz f34760b = eb.a(C0786a.f34761a);

    private a() {
    }

    public static b a() {
        return (b) f34760b.a();
    }

    public static boolean b() {
        if (a() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.core.a$a  reason: collision with other inner class name */
    static final class C0786a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0786a f34761a = new C0786a();

        static {
            Covode.recordClassIndex(20853);
        }

        C0786a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            ISplashAdOutService splashAdOutService;
            Object a2 = com.ss.android.ugc.b.a(ISplashAdOutService.class, false);
            if (a2 != null) {
                splashAdOutService = (ISplashAdOutService) a2;
                if (splashAdOutService == null) {
                    return null;
                }
            } else {
                splashAdOutService = new SplashAdOutService();
            }
            return splashAdOutService.a();
        }
    }

    static {
        Covode.recordClassIndex(20852);
    }

    public static void a(b bVar) {
        f34760b.a(bVar);
    }
}
