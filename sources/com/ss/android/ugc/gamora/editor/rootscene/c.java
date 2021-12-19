package com.ss.android.ugc.gamora.editor.rootscene;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.ftc.components.a;
import h.f.b.l;

public final class c implements IEditRootSceneFactory {
    static {
        Covode.recordClassIndex(96229);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final Class<? extends d> a() {
        return a.class;
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final d a(f fVar) {
        l.d(fVar, "");
        return new a(fVar);
    }
}
