package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class PoolReference implements au {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.RecycledViewPool f4963a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f4964b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4965c;

    static {
        Covode.recordClassIndex(2073);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onContextDestroyed();
        }
    }

    public final Context a() {
        return this.f4964b.get();
    }

    @v(a = i.a.ON_DESTROY)
    public final void onContextDestroyed() {
        a aVar = this.f4965c;
        l.c(this, "");
        if (b.a(a())) {
            this.f4963a.clear();
            aVar.f4966a.remove(this);
        }
    }

    public PoolReference(Context context, RecyclerView.RecycledViewPool recycledViewPool, a aVar) {
        l.c(context, "");
        l.c(recycledViewPool, "");
        l.c(aVar, "");
        this.f4963a = recycledViewPool;
        this.f4965c = aVar;
        this.f4964b = new WeakReference<>(context);
    }
}
