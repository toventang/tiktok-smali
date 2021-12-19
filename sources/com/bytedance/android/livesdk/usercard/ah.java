package com.bytedance.android.livesdk.usercard;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class ah implements f {

    /* renamed from: a  reason: collision with root package name */
    private final y f21802a;

    static {
        Covode.recordClassIndex(12847);
    }

    ah(y yVar) {
        this.f21802a = yVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        y yVar = this.f21802a;
        Throwable th = (Throwable) obj;
        yVar.f21898c = false;
        if (yVar.f21897b != null) {
            yVar.f21897b.a(th);
        }
    }
}
