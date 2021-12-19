package com.ss.android.ugc.gamora.editor.gesture;

import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class b extends com.bytedance.ui_component.b<EditGestureViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f145953a = R.id.fgy;

    /* renamed from: b  reason: collision with root package name */
    private final h f145954b = i.a(m.NONE, new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f145955c = i.a((h.f.a.a) new C3894b(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditGestureViewModel> f145956d = c.f145959a;

    /* renamed from: e  reason: collision with root package name */
    private final f f145957e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.scene.group.b f145958f;

    static {
        Covode.recordClassIndex(95912);
    }

    private final c a() {
        return (c) this.f145955c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditGestureViewModel> b() {
        return this.f145956d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f145958f;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f145957e;
    }

    static final class c extends h.f.b.m implements h.f.a.a<EditGestureViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f145959a = new c();

        static {
            Covode.recordClassIndex(95915);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditGestureViewModel invoke() {
            return new EditGestureViewModel();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.core.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.filter.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.filter.core.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.core.a> r1 = com.ss.android.ugc.gamora.editor.filter.core.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.gesture.b.a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.b$b  reason: collision with other inner class name */
    static final class C3894b extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(95914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3894b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            Object a2 = this.this$0.getDiContainer().a(j.class);
            l.b(a2, "");
            return new c((j) a2, this.this$0.getDiContainer());
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        if (this.f145958f.f(a())) {
            this.f145958f.d(a());
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f145958f.f(a())) {
            this.f145958f.a(this.f145953a, a(), "EditGestureScene");
        }
        ((com.ss.android.ugc.gamora.editor.filter.core.a) this.f145954b.getValue()).a(true);
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f145957e = fVar;
        this.f145958f = bVar;
    }
}
