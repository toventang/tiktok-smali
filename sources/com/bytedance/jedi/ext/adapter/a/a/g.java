package com.bytedance.jedi.ext.adapter.a.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.a.c;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;

public final class g extends f {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ i[] f39618c = {new y(ab.a(g.class), "defaultEmpty", "getDefaultEmpty()Lkotlin/jvm/functions/Function1;")};

    /* renamed from: d  reason: collision with root package name */
    public int f39619d = 15990784;

    /* renamed from: e  reason: collision with root package name */
    public b<? super ViewGroup, ? extends c> f39620e;

    /* renamed from: f  reason: collision with root package name */
    public c f39621f;

    /* renamed from: g  reason: collision with root package name */
    public int f39622g;

    /* renamed from: h  reason: collision with root package name */
    public int f39623h = 241;

    /* renamed from: i  reason: collision with root package name */
    public final f f39624i;

    /* renamed from: j  reason: collision with root package name */
    public final f f39625j;

    /* renamed from: k  reason: collision with root package name */
    private final h f39626k = h.i.a((h.f.a.a) a.f39627a);

    static final class a extends m implements h.f.a.a<b<? super ViewGroup, ? extends c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39627a = new a();

        static {
            Covode.recordClassIndex(24388);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ b<? super ViewGroup, ? extends c> invoke() {
            return AnonymousClass1.f39628a;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final int e() {
        return this.f39619d;
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final boolean g() {
        if (this.f39622g != 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(24387);
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.f
    public final int c() {
        int i2;
        if (this.f39623h != 241 && (this.f39622g & 1) == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.f39624i.g() && (this.f39622g & 2) == 2) {
            i2 += this.f39624i.c();
        }
        if (!this.f39625j.g() || (this.f39622g & 4) != 4) {
            return i2;
        }
        return i2 + this.f39625j.c();
    }

    public final int f() {
        int i2;
        if (!this.f39625j.g() || (this.f39622g & 4) != 4) {
            return -1;
        }
        if (this.f39623h != 241 && (this.f39622g & 1) == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (!this.f39624i.g() || (this.f39622g & 2) != 2) {
            return i2;
        }
        return i2 + this.f39624i.c();
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final void a(int i2) {
        this.f39619d = i2;
    }

    private final void c(int i2) {
        c cVar = this.f39621f;
        if (cVar != null) {
            cVar.a(i2);
        }
    }

    public final void b(int i2) {
        if (this.f39623h != i2) {
            this.f39623h = i2;
            c(i2);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        View view;
        l.c(viewGroup, "");
        c cVar = this.f39621f;
        if (cVar == null || (view = cVar.a()) == null) {
            b<? super ViewGroup, ? extends c> bVar = this.f39620e;
            if (bVar == null) {
                bVar = (b) this.f39626k.getValue();
            }
            c cVar2 = (c) bVar.invoke(viewGroup);
            this.f39621f = cVar2;
            view = cVar2.a();
        }
        h hVar = new h(view);
        c(this.f39623h);
        a(hVar);
        return hVar;
    }

    public g(f fVar, f fVar2) {
        l.c(fVar, "");
        l.c(fVar2, "");
        this.f39624i = fVar;
        this.f39625j = fVar2;
    }
}
