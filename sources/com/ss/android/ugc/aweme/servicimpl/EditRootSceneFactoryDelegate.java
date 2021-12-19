package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.b;
import com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory;
import com.ss.android.ugc.gamora.editor.rootscene.d;
import h.f.b.l;

public final class EditRootSceneFactoryDelegate implements IEditRootSceneFactory {
    static {
        Covode.recordClassIndex(79883);
    }

    private static IEditRootSceneFactory c() {
        if (!AVInitializerImpl.f82880a) {
            return null;
        }
        return g.f121881a;
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final Class<? extends d> a() {
        IEditRootSceneFactory c2 = c();
        if (c2 == null) {
            l.b();
        }
        return c2.a();
    }

    public static IEditRootSceneFactory b() {
        MethodCollector.i(9607);
        Object a2 = b.a(IEditRootSceneFactory.class, false);
        if (a2 != null) {
            IEditRootSceneFactory iEditRootSceneFactory = (IEditRootSceneFactory) a2;
            MethodCollector.o(9607);
            return iEditRootSceneFactory;
        }
        if (b.dF == null) {
            synchronized (IEditRootSceneFactory.class) {
                try {
                    if (b.dF == null) {
                        b.dF = new EditRootSceneFactoryDelegate();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9607);
                    throw th;
                }
            }
        }
        EditRootSceneFactoryDelegate editRootSceneFactoryDelegate = (EditRootSceneFactoryDelegate) b.dF;
        MethodCollector.o(9607);
        return editRootSceneFactoryDelegate;
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final d a(f fVar) {
        l.d(fVar, "");
        IEditRootSceneFactory c2 = c();
        if (c2 == null) {
            l.b();
        }
        return c2.a(fVar);
    }
}
