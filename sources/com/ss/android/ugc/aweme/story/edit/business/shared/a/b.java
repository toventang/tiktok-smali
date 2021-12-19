package com.ss.android.ugc.aweme.story.edit.business.shared.a;

import android.content.Context;
import com.bytedance.als.dsl.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.gamora.editor.filter.core.a.a;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.z;

public final class b extends com.ss.android.ugc.aweme.story.edit.clip.a<a> implements a {

    /* renamed from: a  reason: collision with root package name */
    final h f137167a = i.a(m.NONE, new C3593b(this));

    /* renamed from: b  reason: collision with root package name */
    public final a f137168b = this;

    /* renamed from: c  reason: collision with root package name */
    final j f137169c;

    /* renamed from: d  reason: collision with root package name */
    final o f137170d;

    /* renamed from: f  reason: collision with root package name */
    private final h f137171f = i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f137172g = i.a(m.NONE, new a(this));

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.editor.filter.core.b f137173h;

    static {
        Covode.recordClassIndex(89698);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.filter.core.a.a a() {
        return (com.ss.android.ugc.gamora.editor.filter.core.a.a) this.f137171f.getValue();
    }

    public final com.ss.android.ugc.aweme.story.edit.b.e b() {
        return (com.ss.android.ugc.aweme.story.edit.b.e) this.f137172g.getValue();
    }

    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ com.bytedance.als.b getApiComponent() {
        return this.f137168b;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.b.e> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.b.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.ss.android.ugc.aweme.story.edit.b.e.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.a.b.a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.a.b$b  reason: collision with other inner class name */
    public static final class C3593b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.indicator.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3593b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.filter.indicator.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.filter.indicator.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.indicator.a> r1 = com.ss.android.ugc.gamora.editor.filter.indicator.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.a.b.C3593b.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.d, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f137170d.a();
        a();
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        a().f145870b = null;
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.core.a.a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.filter.core.a.a invoke() {
            b bVar = this.this$0;
            e eVar = new e(bVar);
            com.ss.android.ugc.gamora.editor.filter.core.a.a aVar = new com.ss.android.ugc.gamora.editor.filter.core.a.a(bVar, bVar.f137169c, (com.ss.android.ugc.gamora.editor.filter.indicator.a) bVar.f137167a.getValue(), bVar.f137170d, bVar.b().j(), new d(bVar));
            aVar.f145870b = eVar;
            return aVar;
        }
    }

    public static final class e implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137174a;

        static {
            Covode.recordClassIndex(89703);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(b bVar) {
            this.f137174a = bVar;
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.a.a.b
        public final void a(FilterBean filterBean) {
            b bVar = this.f137174a;
            bVar.a(filterBean, true, g.b(bVar));
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.a.a.b
        public final void a(FilterBean filterBean, FilterBean filterBean2, float f2) {
            this.f137174a.b().a(filterBean, filterBean2, f2);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<FilterBean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FilterBean filterBean) {
            this.this$0.a(filterBean, false, null);
            this.this$0.a().f145873e = true;
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.d
    public final /* synthetic */ void a(VEEditClip vEEditClip) {
        FilterBean a2;
        VEEditClip vEEditClip2 = vEEditClip;
        l.d(vEEditClip2, "");
        super.a(vEEditClip2);
        StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this);
        if (d2 != null && (a2 = com.ss.android.ugc.aweme.story.edit.model.a.a(d2, this.f137170d)) != null) {
            a().a(a2);
        }
    }

    public final void a(FilterBean filterBean, boolean z, Context context) {
        if (filterBean != null) {
            b().a(new com.ss.android.ugc.aweme.filter.c.a(false, filterBean, false, this.f137170d.g().c(filterBean.getId())));
            this.f137173h.a(filterBean, z, context);
            return;
        }
        this.f137173h.a(null, z, context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(f fVar, j jVar, o oVar, com.ss.android.ugc.gamora.editor.filter.core.b bVar) {
        super(fVar);
        l.d(fVar, "");
        l.d(jVar, "");
        l.d(oVar, "");
        l.d(bVar, "");
        this.f137169c = jVar;
        this.f137170d = oVar;
        this.f137173h = bVar;
    }
}
