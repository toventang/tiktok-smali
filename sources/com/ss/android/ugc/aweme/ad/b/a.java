package com.ss.android.ugc.aweme.ad.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.service.IAdLandPageDependOutService;
import com.ss.android.ugc.aweme.commercialize.service.AdLandPageDependOutService;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.b;
import h.f.b.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final dz f65583a = eb.a(C1464a.f65585a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f65584b = new a();

    private a() {
    }

    public static d a() {
        return (d) f65583a.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.b.a$a  reason: collision with other inner class name */
    static final class C1464a extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1464a f65585a = new C1464a();

        static {
            Covode.recordClassIndex(40352);
        }

        C1464a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            IAdLandPageDependOutService adLandPageDependOutService;
            Object a2 = b.a(IAdLandPageDependOutService.class, false);
            if (a2 != null) {
                adLandPageDependOutService = (IAdLandPageDependOutService) a2;
                if (adLandPageDependOutService == null) {
                    return null;
                }
            } else {
                adLandPageDependOutService = new AdLandPageDependOutService();
            }
            return adLandPageDependOutService.a();
        }
    }

    static {
        Covode.recordClassIndex(40351);
    }
}
