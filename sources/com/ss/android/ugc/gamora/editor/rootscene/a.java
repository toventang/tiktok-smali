package com.ss.android.ugc.gamora.editor.rootscene;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.gamora.editor.v;
import h.f.b.l;

public final class a implements IEditRootSceneFactory {
    static {
        Covode.recordClassIndex(96224);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final Class<? extends d> a() {
        return v.class;
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final d a(f fVar) {
        l.d(fVar, "");
        return new v(fVar);
    }
}
