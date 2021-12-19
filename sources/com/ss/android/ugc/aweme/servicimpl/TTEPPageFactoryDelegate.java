package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.ttep.ad;
import com.ss.android.ugc.b;
import com.ss.android.ugc.gamora.TTEPPageFactory;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class TTEPPageFactoryDelegate implements TTEPPageFactory {

    /* renamed from: a  reason: collision with root package name */
    private final h f121837a = i.a((h.f.a.a) a.f121838a);

    static {
        Covode.recordClassIndex(79887);
    }

    static final class a extends m implements h.f.a.a<ad> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121838a = new a();

        static {
            Covode.recordClassIndex(79888);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad invoke() {
            if (g.a().A().a()) {
                return null;
            }
            return new ad();
        }
    }

    public static TTEPPageFactory a() {
        MethodCollector.i(8849);
        Object a2 = b.a(TTEPPageFactory.class, false);
        if (a2 != null) {
            TTEPPageFactory tTEPPageFactory = (TTEPPageFactory) a2;
            MethodCollector.o(8849);
            return tTEPPageFactory;
        }
        if (b.dJ == null) {
            synchronized (TTEPPageFactory.class) {
                try {
                    if (b.dJ == null) {
                        b.dJ = new TTEPPageFactoryDelegate();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8849);
                    throw th;
                }
            }
        }
        TTEPPageFactoryDelegate tTEPPageFactoryDelegate = (TTEPPageFactoryDelegate) b.dJ;
        MethodCollector.o(8849);
        return tTEPPageFactoryDelegate;
    }

    @Override // com.ss.android.ugc.gamora.TTEPPageFactory
    public final void a(com.bytedance.scene.group.b bVar) {
        TTEPPageFactory tTEPPageFactory;
        l.d(bVar, "");
        if (AVInitializerImpl.f82880a && (tTEPPageFactory = (TTEPPageFactory) this.f121837a.getValue()) != null) {
            tTEPPageFactory.a(bVar);
        }
    }
}
