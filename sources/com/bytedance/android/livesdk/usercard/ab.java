package com.bytedance.android.livesdk.usercard;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class ab implements f {

    /* renamed from: a  reason: collision with root package name */
    private final y f21796a;

    static {
        Covode.recordClassIndex(12841);
    }

    ab(y yVar) {
        this.f21796a = yVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        y yVar = this.f21796a;
        Throwable th = (Throwable) obj;
        if (yVar.f21897b != null) {
            yVar.f21897b.a(th);
        }
    }
}
