package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.photo.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cs implements u {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131664a;

    static {
        Covode.recordClassIndex(86220);
    }

    cs(cj cjVar) {
        this.f131664a = cjVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f131664a.H.a(((a) obj).getPermission());
    }
}
