package com.bytedance.android.livesdk.feed.drawerfeed.a;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f17376a;

    static {
        Covode.recordClassIndex(9630);
    }

    c(a aVar) {
        this.f17376a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f17376a;
        if (((Boolean) obj).booleanValue()) {
            aVar.a(true);
        } else {
            aVar.d();
        }
    }
}
