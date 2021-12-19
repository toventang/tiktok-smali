package com.ss.android.ugc.aweme.ad.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class AdCommentService implements IAdCommentService {
    static {
        Covode.recordClassIndex(40375);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.IAdCommentService
    public final void a() {
        HasCommentDesApi.f65609a = null;
    }

    public static IAdCommentService b() {
        MethodCollector.i(1865);
        Object a2 = b.a(IAdCommentService.class, false);
        if (a2 != null) {
            IAdCommentService iAdCommentService = (IAdCommentService) a2;
            MethodCollector.o(1865);
            return iAdCommentService;
        }
        if (b.H == null) {
            synchronized (IAdCommentService.class) {
                try {
                    if (b.H == null) {
                        b.H = new AdCommentService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1865);
                    throw th;
                }
            }
        }
        AdCommentService adCommentService = (AdCommentService) b.H;
        MethodCollector.o(1865);
        return adCommentService;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.IAdCommentService
    public final void a(String str, com.ss.android.ugc.aweme.ad.comment.a.b bVar) {
        l.d(str, "");
        l.d(bVar, "");
        l.d(str, "");
        l.d(bVar, "");
        HasCommentDesApi.f65609a = bVar;
        ((HasCommentDesApi.Api) HasCommentDesApi.f65610b.getValue()).getResponse(str).enqueue(new HasCommentDesApi.b());
    }
}
