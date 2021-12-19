package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cx implements u {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131669a;

    static {
        Covode.recordClassIndex(86225);
    }

    cx(cj cjVar) {
        this.f131669a = cjVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f131669a.z.setStitchStatus(((Boolean) obj).booleanValue());
    }
}
