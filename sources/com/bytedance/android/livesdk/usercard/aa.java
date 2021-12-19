package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.livesdk.usercard.y;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements f {

    /* renamed from: a  reason: collision with root package name */
    private final y f21795a;

    static {
        Covode.recordClassIndex(12840);
    }

    aa(y yVar) {
        this.f21795a = yVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        y yVar = this.f21795a;
        Throwable th = (Throwable) obj;
        if (yVar.y != null) {
            ((y.b) yVar.y).a(th);
        }
    }
}
