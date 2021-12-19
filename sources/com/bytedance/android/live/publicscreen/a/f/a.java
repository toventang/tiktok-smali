package com.bytedance.android.live.publicscreen.a.f;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public abstract class a<MODEL extends h> extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public g f12195b;

    /* renamed from: c  reason: collision with root package name */
    public MODEL f12196c;

    static {
        Covode.recordClassIndex(6717);
    }

    public void a() {
    }

    public abstract void a(g gVar, MODEL model);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
    }

    public final void a(g gVar, MODEL model, List<Object> list) {
        l.d(gVar, "");
        l.d(model, "");
        l.d(list, "");
        this.f12195b = gVar;
        this.f12196c = model;
        a(gVar, model);
    }
}
