package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.e.d;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import j.a.a.c;
import j.a.a.f;
import java.util.ArrayList;

public final class a extends f implements d {

    /* renamed from: a  reason: collision with root package name */
    public g f12524a;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<Class<? extends h>> f12525d = new ArrayList<>();

    static {
        Covode.recordClassIndex(6890);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.d
    public final <MODEL extends h, VH extends com.bytedance.android.live.publicscreen.a.f.a<MODEL>> void a(Class<MODEL> cls, com.bytedance.android.live.publicscreen.a.a.a<MODEL, VH> aVar) {
        l.d(cls, "");
        l.d(aVar, "");
        g gVar = this.f12524a;
        if (gVar == null) {
            l.a("publicScreenContext");
        }
        l.d(gVar, "");
        aVar.f12173a = gVar;
        this.f158846c.a((Class<?>) cls);
        a((Class) cls, (c) aVar);
        if (!this.f12525d.contains(cls)) {
            this.f12525d.add(cls);
        }
    }
}
