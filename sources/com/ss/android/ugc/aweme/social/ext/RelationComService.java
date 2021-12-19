package com.ss.android.ugc.aweme.social.ext;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.social.b.a;
import com.ss.android.ugc.aweme.social.service.IRelationComService;
import com.ss.android.ugc.b;
import h.a.n;
import java.util.List;

public final class RelationComService implements IRelationComService {
    static {
        Covode.recordClassIndex(87452);
    }

    @Override // com.ss.android.ugc.aweme.social.service.IRelationComService
    public final List<r> a() {
        return n.a(new a());
    }

    public static IRelationComService b() {
        MethodCollector.i(13770);
        Object a2 = b.a(IRelationComService.class, false);
        if (a2 != null) {
            IRelationComService iRelationComService = (IRelationComService) a2;
            MethodCollector.o(13770);
            return iRelationComService;
        }
        if (b.eh == null) {
            synchronized (IRelationComService.class) {
                try {
                    if (b.eh == null) {
                        b.eh = new RelationComService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13770);
                    throw th;
                }
            }
        }
        RelationComService relationComService = (RelationComService) b.eh;
        MethodCollector.o(13770);
        return relationComService;
    }
}
