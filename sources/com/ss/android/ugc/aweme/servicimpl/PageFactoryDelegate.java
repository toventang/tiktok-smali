package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.b;
import com.ss.android.ugc.gamora.PageFactory;
import h.f.b.l;

public final class PageFactoryDelegate implements PageFactory {
    static {
        Covode.recordClassIndex(79885);
    }

    public static PageFactory a() {
        MethodCollector.i(9266);
        Object a2 = b.a(PageFactory.class, false);
        if (a2 != null) {
            PageFactory pageFactory = (PageFactory) a2;
            MethodCollector.o(9266);
            return pageFactory;
        }
        if (b.dH == null) {
            synchronized (PageFactory.class) {
                try {
                    if (b.dH == null) {
                        b.dH = new PageFactoryDelegate();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9266);
                    throw th;
                }
            }
        }
        PageFactoryDelegate pageFactoryDelegate = (PageFactoryDelegate) b.dH;
        MethodCollector.o(9266);
        return pageFactoryDelegate;
    }

    @Override // com.ss.android.ugc.gamora.PageFactory
    public final void a(com.bytedance.scene.group.b bVar) {
        w wVar;
        l.d(bVar, "");
        if (AVInitializerImpl.f82880a && (wVar = w.f121945a) != null) {
            wVar.a(bVar);
        }
    }
}
