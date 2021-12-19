package com.bytedance.jedi.ext.adapter.a.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class r implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f39649a;

    /* renamed from: b  reason: collision with root package name */
    private final b<RecyclerView, z> f39650b;

    /* renamed from: c  reason: collision with root package name */
    private final b<RecyclerView, z> f39651c;

    static {
        Covode.recordClassIndex(24404);
    }

    private r() {
        this.f39650b = null;
        this.f39651c = null;
    }

    public /* synthetic */ r(byte b2) {
        this();
    }

    public final void a(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        this.f39649a = recyclerView;
        recyclerView.addOnAttachStateChangeListener(this);
    }

    public final void b(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        this.f39649a = null;
        recyclerView.removeOnAttachStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        l.c(view, "");
        this.f39649a = null;
        b<RecyclerView, z> bVar = this.f39651c;
        if (bVar != null) {
            bVar.invoke(view);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        l.c(view, "");
        this.f39649a = (RecyclerView) view;
        b<RecyclerView, z> bVar = this.f39650b;
        if (bVar != null) {
            bVar.invoke(view);
        }
    }
}
