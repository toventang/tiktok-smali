package com.bytedance.ies.xelement.picker.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.c.a;
import com.bytedance.ies.xelement.picker.c.b;
import com.bytedance.ies.xelement.picker.e.g;
import com.bytedance.ies.xelement.picker.e.h;
import java.util.ArrayList;
import java.util.List;

public final class c extends a<c> {

    /* renamed from: a  reason: collision with root package name */
    private b f37250a;

    static {
        Covode.recordClassIndex(22400);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.xelement.picker.b.a
    public final a a() {
        return this.f37250a;
    }

    public final com.bytedance.ies.xelement.picker.view.c b() {
        return new com.bytedance.ies.xelement.picker.view.c(this.f37250a);
    }

    public final c a(com.bytedance.ies.xelement.c.a aVar) {
        this.f37250a.L = aVar;
        return this;
    }

    public c(Context context) {
        b bVar = new b();
        this.f37250a = bVar;
        bVar.f37261f = context;
    }

    public final c a(g gVar) {
        this.f37250a.D = gVar;
        return this;
    }

    public final c a(h hVar) {
        this.f37250a.E = hVar;
        return this;
    }

    public final c b(List<Integer> list) {
        if (list == null) {
            this.f37250a.H = null;
        } else {
            this.f37250a.H = new ArrayList(list);
        }
        return this;
    }

    public final c a(List<List<String>> list) {
        if (list == null) {
            this.f37250a.F = null;
        } else {
            this.f37250a.F = new ArrayList(list);
        }
        return this;
    }
}
