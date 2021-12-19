package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class ag implements f {

    /* renamed from: a  reason: collision with root package name */
    private final y f21801a;

    static {
        Covode.recordClassIndex(12846);
    }

    ag(y yVar) {
        this.f21801a = yVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        y yVar = this.f21801a;
        a aVar = (a) obj;
        yVar.f21898c = false;
        if (yVar.f21897b != null) {
            yVar.f21897b.a(aVar);
        }
    }
}
