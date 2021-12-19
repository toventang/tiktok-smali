package com.ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.x;

public final class l extends i {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f62028a;

    /* renamed from: b  reason: collision with root package name */
    public final x.l f62029b;

    static {
        Covode.recordClassIndex(38135);
    }

    public l(String[] strArr, x.l lVar) {
        h.f.b.l.d(strArr, "");
        h.f.b.l.d(lVar, "");
        this.f62028a = strArr;
        this.f62029b = lVar;
    }

    @Override // com.ss.android.ugc.asve.editor.i
    public final int a(x xVar, boolean z) {
        h.f.b.l.d(xVar, "");
        return xVar.a(this.f62028a, this.f62029b);
    }
}
