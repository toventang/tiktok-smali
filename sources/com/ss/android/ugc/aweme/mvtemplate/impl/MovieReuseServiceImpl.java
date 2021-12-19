package com.ss.android.ugc.aweme.mvtemplate.impl;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class MovieReuseServiceImpl implements IMovieReuseService {
    static {
        Covode.recordClassIndex(72061);
    }

    public static IMovieReuseService a() {
        MethodCollector.i(8770);
        Object a2 = b.a(IMovieReuseService.class, false);
        if (a2 != null) {
            IMovieReuseService iMovieReuseService = (IMovieReuseService) a2;
            MethodCollector.o(8770);
            return iMovieReuseService;
        }
        if (b.cR == null) {
            synchronized (IMovieReuseService.class) {
                try {
                    if (b.cR == null) {
                        b.cR = new MovieReuseServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8770);
                    throw th;
                }
            }
        }
        MovieReuseServiceImpl movieReuseServiceImpl = (MovieReuseServiceImpl) b.cR;
        MethodCollector.o(8770);
        return movieReuseServiceImpl;
    }

    public static final class a implements com.ss.android.ugc.aweme.tools.f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IMovieReuseService.b f112163a;

        static {
            Covode.recordClassIndex(72062);
        }

        a(IMovieReuseService.b bVar) {
            this.f112163a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.f.b
        public final void onFinish(int i2) {
            boolean z;
            IMovieReuseService.b bVar = this.f112163a;
            if (i2 == 2006) {
                z = true;
            } else {
                z = false;
            }
            bVar.a(i2, Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final aa a(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar) {
        return new com.ss.android.ugc.aweme.mvtemplate.a.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final void b(Fragment fragment, String str) {
        l.d(fragment, "");
        a(fragment, str);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final void a(Fragment fragment, String str) {
        l.d(fragment, "");
        if (str != null && AVExternalServiceImpl.a().publishService().checkIsAlreadyPublished(fragment.getContext())) {
            com.ss.android.ugc.aweme.mvtemplate.a aVar = new com.ss.android.ugc.aweme.mvtemplate.a(fragment.getContext());
            aVar.f112120c = "mv_page";
            aVar.f112121d = "mv_page";
            aVar.a(str, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final void a(String str, Activity activity, IMovieReuseService.b bVar) {
        l.d(str, "");
        l.d(activity, "");
        l.d(bVar, "");
        com.ss.android.ugc.aweme.mvtemplate.a aVar = new com.ss.android.ugc.aweme.mvtemplate.a(activity, 3);
        aVar.f112122e = false;
        aVar.f112124g = new a(bVar);
        aVar.a(str, 0, "scan", "scan");
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final void a(Context context, Integer num, String str, Integer num2, String str2, String str3) {
        l.d(context, "");
        l.d(str, "");
        new com.ss.android.ugc.aweme.mvtemplate.a(context, num).a(str, num2, str2, str3);
    }
}
