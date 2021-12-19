package com.ss.android.ugc.gamora.editor.progress;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<EditProgressViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f146270a;

    /* renamed from: b  reason: collision with root package name */
    public final int f146271b = R.id.c9_;

    /* renamed from: c  reason: collision with root package name */
    private final h f146272c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditProgressViewModel> f146273d = C3909b.f146275a;

    /* renamed from: e  reason: collision with root package name */
    private final f f146274e;

    static {
        Covode.recordClassIndex(96146);
    }

    private final d a() {
        return (d) this.f146272c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditProgressViewModel> b() {
        return this.f146273d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146270a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146274e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.b$b  reason: collision with other inner class name */
    static final class C3909b extends m implements h.f.a.a<EditProgressViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3909b f146275a = new C3909b();

        static {
            Covode.recordClassIndex(96148);
        }

        C3909b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditProgressViewModel invoke() {
            return new EditProgressViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<d> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            d dVar = new d(this.this$0.getDiContainer());
            this.this$0.f146270a.a(this.this$0.f146271b, dVar, "EditProgressScene");
            return dVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f146270a.f(a())) {
            this.f146270a.a(this.f146271b, a(), "EditProgressScene");
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f146274e = fVar;
        this.f146270a = bVar;
    }
}
