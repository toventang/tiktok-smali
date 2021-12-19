package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.service.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bl implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final v f122870a;

    static {
        Covode.recordClassIndex(80656);
    }

    bl(v vVar) {
        this.f122870a = vVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.b.a
    public final void a(boolean z, String str) {
        v vVar = this.f122870a;
        if (vVar.G != null) {
            vVar.G.a(z);
            vVar.G.b(str);
        }
    }
}
