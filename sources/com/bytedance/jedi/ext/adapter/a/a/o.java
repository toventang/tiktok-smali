package com.bytedance.jedi.ext.adapter.a.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.a.e;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;

public final class o extends f {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ i[] f39631c = {new y(ab.a(o.class), "defaultLoading", "getDefaultLoading()Lkotlin/jvm/functions/Function1;")};

    /* renamed from: d  reason: collision with root package name */
    public int f39632d = 16056320;

    /* renamed from: e  reason: collision with root package name */
    public b<? super ViewGroup, ? extends e> f39633e;

    /* renamed from: f  reason: collision with root package name */
    public e f39634f;

    /* renamed from: g  reason: collision with root package name */
    public int f39635g = 241;

    /* renamed from: h  reason: collision with root package name */
    public int f39636h = 241;

    /* renamed from: i  reason: collision with root package name */
    public h.f.a.a<z> f39637i;

    /* renamed from: j  reason: collision with root package name */
    public final q f39638j = new q(this);

    /* renamed from: k  reason: collision with root package name */
    private final h f39639k = h.i.a((h.f.a.a) new a(this));

    /* renamed from: l  reason: collision with root package name */
    private boolean f39640l;

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final int e() {
        return this.f39632d;
    }

    static final class a extends m implements h.f.a.a<b<? super ViewGroup, ? extends a>> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(24399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b<? super ViewGroup, ? extends a> invoke() {
            return new b<ViewGroup, a>(this) {
                /* class com.bytedance.jedi.ext.adapter.a.a.o.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(24400);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ a invoke(ViewGroup viewGroup) {
                    ViewGroup viewGroup2 = viewGroup;
                    l.c(viewGroup2, "");
                    return new a(viewGroup2, new h.f.a.a<z>(this) {
                        /* class com.bytedance.jedi.ext.adapter.a.a.o.a.AnonymousClass1.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(24401);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            this.this$0.this$0.this$0.c(244);
                            return z.f158842a;
                        }
                    });
                }
            };
        }
    }

    public final boolean f() {
        if (this.f39636h == 244) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final boolean g() {
        if (this.f39636h == 241 || this.f39637i == null) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(24398);
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final void a(int i2) {
        this.f39632d = i2;
    }

    public static /* synthetic */ void a(o oVar) {
        oVar.d(oVar.f39635g);
    }

    private void d(int i2) {
        e eVar = this.f39634f;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public final void a(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        this.f39638j.a(recyclerView);
    }

    public final void b(int i2) {
        boolean z;
        if (this.f39635g != i2) {
            this.f39635g = i2;
            if (i2 == 242) {
                z = true;
            } else {
                z = false;
            }
            this.f39640l = z;
            d(i2);
        }
    }

    public final void c(int i2) {
        if (this.f39635g == i2 && !this.f39640l) {
            this.f39640l = true;
            b(242);
            h.f.a.a<z> aVar = this.f39637i;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.a.a.m
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        View view;
        l.c(viewGroup, "");
        e eVar = this.f39634f;
        if (eVar == null || (view = eVar.a()) == null) {
            b<? super ViewGroup, ? extends e> bVar = this.f39633e;
            if (bVar == null) {
                bVar = (b) this.f39639k.getValue();
            }
            e eVar2 = (e) bVar.invoke(viewGroup);
            this.f39634f = eVar2;
            view = eVar2.a();
        }
        p pVar = new p(view);
        a(this);
        a(pVar);
        return pVar;
    }
}
