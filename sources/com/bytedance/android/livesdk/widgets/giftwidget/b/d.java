package com.bytedance.android.livesdk.widgets.giftwidget.b;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f22781a;

    static {
        Covode.recordClassIndex(13423);
    }

    d(b bVar) {
        this.f22781a = bVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        b bVar = this.f22781a;
        boolean z = true;
        bVar.f22772f = !((Boolean) obj).booleanValue();
        t<Boolean> tVar = bVar.f22770d;
        if (!bVar.f22771e && (bVar.f22772f || bVar.f22773g)) {
            z = false;
        }
        tVar.setValue(Boolean.valueOf(z));
        return z.f158842a;
    }
}
