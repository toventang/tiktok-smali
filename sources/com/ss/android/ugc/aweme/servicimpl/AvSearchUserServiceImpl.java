package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.IAvSearchUserService;
import com.ss.android.ugc.aweme.search.model.g;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import com.ss.android.ugc.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class AvSearchUserServiceImpl implements IAvSearchUserService {

    /* renamed from: a  reason: collision with root package name */
    private final h f121835a = i.a((h.f.a.a) a.f121836a);

    static {
        Covode.recordClassIndex(79881);
    }

    static final class a extends m implements h.f.a.a<ISearchUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121836a = new a();

        static {
            Covode.recordClassIndex(79882);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.b();
        }
    }

    public static IAvSearchUserService a() {
        MethodCollector.i(9614);
        Object a2 = b.a(IAvSearchUserService.class, false);
        if (a2 != null) {
            IAvSearchUserService iAvSearchUserService = (IAvSearchUserService) a2;
            MethodCollector.o(9614);
            return iAvSearchUserService;
        }
        if (b.dE == null) {
            synchronized (IAvSearchUserService.class) {
                try {
                    if (b.dE == null) {
                        b.dE = new AvSearchUserServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9614);
                    throw th;
                }
            }
        }
        AvSearchUserServiceImpl avSearchUserServiceImpl = (AvSearchUserServiceImpl) b.dE;
        MethodCollector.o(9614);
        return avSearchUserServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAvSearchUserService
    public final com.ss.android.ugc.aweme.search.model.h a(g gVar) {
        l.d(gVar, "");
        return ((ISearchUserService) this.f121835a.getValue()).b(gVar);
    }
}
