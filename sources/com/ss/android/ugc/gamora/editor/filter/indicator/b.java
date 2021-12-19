package com.ss.android.ugc.gamora.editor.filter.indicator;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<EditFilterIndicatorViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f145929a;

    /* renamed from: b  reason: collision with root package name */
    public final FilterBean f145930b;

    /* renamed from: c  reason: collision with root package name */
    public final o f145931c;

    /* renamed from: d  reason: collision with root package name */
    private final h f145932d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<EditFilterIndicatorViewModel> f145933e;

    /* renamed from: f  reason: collision with root package name */
    private final f f145934f;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.scene.group.b f145935k;

    /* renamed from: l  reason: collision with root package name */
    private final int f145936l = R.id.asj;

    static {
        Covode.recordClassIndex(95894);
    }

    private final c a() {
        return (c) this.f145932d.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditFilterIndicatorViewModel> b() {
        return this.f145933e;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f145935k;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f145934f;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.indicator.b$b  reason: collision with other inner class name */
    static final class C3892b extends m implements h.f.a.a<EditFilterIndicatorViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3892b f145937a = new C3892b();

        static {
            Covode.recordClassIndex(95896);
        }

        C3892b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditFilterIndicatorViewModel invoke() {
            return new EditFilterIndicatorViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(95895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c(this.this$0.f145930b, this.this$0.f145931c);
            cVar.f145942d = this.this$0.f145929a;
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f145935k.f(a())) {
            this.f145935k.a(this.f145936l, a(), "EditFilterIndicatorScene");
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        if (this.f145935k.f(a())) {
            this.f145935k.d(a());
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar, FilterBean filterBean, o oVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(oVar, "");
        this.f145934f = fVar;
        this.f145935k = bVar;
        this.f145930b = filterBean;
        this.f145931c = oVar;
        this.f145929a = true;
        this.f145932d = i.a((h.f.a.a) new a(this));
        this.f145933e = C3892b.f145937a;
    }
}
