package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cv implements u {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131667a;

    static {
        Covode.recordClassIndex(86223);
    }

    cv(cj cjVar) {
        this.f131667a = cjVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f131667a.z.setDuetStatus(((Boolean) obj).booleanValue());
    }
}
