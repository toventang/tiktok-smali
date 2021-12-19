package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.ui.d.a;
import h.f.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class v implements b {

    /* renamed from: a  reason: collision with root package name */
    private final k f117490a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f117491b;

    static {
        Covode.recordClassIndex(75897);
    }

    v(k kVar, boolean z) {
        this.f117490a = kVar;
        this.f117491b = z;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        k kVar = this.f117490a;
        boolean z = this.f117491b;
        a aVar = (a) obj;
        aVar.a(z);
        if (!z) {
            return null;
        }
        aVar.a(new t(kVar));
        return null;
    }
}
