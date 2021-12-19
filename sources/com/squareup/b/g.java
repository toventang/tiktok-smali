package com.squareup.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.b.t;
import com.squareup.b.y;
import java.io.InputStream;

public class g extends y {

    /* renamed from: a  reason: collision with root package name */
    final Context f58025a;

    static {
        Covode.recordClassIndex(36055);
    }

    g(Context context) {
        this.f58025a = context;
    }

    @Override // com.squareup.b.y
    public boolean a(w wVar) {
        return "content".equals(wVar.f58115d.getScheme());
    }

    @Override // com.squareup.b.y
    public y.a b(w wVar) {
        return new y.a(c(wVar), t.d.DISK);
    }

    /* access modifiers changed from: package-private */
    public final InputStream c(w wVar) {
        MethodCollector.i(1430);
        InputStream openInputStream = this.f58025a.getContentResolver().openInputStream(wVar.f58115d);
        MethodCollector.o(1430);
        return openInputStream;
    }
}
