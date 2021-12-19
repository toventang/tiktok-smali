package com.ss.android.ugc.aweme.dmt_integration;

import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.a;
import com.ss.android.ugc.tools.e.f;
import com.ss.android.ugc.tools.view.style.c;
import h.f.a.b;
import h.z;

final /* synthetic */ class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final AVInitializerImpl f82929a;

    static {
        Covode.recordClassIndex(51682);
    }

    h(AVInitializerImpl aVInitializerImpl) {
        this.f82929a = aVInitializerImpl;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        AVInitializerImpl aVInitializerImpl = this.f82929a;
        f fVar = (f) obj;
        fVar.a(l.f82933a);
        fVar.a(new c() {
            /* class com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.AnonymousClass3 */

            static {
                Covode.recordClassIndex(51645);
            }

            @Override // com.ss.android.ugc.tools.view.style.c
            public final Typeface a(int i2) {
                return a.a().a(i2);
            }

            @Override // com.ss.android.ugc.tools.view.style.c
            public final Typeface a(String str) {
                return com.bytedance.ies.dmt.ui.widget.util.b.a().a(str);
            }
        });
        fVar.a(m.f82934a);
        return z.f158842a;
    }
}
