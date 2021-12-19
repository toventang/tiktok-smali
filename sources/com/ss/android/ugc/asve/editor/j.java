package com.ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class j extends i {

    /* renamed from: a  reason: collision with root package name */
    public String[] f62017a;

    static {
        Covode.recordClassIndex(38133);
    }

    public j(String[] strArr) {
        l.d(strArr, "");
        this.f62017a = strArr;
    }

    @Override // com.ss.android.ugc.asve.editor.i
    public final int a(x xVar, boolean z) {
        l.d(xVar, "");
        if (z) {
            xVar.h();
        }
        return xVar.a(this.f62017a, (String[]) null, (String[]) null, x.l.VIDEO_OUT_RATIO_ORIGINAL);
    }
}
