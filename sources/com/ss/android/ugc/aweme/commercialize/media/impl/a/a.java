package com.ss.android.ugc.aweme.commercialize.media.impl.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceMediaOutService;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.b;
import h.f.b.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final dz f74845a = eb.a(C1701a.f74847a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f74846b = new a();

    private a() {
    }

    public static com.ss.android.ugc.aweme.commercialize.media.api.a.a a() {
        return (com.ss.android.ugc.aweme.commercialize.media.api.a.a) f74845a.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.media.impl.a.a$a  reason: collision with other inner class name */
    static final class C1701a extends m implements h.f.a.a<com.ss.android.ugc.aweme.commercialize.media.api.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1701a f74847a = new C1701a();

        static {
            Covode.recordClassIndex(46139);
        }

        C1701a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.commercialize.media.api.a.a invoke() {
            ICommerceMediaOutService commerceMediaOutService;
            Object a2 = b.a(ICommerceMediaOutService.class, false);
            if (a2 != null) {
                commerceMediaOutService = (ICommerceMediaOutService) a2;
                if (commerceMediaOutService == null) {
                    return null;
                }
            } else {
                commerceMediaOutService = new CommerceMediaOutService();
            }
            return commerceMediaOutService.a();
        }
    }

    static {
        Covode.recordClassIndex(46138);
    }
}
