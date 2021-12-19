package com.ss.android.ugc.aweme.tcm.impl.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.service.TcmOutService;
import com.ss.android.ugc.aweme.tcm.api.service.ITcmOutService;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.b;
import h.f.b.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final dz f138562a = eb.a(C3654a.f138564a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f138563b = new a();

    private a() {
    }

    public static com.ss.android.ugc.aweme.tcm.api.a.a a() {
        return (com.ss.android.ugc.aweme.tcm.api.a.a) f138562a.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.a.a$a  reason: collision with other inner class name */
    static final class C3654a extends m implements h.f.a.a<com.ss.android.ugc.aweme.tcm.api.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3654a f138564a = new C3654a();

        static {
            Covode.recordClassIndex(90656);
        }

        C3654a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.tcm.api.a.a invoke() {
            ITcmOutService tcmOutService;
            Object a2 = b.a(ITcmOutService.class, false);
            if (a2 != null) {
                tcmOutService = (ITcmOutService) a2;
                if (tcmOutService == null) {
                    return null;
                }
            } else {
                tcmOutService = new TcmOutService();
            }
            return tcmOutService.a();
        }
    }

    static {
        Covode.recordClassIndex(90655);
    }
}
