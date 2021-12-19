package com.ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class q extends i {

    /* renamed from: a  reason: collision with root package name */
    public final VEEditorModel f62062a;

    /* renamed from: b  reason: collision with root package name */
    public final bg f62063b;

    static {
        Covode.recordClassIndex(38151);
    }

    public q(VEEditorModel vEEditorModel, bg bgVar) {
        l.d(vEEditorModel, "");
        this.f62062a = vEEditorModel;
        this.f62063b = bgVar;
    }

    @Override // com.ss.android.ugc.asve.editor.i
    public final int a(x xVar, boolean z) {
        l.d(xVar, "");
        return xVar.a(this.f62062a, this.f62063b);
    }
}
