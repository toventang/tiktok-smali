package com.ss.android.ugc.aweme.story.edit.business.shared.b.a;

import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.sticker.r;
import com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.n;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.h.d;
import h.k.i;
import h.m;

public final class b extends j<a> implements com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137185a = {new y(b.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0)};

    /* renamed from: b  reason: collision with root package name */
    final h f137186b = h.i.a(m.NONE, new a(this));

    /* renamed from: c  reason: collision with root package name */
    final d f137187c = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.f.a.a.j.class);

    /* renamed from: d  reason: collision with root package name */
    public final a f137188d = this;

    /* renamed from: e  reason: collision with root package name */
    private final h f137189e = h.i.a((h.f.a.a) new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final f f137190f;

    static {
        Covode.recordClassIndex(89711);
    }

    private final c a() {
        return (c) this.f137189e.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f137188d;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f137190f;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> r1 = com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b.a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        a().f137192a = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b$b  reason: collision with other inner class name */
    public static final class C3594b implements r.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137191a;

        static {
            Covode.recordClassIndex(89713);
        }

        @Override // com.ss.android.ugc.aweme.sticker.r.a
        public final void a() {
            ((com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d) this.f137191a.f137186b.getValue()).a(new n(4, "slide_up"));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3594b(b bVar) {
            this.f137191a = bVar;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            b bVar = this.this$0;
            return new c((com.bytedance.f.a.a.j) bVar.f137187c.a(bVar, b.f137185a[0]));
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        a().f137192a = new C3594b(this);
        c a2 = a();
        a2.f137194c.a(new com.bytedance.f.a.a.f(0, a2.f()));
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.b.a.a
    public final void a(boolean z) {
        c a2 = a();
        a2.f137193b = z;
        a2.f().f137196b = z;
    }

    public b(f fVar) {
        l.d(fVar, "");
        this.f137190f = fVar;
    }
}
