package com.bytedance.tux.dialog.internal;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.dialog.internal.d;
import h.f.b.l;

public abstract class c {

    /* renamed from: d  reason: collision with root package name */
    public final d f44900d;

    /* renamed from: e  reason: collision with root package name */
    protected a f44901e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f44902f;

    static {
        Covode.recordClassIndex(27411);
    }

    public abstract View a();

    public final a c() {
        a aVar = this.f44901e;
        if (aVar == null) {
            l.a("dialog");
        }
        return aVar;
    }

    public void a(a aVar) {
        l.c(aVar, "");
        this.f44901e = aVar;
    }

    public final void b(a aVar) {
        l.c(aVar, "");
        this.f44901e = aVar;
    }

    public c(Context context) {
        l.c(context, "");
        this.f44902f = context;
        this.f44900d = d.a.a(context);
    }
}
