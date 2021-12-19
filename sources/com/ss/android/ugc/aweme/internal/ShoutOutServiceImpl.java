package com.ss.android.ugc.aweme.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.profile.b.h;
import com.ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService;
import com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewService;
import com.ss.android.ugc.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class ShoutOutServiceImpl implements IShoutOutApiService {
    static {
        Covode.recordClassIndex(67186);
    }

    @Override // com.ss.android.ugc.aweme.internal.IShoutOutApiService
    public final void a() {
        c.a(new h());
    }

    public static IShoutOutApiService b() {
        MethodCollector.i(9152);
        Object a2 = b.a(IShoutOutApiService.class, false);
        if (a2 != null) {
            IShoutOutApiService iShoutOutApiService = (IShoutOutApiService) a2;
            MethodCollector.o(9152);
            return iShoutOutApiService;
        }
        if (b.bO == null) {
            synchronized (IShoutOutApiService.class) {
                try {
                    if (b.bO == null) {
                        b.bO = new ShoutOutServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9152);
                    throw th;
                }
            }
        }
        ShoutOutServiceImpl shoutOutServiceImpl = (ShoutOutServiceImpl) b.bO;
        MethodCollector.o(9152);
        return shoutOutServiceImpl;
    }

    public static final class a implements com.ss.android.ugc.aweme.shoutouts.api.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f104774a;

        static {
            Covode.recordClassIndex(67187);
        }

        a(d dVar) {
            this.f104774a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.shoutouts.api.a
        public final void a(boolean z) {
            this.f104774a.a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.internal.IShoutOutApiService
    public final void a(String str, long j2) {
        l.d(str, "");
        e.a.f91018a.b(str, String.valueOf(j2));
    }

    @Override // com.ss.android.ugc.aweme.internal.IShoutOutApiService
    public final void a(Context context, String str, Integer num, Float f2, String str2) {
        l.d(context, "");
        l.d(str, "");
        IShoutoutsReviewService a2 = ShoutoutsReviewService.a();
        if (a2 != null) {
            a2.a(context, str, num, f2, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.internal.IShoutOutApiService
    public final void a(ViewGroup viewGroup, int i2, float f2, String str, String str2, d dVar) {
        l.d(viewGroup, "");
        l.d(str, "");
        l.d(dVar, "");
        IShoutoutsReviewService a2 = ShoutoutsReviewService.a();
        if (a2 != null) {
            a2.a(viewGroup, i2, f2, str, str2, new a(dVar));
        }
    }
}
