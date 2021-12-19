package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f22782a;

    static {
        Covode.recordClassIndex(13424);
    }

    e(b bVar) {
        this.f22782a = bVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        b bVar = this.f22782a;
        View view = (View) obj;
        if (bVar.f22768b != null) {
            bVar.f22768b.a(view);
        }
        return z.f158842a;
    }
}
