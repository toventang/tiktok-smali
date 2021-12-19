package com.ss.android.ugc.aweme.detail.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.b.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ai implements a {

    /* renamed from: a  reason: collision with root package name */
    private final z f79922a;

    static {
        Covode.recordClassIndex(49718);
    }

    ai(z zVar) {
        this.f79922a = zVar;
    }

    @Override // com.ss.android.ugc.aweme.detail.b.a
    public final void a(float f2) {
        z zVar = this.f79922a;
        if (zVar.f79987b != null) {
            zVar.f79987b.setAlpha(f2);
            zVar.f79987b.setVisibility(f2 > 0.0f ? 0 : 8);
        }
    }
}
