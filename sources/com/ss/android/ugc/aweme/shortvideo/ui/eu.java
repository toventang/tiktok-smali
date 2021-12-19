package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.appcompat.widget.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f;

final /* synthetic */ class eu implements v.a {

    /* renamed from: a  reason: collision with root package name */
    private final n f131734a;

    static {
        Covode.recordClassIndex(86277);
    }

    eu(n nVar) {
        this.f131734a = nVar;
    }

    @Override // com.ss.android.ugc.aweme.port.in.v.a
    public final void a(String[] strArr, int[] iArr) {
        n nVar = this.f131734a;
        if (f.a(iArr)) {
            nVar.toggle();
        }
    }
}
