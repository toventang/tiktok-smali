package com.ss.android.ugc.asve.editor;

import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.h;
import com.ss.android.vesdk.bj;
import h.f.b.l;

public final class e implements h {
    static {
        Covode.recordClassIndex(38124);
    }

    @Override // com.ss.android.ugc.asve.editor.h
    public final g a(SurfaceView surfaceView, h.b bVar) {
        l.d(bVar, "");
        if (bVar.f62013a == f.VEEditorTYPE) {
            bj bjVar = bVar.f62016d;
            if (bjVar != null) {
                if (surfaceView == null) {
                    return new a(bVar.f62014b, bjVar);
                }
                if (bVar.f62015c > 0) {
                    return new a(bVar.f62014b, surfaceView, bVar.f62015c);
                }
                return new a(bVar.f62014b, surfaceView, bjVar);
            } else if (surfaceView == null) {
                return new a(bVar.f62014b);
            } else {
                if (bVar.f62015c > 0) {
                    return new a(bVar.f62014b, surfaceView, bVar.f62015c);
                }
                return new a(bVar.f62014b, surfaceView);
            }
        } else {
            throw new IllegalArgumentException(("Unknown editor type " + bVar.f62013a).toString());
        }
    }
}
