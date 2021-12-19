package com.squareup.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.b.t;
import com.squareup.b.y;

/* access modifiers changed from: package-private */
public final class z extends y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f58155a;

    static {
        Covode.recordClassIndex(36094);
    }

    z(Context context) {
        this.f58155a = context;
    }

    @Override // com.squareup.b.y
    public final boolean a(w wVar) {
        if (wVar.f58116e != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f58115d.getScheme());
    }

    @Override // com.squareup.b.y
    public final y.a b(w wVar) {
        MethodCollector.i(3103);
        Resources a2 = ae.a(this.f58155a, wVar);
        int a3 = ae.a(a2, wVar);
        BitmapFactory.Options d2 = d(wVar);
        if (a(d2)) {
            BitmapFactory.decodeResource(a2, a3, d2);
            a(wVar.f58119h, wVar.f58120i, d2, wVar);
        }
        y.a aVar = new y.a(BitmapFactory.decodeResource(a2, a3, d2), t.d.DISK);
        MethodCollector.o(3103);
        return aVar;
    }
}
