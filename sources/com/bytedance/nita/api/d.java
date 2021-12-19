package com.bytedance.nita.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.c;
import com.bytedance.nita.f.a;
import com.bytedance.nita.f.b;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;

public abstract class d implements c {

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<Integer> f41618d = new ArrayList<>();

    static {
        Covode.recordClassIndex(25461);
    }

    @Override // com.bytedance.nita.api.c
    public void a(View view, Activity activity) {
        l.c(view, "");
        l.c(activity, "");
    }

    @Override // com.bytedance.nita.api.c
    public b b() {
        return a.f41667a;
    }

    @Override // com.bytedance.nita.api.c
    public final g f() {
        return g.ACTIVITY_DESTORY;
    }

    @Override // com.bytedance.nita.api.c
    public final f g() {
        return f.SINGLE;
    }

    @Override // com.bytedance.nita.api.c
    public final int[] d() {
        return n.e((Collection<Integer>) this.f41618d);
    }

    @Override // com.bytedance.nita.api.c
    public final ViewGroup b(Context context) {
        l.c(context, "");
        return c.a.a(context);
    }
}
