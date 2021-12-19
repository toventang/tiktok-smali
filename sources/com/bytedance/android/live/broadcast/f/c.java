package com.bytedance.android.live.broadcast.f;

import com.bytedance.android.live.broadcast.f.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f7864a;

    static {
        Covode.recordClassIndex(3889);
    }

    c(a aVar) {
        this.f7864a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f7864a;
        Long l2 = (Long) obj;
        if (aVar.y != null) {
            ((a.AbstractC0113a) aVar.y).a(false, com.a.a(Locale.getDefault(), aVar.f7852a, new Object[]{Long.valueOf((10 - l2.longValue()) - 1)}));
        }
    }
}
