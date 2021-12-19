package com.ss.android.ugc.aweme.profile.ui;

import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ch implements u {

    /* renamed from: a  reason: collision with root package name */
    private final e f117067a;

    static {
        Covode.recordClassIndex(75589);
    }

    ch(e eVar) {
        this.f117067a = eVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        new b(this.f117067a).a((String) obj).b();
    }
}
