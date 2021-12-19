package com.lynx.tasm.behavior.ui.list;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.c;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    c f56176a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f56177b;

    /* renamed from: c  reason: collision with root package name */
    d f56178c;

    /* renamed from: d  reason: collision with root package name */
    boolean f56179d;

    static {
        Covode.recordClassIndex(35113);
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void a() {
        this.f56178c.a();
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void b(h hVar) {
        this.f56178c.b(hVar);
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void c(h hVar) {
        this.f56178c.c(hVar);
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void a(h hVar) {
        this.f56178c.a(hVar);
    }

    public a(c cVar, RecyclerView recyclerView) {
        this.f56176a = cVar;
        this.f56177b = recyclerView;
        this.f56178c = new b(cVar);
    }
}
