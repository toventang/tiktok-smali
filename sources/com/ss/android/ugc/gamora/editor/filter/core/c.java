package com.ss.android.ugc.gamora.editor.filter.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.ui_component.b;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.tools.b.a.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c extends b<EditFilterViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final o f145891a;

    /* renamed from: b  reason: collision with root package name */
    public final b f145892b;

    /* renamed from: c  reason: collision with root package name */
    private e f145893c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditFilterViewModel> f145894d;

    /* renamed from: e  reason: collision with root package name */
    private final f f145895e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.scene.group.b f145896f;

    /* renamed from: k  reason: collision with root package name */
    private final int f145897k = R.id.c9b;

    /* renamed from: l  reason: collision with root package name */
    private final d f145898l;

    /* renamed from: m  reason: collision with root package name */
    private final h.f.a.b<d, z> f145899m;

    static {
        Covode.recordClassIndex(95862);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditFilterViewModel> b() {
        return this.f145894d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f145896f;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f145895e;
    }

    static final class a extends m implements h.f.a.a<EditFilterViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(95863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditFilterViewModel invoke() {
            return new EditFilterViewModel(this.this$0.getDiContainer(), this.this$0.f145891a, this.this$0.f145892b);
        }
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f145893c = new e(getDiContainer(), this.f145891a, this.f145898l, this.f145899m);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        com.bytedance.scene.group.b bVar = this.f145896f;
        e eVar = this.f145893c;
        if (eVar == null) {
            l.a("scene");
        }
        if (!bVar.f(eVar)) {
            com.bytedance.scene.group.b bVar2 = this.f145896f;
            int i2 = this.f145897k;
            e eVar2 = this.f145893c;
            if (eVar2 == null) {
                l.a("scene");
            }
            bVar2.a(i2, eVar2, "EditFilterScene");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super com.ss.android.ugc.gamora.editor.filter.core.d, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(f fVar, com.bytedance.scene.group.b bVar, o oVar, d dVar, b bVar2, h.f.a.b<? super d, z> bVar3) {
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(oVar, "");
        l.d(dVar, "");
        l.d(bVar2, "");
        this.f145895e = fVar;
        this.f145896f = bVar;
        this.f145891a = oVar;
        this.f145898l = dVar;
        this.f145892b = bVar2;
        this.f145899m = bVar3;
        this.f145894d = new a(this);
    }
}
