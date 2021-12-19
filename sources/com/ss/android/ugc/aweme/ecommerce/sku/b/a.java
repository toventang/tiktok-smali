package com.ss.android.ugc.aweme.ecommerce.sku.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.router.m;
import com.ss.android.ugc.aweme.ecommerce.sku.d;
import h.f.b.l;

public abstract class a extends m {
    static {
        Covode.recordClassIndex(54854);
    }

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void a();

    public abstract void a(View view);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(null, dVar, 1);
        l.d(dVar, "");
        this.f87186j = false;
    }
}
